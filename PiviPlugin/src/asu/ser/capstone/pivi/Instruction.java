package asu.ser.capstone.pivi;

/**
 * @model
 */
public interface Instruction extends Statement {
	
	/**
	 * @model
	 */
	public String getInstructions();

	/**
	 * Sets the value of the '{@link asu.ser.capstone.pivi.Instruction#getInstructions <em>Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instructions</em>' attribute.
	 * @see #getInstructions()
	 * @generated
	 */
	void setInstructions(String value);
}
