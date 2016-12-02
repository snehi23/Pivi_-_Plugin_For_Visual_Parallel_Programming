package edu.ser.pivi.mindmap.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import edu.ser.pivi.mindmap.End;
import edu.ser.pivi.mindmap.Map;
import edu.ser.pivi.mindmap.MindmapPackage;
import edu.ser.pivi.mindmap.Start;
import edu.ser.pivi.mindmap.diagram.edit.parts.EndEditPart;
import edu.ser.pivi.mindmap.diagram.edit.parts.MapEditPart;
import edu.ser.pivi.mindmap.diagram.edit.parts.StartConnectorEditPart;
import edu.ser.pivi.mindmap.diagram.edit.parts.StartEditPart;
import edu.ser.pivi.mindmap.diagram.providers.PiviElementTypes;

/**
 * @generated
 */
public class PiviDiagramUpdater {

	/**
	* @generated
	*/
	public static List<PiviNodeDescriptor> getSemanticChildren(View view) {
		switch (PiviVisualIDRegistry.getVisualID(view)) {
		case MapEditPart.VISUAL_ID:
			return getMap_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PiviNodeDescriptor> getMap_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Map modelElement = (Map) view.getElement();
		LinkedList<PiviNodeDescriptor> result = new LinkedList<PiviNodeDescriptor>();
		{
			End childElement = modelElement.getEnd();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EndEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
			}
		}
		{
			Start childElement = modelElement.getStart();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == StartEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PiviLinkDescriptor> getContainedLinks(View view) {
		switch (PiviVisualIDRegistry.getVisualID(view)) {
		case MapEditPart.VISUAL_ID:
			return getMap_1000ContainedLinks(view);
		case EndEditPart.VISUAL_ID:
			return getEnd_2001ContainedLinks(view);
		case StartEditPart.VISUAL_ID:
			return getStart_2002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PiviLinkDescriptor> getIncomingLinks(View view) {
		switch (PiviVisualIDRegistry.getVisualID(view)) {
		case EndEditPart.VISUAL_ID:
			return getEnd_2001IncomingLinks(view);
		case StartEditPart.VISUAL_ID:
			return getStart_2002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PiviLinkDescriptor> getOutgoingLinks(View view) {
		switch (PiviVisualIDRegistry.getVisualID(view)) {
		case EndEditPart.VISUAL_ID:
			return getEnd_2001OutgoingLinks(view);
		case StartEditPart.VISUAL_ID:
			return getStart_2002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getMap_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getEnd_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getStart_2002ContainedLinks(View view) {
		Start modelElement = (Start) view.getElement();
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Start_Connector_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getEnd_2001IncomingLinks(View view) {
		End modelElement = (End) view.getElement();
		java.util.Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Start_Connector_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getStart_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getEnd_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getStart_2002OutgoingLinks(View view) {
		Start modelElement = (Start) view.getElement();
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Start_Connector_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PiviLinkDescriptor> getIncomingFeatureModelFacetLinks_Start_Connector_4001(End target,
			java.util.Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MindmapPackage.eINSTANCE.getStart_Connector()) {
				result.add(new PiviLinkDescriptor(setting.getEObject(), target, PiviElementTypes.StartConnector_4001,
						StartConnectorEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PiviLinkDescriptor> getOutgoingFeatureModelFacetLinks_Start_Connector_4001(Start source) {
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnector().iterator(); destinations.hasNext();) {
			End destination = (End) destinations.next();
			result.add(new PiviLinkDescriptor(source, destination, PiviElementTypes.StartConnector_4001,
					StartConnectorEditPart.VISUAL_ID));
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
