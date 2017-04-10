package asu.ser.capstone.pivi.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import asu.ser.capstone.pivi.PiviPackage;
import asu.ser.capstone.pivi.diagram.edit.parts.IfEndStatementNameEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.IfStartStatementConditionEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.IfStartStatementNameEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.InstructionInstructionsEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.InstructionNameEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.StartNameEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.WhileStatementConditionEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.WhileStatementNameEditPart;
import asu.ser.capstone.pivi.diagram.parsers.MessageFormatParser;
import asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry;

/**
 * @generated
 */
public class PiviParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser ifEndStatementName_5001Parser;

	/**
	* @generated
	*/
	private IParser getIfEndStatementName_5001Parser() {
		if (ifEndStatementName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { PiviPackage.eINSTANCE.getStatement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { PiviPackage.eINSTANCE.getStatement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			ifEndStatementName_5001Parser = parser;
		}
		return ifEndStatementName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser startName_5002Parser;

	/**
	* @generated
	*/
	private IParser getStartName_5002Parser() {
		if (startName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { PiviPackage.eINSTANCE.getTerminal_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			startName_5002Parser = parser;
		}
		return startName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser instructionName_5003Parser;

	/**
	* @generated
	*/
	private IParser getInstructionName_5003Parser() {
		if (instructionName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { PiviPackage.eINSTANCE.getStatement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { PiviPackage.eINSTANCE.getStatement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			instructionName_5003Parser = parser;
		}
		return instructionName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser instructionInstructions_5004Parser;

	/**
	* @generated
	*/
	private IParser getInstructionInstructions_5004Parser() {
		if (instructionInstructions_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { PiviPackage.eINSTANCE.getInstruction_Instructions() };
			EAttribute[] editableFeatures = new EAttribute[] { PiviPackage.eINSTANCE.getInstruction_Instructions() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			instructionInstructions_5004Parser = parser;
		}
		return instructionInstructions_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser ifStartStatementName_5005Parser;

	/**
	* @generated
	*/
	private IParser getIfStartStatementName_5005Parser() {
		if (ifStartStatementName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { PiviPackage.eINSTANCE.getStatement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { PiviPackage.eINSTANCE.getStatement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			ifStartStatementName_5005Parser = parser;
		}
		return ifStartStatementName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser ifStartStatementCondition_5006Parser;

	/**
	* @generated
	*/
	private IParser getIfStartStatementCondition_5006Parser() {
		if (ifStartStatementCondition_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { PiviPackage.eINSTANCE.getIfStartStatement_Condition() };
			EAttribute[] editableFeatures = new EAttribute[] { PiviPackage.eINSTANCE.getIfStartStatement_Condition() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			ifStartStatementCondition_5006Parser = parser;
		}
		return ifStartStatementCondition_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser whileStatementName_5007Parser;

	/**
	* @generated
	*/
	private IParser getWhileStatementName_5007Parser() {
		if (whileStatementName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { PiviPackage.eINSTANCE.getStatement_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { PiviPackage.eINSTANCE.getStatement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			whileStatementName_5007Parser = parser;
		}
		return whileStatementName_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser whileStatementCondition_5008Parser;

	/**
	* @generated
	*/
	private IParser getWhileStatementCondition_5008Parser() {
		if (whileStatementCondition_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { PiviPackage.eINSTANCE.getWhileStatement_Condition() };
			EAttribute[] editableFeatures = new EAttribute[] { PiviPackage.eINSTANCE.getWhileStatement_Condition() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			whileStatementCondition_5008Parser = parser;
		}
		return whileStatementCondition_5008Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case IfEndStatementNameEditPart.VISUAL_ID:
			return getIfEndStatementName_5001Parser();
		case StartNameEditPart.VISUAL_ID:
			return getStartName_5002Parser();
		case InstructionNameEditPart.VISUAL_ID:
			return getInstructionName_5003Parser();
		case InstructionInstructionsEditPart.VISUAL_ID:
			return getInstructionInstructions_5004Parser();
		case IfStartStatementNameEditPart.VISUAL_ID:
			return getIfStartStatementName_5005Parser();
		case IfStartStatementConditionEditPart.VISUAL_ID:
			return getIfStartStatementCondition_5006Parser();
		case WhileStatementNameEditPart.VISUAL_ID:
			return getWhileStatementName_5007Parser();
		case WhileStatementConditionEditPart.VISUAL_ID:
			return getWhileStatementCondition_5008Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(PiviVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(PiviVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (PiviElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
