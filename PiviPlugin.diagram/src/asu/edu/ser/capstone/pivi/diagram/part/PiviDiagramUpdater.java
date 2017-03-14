package asu.edu.ser.capstone.pivi.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import asu.edu.ser.capstone.pivi.Diagram;
import asu.edu.ser.capstone.pivi.Edge;
import asu.edu.ser.capstone.pivi.IfStart;
import asu.edu.ser.capstone.pivi.InputPort;
import asu.edu.ser.capstone.pivi.Node;
import asu.edu.ser.capstone.pivi.OutputPort;
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
import asu.edu.ser.capstone.pivi.diagram.providers.PiviElementTypes;

/**
 * @generated
 */
public class PiviDiagramUpdater {

	/**
	* @generated
	*/
	public static List<PiviNodeDescriptor> getSemanticChildren(View view) {
		switch (PiviVisualIDRegistry.getVisualID(view)) {
		case DiagramEditPart.VISUAL_ID:
			return getDiagram_1000SemanticChildren(view);
		case IfStartIfStartFigureCompartmentEditPart.VISUAL_ID:
			return getIfStartIfStartFigureCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PiviNodeDescriptor> getDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Diagram modelElement = (Diagram) view.getElement();
		LinkedList<PiviNodeDescriptor> result = new LinkedList<PiviNodeDescriptor>();
		for (Iterator<?> it = modelElement.getStatements().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == WhileStartEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EndNodeEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IfStartEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InstructionEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IfEndEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StartNodeEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PiviNodeDescriptor> getIfStartIfStartFigureCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		IfStart modelElement = (IfStart) containerView.getElement();
		LinkedList<PiviNodeDescriptor> result = new LinkedList<PiviNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputPorts().iterator(); it.hasNext();) {
			InputPort childElement = (InputPort) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputPortEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOutputPorts().iterator(); it.hasNext();) {
			OutputPort childElement = (OutputPort) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OutputPortEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PiviLinkDescriptor> getContainedLinks(View view) {
		switch (PiviVisualIDRegistry.getVisualID(view)) {
		case DiagramEditPart.VISUAL_ID:
			return getDiagram_1000ContainedLinks(view);
		case WhileStartEditPart.VISUAL_ID:
			return getWhileStart_2001ContainedLinks(view);
		case EndNodeEditPart.VISUAL_ID:
			return getEndNode_2002ContainedLinks(view);
		case IfStartEditPart.VISUAL_ID:
			return getIfStart_2003ContainedLinks(view);
		case InstructionEditPart.VISUAL_ID:
			return getInstruction_2004ContainedLinks(view);
		case IfEndEditPart.VISUAL_ID:
			return getIfEnd_2005ContainedLinks(view);
		case StartNodeEditPart.VISUAL_ID:
			return getStartNode_2006ContainedLinks(view);
		case InputPortEditPart.VISUAL_ID:
			return getInputPort_3001ContainedLinks(view);
		case OutputPortEditPart.VISUAL_ID:
			return getOutputPort_3002ContainedLinks(view);
		case EdgeEditPart.VISUAL_ID:
			return getEdge_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PiviLinkDescriptor> getIncomingLinks(View view) {
		switch (PiviVisualIDRegistry.getVisualID(view)) {
		case WhileStartEditPart.VISUAL_ID:
			return getWhileStart_2001IncomingLinks(view);
		case EndNodeEditPart.VISUAL_ID:
			return getEndNode_2002IncomingLinks(view);
		case IfStartEditPart.VISUAL_ID:
			return getIfStart_2003IncomingLinks(view);
		case InstructionEditPart.VISUAL_ID:
			return getInstruction_2004IncomingLinks(view);
		case IfEndEditPart.VISUAL_ID:
			return getIfEnd_2005IncomingLinks(view);
		case StartNodeEditPart.VISUAL_ID:
			return getStartNode_2006IncomingLinks(view);
		case InputPortEditPart.VISUAL_ID:
			return getInputPort_3001IncomingLinks(view);
		case OutputPortEditPart.VISUAL_ID:
			return getOutputPort_3002IncomingLinks(view);
		case EdgeEditPart.VISUAL_ID:
			return getEdge_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PiviLinkDescriptor> getOutgoingLinks(View view) {
		switch (PiviVisualIDRegistry.getVisualID(view)) {
		case WhileStartEditPart.VISUAL_ID:
			return getWhileStart_2001OutgoingLinks(view);
		case EndNodeEditPart.VISUAL_ID:
			return getEndNode_2002OutgoingLinks(view);
		case IfStartEditPart.VISUAL_ID:
			return getIfStart_2003OutgoingLinks(view);
		case InstructionEditPart.VISUAL_ID:
			return getInstruction_2004OutgoingLinks(view);
		case IfEndEditPart.VISUAL_ID:
			return getIfEnd_2005OutgoingLinks(view);
		case StartNodeEditPart.VISUAL_ID:
			return getStartNode_2006OutgoingLinks(view);
		case InputPortEditPart.VISUAL_ID:
			return getInputPort_3001OutgoingLinks(view);
		case OutputPortEditPart.VISUAL_ID:
			return getOutputPort_3002OutgoingLinks(view);
		case EdgeEditPart.VISUAL_ID:
			return getEdge_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getDiagram_1000ContainedLinks(View view) {
		Diagram modelElement = (Diagram) view.getElement();
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Edge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getWhileStart_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getEndNode_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getIfStart_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getInstruction_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getIfEnd_2005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getStartNode_2006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getInputPort_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getOutputPort_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getEdge_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getWhileStart_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getEndNode_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getIfStart_2003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getInstruction_2004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getIfEnd_2005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getStartNode_2006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getInputPort_3001IncomingLinks(View view) {
		InputPort modelElement = (InputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Edge_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getOutputPort_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getEdge_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getWhileStart_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getEndNode_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getIfStart_2003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getInstruction_2004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getIfEnd_2005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getStartNode_2006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getInputPort_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getOutputPort_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getEdge_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<PiviLinkDescriptor> getContainedTypeModelFacetLinks_Edge_4001(Diagram container) {
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Edge) {
				continue;
			}
			Edge link = (Edge) linkObject;
			if (EdgeEditPart.VISUAL_ID != PiviVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			InputPort dst = link.getInputPort();
			result.add(
					new PiviLinkDescriptor(container, dst, link, PiviElementTypes.Edge_4001, EdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PiviLinkDescriptor> getIncomingTypeModelFacetLinks_Edge_4001(InputPort target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != PiviPackage.eINSTANCE.getEdge_InputPort()
					|| false == setting.getEObject() instanceof Edge) {
				continue;
			}
			Edge link = (Edge) setting.getEObject();
			if (EdgeEditPart.VISUAL_ID != PiviVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Diagram) {
				continue;
			}
			Diagram container = (Diagram) link.eContainer();
			result.add(new PiviLinkDescriptor(container, target, link, PiviElementTypes.Edge_4001,
					EdgeEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<PiviNodeDescriptor> getSemanticChildren(View view) {
			return PiviDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<PiviLinkDescriptor> getContainedLinks(View view) {
			return PiviDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<PiviLinkDescriptor> getIncomingLinks(View view) {
			return PiviDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<PiviLinkDescriptor> getOutgoingLinks(View view) {
			return PiviDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
