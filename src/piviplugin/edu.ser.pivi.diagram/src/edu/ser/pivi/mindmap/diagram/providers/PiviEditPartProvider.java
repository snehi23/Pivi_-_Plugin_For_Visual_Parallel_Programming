package edu.ser.pivi.mindmap.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import edu.ser.pivi.mindmap.diagram.edit.parts.MapEditPart;
import edu.ser.pivi.mindmap.diagram.edit.parts.PiviEditPartFactory;
import edu.ser.pivi.mindmap.diagram.part.PiviVisualIDRegistry;

/**
 * @generated
 */
public class PiviEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public PiviEditPartProvider() {
		super(new PiviEditPartFactory(), PiviVisualIDRegistry.TYPED_INSTANCE, MapEditPart.MODEL_ID);
	}

}
