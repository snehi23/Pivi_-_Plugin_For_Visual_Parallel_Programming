package asu.ser.capstone.pivi;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * @model abstract="true"
 */
public interface Statement extends EObject {

	/**
	 * @model containment="true"
	 */
	public EList<StartPort> getStart();
	
	/**
	 * @model containment="true"
	 */
	public EList<InputPort> getInputs();

	/**
	 * @model containment="true"
	 */
	public EList<OutputPort> getOutputs();
}
