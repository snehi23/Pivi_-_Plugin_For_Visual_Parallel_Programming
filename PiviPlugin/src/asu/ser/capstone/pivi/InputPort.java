package asu.ser.capstone.pivi;

import org.eclipse.emf.ecore.EObject;

/**
 * @model
 */
public interface InputPort extends EObject {
	/**
	 * @model
	 */
	public Statement getStatement();

	/**
	 * Sets the value of the '{@link asu.ser.capstone.pivi.InputPort#getStatement <em>Statement</em>}' container reference.
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
	public Terminal getTerminal();

	/**
	 * Sets the value of the '{@link asu.ser.capstone.pivi.InputPort#getTerminal <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal</em>' reference.
	 * @see #getTerminal()
	 * @generated
	 */
	void setTerminal(Terminal value);
}
