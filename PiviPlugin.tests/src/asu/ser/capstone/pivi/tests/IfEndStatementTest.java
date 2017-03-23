/**
 */
package asu.ser.capstone.pivi.tests;

import asu.ser.capstone.pivi.IfEndStatement;
import asu.ser.capstone.pivi.PiviFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>If End Statement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IfEndStatementTest extends StatementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IfEndStatementTest.class);
	}

	/**
	 * Constructs a new If End Statement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfEndStatementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this If End Statement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IfEndStatement getFixture() {
		return (IfEndStatement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PiviFactory.eINSTANCE.createIfEndStatement());
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

} //IfEndStatementTest
