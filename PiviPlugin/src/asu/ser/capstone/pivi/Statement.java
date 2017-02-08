package asu.ser.capstone.pivi;

import java.util.List;

/**
 * @model abstract="true"
 */
public interface Statement {
	
	/**
	 * @model containment="true"
	 */
	public List<StatementInput> getInputs();
	
	/**
	 * @model containment="true"
	 */
	public List<StatementOutput> getOutputs();
}
