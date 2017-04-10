package asu.ser.capstone.pivi;

import org.eclipse.emf.ecore.EObject;

/**
 * @model
 */
public interface Result extends EObject {
	
	/**
	 * @model
	 */
	public Statement getStatement();

	/**
	 * Sets the value of the '{@link asu.ser.capstone.pivi.Result#getStatement <em>Statement</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' container reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(Statement value);

	/**
	 * @model
	 */
	public OutputPort getOutputPort();

	/**
	 * Sets the value of the '{@link asu.ser.capstone.pivi.Result#getOutputPort <em>Output Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Port</em>' reference.
	 * @see #getOutputPort()
	 * @generated
	 */
	void setOutputPort(OutputPort value);
}
