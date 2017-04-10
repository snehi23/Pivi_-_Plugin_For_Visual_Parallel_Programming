/**
 */
package asu.ser.capstone.pivi.tests;

import asu.ser.capstone.pivi.IfStartStatement;
import asu.ser.capstone.pivi.PiviFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>If Start Statement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IfStartStatementTest extends StatementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IfStartStatementTest.class);
	}

	/**
	 * Constructs a new If Start Statement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStartStatementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this If Start Statement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IfStartStatement getFixture() {
		return (IfStartStatement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PiviFactory.eINSTANCE.createIfStartStatement());
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

} //IfStartStatementTest
