package asu.ser.capstone.pivi.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import asu.ser.capstone.pivi.diagram.edit.commands.InputPortCreateCommand;
import asu.ser.capstone.pivi.diagram.edit.commands.OutputPortCreateCommand;
import asu.ser.capstone.pivi.diagram.edit.commands.ResultCreateCommand;
import asu.ser.capstone.pivi.diagram.providers.PiviElementTypes;

/**
 * @generated
 */
public class IfStartStatementIfStartCompartmentFigureItemSemanticEditPolicy extends PiviBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public IfStartStatementIfStartCompartmentFigureItemSemanticEditPolicy() {
		super(PiviElementTypes.IfStartStatement_2004);
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
		if (PiviElementTypes.Result_3003 == req.getElementType()) {
			return getGEFWrapper(new ResultCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
