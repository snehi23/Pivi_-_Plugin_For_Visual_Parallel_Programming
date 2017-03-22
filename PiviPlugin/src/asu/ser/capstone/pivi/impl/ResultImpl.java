/**
 */
package asu.ser.capstone.pivi.impl;

import asu.ser.capstone.pivi.OutputPort;
import asu.ser.capstone.pivi.PiviPackage;
import asu.ser.capstone.pivi.Result;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asu.ser.capstone.pivi.impl.ResultImpl#getOutputPort <em>Output Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultImpl extends TerminalImpl implements Result {
	/**
	 * The cached value of the '{@link #getOutputPort() <em>Output Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPort()
	 * @generated
	 * @ordered
	 */
	protected OutputPort outputPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PiviPackage.Literals.RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort getOutputPort() {
		if (outputPort != null && outputPort.eIsProxy()) {
			InternalEObject oldOutputPort = (InternalEObject)outputPort;
			outputPort = (OutputPort)eResolveProxy(oldOutputPort);
			if (outputPort != oldOutputPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PiviPackage.RESULT__OUTPUT_PORT, oldOutputPort, outputPort));
			}
		}
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort basicGetOutputPort() {
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputPort(OutputPort newOutputPort, NotificationChain msgs) {
		OutputPort oldOutputPort = outputPort;
		outputPort = newOutputPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PiviPackage.RESULT__OUTPUT_PORT, oldOutputPort, newOutputPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputPort(OutputPort newOutputPort) {
		if (newOutputPort != outputPort) {
			NotificationChain msgs = null;
			if (outputPort != null)
				msgs = ((InternalEObject)outputPort).eInverseRemove(this, PiviPackage.OUTPUT_PORT__RESULT, OutputPort.class, msgs);
			if (newOutputPort != null)
				msgs = ((InternalEObject)newOutputPort).eInverseAdd(this, PiviPackage.OUTPUT_PORT__RESULT, OutputPort.class, msgs);
			msgs = basicSetOutputPort(newOutputPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PiviPackage.RESULT__OUTPUT_PORT, newOutputPort, newOutputPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PiviPackage.RESULT__OUTPUT_PORT:
				if (outputPort != null)
					msgs = ((InternalEObject)outputPort).eInverseRemove(this, PiviPackage.OUTPUT_PORT__RESULT, OutputPort.class, msgs);
				return basicSetOutputPort((OutputPort)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PiviPackage.RESULT__OUTPUT_PORT:
				return basicSetOutputPort(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PiviPackage.RESULT__OUTPUT_PORT:
				if (resolve) return getOutputPort();
				return basicGetOutputPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PiviPackage.RESULT__OUTPUT_PORT:
				setOutputPort((OutputPort)newValue);
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
			case PiviPackage.RESULT__OUTPUT_PORT:
				setOutputPort((OutputPort)null);
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
			case PiviPackage.RESULT__OUTPUT_PORT:
				return outputPort != null;
		}
		return super.eIsSet(featureID);
	}

} //ResultImpl
