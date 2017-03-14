package asu.edu.ser.capstone.pivi.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import asu.edu.ser.capstone.pivi.diagram.edit.commands.EndNodeCreateCommand;
import asu.edu.ser.capstone.pivi.diagram.edit.commands.IfEndCreateCommand;
import asu.edu.ser.capstone.pivi.diagram.edit.commands.IfStartCreateCommand;
import asu.edu.ser.capstone.pivi.diagram.edit.commands.InstructionCreateCommand;
import asu.edu.ser.capstone.pivi.diagram.edit.commands.StartNodeCreateCommand;
import asu.edu.ser.capstone.pivi.diagram.edit.commands.WhileStartCreateCommand;
import asu.edu.ser.capstone.pivi.diagram.providers.PiviElementTypes;

/**
 * @generated
 */
public class DiagramItemSemanticEditPolicy extends PiviBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DiagramItemSemanticEditPolicy() {
		super(PiviElementTypes.Diagram_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PiviElementTypes.WhileStart_2001 == req.getElementType()) {
			return getGEFWrapper(new WhileStartCreateCommand(req));
		}
		if (PiviElementTypes.EndNode_2002 == req.getElementType()) {
			return getGEFWrapper(new EndNodeCreateCommand(req));
		}
		if (PiviElementTypes.IfStart_2003 == req.getElementType()) {
			return getGEFWrapper(new IfStartCreateCommand(req));
		}
		if (PiviElementTypes.Instruction_2004 == req.getElementType()) {
			return getGEFWrapper(new InstructionCreateCommand(req));
		}
		if (PiviElementTypes.IfEnd_2005 == req.getElementType()) {
			return getGEFWrapper(new IfEndCreateCommand(req));
		}
		if (PiviElementTypes.StartNode_2006 == req.getElementType()) {
			return getGEFWrapper(new StartNodeCreateCommand(req));
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
