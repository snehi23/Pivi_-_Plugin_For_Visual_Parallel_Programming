package asu.ser.capstone.pivi;

import org.eclipse.emf.ecore.EObject;

/**
 * @model
 */
public interface OutputPort extends EObject {

	/**
	 * @model
	 */
	public Statement getStatement();

	/**
	 * Sets the value of the '{@link asu.ser.capstone.pivi.OutputPort#getStatement <em>Statement</em>}' container reference.
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
	public Result getResult();

	/**
	 * Sets the value of the '{@link asu.ser.capstone.pivi.OutputPort#getResult <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Result value);
}
