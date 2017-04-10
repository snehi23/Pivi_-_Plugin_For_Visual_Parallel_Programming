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
			case PiviPackage.IF_END_STATEMENT: return createIfEndStatement();
			case PiviPackage.IF_START_STATEMENT: return createIfStartStatement();
			case PiviPackage.INPUT_PORT: return createInputPort();
			case PiviPackage.INSTRUCTION: return createInstruction();
			case PiviPackage.OUTPUT_PORT: return createOutputPort();
			case PiviPackage.PIVI_DIAGRAM: return createPiviDiagram();
			case PiviPackage.RESULT: return createResult();
			case PiviPackage.START: return createStart();
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
	public IfEndStatement createIfEndStatement() {
		IfEndStatementImpl ifEndStatement = new IfEndStatementImpl();
		return ifEndStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStartStatement createIfStartStatement() {
		IfStartStatementImpl ifStartStatement = new IfStartStatementImpl();
		return ifStartStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort createInputPort() {
		InputPortImpl inputPort = new InputPortImpl();
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction createInstruction() {
		InstructionImpl instruction = new InstructionImpl();
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort createOutputPort() {
		OutputPortImpl outputPort = new OutputPortImpl();
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PiviDiagram createPiviDiagram() {
		PiviDiagramImpl piviDiagram = new PiviDiagramImpl();
		return piviDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Result createResult() {
		ResultImpl result = new ResultImpl();
		return result;
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
