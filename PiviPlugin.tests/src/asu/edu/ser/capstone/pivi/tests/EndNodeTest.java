/**
 */
package asu.edu.ser.capstone.pivi.tests;

import asu.edu.ser.capstone.pivi.EndNode;
import asu.edu.ser.capstone.pivi.PiviFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>End Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EndNodeTest extends NodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EndNodeTest.class);
	}

	/**
	 * Constructs a new End Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this End Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EndNode getFixture() {
		return (EndNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PiviFactory.eINSTANCE.createEndNode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //EndNodeTest
