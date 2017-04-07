package asu.ser.capstone.pivi.diagram.preferences;

import org.eclipse.gef.SnapToGrid;
import org.eclipse.gmf.runtime.diagram.ui.internal.ruler.SnapToGridEx;
import org.eclipse.gmf.runtime.diagram.ui.preferences.AppearancePreferencePage;
import org.eclipse.gmf.tooling.runtime.providers.router.SnapToGridRouter;
import org.eclipse.jface.preference.PreferenceStore;

import asu.ser.capstone.pivi.diagram.part.PiviDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramAppearancePreferencePage extends AppearancePreferencePage {

	/**
	* @generated
	*/
	public DiagramAppearancePreferencePage() {
		PreferenceStore preferenceStore= (PreferenceStore) PiviDiagramEditorPlugin.getInstance().getPreferenceStore();
		preferenceStore.setDefault(SnapToGrid.PROPERTY_GRID_ENABLED, true);
		preferenceStore.setDefault(SnapToGrid.PROPERTY_GRID_VISIBLE, true);
		preferenceStore.setDefault(SnapToGridEx.PROPERTY_GRID_ENABLED, true);
		preferenceStore.setDefault(SnapToGridEx.PROPERTY_GRID_VISIBLE, true);
		
		setPreferenceStore(preferenceStore);
	}
}
