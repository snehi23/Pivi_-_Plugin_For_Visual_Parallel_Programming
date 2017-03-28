package asu.ser.capstone.pivi.diagram.part;

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

import asu.ser.capstone.pivi.IfEndStatement;
import asu.ser.capstone.pivi.IfStartStatement;
import asu.ser.capstone.pivi.InputPort;
import asu.ser.capstone.pivi.Instruction;
import asu.ser.capstone.pivi.OutputPort;
import asu.ser.capstone.pivi.PiviDiagram;
import asu.ser.capstone.pivi.PiviPackage;
import asu.ser.capstone.pivi.Result;
import asu.ser.capstone.pivi.Start;
import asu.ser.capstone.pivi.Statement;
import asu.ser.capstone.pivi.Terminal;
import asu.ser.capstone.pivi.WhileStatement;
import asu.ser.capstone.pivi.diagram.edit.parts.IfEndStatementEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.IfEndStatementIfEndFigureCompartmentEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.IfStartStatementEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.IfStartStatementIfStartFigureCompartmentEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.InstructionEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.InstructionInstructionFigureCompartmentEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.OutputPortResultEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.ResultEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.StartEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.TerminalInputPortsEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.WhileStatementEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.WhileStatementWhileFigureCompartmentEditPart;
import asu.ser.capstone.pivi.diagram.providers.PiviElementTypes;

/**
 * @generated
 */
public class PiviDiagramUpdater {

	/**
	* @generated
	*/
	public static List<PiviNodeDescriptor> getSemanticChildren(View view) {
		switch (PiviVisualIDRegistry.getVisualID(view)) {
		case PiviDiagramEditPart.VISUAL_ID:
			return getPiviDiagram_1000SemanticChildren(view);
		case IfStartStatementIfStartFigureCompartmentEditPart.VISUAL_ID:
			return getIfStartStatementIfStartFigureCompartment_7001SemanticChildren(view);
		case WhileStatementWhileFigureCompartmentEditPart.VISUAL_ID:
			return getWhileStatementWhileFigureCompartment_7002SemanticChildren(view);
		case IfEndStatementIfEndFigureCompartmentEditPart.VISUAL_ID:
			return getIfEndStatementIfEndFigureCompartment_7003SemanticChildren(view);
		case InstructionInstructionFigureCompartmentEditPart.VISUAL_ID:
			return getInstructionInstructionFigureCompartment_7004SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PiviNodeDescriptor> getPiviDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		PiviDiagram modelElement = (PiviDiagram) view.getElement();
		LinkedList<PiviNodeDescriptor> result = new LinkedList<PiviNodeDescriptor>();
		for (Iterator<?> it = modelElement.getStatements().iterator(); it.hasNext();) {
			Statement childElement = (Statement) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == IfStartStatementEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WhileStatementEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IfEndStatementEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InstructionEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Start childElement = modelElement.getStart();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == StartEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getResults().iterator(); it.hasNext();) {
			Result childElement = (Result) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ResultEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PiviNodeDescriptor> getIfStartStatementIfStartFigureCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		IfStartStatement modelElement = (IfStartStatement) containerView.getElement();
		LinkedList<PiviNodeDescriptor> result = new LinkedList<PiviNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
			InputPort childElement = (InputPort) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputPortEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOutputs().iterator(); it.hasNext();) {
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
	public static List<PiviNodeDescriptor> getWhileStatementWhileFigureCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		WhileStatement modelElement = (WhileStatement) containerView.getElement();
		LinkedList<PiviNodeDescriptor> result = new LinkedList<PiviNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
			InputPort childElement = (InputPort) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputPortEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOutputs().iterator(); it.hasNext();) {
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
	public static List<PiviNodeDescriptor> getIfEndStatementIfEndFigureCompartment_7003SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		IfEndStatement modelElement = (IfEndStatement) containerView.getElement();
		LinkedList<PiviNodeDescriptor> result = new LinkedList<PiviNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
			InputPort childElement = (InputPort) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputPortEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOutputs().iterator(); it.hasNext();) {
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
	public static List<PiviNodeDescriptor> getInstructionInstructionFigureCompartment_7004SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Instruction modelElement = (Instruction) containerView.getElement();
		LinkedList<PiviNodeDescriptor> result = new LinkedList<PiviNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
			InputPort childElement = (InputPort) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputPortEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOutputs().iterator(); it.hasNext();) {
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
		case PiviDiagramEditPart.VISUAL_ID:
			return getPiviDiagram_1000ContainedLinks(view);
		case IfStartStatementEditPart.VISUAL_ID:
			return getIfStartStatement_2001ContainedLinks(view);
		case WhileStatementEditPart.VISUAL_ID:
			return getWhileStatement_2002ContainedLinks(view);
		case IfEndStatementEditPart.VISUAL_ID:
			return getIfEndStatement_2003ContainedLinks(view);
		case InstructionEditPart.VISUAL_ID:
			return getInstruction_2004ContainedLinks(view);
		case StartEditPart.VISUAL_ID:
			return getStart_2005ContainedLinks(view);
		case ResultEditPart.VISUAL_ID:
			return getResult_2006ContainedLinks(view);
		case InputPortEditPart.VISUAL_ID:
			return getInputPort_3001ContainedLinks(view);
		case OutputPortEditPart.VISUAL_ID:
			return getOutputPort_3002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PiviLinkDescriptor> getIncomingLinks(View view) {
		switch (PiviVisualIDRegistry.getVisualID(view)) {
		case IfStartStatementEditPart.VISUAL_ID:
			return getIfStartStatement_2001IncomingLinks(view);
		case WhileStatementEditPart.VISUAL_ID:
			return getWhileStatement_2002IncomingLinks(view);
		case IfEndStatementEditPart.VISUAL_ID:
			return getIfEndStatement_2003IncomingLinks(view);
		case InstructionEditPart.VISUAL_ID:
			return getInstruction_2004IncomingLinks(view);
		case StartEditPart.VISUAL_ID:
			return getStart_2005IncomingLinks(view);
		case ResultEditPart.VISUAL_ID:
			return getResult_2006IncomingLinks(view);
		case InputPortEditPart.VISUAL_ID:
			return getInputPort_3001IncomingLinks(view);
		case OutputPortEditPart.VISUAL_ID:
			return getOutputPort_3002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PiviLinkDescriptor> getOutgoingLinks(View view) {
		switch (PiviVisualIDRegistry.getVisualID(view)) {
		case IfStartStatementEditPart.VISUAL_ID:
			return getIfStartStatement_2001OutgoingLinks(view);
		case WhileStatementEditPart.VISUAL_ID:
			return getWhileStatement_2002OutgoingLinks(view);
		case IfEndStatementEditPart.VISUAL_ID:
			return getIfEndStatement_2003OutgoingLinks(view);
		case InstructionEditPart.VISUAL_ID:
			return getInstruction_2004OutgoingLinks(view);
		case StartEditPart.VISUAL_ID:
			return getStart_2005OutgoingLinks(view);
		case ResultEditPart.VISUAL_ID:
			return getResult_2006OutgoingLinks(view);
		case InputPortEditPart.VISUAL_ID:
			return getInputPort_3001OutgoingLinks(view);
		case OutputPortEditPart.VISUAL_ID:
			return getOutputPort_3002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getPiviDiagram_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getIfStartStatement_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getWhileStatement_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getIfEndStatement_2003ContainedLinks(View view) {
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
	public static List<PiviLinkDescriptor> getStart_2005ContainedLinks(View view) {
		Start modelElement = (Start) view.getElement();
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Terminal_InputPorts_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getResult_2006ContainedLinks(View view) {
		Result modelElement = (Result) view.getElement();
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Terminal_InputPorts_4001(modelElement));
		return result;
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
		OutputPort modelElement = (OutputPort) view.getElement();
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_OutputPort_Result_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getIfStartStatement_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getWhileStatement_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getIfEndStatement_2003IncomingLinks(View view) {
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
	public static List<PiviLinkDescriptor> getStart_2005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getResult_2006IncomingLinks(View view) {
		Result modelElement = (Result) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_OutputPort_Result_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getInputPort_3001IncomingLinks(View view) {
		InputPort modelElement = (InputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Terminal_InputPorts_4001(modelElement, crossReferences));
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
	public static List<PiviLinkDescriptor> getIfStartStatement_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getWhileStatement_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getIfEndStatement_2003OutgoingLinks(View view) {
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
	public static List<PiviLinkDescriptor> getStart_2005OutgoingLinks(View view) {
		Start modelElement = (Start) view.getElement();
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Terminal_InputPorts_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getResult_2006OutgoingLinks(View view) {
		Result modelElement = (Result) view.getElement();
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Terminal_InputPorts_4001(modelElement));
		return result;
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
		OutputPort modelElement = (OutputPort) view.getElement();
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_OutputPort_Result_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PiviLinkDescriptor> getIncomingFeatureModelFacetLinks_Terminal_InputPorts_4001(
			InputPort target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PiviPackage.eINSTANCE.getTerminal_InputPorts()) {
				result.add(new PiviLinkDescriptor(setting.getEObject(), target,
						PiviElementTypes.TerminalInputPorts_4001, TerminalInputPortsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PiviLinkDescriptor> getIncomingFeatureModelFacetLinks_OutputPort_Result_4002(
			Result target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PiviPackage.eINSTANCE.getOutputPort_Result()) {
				result.add(new PiviLinkDescriptor(setting.getEObject(), target, PiviElementTypes.OutputPortResult_4002,
						OutputPortResultEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PiviLinkDescriptor> getOutgoingFeatureModelFacetLinks_Terminal_InputPorts_4001(
			Terminal source) {
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		for (Iterator<?> destinations = source.getInputPorts().iterator(); destinations.hasNext();) {
			InputPort destination = (InputPort) destinations.next();
			result.add(new PiviLinkDescriptor(source, destination, PiviElementTypes.TerminalInputPorts_4001,
					TerminalInputPortsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PiviLinkDescriptor> getOutgoingFeatureModelFacetLinks_OutputPort_Result_4002(
			OutputPort source) {
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		Result destination = source.getResult();
		if (destination == null) {
			return result;
		}
		result.add(new PiviLinkDescriptor(source, destination, PiviElementTypes.OutputPortResult_4002,
				OutputPortResultEditPart.VISUAL_ID));
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
