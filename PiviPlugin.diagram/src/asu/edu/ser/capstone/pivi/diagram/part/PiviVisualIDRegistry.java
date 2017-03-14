package asu.edu.ser.capstone.pivi.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import asu.edu.ser.capstone.pivi.PiviPackage;
import asu.edu.ser.capstone.pivi.diagram.edit.parts.DiagramEditPart;
import asu.edu.ser.capstone.pivi.diagram.edit.parts.EdgeEditPart;
import asu.edu.ser.capstone.pivi.diagram.edit.parts.EndNodeEditPart;
import asu.edu.ser.capstone.pivi.diagram.edit.parts.IfEndEditPart;
import asu.edu.ser.capstone.pivi.diagram.edit.parts.IfStartEditPart;
import asu.edu.ser.capstone.pivi.diagram.edit.parts.IfStartIfStartFigureCompartmentEditPart;
import asu.edu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart;
import asu.edu.ser.capstone.pivi.diagram.edit.parts.InstructionEditPart;
import asu.edu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart;
import asu.edu.ser.capstone.pivi.diagram.edit.parts.StartNodeEditPart;
import asu.edu.ser.capstone.pivi.diagram.edit.parts.WhileStartEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class PiviVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "Pivi.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (DiagramEditPart.MODEL_ID.equals(view.getType())) {
				return DiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return asu.edu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				PiviDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (PiviPackage.eINSTANCE.getDiagram().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((asu.edu.ser.capstone.pivi.Diagram) domainElement)) {
			return DiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = asu.edu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getModelID(containerView);
		if (!DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = asu.edu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case DiagramEditPart.VISUAL_ID:
			if (PiviPackage.eINSTANCE.getWhileStart().isSuperTypeOf(domainElement.eClass())) {
				return WhileStartEditPart.VISUAL_ID;
			}
			if (PiviPackage.eINSTANCE.getEndNode().isSuperTypeOf(domainElement.eClass())) {
				return EndNodeEditPart.VISUAL_ID;
			}
			if (PiviPackage.eINSTANCE.getIfStart().isSuperTypeOf(domainElement.eClass())) {
				return IfStartEditPart.VISUAL_ID;
			}
			if (PiviPackage.eINSTANCE.getInstruction().isSuperTypeOf(domainElement.eClass())) {
				return InstructionEditPart.VISUAL_ID;
			}
			if (PiviPackage.eINSTANCE.getIfEnd().isSuperTypeOf(domainElement.eClass())) {
				return IfEndEditPart.VISUAL_ID;
			}
			if (PiviPackage.eINSTANCE.getStartNode().isSuperTypeOf(domainElement.eClass())) {
				return StartNodeEditPart.VISUAL_ID;
			}
			break;
		case IfStartIfStartFigureCompartmentEditPart.VISUAL_ID:
			if (PiviPackage.eINSTANCE.getInputPort().isSuperTypeOf(domainElement.eClass())) {
				return InputPortEditPart.VISUAL_ID;
			}
			if (PiviPackage.eINSTANCE.getOutputPort().isSuperTypeOf(domainElement.eClass())) {
				return OutputPortEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = asu.edu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getModelID(containerView);
		if (!DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = asu.edu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case DiagramEditPart.VISUAL_ID:
			if (WhileStartEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EndNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfStartEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InstructionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfEndEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StartNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfStartEditPart.VISUAL_ID:
			if (IfStartIfStartFigureCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfStartIfStartFigureCompartmentEditPart.VISUAL_ID:
			if (InputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (PiviPackage.eINSTANCE.getEdge().isSuperTypeOf(domainElement.eClass())) {
			return EdgeEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(asu.edu.ser.capstone.pivi.Diagram element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case IfStartIfStartFigureCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case DiagramEditPart.VISUAL_ID:
			return false;
		case WhileStartEditPart.VISUAL_ID:
		case EndNodeEditPart.VISUAL_ID:
		case InstructionEditPart.VISUAL_ID:
		case IfEndEditPart.VISUAL_ID:
		case StartNodeEditPart.VISUAL_ID:
		case InputPortEditPart.VISUAL_ID:
		case OutputPortEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return asu.edu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return asu.edu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return asu.edu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return asu.edu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return asu.edu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return asu.edu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
