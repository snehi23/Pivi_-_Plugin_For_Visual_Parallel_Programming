package edu.ser.pivi.mindmap.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import edu.ser.pivi.mindmap.Map;
import edu.ser.pivi.mindmap.MindmapPackage;
import edu.ser.pivi.mindmap.diagram.edit.parts.EndEditPart;
import edu.ser.pivi.mindmap.diagram.edit.parts.EndNameEditPart;
import edu.ser.pivi.mindmap.diagram.edit.parts.MapEditPart;
import edu.ser.pivi.mindmap.diagram.edit.parts.StartEditPart;
import edu.ser.pivi.mindmap.diagram.edit.parts.StartNameEditPart;

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
	private static final String DEBUG_KEY = "edu.ser.pivi.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (MapEditPart.MODEL_ID.equals(view.getType())) {
				return MapEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return edu.ser.pivi.mindmap.diagram.part.PiviVisualIDRegistry.getVisualID(view.getType());
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
		if (MindmapPackage.eINSTANCE.getMap().isSuperTypeOf(domainElement.eClass()) && isDiagram((Map) domainElement)) {
			return MapEditPart.VISUAL_ID;
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
		String containerModelID = edu.ser.pivi.mindmap.diagram.part.PiviVisualIDRegistry.getModelID(containerView);
		if (!MapEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (MapEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = edu.ser.pivi.mindmap.diagram.part.PiviVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MapEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case MapEditPart.VISUAL_ID:
			if (MindmapPackage.eINSTANCE.getEnd().isSuperTypeOf(domainElement.eClass())) {
				return EndEditPart.VISUAL_ID;
			}
			if (MindmapPackage.eINSTANCE.getStart().isSuperTypeOf(domainElement.eClass())) {
				return StartEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = edu.ser.pivi.mindmap.diagram.part.PiviVisualIDRegistry.getModelID(containerView);
		if (!MapEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (MapEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = edu.ser.pivi.mindmap.diagram.part.PiviVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MapEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case MapEditPart.VISUAL_ID:
			if (EndEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StartEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EndEditPart.VISUAL_ID:
			if (EndNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StartEditPart.VISUAL_ID:
			if (StartNameEditPart.VISUAL_ID == nodeVisualID) {
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
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(Map element) {
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
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case MapEditPart.VISUAL_ID:
			return false;
		case EndEditPart.VISUAL_ID:
		case StartEditPart.VISUAL_ID:
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
			return edu.ser.pivi.mindmap.diagram.part.PiviVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return edu.ser.pivi.mindmap.diagram.part.PiviVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return edu.ser.pivi.mindmap.diagram.part.PiviVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return edu.ser.pivi.mindmap.diagram.part.PiviVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return edu.ser.pivi.mindmap.diagram.part.PiviVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return edu.ser.pivi.mindmap.diagram.part.PiviVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
