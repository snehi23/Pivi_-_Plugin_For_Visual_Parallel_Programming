package asu.ser.capstone.pivi;

import org.eclipse.emf.ecore.EObject;

/**
 * @model
 */
public interface StatementInput extends EObject {
	
	/**
	 * @model
	 */
	public Statement getStatement();
	
	/**
	 * Sets the value of the '{@link asu.ser.capstone.pivi.StatementInput#getStatement <em>Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(Statement value);

	/**
	 * @model
	 */
	public Start getStart();

	/**
	 * Sets the value of the '{@link asu.ser.capstone.pivi.StatementInput#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Start value);
}
