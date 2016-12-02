package edu.ser.pivi.mindmap.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import edu.ser.pivi.mindmap.diagram.providers.PiviElementTypes;
import edu.ser.pivi.mindmap.diagram.providers.PiviModelingAssistantProvider;

/**
 * @generated
 */
public class PiviModelingAssistantProviderOfMapEditPart extends PiviModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(PiviElementTypes.End_2001);
		types.add(PiviElementTypes.Start_2002);
		return types;
	}

}
