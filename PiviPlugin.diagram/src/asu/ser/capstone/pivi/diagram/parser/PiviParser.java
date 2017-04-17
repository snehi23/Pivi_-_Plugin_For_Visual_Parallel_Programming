package asu.ser.capstone.pivi.diagram.parser;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import asu.ser.capstone.pivi.diagram.edit.parts.custom.InstructionOpenEditPolicy;

public class PiviParser {

	StartNode startNode;
	List<StatementNode> statements;
	StringBuilder generatedCode;

	public PiviParser() {
		statements = new ArrayList<>();
		generatedCode = new StringBuilder();
	}

	public static void ParseDiagram(String path, String fileName) {
		File piviFile = new File(path + "/" + fileName);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		Document doc;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(piviFile);
			doc.getDocumentElement().normalize();

			PiviParser pivi = new PiviParser();
			pivi.startNode = new StartNode(doc);
			pivi.setStatements(doc);
			pivi.generateCode();
			pivi.saveToFile(path);

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void saveToFile(String path) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		String fileName = path + "/Solution.java";

		try {
			fw = new FileWriter(fileName);
			bw = new BufferedWriter(fw);
			bw.write(generatedCode.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null) {
					bw.close();
				}
				if (fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void generateCode() {
		generatedCode.append("public class Solution {\n");
		generatedCode.append("public static void main(String[] args) { \n");

		Stack<StatementNode> ifStack = new Stack<>();
		Stack<StatementNode> whileStack = new Stack<>();
		Stack<StatementNode> methodStack = new Stack<>();
		Map<String, Integer> methodMap = new HashMap<>();
		List<StringBuilder> methodData = new ArrayList<>();
		methodData.add(generatedCode);

		int index = startNode.outputIndex;
		StringBuilder code = methodData.get(0);
		while (index != -1) {
			StatementNode statement = statements.get(index);
			if (statement instanceof IfStartNode) {
				ifStack.push(statement);
				code.append("if(");
				code.append(((IfStartNode) statement).condition);
				code.append("){\n");
				index = ((IfStartNode) statement).firstOutputIndex;
			} else if (statement instanceof IfEndNode) {
				if (!ifStack.empty()) {
					StatementNode ifStatement = ifStack.pop();
					if (ifStatement instanceof IfStartNode) {
						index = ((IfStartNode) ifStatement).secondOutputIndex;
						if (index == -1) {
							index = ((IfEndNode) statement).firstOutputIndex;
							code.append("}\n");
						} else {
							code.append("} else {\n");
						}
					}
				} else {
					index = ((IfEndNode) statement).firstOutputIndex;
					code.append("}\n");
				}
			} else if (statement instanceof InstructionNode) {
				if(InstructionOpenEditPolicy.instructionsMap.containsKey(index)){
					code.append(InstructionOpenEditPolicy.instructionsMap.get(index));
				}
				code.append("\n");
				index = ((InstructionNode) statement).firstOutputIndex;
			} else if (statement instanceof WhileStartNode) {
				whileStack.push(statement);
				code.append("while(");
				code.append(((WhileStartNode) statement).condition);
				code.append("){\n");
				index = ((WhileStartNode) statement).firstOutputIndex;
			} else if (statement instanceof WhileEndNode) {
				if (!whileStack.isEmpty()) {
					whileStack.pop();
					code.append("}\n");
					index = ((WhileEndNode) statement).firstOutputIndex;
				}
			} else if (statement instanceof MethodStartNode) {
				methodStack.push(statement);
				StringBuilder newMethodData = new StringBuilder();

				methodMap.put(((MethodStartNode) statement).name, methodData.size());
				methodData.add(newMethodData);

				newMethodData.append("public static void " + ((MethodStartNode) statement).name + "(){\n");
				code = newMethodData;
				index = ((MethodStartNode) statement).firstOutputIndex;
			} else if (statement instanceof MethodEndNode) {
				if (!methodStack.isEmpty()) {
					code.append("}\n");
					StatementNode calleeMethod = methodStack.pop();
					if (!methodStack.isEmpty()) {
						StatementNode callerMethod = methodStack.peek();
						String callerName = ((MethodStartNode) callerMethod).name;
						if (methodMap.containsKey(callerName)) {
							code = methodData.get(methodMap.get(callerName));
							code.append(((MethodStartNode) calleeMethod).name + "();\n");
						}
					} else {
						code = methodData.get(0);
						code.append(((MethodStartNode) calleeMethod).name + "();\n");
					}
					index = ((MethodEndNode) statement).firstOutputIndex;
				}
			}
		}
		generatedCode.append("}\n");
		for (int i = 1; i < methodData.size(); i++) {
			generatedCode.append(methodData.get(i));
		}
		generatedCode.append("}\n");
	}

	private void setStatements(Document doc) {
		NodeList nStatementList = doc.getElementsByTagName("statements");
		for (int i = 0; i < nStatementList.getLength(); i++) {
			Node nStatement = nStatementList.item(i);
			if (nStatement.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) nStatement;

				String statementType = element.getAttribute("xsi:type");

				if (statementType.contains("IfStart")) {
					statements.add(new IfStartNode(element));
				} else if (statementType.contains("IfEnd")) {
					statements.add(new IfEndNode(element));
				} else if (statementType.contains("Instruction")) {
					statements.add(new InstructionNode(element));
				} else if (statementType.contains("WhileStart")) {
					statements.add(new WhileStartNode(element));
				} else if (statementType.contains("WhileEnd")) {
					statements.add(new WhileEndNode(element));
				} else if (statementType.contains("MethodStart")) {
					statements.add(new MethodStartNode(element));
				} else if (statementType.contains("MethodEnd")) {
					statements.add(new MethodEndNode(element));
				}
			}
		}
	}
}
