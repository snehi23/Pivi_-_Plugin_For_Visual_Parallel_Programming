package asu.ser.capstone.pivi;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * @model
 */
public interface ProgramDiagram extends EObject {
	
	/**
	 * @model containment="true"
	 */
	public Start getStart();
	
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
	 * @model containment="true"
	 */
	public End getEnd();
	
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
	 * @model containment="true"
	 */
	public EList<Statement> getStatements();
}
