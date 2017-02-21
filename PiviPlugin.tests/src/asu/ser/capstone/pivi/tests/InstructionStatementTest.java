/**
 */
package asu.ser.capstone.pivi.tests;

import asu.ser.capstone.pivi.InstructionStatement;
import asu.ser.capstone.pivi.PiviFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Instruction Statement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstructionStatementTest extends StatementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InstructionStatementTest.class);
	}

	/**
	 * Constructs a new Instruction Statement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionStatementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Instruction Statement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InstructionStatement getFixture() {
		return (InstructionStatement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PiviFactory.eINSTANCE.createInstructionStatement());
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

} //InstructionStatementTest
