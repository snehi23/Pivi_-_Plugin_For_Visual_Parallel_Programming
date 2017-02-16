/**
 */
package asu.ser.capstone.pivi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asu.ser.capstone.pivi.End#getStatementOutput <em>Statement Output</em>}</li>
 * </ul>
 *
 * @see asu.ser.capstone.pivi.PiviPackage#getEnd()
 * @model
 * @generated
 */
public interface End extends EObject {
	/**
	 * Returns the value of the '<em><b>Statement Output</b></em>' reference list.
	 * The list contents are of type {@link asu.ser.capstone.pivi.StatementOutput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement Output</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement Output</em>' reference list.
	 * @see asu.ser.capstone.pivi.PiviPackage#getEnd_StatementOutput()
	 * @model
	 * @generated
	 */
	EList<StatementOutput> getStatementOutput();

} // End
