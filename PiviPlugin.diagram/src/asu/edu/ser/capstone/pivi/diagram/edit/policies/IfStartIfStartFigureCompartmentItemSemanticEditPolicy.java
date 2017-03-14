package asu.edu.ser.capstone.pivi.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import asu.edu.ser.capstone.pivi.diagram.edit.commands.InputPortCreateCommand;
import asu.edu.ser.capstone.pivi.diagram.edit.commands.OutputPortCreateCommand;
import asu.edu.ser.capstone.pivi.diagram.providers.PiviElementTypes;

/**
 * @generated
 */
public class IfStartIfStartFigureCompartmentItemSemanticEditPolicy extends PiviBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public IfStartIfStartFigureCompartmentItemSemanticEditPolicy() {
		super(PiviElementTypes.IfStart_2003);
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
