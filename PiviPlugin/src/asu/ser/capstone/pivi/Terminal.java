package asu.ser.capstone.pivi;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * @model abstract="true"
 */
public interface Terminal extends EObject {
	
	/**
	 * @model
	 */
	String getName();

	/**
	 * Sets the value of the '{@link asu.ser.capstone.pivi.Terminal#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * @model
	 */
	public EList<InputPort> getInputPorts();
}
