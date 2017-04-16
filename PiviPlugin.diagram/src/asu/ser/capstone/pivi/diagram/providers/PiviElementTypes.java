package asu.ser.capstone.pivi.diagram.providers;

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

import asu.ser.capstone.pivi.PiviPackage;
import asu.ser.capstone.pivi.diagram.edit.parts.IfEndEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.IfStartEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.InstructionEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.MethodEndEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.MethodStartEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.OutputPortInputPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.StartEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.StartStartPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.WhileEndEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.WhileStartEditPart;
import asu.ser.capstone.pivi.diagram.part.PiviDiagramEditorPlugin;

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
	public static final IElementType PiviDiagram_1000 = getElementType("PiviPlugin.diagram.PiviDiagram_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType IfStart_2001 = getElementType("PiviPlugin.diagram.IfStart_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType WhileEnd_2002 = getElementType("PiviPlugin.diagram.WhileEnd_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MethodEnd_2003 = getElementType("PiviPlugin.diagram.MethodEnd_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType IfEnd_2004 = getElementType("PiviPlugin.diagram.IfEnd_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Instruction_2005 = getElementType("PiviPlugin.diagram.Instruction_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MethodStart_2006 = getElementType("PiviPlugin.diagram.MethodStart_2006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType WhileStart_2007 = getElementType("PiviPlugin.diagram.WhileStart_2007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Start_2008 = getElementType("PiviPlugin.diagram.Start_2008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputPort_3001 = getElementType("PiviPlugin.diagram.InputPort_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType StartPort_3002 = getElementType("PiviPlugin.diagram.StartPort_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType OutputPort_3003 = getElementType("PiviPlugin.diagram.OutputPort_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType StartStartPort_4004 = getElementType("PiviPlugin.diagram.StartStartPort_4004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType OutputPortInputPort_4002 = getElementType(
			"PiviPlugin.diagram.OutputPortInputPort_4002"); //$NON-NLS-1$

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

			elements.put(PiviDiagram_1000, PiviPackage.eINSTANCE.getPiviDiagram());

			elements.put(IfStart_2001, PiviPackage.eINSTANCE.getIfStart());

			elements.put(WhileEnd_2002, PiviPackage.eINSTANCE.getWhileEnd());

			elements.put(MethodEnd_2003, PiviPackage.eINSTANCE.getMethodEnd());

			elements.put(IfEnd_2004, PiviPackage.eINSTANCE.getIfEnd());

			elements.put(Instruction_2005, PiviPackage.eINSTANCE.getInstruction());

			elements.put(MethodStart_2006, PiviPackage.eINSTANCE.getMethodStart());

			elements.put(WhileStart_2007, PiviPackage.eINSTANCE.getWhileStart());

			elements.put(Start_2008, PiviPackage.eINSTANCE.getStart());

			elements.put(InputPort_3001, PiviPackage.eINSTANCE.getInputPort());

			elements.put(StartPort_3002, PiviPackage.eINSTANCE.getStartPort());

			elements.put(OutputPort_3003, PiviPackage.eINSTANCE.getOutputPort());

			elements.put(StartStartPort_4004, PiviPackage.eINSTANCE.getStart_StartPort());

			elements.put(OutputPortInputPort_4002, PiviPackage.eINSTANCE.getOutputPort_InputPort());
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
			KNOWN_ELEMENT_TYPES.add(PiviDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(IfStart_2001);
			KNOWN_ELEMENT_TYPES.add(WhileEnd_2002);
			KNOWN_ELEMENT_TYPES.add(MethodEnd_2003);
			KNOWN_ELEMENT_TYPES.add(IfEnd_2004);
			KNOWN_ELEMENT_TYPES.add(Instruction_2005);
			KNOWN_ELEMENT_TYPES.add(MethodStart_2006);
			KNOWN_ELEMENT_TYPES.add(WhileStart_2007);
			KNOWN_ELEMENT_TYPES.add(Start_2008);
			KNOWN_ELEMENT_TYPES.add(InputPort_3001);
			KNOWN_ELEMENT_TYPES.add(StartPort_3002);
			KNOWN_ELEMENT_TYPES.add(OutputPort_3003);
			KNOWN_ELEMENT_TYPES.add(StartStartPort_4004);
			KNOWN_ELEMENT_TYPES.add(OutputPortInputPort_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case PiviDiagramEditPart.VISUAL_ID:
			return PiviDiagram_1000;
		case IfStartEditPart.VISUAL_ID:
			return IfStart_2001;
		case WhileEndEditPart.VISUAL_ID:
			return WhileEnd_2002;
		case MethodEndEditPart.VISUAL_ID:
			return MethodEnd_2003;
		case IfEndEditPart.VISUAL_ID:
			return IfEnd_2004;
		case InstructionEditPart.VISUAL_ID:
			return Instruction_2005;
		case MethodStartEditPart.VISUAL_ID:
			return MethodStart_2006;
		case WhileStartEditPart.VISUAL_ID:
			return WhileStart_2007;
		case StartEditPart.VISUAL_ID:
			return Start_2008;
		case InputPortEditPart.VISUAL_ID:
			return InputPort_3001;
		case StartPortEditPart.VISUAL_ID:
			return StartPort_3002;
		case OutputPortEditPart.VISUAL_ID:
			return OutputPort_3003;
		case StartStartPortEditPart.VISUAL_ID:
			return StartStartPort_4004;
		case OutputPortInputPortEditPart.VISUAL_ID:
			return OutputPortInputPort_4002;
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
			return asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.getElement(elementTypeAdapter);
		}
	};

}
