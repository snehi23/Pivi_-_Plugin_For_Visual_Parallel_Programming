package asu.ser.capstone.pivi.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;

import asu.ser.capstone.pivi.diagram.edit.parts.custom.MethodStartCompartmentFigureListener;
import asu.ser.capstone.pivi.diagram.edit.parts.custom.MethodStartRoundedRectangle;
import asu.ser.capstone.pivi.diagram.edit.policies.MethodStartMethodStartFigureCompartmentCanonicalEditPolicy;
import asu.ser.capstone.pivi.diagram.edit.policies.MethodStartMethodStartFigureCompartmentItemSemanticEditPolicy;
import asu.ser.capstone.pivi.diagram.edit.policies.custom.MethodStatementOpenEditPolicy;
import asu.ser.capstone.pivi.diagram.edit.policies.custom.WhileStatementOpenEditPolicy;
import asu.ser.capstone.pivi.diagram.part.Messages;
import asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry;
import asu.ser.capstone.pivi.diagram.part.custom.MethodWizard;
import asu.ser.capstone.pivi.diagram.part.custom.WhileStatementWizard;
import asu.ser.capstone.pivi.diagram.providers.PiviElementTypes;

/**
 * @generated
 */
public class MethodStartMethodStartFigureCompartmentEditPart extends ListCompartmentEditPart {

	/**
	* @generated Not
	*/
	public static final int VISUAL_ID = 7007;
	protected Shell shell;
	protected WizardDialog wizardDialog;
	
	/**
	* @generated
	*/
	public MethodStartMethodStartFigureCompartmentEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected boolean hasModelChildrenChanged(Notification evt) {
		return false;
	}

	/**
	* @generated
	*/
	public String getCompartmentName() {
		return Messages.MethodStartMethodStartFigureCompartmentEditPart_title;
	}

	/**
	* @generated NOT
	*/
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
		result.setTitleVisibility(false);
		
		// Setup for a XYLayout
		IFigure contentPane = result.getContentPane();
		contentPane.setLayoutManager(new XYLayout());
 
		// Delete content pane insets
		Insets is = contentPane.getInsets();
		is.top = 0;
		is.bottom = 0;
		is.left = 0;
		is.right = 0;
 
		// Setup graphical elements
		MethodStartRoundedRectangle roundedRectangle = new MethodStartRoundedRectangle();
		contentPane.add(roundedRectangle);
 
		// Add the resize events listener
		result.addFigureListener(new MethodStartCompartmentFigureListener(this, roundedRectangle));
		shell = new Shell(SWT.DIALOG_TRIM | 
                SWT.PRIMARY_MODAL);
		wizardDialog = new WizardDialog(shell,
                new MethodWizard(this));
		return result;
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new MethodStartMethodStartFigureCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(PiviVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new MethodStartMethodStartFigureCompartmentCanonicalEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new MethodStatementOpenEditPolicy(wizardDialog));
	}

	/**
	* @generated
	*/
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == PiviElementTypes.InputPort_3001) {
				return this;
			}
			if (type == PiviElementTypes.OutputPort_3003) {
				return this;
			}
			if (type == PiviElementTypes.StartPort_3002) {
				return this;
			}
			return getParent().getTargetEditPart(request);
		}
		if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
			if (RequestConstants.REQ_CONNECTION_END.equals(request.getType())) {
				for (Object type : ((CreateUnspecifiedTypeConnectionRequest) request).getElementTypes()) {
					if (type instanceof IElementType) {
						IElementType elementType = (IElementType) type;
						if (elementType.equals(PiviElementTypes.OutputPortInputPort_4002)
								|| elementType.equals(PiviElementTypes.StartStartPort_4004))
							return super.getTargetEditPart(request);
					}
				}
			}
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

}
