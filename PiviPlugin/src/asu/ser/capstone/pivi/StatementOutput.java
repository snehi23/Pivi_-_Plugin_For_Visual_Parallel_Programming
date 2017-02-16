/**
 */
package asu.ser.capstone.pivi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asu.ser.capstone.pivi.StatementOutput#getStatement <em>Statement</em>}</li>
 *   <li>{@link asu.ser.capstone.pivi.StatementOutput#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see asu.ser.capstone.pivi.PiviPackage#getStatementOutput()
 * @model
 * @generated
 */
public interface StatementOutput extends EObject {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' reference.
	 * @see #setStatement(Statement)
	 * @see asu.ser.capstone.pivi.PiviPackage#getStatementOutput_Statement()
	 * @model
	 * @generated
	 */
	Statement getStatement();

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
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(End)
	 * @see asu.ser.capstone.pivi.PiviPackage#getStatementOutput_End()
	 * @model
	 * @generated
	 */
	End getEnd();

	/**
	 * Sets the value of the '{@link asu.ser.capstone.pivi.StatementOutput#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(End value);

} // StatementOutput
