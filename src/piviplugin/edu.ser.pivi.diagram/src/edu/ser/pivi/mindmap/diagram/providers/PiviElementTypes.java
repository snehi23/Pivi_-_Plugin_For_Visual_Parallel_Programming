package edu.ser.pivi.mindmap.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import edu.ser.pivi.mindmap.MindmapPackage;
import edu.ser.pivi.mindmap.diagram.edit.parts.EndEditPart;
import edu.ser.pivi.mindmap.diagram.edit.parts.MapEditPart;
import edu.ser.pivi.mindmap.diagram.edit.parts.StartConnectorEditPart;
import edu.ser.pivi.mindmap.diagram.edit.parts.StartEditPart;
import edu.ser.pivi.mindmap.diagram.part.PiviDiagramEditorPlugin;

/**
 * @generated
 */
public class PiviElementTypes {

	/**
	* @generated
	*/
	private PiviElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			PiviDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Map_1000 = getElementType("edu.ser.pivi.diagram.Map_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType End_2001 = getElementType("edu.ser.pivi.diagram.End_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Start_2002 = getElementType("edu.ser.pivi.diagram.Start_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType StartConnector_4001 = getElementType("edu.ser.pivi.diagram.StartConnector_4001"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Map_1000, MindmapPackage.eINSTANCE.getMap());

			elements.put(End_2001, MindmapPackage.eINSTANCE.getEnd());

			elements.put(Start_2002, MindmapPackage.eINSTANCE.getStart());

			elements.put(StartConnector_4001, MindmapPackage.eINSTANCE.getStart_Connector());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Map_1000);
			KNOWN_ELEMENT_TYPES.add(End_2001);
			KNOWN_ELEMENT_TYPES.add(Start_2002);
			KNOWN_ELEMENT_TYPES.add(StartConnector_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case MapEditPart.VISUAL_ID:
			return Map_1000;
		case EndEditPart.VISUAL_ID:
			return End_2001;
		case StartEditPart.VISUAL_ID:
			return Start_2002;
		case StartConnectorEditPart.VISUAL_ID:
			return StartConnector_4001;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return edu.ser.pivi.mindmap.diagram.providers.PiviElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return edu.ser.pivi.mindmap.diagram.providers.PiviElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return edu.ser.pivi.mindmap.diagram.providers.PiviElementTypes.getElement(elementTypeAdapter);
		}
	};

}
