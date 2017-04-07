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
import asu.ser.capstone.pivi.diagram.edit.parts.IfEndStatementEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.IfStartStatementEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.InstructionEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.OutputPortResultEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.ResultEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.StartEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.TerminalInputPortsEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.WhileStatementEditPart;
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
	public static final IElementType IfEndStatement_2001 = getElementType("PiviPlugin.diagram.IfEndStatement_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Start_2002 = getElementType("PiviPlugin.diagram.Start_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Instruction_2003 = getElementType("PiviPlugin.diagram.Instruction_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType IfStartStatement_2004 = getElementType("PiviPlugin.diagram.IfStartStatement_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType WhileStatement_2005 = getElementType("PiviPlugin.diagram.WhileStatement_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InputPort_3001 = getElementType("PiviPlugin.diagram.InputPort_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType OutputPort_3002 = getElementType("PiviPlugin.diagram.OutputPort_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Result_3003 = getElementType("PiviPlugin.diagram.Result_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TerminalInputPorts_4001 = getElementType(
			"PiviPlugin.diagram.TerminalInputPorts_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType OutputPortResult_4002 = getElementType("PiviPlugin.diagram.OutputPortResult_4002"); //$NON-NLS-1$

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

			elements.put(IfEndStatement_2001, PiviPackage.eINSTANCE.getIfEndStatement());

			elements.put(Start_2002, PiviPackage.eINSTANCE.getStart());

			elements.put(Instruction_2003, PiviPackage.eINSTANCE.getInstruction());

			elements.put(IfStartStatement_2004, PiviPackage.eINSTANCE.getIfStartStatement());

			elements.put(WhileStatement_2005, PiviPackage.eINSTANCE.getWhileStatement());

			elements.put(InputPort_3001, PiviPackage.eINSTANCE.getInputPort());

			elements.put(OutputPort_3002, PiviPackage.eINSTANCE.getOutputPort());

			elements.put(Result_3003, PiviPackage.eINSTANCE.getResult());

			elements.put(TerminalInputPorts_4001, PiviPackage.eINSTANCE.getTerminal_InputPorts());

			elements.put(OutputPortResult_4002, PiviPackage.eINSTANCE.getOutputPort_Result());
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
			KNOWN_ELEMENT_TYPES.add(IfEndStatement_2001);
			KNOWN_ELEMENT_TYPES.add(Start_2002);
			KNOWN_ELEMENT_TYPES.add(Instruction_2003);
			KNOWN_ELEMENT_TYPES.add(IfStartStatement_2004);
			KNOWN_ELEMENT_TYPES.add(WhileStatement_2005);
			KNOWN_ELEMENT_TYPES.add(InputPort_3001);
			KNOWN_ELEMENT_TYPES.add(OutputPort_3002);
			KNOWN_ELEMENT_TYPES.add(Result_3003);
			KNOWN_ELEMENT_TYPES.add(TerminalInputPorts_4001);
			KNOWN_ELEMENT_TYPES.add(OutputPortResult_4002);
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
		case IfEndStatementEditPart.VISUAL_ID:
			return IfEndStatement_2001;
		case StartEditPart.VISUAL_ID:
			return Start_2002;
		case InstructionEditPart.VISUAL_ID:
			return Instruction_2003;
		case IfStartStatementEditPart.VISUAL_ID:
			return IfStartStatement_2004;
		case WhileStatementEditPart.VISUAL_ID:
			return WhileStatement_2005;
		case InputPortEditPart.VISUAL_ID:
			return InputPort_3001;
		case OutputPortEditPart.VISUAL_ID:
			return OutputPort_3002;
		case ResultEditPart.VISUAL_ID:
			return Result_3003;
		case TerminalInputPortsEditPart.VISUAL_ID:
			return TerminalInputPorts_4001;
		case OutputPortResultEditPart.VISUAL_ID:
			return OutputPortResult_4002;
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
