package asu.ser.capstone.pivi.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import asu.ser.capstone.pivi.diagram.edit.commands.IfEndStatementCreateCommand;
import asu.ser.capstone.pivi.diagram.edit.commands.IfStartStatementCreateCommand;
import asu.ser.capstone.pivi.diagram.edit.commands.InstructionCreateCommand;
import asu.ser.capstone.pivi.diagram.edit.commands.ResultCreateCommand;
import asu.ser.capstone.pivi.diagram.edit.commands.StartCreateCommand;
import asu.ser.capstone.pivi.diagram.edit.commands.WhileStatementCreateCommand;
import asu.ser.capstone.pivi.diagram.providers.PiviElementTypes;

/**
 * @generated
 */
public class PiviDiagramItemSemanticEditPolicy extends PiviBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PiviDiagramItemSemanticEditPolicy() {
		super(PiviElementTypes.PiviDiagram_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PiviElementTypes.IfStartStatement_2001 == req.getElementType()) {
			return getGEFWrapper(new IfStartStatementCreateCommand(req));
		}
		if (PiviElementTypes.WhileStatement_2002 == req.getElementType()) {
			return getGEFWrapper(new WhileStatementCreateCommand(req));
		}
		if (PiviElementTypes.IfEndStatement_2003 == req.getElementType()) {
			return getGEFWrapper(new IfEndStatementCreateCommand(req));
		}
		if (PiviElementTypes.Instruction_2004 == req.getElementType()) {
			return getGEFWrapper(new InstructionCreateCommand(req));
		}
		if (PiviElementTypes.Start_2005 == req.getElementType()) {
			return getGEFWrapper(new StartCreateCommand(req));
		}
		if (PiviElementTypes.Result_2006 == req.getElementType()) {
			return getGEFWrapper(new ResultCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
