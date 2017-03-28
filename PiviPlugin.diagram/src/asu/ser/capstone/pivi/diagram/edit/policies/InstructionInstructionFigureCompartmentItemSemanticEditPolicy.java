package asu.ser.capstone.pivi.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import asu.ser.capstone.pivi.diagram.edit.commands.InputPortCreateCommand;
import asu.ser.capstone.pivi.diagram.edit.commands.OutputPortCreateCommand;
import asu.ser.capstone.pivi.diagram.providers.PiviElementTypes;

/**
 * @generated
 */
public class InstructionInstructionFigureCompartmentItemSemanticEditPolicy extends PiviBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public InstructionInstructionFigureCompartmentItemSemanticEditPolicy() {
		super(PiviElementTypes.Instruction_2004);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PiviElementTypes.InputPort_3001 == req.getElementType()) {
			return getGEFWrapper(new InputPortCreateCommand(req));
		}
		if (PiviElementTypes.OutputPort_3002 == req.getElementType()) {
			return getGEFWrapper(new OutputPortCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
