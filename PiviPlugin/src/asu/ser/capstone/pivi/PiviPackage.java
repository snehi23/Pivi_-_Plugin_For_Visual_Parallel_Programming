/**
 */
package asu.ser.capstone.pivi;

import org.eclipse.emf.ecore.EAttribute;
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
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.StatementImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__INPUTS = 1;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__RESULTS = 2;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__OUTPUTS = 3;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.IfEndStatementImpl <em>If End Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.IfEndStatementImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getIfEndStatement()
	 * @generated
	 */
	int IF_END_STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_END_STATEMENT__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_END_STATEMENT__INPUTS = STATEMENT__INPUTS;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_END_STATEMENT__RESULTS = STATEMENT__RESULTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_END_STATEMENT__OUTPUTS = STATEMENT__OUTPUTS;

	/**
	 * The number of structural features of the '<em>If End Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_END_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>If End Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_END_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.IfStartStatementImpl <em>If Start Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.IfStartStatementImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getIfStartStatement()
	 * @generated
	 */
	int IF_START_STATEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_START_STATEMENT__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_START_STATEMENT__INPUTS = STATEMENT__INPUTS;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_START_STATEMENT__RESULTS = STATEMENT__RESULTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_START_STATEMENT__OUTPUTS = STATEMENT__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_START_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>If Start Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_START_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>If Start Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_START_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.InputPortImpl <em>Input Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.InputPortImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getInputPort()
	 * @generated
	 */
	int INPUT_PORT = 2;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__TERMINAL = 1;

	/**
	 * The number of structural features of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.InstructionImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__INPUTS = STATEMENT__INPUTS;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__RESULTS = STATEMENT__RESULTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__OUTPUTS = STATEMENT__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__INSTRUCTIONS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.OutputPortImpl <em>Output Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.OutputPortImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getOutputPort()
	 * @generated
	 */
	int OUTPUT_PORT = 4;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__RESULT = 1;

	/**
	 * The number of structural features of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.PiviDiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.PiviDiagramImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getPiviDiagram()
	 * @generated
	 */
	int PIVI_DIAGRAM = 5;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVI_DIAGRAM__STATEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVI_DIAGRAM__START = 1;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVI_DIAGRAM__RESULTS = 2;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVI_DIAGRAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVI_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.ResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.ResultImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getResult()
	 * @generated
	 */
	int RESULT = 6;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Output Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__OUTPUT_PORT = 1;

	/**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.TerminalImpl <em>Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.TerminalImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getTerminal()
	 * @generated
	 */
	int TERMINAL = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Input Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__INPUT_PORTS = 1;

	/**
	 * The number of structural features of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.StartImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getStart()
	 * @generated
	 */
	int START = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__NAME = TERMINAL__NAME;

	/**
	 * The feature id for the '<em><b>Input Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__INPUT_PORTS = TERMINAL__INPUT_PORTS;

	/**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_FEATURE_COUNT = TERMINAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OPERATION_COUNT = TERMINAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.WhileStatementImpl <em>While Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.WhileStatementImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getWhileStatement()
	 * @generated
	 */
	int WHILE_STATEMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__INPUTS = STATEMENT__INPUTS;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__RESULTS = STATEMENT__RESULTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__OUTPUTS = STATEMENT__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.IfEndStatement <em>If End Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If End Statement</em>'.
	 * @see asu.ser.capstone.pivi.IfEndStatement
	 * @generated
	 */
	EClass getIfEndStatement();

	/**
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.IfStartStatement <em>If Start Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Start Statement</em>'.
	 * @see asu.ser.capstone.pivi.IfStartStatement
	 * @generated
	 */
	EClass getIfStartStatement();

	/**
	 * Returns the meta object for the attribute '{@link asu.ser.capstone.pivi.IfStartStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see asu.ser.capstone.pivi.IfStartStatement#getCondition()
	 * @see #getIfStartStatement()
	 * @generated
	 */
	EAttribute getIfStartStatement_Condition();

	/**
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Port</em>'.
	 * @see asu.ser.capstone.pivi.InputPort
	 * @generated
	 */
	EClass getInputPort();

	/**
	 * Returns the meta object for the container reference '{@link asu.ser.capstone.pivi.InputPort#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Statement</em>'.
	 * @see asu.ser.capstone.pivi.InputPort#getStatement()
	 * @see #getInputPort()
	 * @generated
	 */
	EReference getInputPort_Statement();

	/**
	 * Returns the meta object for the reference '{@link asu.ser.capstone.pivi.InputPort#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see asu.ser.capstone.pivi.InputPort#getTerminal()
	 * @see #getInputPort()
	 * @generated
	 */
	EReference getInputPort_Terminal();

	/**
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see asu.ser.capstone.pivi.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for the attribute '{@link asu.ser.capstone.pivi.Instruction#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instructions</em>'.
	 * @see asu.ser.capstone.pivi.Instruction#getInstructions()
	 * @see #getInstruction()
	 * @generated
	 */
	EAttribute getInstruction_Instructions();

	/**
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Port</em>'.
	 * @see asu.ser.capstone.pivi.OutputPort
	 * @generated
	 */
	EClass getOutputPort();

	/**
	 * Returns the meta object for the container reference '{@link asu.ser.capstone.pivi.OutputPort#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Statement</em>'.
	 * @see asu.ser.capstone.pivi.OutputPort#getStatement()
	 * @see #getOutputPort()
	 * @generated
	 */
	EReference getOutputPort_Statement();

	/**
	 * Returns the meta object for the reference '{@link asu.ser.capstone.pivi.OutputPort#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result</em>'.
	 * @see asu.ser.capstone.pivi.OutputPort#getResult()
	 * @see #getOutputPort()
	 * @generated
	 */
	EReference getOutputPort_Result();

	/**
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.PiviDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see asu.ser.capstone.pivi.PiviDiagram
	 * @generated
	 */
	EClass getPiviDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link asu.ser.capstone.pivi.PiviDiagram#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see asu.ser.capstone.pivi.PiviDiagram#getStatements()
	 * @see #getPiviDiagram()
	 * @generated
	 */
	EReference getPiviDiagram_Statements();

	/**
	 * Returns the meta object for the containment reference '{@link asu.ser.capstone.pivi.PiviDiagram#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see asu.ser.capstone.pivi.PiviDiagram#getStart()
	 * @see #getPiviDiagram()
	 * @generated
	 */
	EReference getPiviDiagram_Start();

	/**
	 * Returns the meta object for the containment reference list '{@link asu.ser.capstone.pivi.PiviDiagram#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see asu.ser.capstone.pivi.PiviDiagram#getResults()
	 * @see #getPiviDiagram()
	 * @generated
	 */
	EReference getPiviDiagram_Results();

	/**
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result</em>'.
	 * @see asu.ser.capstone.pivi.Result
	 * @generated
	 */
	EClass getResult();

	/**
	 * Returns the meta object for the container reference '{@link asu.ser.capstone.pivi.Result#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Statement</em>'.
	 * @see asu.ser.capstone.pivi.Result#getStatement()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_Statement();

	/**
	 * Returns the meta object for the reference '{@link asu.ser.capstone.pivi.Result#getOutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Port</em>'.
	 * @see asu.ser.capstone.pivi.Result#getOutputPort()
	 * @see #getResult()
	 * @generated
	 */
	EReference getResult_OutputPort();

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
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see asu.ser.capstone.pivi.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the attribute '{@link asu.ser.capstone.pivi.Statement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see asu.ser.capstone.pivi.Statement#getName()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_Name();

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
	 * Returns the meta object for the containment reference list '{@link asu.ser.capstone.pivi.Statement#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see asu.ser.capstone.pivi.Statement#getResults()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Results();

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
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal</em>'.
	 * @see asu.ser.capstone.pivi.Terminal
	 * @generated
	 */
	EClass getTerminal();

	/**
	 * Returns the meta object for the attribute '{@link asu.ser.capstone.pivi.Terminal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see asu.ser.capstone.pivi.Terminal#getName()
	 * @see #getTerminal()
	 * @generated
	 */
	EAttribute getTerminal_Name();

	/**
	 * Returns the meta object for the reference list '{@link asu.ser.capstone.pivi.Terminal#getInputPorts <em>Input Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Ports</em>'.
	 * @see asu.ser.capstone.pivi.Terminal#getInputPorts()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_InputPorts();

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
	 * Returns the meta object for the attribute '{@link asu.ser.capstone.pivi.WhileStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see asu.ser.capstone.pivi.WhileStatement#getCondition()
	 * @see #getWhileStatement()
	 * @generated
	 */
	EAttribute getWhileStatement_Condition();

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
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.IfEndStatementImpl <em>If End Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.IfEndStatementImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getIfEndStatement()
		 * @generated
		 */
		EClass IF_END_STATEMENT = eINSTANCE.getIfEndStatement();

		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.IfStartStatementImpl <em>If Start Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.IfStartStatementImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getIfStartStatement()
		 * @generated
		 */
		EClass IF_START_STATEMENT = eINSTANCE.getIfStartStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IF_START_STATEMENT__CONDITION = eINSTANCE.getIfStartStatement_Condition();

		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.InputPortImpl <em>Input Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.InputPortImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getInputPort()
		 * @generated
		 */
		EClass INPUT_PORT = eINSTANCE.getInputPort();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PORT__STATEMENT = eINSTANCE.getInputPort_Statement();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PORT__TERMINAL = eINSTANCE.getInputPort_Terminal();

		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.InstructionImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION__INSTRUCTIONS = eINSTANCE.getInstruction_Instructions();

		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.OutputPortImpl <em>Output Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.OutputPortImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getOutputPort()
		 * @generated
		 */
		EClass OUTPUT_PORT = eINSTANCE.getOutputPort();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PORT__STATEMENT = eINSTANCE.getOutputPort_Statement();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PORT__RESULT = eINSTANCE.getOutputPort_Result();

		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.PiviDiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.PiviDiagramImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getPiviDiagram()
		 * @generated
		 */
		EClass PIVI_DIAGRAM = eINSTANCE.getPiviDiagram();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIVI_DIAGRAM__STATEMENTS = eINSTANCE.getPiviDiagram_Statements();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIVI_DIAGRAM__START = eINSTANCE.getPiviDiagram_Start();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIVI_DIAGRAM__RESULTS = eINSTANCE.getPiviDiagram_Results();

		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.ResultImpl <em>Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.ResultImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getResult()
		 * @generated
		 */
		EClass RESULT = eINSTANCE.getResult();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__STATEMENT = eINSTANCE.getResult_Statement();

		/**
		 * The meta object literal for the '<em><b>Output Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT__OUTPUT_PORT = eINSTANCE.getResult_OutputPort();

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
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.StatementImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__NAME = eINSTANCE.getStatement_Name();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__INPUTS = eINSTANCE.getStatement_Inputs();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__RESULTS = eINSTANCE.getStatement_Results();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__OUTPUTS = eINSTANCE.getStatement_Outputs();

		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.TerminalImpl <em>Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.TerminalImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getTerminal()
		 * @generated
		 */
		EClass TERMINAL = eINSTANCE.getTerminal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINAL__NAME = eINSTANCE.getTerminal_Name();

		/**
		 * The meta object literal for the '<em><b>Input Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__INPUT_PORTS = eINSTANCE.getTerminal_InputPorts();

		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.WhileStatementImpl <em>While Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.WhileStatementImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getWhileStatement()
		 * @generated
		 */
		EClass WHILE_STATEMENT = eINSTANCE.getWhileStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHILE_STATEMENT__CONDITION = eINSTANCE.getWhileStatement_Condition();

	}

} //PiviPackage
