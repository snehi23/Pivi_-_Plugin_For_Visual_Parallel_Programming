package edu.ser.pivi.mindmap.diagram.providers;

import edu.ser.pivi.mindmap.diagram.part.PiviDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = PiviDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			PiviDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
