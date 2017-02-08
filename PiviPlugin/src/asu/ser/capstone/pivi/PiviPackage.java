/**
 */
package asu.ser.capstone.pivi;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see asu.ser.capstone.pivi.PiviFactory
 * @model kind="package"
 * @generated
 */
public interface PiviPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pivi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///asu/ser/capstone/pivi.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "asu.ser.capstone.pivi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PiviPackage eINSTANCE = asu.ser.capstone.pivi.impl.PiviPackageImpl.init();

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.EndImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getEnd()
	 * @generated
	 */
	int END = 0;

	/**
	 * The feature id for the '<em><b>Statement Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__STATEMENT_OUTPUT = 0;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.StatementImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 5;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__INPUTS = 0;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__OUTPUTS = 1;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.IfStatementImpl <em>If Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.IfStatementImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getIfStatement()
	 * @generated
	 */
	int IF_STATEMENT = 1;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__INPUTS = STATEMENT__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__OUTPUTS = STATEMENT__OUTPUTS;

	/**
	 * The number of structural features of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.InstructionStatementImpl <em>Instruction Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.InstructionStatementImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getInstructionStatement()
	 * @generated
	 */
	int INSTRUCTION_STATEMENT = 2;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_STATEMENT__INPUTS = STATEMENT__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_STATEMENT__OUTPUTS = STATEMENT__OUTPUTS;

	/**
	 * The number of structural features of the '<em>Instruction Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Instruction Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.ProgramDiagramImpl <em>Program Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.ProgramDiagramImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getProgramDiagram()
	 * @generated
	 */
	int PROGRAM_DIAGRAM = 3;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_DIAGRAM__START = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_DIAGRAM__END = 1;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_DIAGRAM__STATEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Program Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_DIAGRAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Program Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.StartImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getStart()
	 * @generated
	 */
	int START = 4;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__INPUTS = 0;

	/**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.StatementInputImpl <em>Statement Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.StatementInputImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getStatementInput()
	 * @generated
	 */
	int STATEMENT_INPUT = 6;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_INPUT__STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_INPUT__START = 1;

	/**
	 * The number of structural features of the '<em>Statement Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_INPUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Statement Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.StatementOutputImpl <em>Statement Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.StatementOutputImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getStatementOutput()
	 * @generated
	 */
	int STATEMENT_OUTPUT = 7;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OUTPUT__STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OUTPUT__END = 1;

	/**
	 * The number of structural features of the '<em>Statement Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OUTPUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Statement Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OUTPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.WhileStatementImpl <em>While Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.WhileStatementImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getWhileStatement()
	 * @generated
	 */
	int WHILE_STATEMENT = 8;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__INPUTS = STATEMENT__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__OUTPUTS = STATEMENT__OUTPUTS;

	/**
	 * The number of structural features of the '<em>While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see asu.ser.capstone.pivi.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the meta object for the reference list '{@link asu.ser.capstone.pivi.End#getStatementOutput <em>Statement Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Statement Output</em>'.
	 * @see asu.ser.capstone.pivi.End#getStatementOutput()
	 * @see #getEnd()
	 * @generated
	 */
	EReference getEnd_StatementOutput();

	/**
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Statement</em>'.
	 * @see asu.ser.capstone.pivi.IfStatement
	 * @generated
	 */
	EClass getIfStatement();

	/**
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.InstructionStatement <em>Instruction Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Statement</em>'.
	 * @see asu.ser.capstone.pivi.InstructionStatement
	 * @generated
	 */
	EClass getInstructionStatement();

	/**
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.ProgramDiagram <em>Program Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Diagram</em>'.
	 * @see asu.ser.capstone.pivi.ProgramDiagram
	 * @generated
	 */
	EClass getProgramDiagram();

	/**
	 * Returns the meta object for the containment reference '{@link asu.ser.capstone.pivi.ProgramDiagram#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see asu.ser.capstone.pivi.ProgramDiagram#getStart()
	 * @see #getProgramDiagram()
	 * @generated
	 */
	EReference getProgramDiagram_Start();

	/**
	 * Returns the meta object for the containment reference '{@link asu.ser.capstone.pivi.ProgramDiagram#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see asu.ser.capstone.pivi.ProgramDiagram#getEnd()
	 * @see #getProgramDiagram()
	 * @generated
	 */
	EReference getProgramDiagram_End();

	/**
	 * Returns the meta object for the containment reference list '{@link asu.ser.capstone.pivi.ProgramDiagram#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see asu.ser.capstone.pivi.ProgramDiagram#getStatements()
	 * @see #getProgramDiagram()
	 * @generated
	 */
	EReference getProgramDiagram_Statements();

	/**
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see asu.ser.capstone.pivi.Start
	 * @generated
	 */
	EClass getStart();

	/**
	 * Returns the meta object for the reference list '{@link asu.ser.capstone.pivi.Start#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see asu.ser.capstone.pivi.Start#getInputs()
	 * @see #getStart()
	 * @generated
	 */
	EReference getStart_Inputs();

	/**
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see asu.ser.capstone.pivi.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link asu.ser.capstone.pivi.Statement#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see asu.ser.capstone.pivi.Statement#getInputs()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link asu.ser.capstone.pivi.Statement#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see asu.ser.capstone.pivi.Statement#getOutputs()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Outputs();

	/**
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.StatementInput <em>Statement Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Input</em>'.
	 * @see asu.ser.capstone.pivi.StatementInput
	 * @generated
	 */
	EClass getStatementInput();

	/**
	 * Returns the meta object for the reference '{@link asu.ser.capstone.pivi.StatementInput#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statement</em>'.
	 * @see asu.ser.capstone.pivi.StatementInput#getStatement()
	 * @see #getStatementInput()
	 * @generated
	 */
	EReference getStatementInput_Statement();

	/**
	 * Returns the meta object for the reference '{@link asu.ser.capstone.pivi.StatementInput#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see asu.ser.capstone.pivi.StatementInput#getStart()
	 * @see #getStatementInput()
	 * @generated
	 */
	EReference getStatementInput_Start();

	/**
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.StatementOutput <em>Statement Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Output</em>'.
	 * @see asu.ser.capstone.pivi.StatementOutput
	 * @generated
	 */
	EClass getStatementOutput();

	/**
	 * Returns the meta object for the reference '{@link asu.ser.capstone.pivi.StatementOutput#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statement</em>'.
	 * @see asu.ser.capstone.pivi.StatementOutput#getStatement()
	 * @see #getStatementOutput()
	 * @generated
	 */
	EReference getStatementOutput_Statement();

	/**
	 * Returns the meta object for the reference '{@link asu.ser.capstone.pivi.StatementOutput#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see asu.ser.capstone.pivi.StatementOutput#getEnd()
	 * @see #getStatementOutput()
	 * @generated
	 */
	EReference getStatementOutput_End();

	/**
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.WhileStatement <em>While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Statement</em>'.
	 * @see asu.ser.capstone.pivi.WhileStatement
	 * @generated
	 */
	EClass getWhileStatement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PiviFactory getPiviFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.EndImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

		/**
		 * The meta object literal for the '<em><b>Statement Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END__STATEMENT_OUTPUT = eINSTANCE.getEnd_StatementOutput();

		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.IfStatementImpl <em>If Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.IfStatementImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getIfStatement()
		 * @generated
		 */
		EClass IF_STATEMENT = eINSTANCE.getIfStatement();

		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.InstructionStatementImpl <em>Instruction Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.InstructionStatementImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getInstructionStatement()
		 * @generated
		 */
		EClass INSTRUCTION_STATEMENT = eINSTANCE.getInstructionStatement();

		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.ProgramDiagramImpl <em>Program Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.ProgramDiagramImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getProgramDiagram()
		 * @generated
		 */
		EClass PROGRAM_DIAGRAM = eINSTANCE.getProgramDiagram();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_DIAGRAM__START = eINSTANCE.getProgramDiagram_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_DIAGRAM__END = eINSTANCE.getProgramDiagram_End();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_DIAGRAM__STATEMENTS = eINSTANCE.getProgramDiagram_Statements();

		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.StartImpl <em>Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.StartImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getStart()
		 * @generated
		 */
		EClass START = eINSTANCE.getStart();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START__INPUTS = eINSTANCE.getStart_Inputs();

		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.StatementImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__INPUTS = eINSTANCE.getStatement_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__OUTPUTS = eINSTANCE.getStatement_Outputs();

		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.StatementInputImpl <em>Statement Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.StatementInputImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getStatementInput()
		 * @generated
		 */
		EClass STATEMENT_INPUT = eINSTANCE.getStatementInput();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_INPUT__STATEMENT = eINSTANCE.getStatementInput_Statement();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_INPUT__START = eINSTANCE.getStatementInput_Start();

		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.StatementOutputImpl <em>Statement Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.StatementOutputImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getStatementOutput()
		 * @generated
		 */
		EClass STATEMENT_OUTPUT = eINSTANCE.getStatementOutput();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_OUTPUT__STATEMENT = eINSTANCE.getStatementOutput_Statement();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_OUTPUT__END = eINSTANCE.getStatementOutput_End();

		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.WhileStatementImpl <em>While Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.WhileStatementImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getWhileStatement()
		 * @generated
		 */
		EClass WHILE_STATEMENT = eINSTANCE.getWhileStatement();

	}

} //PiviPackage
