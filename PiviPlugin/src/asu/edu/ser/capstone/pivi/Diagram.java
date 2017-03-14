package asu.edu.ser.capstone.pivi;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * @model
 */
public interface Diagram extends EObject {
	
	/**
	 * @model containment="true"
	 */
	public EList<Node> getStatements();
	
	/**
	 * @model containment="true"
	 */
	public EList<Edge> getEdges();
}
