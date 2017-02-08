package asu.ser.capstone.pivi;

import org.eclipse.emf.ecore.EObject;

/**
 * @model
 */
public interface StatementOutput extends EObject {
	/**
	 * @model
	 */
	public Statement getStatement();
	
	/**
	 * Sets the value of the '{@link asu.ser.capstone.pivi.StatementOutput#getStatement <em>Statement</em>}' reference.
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
	public End getEnd();

	/**
	 * Sets the value of the '{@link asu.ser.capstone.pivi.StatementOutput#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(End value);
}
