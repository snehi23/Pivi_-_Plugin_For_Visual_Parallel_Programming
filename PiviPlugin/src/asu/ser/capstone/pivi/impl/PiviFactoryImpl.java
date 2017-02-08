/**
 */
package asu.ser.capstone.pivi.impl;

import asu.ser.capstone.pivi.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PiviFactoryImpl extends EFactoryImpl implements PiviFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PiviFactory init() {
		try {
			PiviFactory thePiviFactory = (PiviFactory)EPackage.Registry.INSTANCE.getEFactory(PiviPackage.eNS_URI);
			if (thePiviFactory != null) {
				return thePiviFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PiviFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PiviFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PiviPackage.END: return createEnd();
			case PiviPackage.IF_STATEMENT: return createIfStatement();
			case PiviPackage.INSTRUCTION_STATEMENT: return createInstructionStatement();
			case PiviPackage.PROGRAM_DIAGRAM: return createProgramDiagram();
			case PiviPackage.START: return createStart();
			case PiviPackage.STATEMENT_INPUT: return createStatementInput();
			case PiviPackage.STATEMENT_OUTPUT: return createStatementOutput();
			case PiviPackage.WHILE_STATEMENT: return createWhileStatement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public End createEnd() {
		EndImpl end = new EndImpl();
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStatement createIfStatement() {
		IfStatementImpl ifStatement = new IfStatementImpl();
		return ifStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionStatement createInstructionStatement() {
		InstructionStatementImpl instructionStatement = new InstructionStatementImpl();
		return instructionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramDiagram createProgramDiagram() {
		ProgramDiagramImpl programDiagram = new ProgramDiagramImpl();
		return programDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Start createStart() {
		StartImpl start = new StartImpl();
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementInput createStatementInput() {
		StatementInputImpl statementInput = new StatementInputImpl();
		return statementInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementOutput createStatementOutput() {
		StatementOutputImpl statementOutput = new StatementOutputImpl();
		return statementOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileStatement createWhileStatement() {
		WhileStatementImpl whileStatement = new WhileStatementImpl();
		return whileStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PiviPackage getPiviPackage() {
		return (PiviPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PiviPackage getPackage() {
		return PiviPackage.eINSTANCE;
	}

} //PiviFactoryImpl
