/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.mdl.arduino.util;

import net.sf.smbt.mdl.arduino.*;
import net.sf.smbt.mdl.arduino.AREFPort;
import net.sf.smbt.mdl.arduino.AnalogPort;
import net.sf.smbt.mdl.arduino.Arduino;
import net.sf.smbt.mdl.arduino.ArduinoPackage;
import net.sf.smbt.mdl.arduino.DigitalPort;
import net.sf.smbt.mdl.arduino.GndPort;
import net.sf.smbt.mdl.arduino.Port;
import net.sf.smbt.mdl.arduino.Port3V3;
import net.sf.smbt.mdl.arduino.Port5V;
import net.sf.smbt.mdl.arduino.Port9V;
import net.sf.smbt.mdl.arduino.PortIO7;
import net.sf.smbt.mdl.arduino.PortVIN;
import net.sf.smbt.mdl.arduino.RstPort;
import net.sf.smbt.mdl.arduino.RxPort;
import net.sf.smbt.mdl.arduino.TxPort;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.mdl.arduino.ArduinoPackage
 * @generated
 */
public class ArduinoSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArduinoPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoSwitch() {
		if (modelPackage == null) {
			modelPackage = ArduinoPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ArduinoPackage.ARDUINO: {
				Arduino arduino = (Arduino)theEObject;
				T result = caseArduino(arduino);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.DIGITAL_PORT: {
				DigitalPort digitalPort = (DigitalPort)theEObject;
				T result = caseDigitalPort(digitalPort);
				if (result == null) result = casePort(digitalPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.ANALOG_PORT: {
				AnalogPort analogPort = (AnalogPort)theEObject;
				T result = caseAnalogPort(analogPort);
				if (result == null) result = casePort(analogPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.RX_PORT: {
				RxPort rxPort = (RxPort)theEObject;
				T result = caseRxPort(rxPort);
				if (result == null) result = casePort(rxPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.TX_PORT: {
				TxPort txPort = (TxPort)theEObject;
				T result = caseTxPort(txPort);
				if (result == null) result = casePort(txPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.GND_PORT: {
				GndPort gndPort = (GndPort)theEObject;
				T result = caseGndPort(gndPort);
				if (result == null) result = casePort(gndPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.PORT3_V3: {
				Port3V3 port3V3 = (Port3V3)theEObject;
				T result = casePort3V3(port3V3);
				if (result == null) result = casePort(port3V3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.RST_PORT: {
				RstPort rstPort = (RstPort)theEObject;
				T result = caseRstPort(rstPort);
				if (result == null) result = casePort(rstPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.PORT5_V: {
				Port5V port5V = (Port5V)theEObject;
				T result = casePort5V(port5V);
				if (result == null) result = casePort(port5V);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.PORT9_V: {
				Port9V port9V = (Port9V)theEObject;
				T result = casePort9V(port9V);
				if (result == null) result = casePort(port9V);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.PORT_IO7: {
				PortIO7 portIO7 = (PortIO7)theEObject;
				T result = casePortIO7(portIO7);
				if (result == null) result = casePort(portIO7);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.AREF_PORT: {
				AREFPort arefPort = (AREFPort)theEObject;
				T result = caseAREFPort(arefPort);
				if (result == null) result = casePort(arefPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.PORT_VIN: {
				PortVIN portVIN = (PortVIN)theEObject;
				T result = casePortVIN(portVIN);
				if (result == null) result = casePort(portVIN);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArduinoPackage.BENCH: {
				Bench bench = (Bench)theEObject;
				T result = caseBench(bench);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino(Arduino object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digital Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digital Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDigitalPort(DigitalPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analog Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analog Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalogPort(AnalogPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rx Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rx Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRxPort(RxPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tx Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tx Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTxPort(TxPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gnd Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gnd Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGndPort(GndPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port3 V3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port3 V3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort3V3(Port3V3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rst Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rst Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRstPort(RstPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port5 V</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port5 V</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort5V(Port5V object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port9 V</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port9 V</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort9V(Port9V object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port IO7</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port IO7</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortIO7(PortIO7 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AREF Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AREF Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAREFPort(AREFPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port VIN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port VIN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortVIN(PortVIN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bench</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bench</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBench(Bench object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ArduinoSwitch
