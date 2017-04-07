package asu.ser.capstone.pivi.diagram.part;

import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramActionBarContributor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;

import asu.ser.capstone.pivi.diagram.part.custom.GenerateCodeAction;

/**
 * @generated
 */
public class PiviDiagramActionBarContributor extends DiagramActionBarContributor {

	/**
	* @generated
	*/
	protected Class getEditorClass() {
		return PiviDiagramEditor.class;
	}

	/**
	* @generated
	*/
	protected String getEditorId() {
		return PiviDiagramEditor.ID;
	}

	/**
	* @generated
	*/
	public void init(IActionBars bars, IWorkbenchPage page) {
		super.init(bars, page);
		// print preview
		IToolBarManager toolBarManager = bars.getToolBarManager(); 
		toolBarManager.remove("fontNameContributionItem");
		toolBarManager.remove("fontSizeContributionItem");
		IMenuManager fileMenu = bars.getMenuManager().findMenuUsingPath(IWorkbenchActionConstants.M_FILE);
		assert fileMenu != null;
		IAction genCodeAction = new GenerateCodeAction();
		toolBarManager.add(genCodeAction);
//		fileMenu.add(genCodeAction);
		fileMenu.remove("pageSetupAction"); //$NON-NLS-1$
	}
}
