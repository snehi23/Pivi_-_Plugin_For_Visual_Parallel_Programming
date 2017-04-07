package asu.ser.capstone.pivi.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry;

/**
 * @generated
 */
public class PiviEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (PiviVisualIDRegistry.getVisualID(view)) {

			case PiviDiagramEditPart.VISUAL_ID:
				return new PiviDiagramEditPart(view);

			case IfEndStatementEditPart.VISUAL_ID:
				return new IfEndStatementEditPart(view);

			case IfEndStatementNameEditPart.VISUAL_ID:
				return new IfEndStatementNameEditPart(view);

			case StartEditPart.VISUAL_ID:
				return new StartEditPart(view);

			case StartNameEditPart.VISUAL_ID:
				return new StartNameEditPart(view);

			case InstructionEditPart.VISUAL_ID:
				return new InstructionEditPart(view);

			case InstructionNameEditPart.VISUAL_ID:
				return new InstructionNameEditPart(view);

			case InstructionInstructionsEditPart.VISUAL_ID:
				return new InstructionInstructionsEditPart(view);

			case IfStartStatementEditPart.VISUAL_ID:
				return new IfStartStatementEditPart(view);

			case IfStartStatementNameEditPart.VISUAL_ID:
				return new IfStartStatementNameEditPart(view);

			case IfStartStatementConditionEditPart.VISUAL_ID:
				return new IfStartStatementConditionEditPart(view);

			case WhileStatementEditPart.VISUAL_ID:
				return new WhileStatementEditPart(view);

			case WhileStatementNameEditPart.VISUAL_ID:
				return new WhileStatementNameEditPart(view);

			case WhileStatementConditionEditPart.VISUAL_ID:
				return new WhileStatementConditionEditPart(view);

			case InputPortEditPart.VISUAL_ID:
				return new InputPortEditPart(view);

			case OutputPortEditPart.VISUAL_ID:
				return new OutputPortEditPart(view);

			case ResultEditPart.VISUAL_ID:
				return new ResultEditPart(view);

			case IfEndStatementIfEndCompartmentFigureEditPart.VISUAL_ID:
				return new IfEndStatementIfEndCompartmentFigureEditPart(view);

			case InstructionInstructionCompartmentFigureEditPart.VISUAL_ID:
				return new InstructionInstructionCompartmentFigureEditPart(view);

			case IfStartStatementIfStartCompartmentFigureEditPart.VISUAL_ID:
				return new IfStartStatementIfStartCompartmentFigureEditPart(view);

			case WhileStatementWhileCompartmentFigureEditPart.VISUAL_ID:
				return new WhileStatementWhileCompartmentFigureEditPart(view);

			case TerminalInputPortsEditPart.VISUAL_ID:
				return new TerminalInputPortsEditPart(view);

			case OutputPortResultEditPart.VISUAL_ID:
				return new OutputPortResultEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
