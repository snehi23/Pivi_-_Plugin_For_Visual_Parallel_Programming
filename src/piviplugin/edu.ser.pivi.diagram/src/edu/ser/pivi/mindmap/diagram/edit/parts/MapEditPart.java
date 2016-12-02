package edu.ser.pivi.mindmap.diagram.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

import edu.ser.pivi.mindmap.diagram.edit.policies.MapCanonicalEditPolicy;
import edu.ser.pivi.mindmap.diagram.edit.policies.MapItemSemanticEditPolicy;
import edu.ser.pivi.mindmap.diagram.part.PiviVisualIDRegistry;

/**
 * @generated
 */
public class MapEditPart extends DiagramEditPart {

	/**
	* @generated
	*/
	public final static String MODEL_ID = "Pivi"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 1000;

	/**
	* @generated
	*/
	public MapEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new MapItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new MapCanonicalEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(PiviVisualIDRegistry.TYPED_INSTANCE));
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}

}
