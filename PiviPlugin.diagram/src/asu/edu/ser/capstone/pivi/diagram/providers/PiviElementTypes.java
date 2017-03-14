package asu.edu.ser.capstone.pivi.diagram.providers;

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

import asu.edu.ser.capstone.pivi.PiviPackage;
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
	public static final IElementType Diagram_1000 = getElementType("Pivi.diagram.Diagram_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType WhileStart_2001 = getElementType("Pivi.diagram.WhileStart_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EndNode_2002 = getElementType("Pivi.diagram.EndNode_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType IfStart_2003 = getElementType("Pivi.diagram.IfStart_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Instruction_2004 = getElementType("Pivi.diagram.Instruction_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType IfEnd_2005 = getElementType("Pivi.diagram.IfEnd_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType StartNode_2006 = getElementType("Pivi.diagram.StartNode_2006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputPort_3001 = getElementType("Pivi.diagram.InputPort_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType OutputPort_3002 = getElementType("Pivi.diagram.OutputPort_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Edge_4001 = getElementType("Pivi.diagram.Edge_4001"); //$NON-NLS-1$

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

			elements.put(Diagram_1000, PiviPackage.eINSTANCE.getDiagram());

			elements.put(WhileStart_2001, PiviPackage.eINSTANCE.getWhileStart());

			elements.put(EndNode_2002, PiviPackage.eINSTANCE.getEndNode());

			elements.put(IfStart_2003, PiviPackage.eINSTANCE.getIfStart());

			elements.put(Instruction_2004, PiviPackage.eINSTANCE.getInstruction());

			elements.put(IfEnd_2005, PiviPackage.eINSTANCE.getIfEnd());

			elements.put(StartNode_2006, PiviPackage.eINSTANCE.getStartNode());

			elements.put(InputPort_3001, PiviPackage.eINSTANCE.getInputPort());

			elements.put(OutputPort_3002, PiviPackage.eINSTANCE.getOutputPort());

			elements.put(Edge_4001, PiviPackage.eINSTANCE.getEdge());
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
			KNOWN_ELEMENT_TYPES.add(Diagram_1000);
			KNOWN_ELEMENT_TYPES.add(WhileStart_2001);
			KNOWN_ELEMENT_TYPES.add(EndNode_2002);
			KNOWN_ELEMENT_TYPES.add(IfStart_2003);
			KNOWN_ELEMENT_TYPES.add(Instruction_2004);
			KNOWN_ELEMENT_TYPES.add(IfEnd_2005);
			KNOWN_ELEMENT_TYPES.add(StartNode_2006);
			KNOWN_ELEMENT_TYPES.add(InputPort_3001);
			KNOWN_ELEMENT_TYPES.add(OutputPort_3002);
			KNOWN_ELEMENT_TYPES.add(Edge_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case DiagramEditPart.VISUAL_ID:
			return Diagram_1000;
		case WhileStartEditPart.VISUAL_ID:
			return WhileStart_2001;
		case EndNodeEditPart.VISUAL_ID:
			return EndNode_2002;
		case IfStartEditPart.VISUAL_ID:
			return IfStart_2003;
		case InstructionEditPart.VISUAL_ID:
			return Instruction_2004;
		case IfEndEditPart.VISUAL_ID:
			return IfEnd_2005;
		case StartNodeEditPart.VISUAL_ID:
			return StartNode_2006;
		case InputPortEditPart.VISUAL_ID:
			return InputPort_3001;
		case OutputPortEditPart.VISUAL_ID:
			return OutputPort_3002;
		case EdgeEditPart.VISUAL_ID:
			return Edge_4001;
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
			return asu.edu.ser.capstone.pivi.diagram.providers.PiviElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return asu.edu.ser.capstone.pivi.diagram.providers.PiviElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return asu.edu.ser.capstone.pivi.diagram.providers.PiviElementTypes.getElement(elementTypeAdapter);
		}
	};

}
