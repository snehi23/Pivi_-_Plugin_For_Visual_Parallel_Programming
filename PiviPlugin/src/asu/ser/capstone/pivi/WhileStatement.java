package asu.ser.capstone.pivi;

/**
 * @model
 */
public interface WhileStatement extends Statement {
	
	/**
	 * @model
	 */
	public String getCondition();

	/**
	 * Sets the value of the '{@link asu.ser.capstone.pivi.WhileStatement#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);
}
