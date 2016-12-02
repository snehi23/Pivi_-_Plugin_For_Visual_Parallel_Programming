package edu.ser.pivi.mindmap.diagram.navigator;

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

import edu.ser.pivi.mindmap.diagram.edit.parts.EndEditPart;
import edu.ser.pivi.mindmap.diagram.edit.parts.EndNameEditPart;
import edu.ser.pivi.mindmap.diagram.edit.parts.MapEditPart;
import edu.ser.pivi.mindmap.diagram.edit.parts.StartConnectorEditPart;
import edu.ser.pivi.mindmap.diagram.edit.parts.StartEditPart;
import edu.ser.pivi.mindmap.diagram.edit.parts.StartNameEditPart;
import edu.ser.pivi.mindmap.diagram.part.PiviDiagramEditorPlugin;
import edu.ser.pivi.mindmap.diagram.part.PiviVisualIDRegistry;
import edu.ser.pivi.mindmap.diagram.providers.PiviElementTypes;
import edu.ser.pivi.mindmap.diagram.providers.PiviParserProvider;

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
		case MapEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.example.org/mindmap?Map", PiviElementTypes.Map_1000); //$NON-NLS-1$
		case EndEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/mindmap?End", PiviElementTypes.End_2001); //$NON-NLS-1$
		case StartEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/mindmap?Start", PiviElementTypes.Start_2002); //$NON-NLS-1$
		case StartConnectorEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/mindmap?Start?connector", //$NON-NLS-1$
					PiviElementTypes.StartConnector_4001);
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
		case MapEditPart.VISUAL_ID:
			return getMap_1000Text(view);
		case EndEditPart.VISUAL_ID:
			return getEnd_2001Text(view);
		case StartEditPart.VISUAL_ID:
			return getStart_2002Text(view);
		case StartConnectorEditPart.VISUAL_ID:
			return getStartConnector_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getMap_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getEnd_2001Text(View view) {
		IParser parser = PiviParserProvider.getParser(PiviElementTypes.End_2001,
				view.getElement() != null ? view.getElement() : view,
				PiviVisualIDRegistry.getType(EndNameEditPart.VISUAL_ID));
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
	private String getStartConnector_4001Text(View view) {
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
		return MapEditPart.MODEL_ID.equals(PiviVisualIDRegistry.getModelID(view));
	}

}
