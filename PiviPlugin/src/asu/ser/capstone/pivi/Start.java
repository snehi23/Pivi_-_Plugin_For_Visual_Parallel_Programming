/**
 */
package asu.ser.capstone.pivi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asu.ser.capstone.pivi.Start#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see asu.ser.capstone.pivi.PiviPackage#getStart()
 * @model
 * @generated
 */
public interface Start extends EObject {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link asu.ser.capstone.pivi.StatementInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see asu.ser.capstone.pivi.PiviPackage#getStart_Inputs()
	 * @model
	 * @generated
	 */
	EList<StatementInput> getInputs();

} // Start
