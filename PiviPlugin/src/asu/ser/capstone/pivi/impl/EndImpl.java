/**
 */
package asu.ser.capstone.pivi.impl;

import asu.ser.capstone.pivi.End;
import asu.ser.capstone.pivi.PiviPackage;
import asu.ser.capstone.pivi.StatementOutput;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asu.ser.capstone.pivi.impl.EndImpl#getStatementOutput <em>Statement Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndImpl extends MinimalEObjectImpl.Container implements End {
	/**
	 * The cached value of the '{@link #getStatementOutput() <em>Statement Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<StatementOutput> statementOutput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PiviPackage.Literals.END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StatementOutput> getStatementOutput() {
		if (statementOutput == null) {
			statementOutput = new EObjectResolvingEList<StatementOutput>(StatementOutput.class, this, PiviPackage.END__STATEMENT_OUTPUT);
		}
		return statementOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PiviPackage.END__STATEMENT_OUTPUT:
				return getStatementOutput();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PiviPackage.END__STATEMENT_OUTPUT:
				getStatementOutput().clear();
				getStatementOutput().addAll((Collection<? extends StatementOutput>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PiviPackage.END__STATEMENT_OUTPUT:
				getStatementOutput().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PiviPackage.END__STATEMENT_OUTPUT:
				return statementOutput != null && !statementOutput.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EndImpl
