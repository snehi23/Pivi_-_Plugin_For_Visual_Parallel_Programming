package asu.ser.capstone.pivi;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * @model
 */
public interface Start extends EObject {
	
	/**
	 * @model
	 */
	public EList<StartPort> getStartPort();
}
