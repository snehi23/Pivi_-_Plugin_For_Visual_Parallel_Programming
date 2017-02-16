/**
 */
package asu.ser.capstone.pivi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asu.ser.capstone.pivi.ProgramDiagram#getStart <em>Start</em>}</li>
 *   <li>{@link asu.ser.capstone.pivi.ProgramDiagram#getEnd <em>End</em>}</li>
 *   <li>{@link asu.ser.capstone.pivi.ProgramDiagram#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see asu.ser.capstone.pivi.PiviPackage#getProgramDiagram()
 * @model
 * @generated
 */
public interface ProgramDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Start)
	 * @see asu.ser.capstone.pivi.PiviPackage#getProgramDiagram_Start()
	 * @model containment="true"
	 * @generated
	 */
	Start getStart();

	/**
	 * Sets the value of the '{@link asu.ser.capstone.pivi.ProgramDiagram#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Start value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(End)
	 * @see asu.ser.capstone.pivi.PiviPackage#getProgramDiagram_End()
	 * @model containment="true"
	 * @generated
	 */
	End getEnd();

	/**
	 * Sets the value of the '{@link asu.ser.capstone.pivi.ProgramDiagram#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(End value);

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link asu.ser.capstone.pivi.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see asu.ser.capstone.pivi.PiviPackage#getProgramDiagram_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

} // ProgramDiagram
