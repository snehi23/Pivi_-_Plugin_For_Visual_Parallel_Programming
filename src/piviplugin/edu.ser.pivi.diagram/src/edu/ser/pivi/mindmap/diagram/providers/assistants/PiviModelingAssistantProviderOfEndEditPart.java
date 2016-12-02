package edu.ser.pivi.mindmap.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import edu.ser.pivi.mindmap.diagram.edit.parts.EndEditPart;
import edu.ser.pivi.mindmap.diagram.providers.PiviElementTypes;
import edu.ser.pivi.mindmap.diagram.providers.PiviModelingAssistantProvider;

/**
 * @generated
 */
public class PiviModelingAssistantProviderOfEndEditPart extends PiviModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((EndEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(EndEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(PiviElementTypes.StartConnector_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((EndEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(EndEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == PiviElementTypes.StartConnector_4001) {
			types.add(PiviElementTypes.Start_2002);
		}
		return types;
	}

}
