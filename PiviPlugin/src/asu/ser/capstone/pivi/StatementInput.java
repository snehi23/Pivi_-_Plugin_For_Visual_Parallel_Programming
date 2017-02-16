/**
 */
package asu.ser.capstone.pivi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asu.ser.capstone.pivi.StatementInput#getStatement <em>Statement</em>}</li>
 *   <li>{@link asu.ser.capstone.pivi.StatementInput#getStart <em>Start</em>}</li>
 * </ul>
 *
 * @see asu.ser.capstone.pivi.PiviPackage#getStatementInput()
 * @model
 * @generated
 */
public interface StatementInput extends EObject {
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
	 * @see asu.ser.capstone.pivi.PiviPackage#getStatementInput_Statement()
	 * @model
	 * @generated
	 */
	Statement getStatement();

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
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(Start)
	 * @see asu.ser.capstone.pivi.PiviPackage#getStatementInput_Start()
	 * @model
	 * @generated
	 */
	Start getStart();

	/**
	 * Sets the value of the '{@link asu.ser.capstone.pivi.StatementInput#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Start value);

} // StatementInput
