/**
 */
package asu.edu.ser.capstone.pivi.tests;

import asu.edu.ser.capstone.pivi.PiviFactory;
import asu.edu.ser.capstone.pivi.StartNode;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Start Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StartNodeTest extends NodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StartNodeTest.class);
	}

	/**
	 * Constructs a new Start Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Start Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StartNode getFixture() {
		return (StartNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PiviFactory.eINSTANCE.createStartNode());
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

} //StartNodeTest
