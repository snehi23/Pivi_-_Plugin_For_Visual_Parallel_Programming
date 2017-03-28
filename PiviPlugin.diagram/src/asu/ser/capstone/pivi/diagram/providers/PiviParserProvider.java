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
import asu.ser.capstone.pivi.diagram.edit.parts.ResultNameEditPart;
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
	private IParser ifStartStatementName_5001Parser;

	/**
	* @generated
	*/
	private IParser getIfStartStatementName_5001Parser() {
		if (ifStartStatementName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { PiviPackage.eINSTANCE.getStatement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ifStartStatementName_5001Parser = parser;
		}
		return ifStartStatementName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser ifStartStatementCondition_5002Parser;

	/**
	* @generated
	*/
	private IParser getIfStartStatementCondition_5002Parser() {
		if (ifStartStatementCondition_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { PiviPackage.eINSTANCE.getIfStartStatement_Condition() };
			EAttribute[] editableFeatures = new EAttribute[] { PiviPackage.eINSTANCE.getIfStartStatement_Condition() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			ifStartStatementCondition_5002Parser = parser;
		}
		return ifStartStatementCondition_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser whileStatementName_5003Parser;

	/**
	* @generated
	*/
	private IParser getWhileStatementName_5003Parser() {
		if (whileStatementName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { PiviPackage.eINSTANCE.getStatement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			whileStatementName_5003Parser = parser;
		}
		return whileStatementName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser whileStatementCondition_5004Parser;

	/**
	* @generated
	*/
	private IParser getWhileStatementCondition_5004Parser() {
		if (whileStatementCondition_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { PiviPackage.eINSTANCE.getWhileStatement_Condition() };
			EAttribute[] editableFeatures = new EAttribute[] { PiviPackage.eINSTANCE.getWhileStatement_Condition() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			whileStatementCondition_5004Parser = parser;
		}
		return whileStatementCondition_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser ifEndStatementName_5005Parser;

	/**
	* @generated
	*/
	private IParser getIfEndStatementName_5005Parser() {
		if (ifEndStatementName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { PiviPackage.eINSTANCE.getStatement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ifEndStatementName_5005Parser = parser;
		}
		return ifEndStatementName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser instructionName_5006Parser;

	/**
	* @generated
	*/
	private IParser getInstructionName_5006Parser() {
		if (instructionName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { PiviPackage.eINSTANCE.getStatement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			instructionName_5006Parser = parser;
		}
		return instructionName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser instructionInstructions_5007Parser;

	/**
	* @generated
	*/
	private IParser getInstructionInstructions_5007Parser() {
		if (instructionInstructions_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { PiviPackage.eINSTANCE.getInstruction_Instructions() };
			EAttribute[] editableFeatures = new EAttribute[] { PiviPackage.eINSTANCE.getInstruction_Instructions() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			instructionInstructions_5007Parser = parser;
		}
		return instructionInstructions_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser startName_5008Parser;

	/**
	* @generated
	*/
	private IParser getStartName_5008Parser() {
		if (startName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { PiviPackage.eINSTANCE.getTerminal_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			startName_5008Parser = parser;
		}
		return startName_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser resultName_5009Parser;

	/**
	* @generated
	*/
	private IParser getResultName_5009Parser() {
		if (resultName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { PiviPackage.eINSTANCE.getTerminal_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			resultName_5009Parser = parser;
		}
		return resultName_5009Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case IfStartStatementNameEditPart.VISUAL_ID:
			return getIfStartStatementName_5001Parser();
		case IfStartStatementConditionEditPart.VISUAL_ID:
			return getIfStartStatementCondition_5002Parser();
		case WhileStatementNameEditPart.VISUAL_ID:
			return getWhileStatementName_5003Parser();
		case WhileStatementConditionEditPart.VISUAL_ID:
			return getWhileStatementCondition_5004Parser();
		case IfEndStatementNameEditPart.VISUAL_ID:
			return getIfEndStatementName_5005Parser();
		case InstructionNameEditPart.VISUAL_ID:
			return getInstructionName_5006Parser();
		case InstructionInstructionsEditPart.VISUAL_ID:
			return getInstructionInstructions_5007Parser();
		case StartNameEditPart.VISUAL_ID:
			return getStartName_5008Parser();
		case ResultNameEditPart.VISUAL_ID:
			return getResultName_5009Parser();
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
