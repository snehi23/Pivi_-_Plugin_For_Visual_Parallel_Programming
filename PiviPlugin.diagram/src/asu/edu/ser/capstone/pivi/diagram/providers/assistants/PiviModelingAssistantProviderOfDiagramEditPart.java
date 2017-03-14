package asu.edu.ser.capstone.pivi.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import asu.edu.ser.capstone.pivi.diagram.providers.PiviElementTypes;
import asu.edu.ser.capstone.pivi.diagram.providers.PiviModelingAssistantProvider;

/**
 * @generated
 */
public class PiviModelingAssistantProviderOfDiagramEditPart extends PiviModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(PiviElementTypes.WhileStart_2001);
		types.add(PiviElementTypes.EndNode_2002);
		types.add(PiviElementTypes.IfStart_2003);
		types.add(PiviElementTypes.Instruction_2004);
		types.add(PiviElementTypes.IfEnd_2005);
		types.add(PiviElementTypes.StartNode_2006);
		return types;
	}

}
