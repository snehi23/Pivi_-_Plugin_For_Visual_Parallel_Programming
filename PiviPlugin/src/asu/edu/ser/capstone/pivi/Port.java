package asu.edu.ser.capstone.pivi;

import org.eclipse.emf.ecore.EObject;

/**
 * @model
 */
public interface Port extends EObject {
	/**
	 * @model
	 */
	public Node getNode();

	/**
	 * Sets the value of the '{@link asu.edu.ser.capstone.pivi.Port#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Node value);
}
