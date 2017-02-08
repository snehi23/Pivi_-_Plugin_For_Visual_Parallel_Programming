package asu.ser.capstone.pivi;

import java.util.List;

/**
 * @model
 */
public interface ProgramDiagram {
	
	/**
	 * @model containment="true"
	 */
	public Start getStart();
	
	/**
	 * @model containment="true"
	 */
	public End getEnd();
	
	/**
	 * @model containment="true"
	 */
	public List<Statement> getStatements();
}
