package asu.edu.ser.capstone.pivi.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import asu.edu.ser.capstone.pivi.diagram.edit.parts.DiagramEditPart;
import asu.edu.ser.capstone.pivi.diagram.edit.parts.PiviEditPartFactory;
import asu.edu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry;

/**
 * @generated
 */
public class PiviEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public PiviEditPartProvider() {
		super(new PiviEditPartFactory(), PiviVisualIDRegistry.TYPED_INSTANCE, DiagramEditPart.MODEL_ID);
	}

}
