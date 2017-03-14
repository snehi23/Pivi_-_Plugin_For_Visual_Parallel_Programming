package asu.edu.ser.capstone.pivi;

import org.eclipse.emf.ecore.EObject;
/**
 * @model
 */
public interface Edge extends EObject {

	/**
	 * @model
	 */
	public InputPort getInputPort();

	/**
	 * Sets the value of the '{@link asu.edu.ser.capstone.pivi.Edge#getInputPort <em>Input Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Port</em>' reference.
	 * @see #getInputPort()
	 * @generated
	 */
	void setInputPort(InputPort value);

	/**
	 * @model
	 */
	public OutputPort getOutputPort();

	/**
	 * Sets the value of the '{@link asu.edu.ser.capstone.pivi.Edge#getOutputPort <em>Output Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Port</em>' reference.
	 * @see #getOutputPort()
	 * @generated
	 */
	void setOutputPort(OutputPort value);

}
