package asu.ser.capstone.pivi;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * @model abstract="true"
 */
public interface Statement extends EObject {
	
	/**
	 * @model
	 */
	String getName();
	
	/**
	 * Sets the value of the '{@link asu.ser.capstone.pivi.Statement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * @model containment="true"
	 */
	public EList<InputPort> getInputs();
 
	/**
	 * @model containment="true"
	 */
	public EList<OutputPort> getOutputs();

}
