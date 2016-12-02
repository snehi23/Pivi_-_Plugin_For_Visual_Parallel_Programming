/**
 */
package edu.ser.pivi.mindmap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ser.pivi.mindmap.Map#getStart <em>Start</em>}</li>
 *   <li>{@link edu.ser.pivi.mindmap.Map#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see edu.ser.pivi.mindmap.MindmapPackage#getMap()
 * @model extendedMetaData="name='Map' kind='elementOnly'"
 * @generated
 */
public interface Map extends EObject {
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
	 * @see edu.ser.pivi.mindmap.MindmapPackage#getMap_Start()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rootTopics'"
	 * @generated
	 */
	Start getStart();

	/**
	 * Sets the value of the '{@link edu.ser.pivi.mindmap.Map#getStart <em>Start</em>}' containment reference.
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
	 * @see edu.ser.pivi.mindmap.MindmapPackage#getMap_End()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rootTopics'"
	 * @generated
	 */
	End getEnd();

	/**
	 * Sets the value of the '{@link edu.ser.pivi.mindmap.Map#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(End value);

} // Map
