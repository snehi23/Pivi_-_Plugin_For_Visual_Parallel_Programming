package asu.ser.capstone.pivi.parser;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class PiviParser {

	StartNode startNode;
	List<ResultNode> results;
	List<StatementNode> statements;
	StringBuilder generatedCode;

	public PiviParser() {
		startNode = new StartNode();
		results = new ArrayList<>();
		statements = new ArrayList<>();
		generatedCode = new StringBuilder();
	}

	public static void main(String[] args) {
		File piviFile = new File("res/default.pivi");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		Document doc;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(piviFile);
			doc.getDocumentElement().normalize();

			PiviParser pivi = new PiviParser();
			pivi.setStartNode(doc);
			pivi.setResults(doc);
			pivi.setStatements(doc);
			pivi.generateCode();
			pivi.saveToFile();

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void saveToFile() {
		BufferedWriter bw = null;
		FileWriter fw = null;
		String fileName = "src/asu/ser/capstone/pivi/test/Solution.java";

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
		generatedCode.append("package asu.ser.capstone.pivi.test;\n\n");
		generatedCode.append("public class Solution {\n");
		generatedCode.append("public static void main(String[] args) { \n");

		Stack<StatementNode> stack = new Stack<>();
		int index = startNode.outputIndex;
		boolean flag = true;
		while (index != -1) {
			if (flag) {
				StatementNode statement = statements.get(index);
				if (statement instanceof IfStartNode) {
					stack.push(statement);
					generatedCode.append("if(");
					generatedCode.append(((IfStartNode) statement).condition);
					generatedCode.append("){\n");
					index = ((IfStartNode) statement).firstOutputIndex;
					flag = false;
				} else if (statement instanceof IfEndNode) {
					if (!stack.empty()) {
						generatedCode.append("} else {\n");
						StatementNode ifStatement = stack.pop();
						if (ifStatement instanceof IfStartNode) {
							index = ((IfStartNode) ifStatement).secondOutputIndex;
							if(index == -1){
								index = ((IfEndNode) statement).firstOutputIndex;
							}else{
								flag = false;
							}
						}
					} else {
						index = ((IfEndNode) statement).firstOutputIndex;
						generatedCode.append("}\n");
						flag = false;
					}
				} else if (statement instanceof InstructionNode) {
					generatedCode.append(((InstructionNode) statement).instructions);
					generatedCode.append("\n");
					index = ((InstructionNode) statement).firstOutputIndex;
					flag = false;
				}
				
			} else {
				ResultNode result = results.get(index);
				index = result.outputIndex;
				flag = true;
			}
		}
		generatedCode.append("}\n}");
	}

	private void setStatements(Document doc) {
		NodeList nStatementList = doc.getElementsByTagName("statements");
		for (int i = 0; i < nStatementList.getLength(); i++) {
			Node nStatement = nStatementList.item(i);
			if (nStatement.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) nStatement;

				String statementType = element.getAttribute("xsi:type");

				if (statementType.contains("IfStartStatement")) {
					setIfStart(element);
				} else if (statementType.contains("IfEndStatement")) {
					setIfEnd(element);
				} else if (statementType.contains("Instruction")) {
					setInstuction(element);
				}
			}
		}
	}

	private void setInstuction(Element element) {
		InstructionNode instruction = new InstructionNode();
		statements.add(instruction);

		instruction.instructions = element.getAttribute("instructions");

		Node nInput = element.getElementsByTagName("inputs").item(0);

		if (nInput.getNodeType() == Node.ELEMENT_NODE) {
			Element inputElement = (Element) nInput;
			String previousPointer = inputElement.getAttribute("terminal");
			if (!previousPointer.isEmpty()) {
				int begin = previousPointer.indexOf('.');
				if (begin != -1) {
					instruction.firstInputIndex = Integer.parseInt(previousPointer.substring(begin + 1, begin + 2));
				} else {
					instruction.firstInputIndex = -1;
				}
			} else {
				instruction.firstInputIndex = -1;
			}
		}

		Node nOutput = element.getElementsByTagName("outputs").item(0);
		if (nOutput.getNodeType() == Node.ELEMENT_NODE) {
			Element inputElement = (Element) nOutput;
			String nextPointer = inputElement.getAttribute("result");
			if (!nextPointer.isEmpty()) {
				int begin = nextPointer.indexOf('.');
				if (begin != -1) {
					instruction.firstOutputIndex = Integer.parseInt(nextPointer.substring(begin + 1, begin + 2));
				} else {
					instruction.firstOutputIndex = -1;
				}
			} else {
				instruction.firstOutputIndex = -1;
			}
		}
	}

	private void setIfEnd(Element element) {
		IfEndNode ifEnd = new IfEndNode();
		statements.add(ifEnd);

		NodeList nInputs = element.getElementsByTagName("inputs");
		for (int i = 0; i < nInputs.getLength(); i++) {
			Node nInput = nInputs.item(i);
			if (nInput.getNodeType() == Node.ELEMENT_NODE) {
				Element inputElement = (Element) nInput;
				String previousPointer = inputElement.getAttribute("terminal");
				if (!previousPointer.isEmpty()) {
					int begin = previousPointer.indexOf('.');
					if (i == 0) {
						if (begin != -1) {
							ifEnd.firstInputIndex = Integer.parseInt(previousPointer.substring(begin + 1, begin + 2));
						} else {
							ifEnd.firstInputIndex = -1;
						}
					} else {
						if (begin != -1) {
							ifEnd.secondInputIndex = Integer.parseInt(previousPointer.substring(begin + 1, begin + 2));
						} else {
							ifEnd.secondInputIndex = -1;
						}
					}
				} else {
					if (i == 0) {
						ifEnd.firstInputIndex = -1;
					} else {
						ifEnd.secondInputIndex = -1;
					}
				}
			}
		}

		Node nOutput = element.getElementsByTagName("outputs").item(0);
		if (nOutput.getNodeType() == Node.ELEMENT_NODE) {
			Element inputElement = (Element) nOutput;
			String nextPointer = inputElement.getAttribute("result");
			if (!nextPointer.isEmpty()) {
				int begin = nextPointer.indexOf('.');
				if (begin != -1) {
					ifEnd.firstOutputIndex = Integer.parseInt(nextPointer.substring(begin + 1, begin + 2));
				} else {
					ifEnd.firstOutputIndex = -1;
				}
			} else {
				ifEnd.firstOutputIndex = -1;
			}
		}
	}

	private void setIfStart(Element element) {
		IfStartNode ifStart = new IfStartNode();
		statements.add(ifStart);

		ifStart.condition = element.getAttribute("condition");

		Node nInput = element.getElementsByTagName("inputs").item(0);
		if (nInput.getNodeType() == Node.ELEMENT_NODE) {
			Element inputElement = (Element) nInput;
			String previousPointer = inputElement.getAttribute("terminal");
			if (!previousPointer.isEmpty()) {
				int begin = previousPointer.indexOf('.');
				if (begin != -1) {
					ifStart.firstInputIndex = Integer.parseInt(previousPointer.substring(begin + 1, begin + 2));
				} else {
					ifStart.firstInputIndex = -1;
				}
			} else {
				ifStart.firstInputIndex = -1;
			}
		}

		NodeList nOutputs = element.getElementsByTagName("outputs");
		for (int i = 0; i < nOutputs.getLength(); i++) {
			Node nOutput = nOutputs.item(i);
			if (nOutput.getNodeType() == Node.ELEMENT_NODE) {
				Element inputElement = (Element) nOutput;
				String nextPointer = inputElement.getAttribute("result");
				if (!nextPointer.isEmpty()) {
					int begin = nextPointer.indexOf('.');
					if (i == 0) {
						if (begin != -1) {
							ifStart.firstOutputIndex = Integer.parseInt(nextPointer.substring(begin + 1, begin + 2));
						} else {
							ifStart.firstInputIndex = -1;
						}
					} else {
						if (begin != -1) {
							ifStart.secondOutputIndex = Integer.parseInt(nextPointer.substring(begin + 1, begin + 2));
						} else {
							ifStart.secondOutputIndex = -1;
						}
					}
				} else {
					if (i == 0) {
						ifStart.firstInputIndex = -1;
					} else {
						ifStart.secondOutputIndex = -1;
					}
				}
			}
		}
	}

	private void setResults(Document doc) {
		NodeList nResultList = doc.getElementsByTagName("results");
		for (int i = 0; i < nResultList.getLength(); i++) {
			Node nResult = nResultList.item(i);

			if (nResult.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) nResult;
				ResultNode result = new ResultNode();
				results.add(result);

				String nextPointer = element.getAttribute("inputPorts");
				if (!nextPointer.isEmpty()) {
					int begin = nextPointer.indexOf('.') + 1;
					result.outputIndex = Integer.parseInt(nextPointer.substring(begin, begin + 1));
				} else {
					result.outputIndex = -1;
				}

				String previousPointer = element.getAttribute("outputPort");
				if (!previousPointer.isEmpty()) {
					int begin = previousPointer.indexOf('.') + 1;
					result.inputIndex = Integer.parseInt(previousPointer.substring(begin, begin + 1));
				} else {
					result.inputIndex = -1;
				}

				// System.out.println(result.inputIndex + ", " +
				// result.outputIndex);
			}

		}
	}

	private void setStartNode(Document doc) {
		NodeList nStartList = doc.getElementsByTagName("start");
		Node nStart = nStartList.item(0);

		if (nStart.getNodeType() == Node.ELEMENT_NODE) {
			Element element = (Element) nStart;
			String nextPointer = element.getAttribute("inputPorts");
			if (!nextPointer.isEmpty()) {
				int begin = nextPointer.indexOf('.') + 1;
				startNode.outputIndex = Integer.parseInt(nextPointer.substring(begin, begin + 1));
			} else {
				startNode.outputIndex = -1;
			}
		}
	}
}
