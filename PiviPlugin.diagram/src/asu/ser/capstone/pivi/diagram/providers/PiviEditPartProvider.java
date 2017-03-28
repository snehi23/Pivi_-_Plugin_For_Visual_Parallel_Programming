package asu.ser.capstone.pivi.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.PiviEditPartFactory;
import asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry;

/**
 * @generated
 */
public class PiviEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public PiviEditPartProvider() {
		super(new PiviEditPartFactory(), PiviVisualIDRegistry.TYPED_INSTANCE, PiviDiagramEditPart.MODEL_ID);
	}

}
