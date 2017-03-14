package asu.edu.ser.capstone.pivi.diagram.navigator;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import asu.edu.ser.capstone.pivi.diagram.edit.parts.DiagramEditPart;
import asu.edu.ser.capstone.pivi.diagram.edit.parts.EdgeEditPart;
import asu.edu.ser.capstone.pivi.diagram.edit.parts.EndNodeEditPart;
import asu.edu.ser.capstone.pivi.diagram.edit.parts.IfEndEditPart;
import asu.edu.ser.capstone.pivi.diagram.edit.parts.IfStartEditPart;
import asu.edu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart;
import asu.edu.ser.capstone.pivi.diagram.edit.parts.InstructionEditPart;
import asu.edu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart;
import asu.edu.ser.capstone.pivi.diagram.edit.parts.StartNodeEditPart;
import asu.edu.ser.capstone.pivi.diagram.edit.parts.WhileStartEditPart;
import asu.edu.ser.capstone.pivi.diagram.part.PiviDiagramEditorPlugin;
import asu.edu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry;
import asu.edu.ser.capstone.pivi.diagram.providers.PiviElementTypes;

/**
 * @generated
 */
public class PiviNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		PiviDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		PiviDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof PiviNavigatorItem && !isOwnView(((PiviNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof PiviNavigatorGroup) {
			PiviNavigatorGroup group = (PiviNavigatorGroup) element;
			return PiviDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof PiviNavigatorItem) {
			PiviNavigatorItem navigatorItem = (PiviNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (PiviVisualIDRegistry.getVisualID(view)) {
		case DiagramEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http:///asu/edu/ser/capstone/pivi.ecore?Diagram", //$NON-NLS-1$
					PiviElementTypes.Diagram_1000);
		case WhileStartEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http:///asu/edu/ser/capstone/pivi.ecore?WhileStart", //$NON-NLS-1$
					PiviElementTypes.WhileStart_2001);
		case EndNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http:///asu/edu/ser/capstone/pivi.ecore?EndNode", //$NON-NLS-1$
					PiviElementTypes.EndNode_2002);
		case IfStartEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http:///asu/edu/ser/capstone/pivi.ecore?IfStart", //$NON-NLS-1$
					PiviElementTypes.IfStart_2003);
		case InstructionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http:///asu/edu/ser/capstone/pivi.ecore?Instruction", //$NON-NLS-1$
					PiviElementTypes.Instruction_2004);
		case IfEndEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http:///asu/edu/ser/capstone/pivi.ecore?IfEnd", //$NON-NLS-1$
					PiviElementTypes.IfEnd_2005);
		case StartNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http:///asu/edu/ser/capstone/pivi.ecore?StartNode", //$NON-NLS-1$
					PiviElementTypes.StartNode_2006);
		case InputPortEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http:///asu/edu/ser/capstone/pivi.ecore?InputPort", //$NON-NLS-1$
					PiviElementTypes.InputPort_3001);
		case OutputPortEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http:///asu/edu/ser/capstone/pivi.ecore?OutputPort", //$NON-NLS-1$
					PiviElementTypes.OutputPort_3002);
		case EdgeEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http:///asu/edu/ser/capstone/pivi.ecore?Edge", PiviElementTypes.Edge_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = PiviDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && PiviElementTypes.isKnownElementType(elementType)) {
			image = PiviElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof PiviNavigatorGroup) {
			PiviNavigatorGroup group = (PiviNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof PiviNavigatorItem) {
			PiviNavigatorItem navigatorItem = (PiviNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (PiviVisualIDRegistry.getVisualID(view)) {
		case DiagramEditPart.VISUAL_ID:
			return getDiagram_1000Text(view);
		case WhileStartEditPart.VISUAL_ID:
			return getWhileStart_2001Text(view);
		case EndNodeEditPart.VISUAL_ID:
			return getEndNode_2002Text(view);
		case IfStartEditPart.VISUAL_ID:
			return getIfStart_2003Text(view);
		case InstructionEditPart.VISUAL_ID:
			return getInstruction_2004Text(view);
		case IfEndEditPart.VISUAL_ID:
			return getIfEnd_2005Text(view);
		case StartNodeEditPart.VISUAL_ID:
			return getStartNode_2006Text(view);
		case InputPortEditPart.VISUAL_ID:
			return getInputPort_3001Text(view);
		case OutputPortEditPart.VISUAL_ID:
			return getOutputPort_3002Text(view);
		case EdgeEditPart.VISUAL_ID:
			return getEdge_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getDiagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getWhileStart_2001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getEndNode_2002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getIfStart_2003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getInstruction_2004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getIfEnd_2005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getStartNode_2006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getInputPort_3001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getOutputPort_3002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getEdge_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return DiagramEditPart.MODEL_ID.equals(PiviVisualIDRegistry.getModelID(view));
	}

}
