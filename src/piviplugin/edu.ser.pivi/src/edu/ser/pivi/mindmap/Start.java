/**
 */
package edu.ser.pivi.mindmap;

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
 *   <li>{@link edu.ser.pivi.mindmap.Start#getName <em>Name</em>}</li>
 *   <li>{@link edu.ser.pivi.mindmap.Start#getConnector <em>Connector</em>}</li>
 * </ul>
 *
 * @see edu.ser.pivi.mindmap.MindmapPackage#getStart()
 * @model extendedMetaData="name='Topic' kind='elementOnly'"
 * @generated
 */
public interface Start extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.ser.pivi.mindmap.MindmapPackage#getStart_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.ser.pivi.mindmap.Start#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' reference list.
	 * The list contents are of type {@link edu.ser.pivi.mindmap.End}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' reference list.
	 * @see edu.ser.pivi.mindmap.MindmapPackage#getStart_Connector()
	 * @model extendedMetaData="kind='attribute' name='subtopics'"
	 * @generated
	 */
	EList<End> getConnector();

} // Start
