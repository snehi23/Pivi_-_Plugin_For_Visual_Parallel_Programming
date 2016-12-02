package edu.ser.pivi.mindmap.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import edu.ser.pivi.mindmap.diagram.providers.PiviElementTypes;

/**
 * @generated
 */
public class StartConnectorItemSemanticEditPolicy extends PiviBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public StartConnectorItemSemanticEditPolicy() {
		super(PiviElementTypes.StartConnector_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
