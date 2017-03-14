package asu.edu.ser.capstone.pivi;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * @model abstract="true"
 */
public interface Node extends EObject {
	
	/**
	 * @model containment="true"
	 */
	public EList<InputPort> getInputPorts();
	
	/**
	 * @model containment="true"
	 */
	public EList<OutputPort> getOutputPorts();
}
