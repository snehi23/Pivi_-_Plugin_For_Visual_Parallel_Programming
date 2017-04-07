package asu.ser.capstone.pivi.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
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

import asu.ser.capstone.pivi.diagram.edit.parts.IfEndStatementEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.IfEndStatementNameEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.IfStartStatementEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.IfStartStatementNameEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.InstructionEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.InstructionNameEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.OutputPortResultEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.ResultEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.StartEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.StartNameEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.TerminalInputPortsEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.WhileStatementEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.WhileStatementNameEditPart;
import asu.ser.capstone.pivi.diagram.part.PiviDiagramEditorPlugin;
import asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry;
import asu.ser.capstone.pivi.diagram.providers.PiviElementTypes;
import asu.ser.capstone.pivi.diagram.providers.PiviParserProvider;

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
		case PiviDiagramEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http:///asu/ser/capstone/pivi.ecore?PiviDiagram", //$NON-NLS-1$
					PiviElementTypes.PiviDiagram_1000);
		case IfEndStatementEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http:///asu/ser/capstone/pivi.ecore?IfEndStatement", //$NON-NLS-1$
					PiviElementTypes.IfEndStatement_2001);
		case StartEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http:///asu/ser/capstone/pivi.ecore?Start", //$NON-NLS-1$
					PiviElementTypes.Start_2002);
		case InstructionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http:///asu/ser/capstone/pivi.ecore?Instruction", //$NON-NLS-1$
					PiviElementTypes.Instruction_2003);
		case IfStartStatementEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http:///asu/ser/capstone/pivi.ecore?IfStartStatement", //$NON-NLS-1$
					PiviElementTypes.IfStartStatement_2004);
		case WhileStatementEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http:///asu/ser/capstone/pivi.ecore?WhileStatement", //$NON-NLS-1$
					PiviElementTypes.WhileStatement_2005);
		case InputPortEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http:///asu/ser/capstone/pivi.ecore?InputPort", //$NON-NLS-1$
					PiviElementTypes.InputPort_3001);
		case OutputPortEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http:///asu/ser/capstone/pivi.ecore?OutputPort", //$NON-NLS-1$
					PiviElementTypes.OutputPort_3002);
		case ResultEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http:///asu/ser/capstone/pivi.ecore?Result", PiviElementTypes.Result_3003); //$NON-NLS-1$
		case TerminalInputPortsEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http:///asu/ser/capstone/pivi.ecore?Terminal?inputPorts", //$NON-NLS-1$
					PiviElementTypes.TerminalInputPorts_4001);
		case OutputPortResultEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http:///asu/ser/capstone/pivi.ecore?OutputPort?result", //$NON-NLS-1$
					PiviElementTypes.OutputPortResult_4002);
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
		case PiviDiagramEditPart.VISUAL_ID:
			return getPiviDiagram_1000Text(view);
		case IfEndStatementEditPart.VISUAL_ID:
			return getIfEndStatement_2001Text(view);
		case StartEditPart.VISUAL_ID:
			return getStart_2002Text(view);
		case InstructionEditPart.VISUAL_ID:
			return getInstruction_2003Text(view);
		case IfStartStatementEditPart.VISUAL_ID:
			return getIfStartStatement_2004Text(view);
		case WhileStatementEditPart.VISUAL_ID:
			return getWhileStatement_2005Text(view);
		case InputPortEditPart.VISUAL_ID:
			return getInputPort_3001Text(view);
		case OutputPortEditPart.VISUAL_ID:
			return getOutputPort_3002Text(view);
		case ResultEditPart.VISUAL_ID:
			return getResult_3003Text(view);
		case TerminalInputPortsEditPart.VISUAL_ID:
			return getTerminalInputPorts_4001Text(view);
		case OutputPortResultEditPart.VISUAL_ID:
			return getOutputPortResult_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getPiviDiagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getIfEndStatement_2001Text(View view) {
		IParser parser = PiviParserProvider.getParser(PiviElementTypes.IfEndStatement_2001,
				view.getElement() != null ? view.getElement() : view,
				PiviVisualIDRegistry.getType(IfEndStatementNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PiviDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getStart_2002Text(View view) {
		IParser parser = PiviParserProvider.getParser(PiviElementTypes.Start_2002,
				view.getElement() != null ? view.getElement() : view,
				PiviVisualIDRegistry.getType(StartNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PiviDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInstruction_2003Text(View view) {
		IParser parser = PiviParserProvider.getParser(PiviElementTypes.Instruction_2003,
				view.getElement() != null ? view.getElement() : view,
				PiviVisualIDRegistry.getType(InstructionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PiviDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIfStartStatement_2004Text(View view) {
		IParser parser = PiviParserProvider.getParser(PiviElementTypes.IfStartStatement_2004,
				view.getElement() != null ? view.getElement() : view,
				PiviVisualIDRegistry.getType(IfStartStatementNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PiviDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getWhileStatement_2005Text(View view) {
		IParser parser = PiviParserProvider.getParser(PiviElementTypes.WhileStatement_2005,
				view.getElement() != null ? view.getElement() : view,
				PiviVisualIDRegistry.getType(WhileStatementNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PiviDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getResult_3003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getTerminalInputPorts_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getOutputPortResult_4002Text(View view) {
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
		return PiviDiagramEditPart.MODEL_ID.equals(PiviVisualIDRegistry.getModelID(view));
	}

}
