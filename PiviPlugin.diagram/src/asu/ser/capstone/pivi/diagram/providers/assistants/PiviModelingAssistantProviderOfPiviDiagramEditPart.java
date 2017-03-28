package asu.ser.capstone.pivi.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import asu.ser.capstone.pivi.diagram.providers.PiviElementTypes;
import asu.ser.capstone.pivi.diagram.providers.PiviModelingAssistantProvider;

/**
 * @generated
 */
public class PiviModelingAssistantProviderOfPiviDiagramEditPart extends PiviModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(PiviElementTypes.IfStartStatement_2001);
		types.add(PiviElementTypes.WhileStatement_2002);
		types.add(PiviElementTypes.IfEndStatement_2003);
		types.add(PiviElementTypes.Instruction_2004);
		types.add(PiviElementTypes.Start_2005);
		types.add(PiviElementTypes.Result_2006);
		return types;
	}

}
