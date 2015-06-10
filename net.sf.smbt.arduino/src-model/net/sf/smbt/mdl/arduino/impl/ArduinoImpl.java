/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.mdl.arduino.impl;

import java.util.ArrayList;
import java.util.List;

import net.sf.smbt.arduino.utils.IPortListener;
import net.sf.smbt.mdl.arduino.ARDUINO_ATMEGA_168_SERIES;
import net.sf.smbt.mdl.arduino.ARDUINO_BOARD_KIND;
import net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID;
import net.sf.smbt.mdl.arduino.ARDUINO_COMM;
import net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE;
import net.sf.smbt.mdl.arduino.ARDUINO_REPORT_MODE;
import net.sf.smbt.mdl.arduino.ARDUINO_STATUS_MODE;
import net.sf.smbt.mdl.arduino.ARDUINO_VER_BRAND_NAME;
import net.sf.smbt.mdl.arduino.AREFPort;
import net.sf.smbt.mdl.arduino.AnalogPort;
import net.sf.smbt.mdl.arduino.Arduino;
import net.sf.smbt.mdl.arduino.ArduinoPackage;
import net.sf.smbt.mdl.arduino.DigitalPort;
import net.sf.smbt.mdl.arduino.GndPort;
import net.sf.smbt.mdl.arduino.PIN_MAPPING;
import net.sf.smbt.mdl.arduino.Port;
import net.sf.smbt.mdl.arduino.Port3V3;
import net.sf.smbt.mdl.arduino.Port5V;
import net.sf.smbt.mdl.arduino.Port9V;
import net.sf.smbt.mdl.arduino.PortIO7;
import net.sf.smbt.mdl.arduino.PortVIN;
import net.sf.smbt.mdl.arduino.RstPort;
import net.sf.smbt.mdl.arduino.RxPort;
import net.sf.smbt.mdl.arduino.TxPort;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arduino</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.mdl.arduino.impl.ArduinoImpl#getVer <em>Ver</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.impl.ArduinoImpl#getBoard <em>Board</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.impl.ArduinoImpl#getSeries <em>Series</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.impl.ArduinoImpl#getDigitalPorts <em>Digital Ports</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.impl.ArduinoImpl#getAnalogPorts <em>Analog Ports</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.impl.ArduinoImpl#getTx <em>Tx</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.impl.ArduinoImpl#getGroundPorts <em>Ground Ports</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.impl.ArduinoImpl#getRx <em>Rx</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.impl.ArduinoImpl#getPwm3V3 <em>Pwm3 V3</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.impl.ArduinoImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.impl.ArduinoImpl#getComm <em>Comm</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.impl.ArduinoImpl#getResetPort <em>Reset Port</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.impl.ArduinoImpl#getPwm9V <em>Pwm9 V</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.impl.ArduinoImpl#getPwm5V <em>Pwm5 V</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.impl.ArduinoImpl#getIo7 <em>Io7</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.impl.ArduinoImpl#getVin <em>Vin</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.impl.ArduinoImpl#getAref <em>Aref</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.impl.ArduinoImpl#getFirmataMode <em>Firmata Mode</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.impl.ArduinoImpl#getLockedPin <em>Locked Pin</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.impl.ArduinoImpl#isSynchronizing <em>Synchronizing</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.impl.ArduinoImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.impl.ArduinoImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.impl.ArduinoImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArduinoImpl extends MinimalEObjectImpl.Container implements Arduino {
	
	private List<IPortListener> portListeners;
	
	public void addPortIOMessageListner(IPortListener listener) {
		if (!portListeners.contains(listener)) {
			portListeners.add(listener);
		}
	}
	
	public void removePortIOMessageListner(IPortListener listener) {
		if (portListeners.contains(listener)) {
			portListeners.remove(portListeners.indexOf(listener));
		}
	}
	
	public List<IPortListener> getPortsToListen() {
		return portListeners;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ArduinoImpl() {
		super();
		portListeners = new ArrayList<IPortListener>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.ARDUINO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARDUINO_VER_BRAND_NAME getVer() {
		return (ARDUINO_VER_BRAND_NAME)eGet(ArduinoPackage.Literals.ARDUINO__VER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVer(ARDUINO_VER_BRAND_NAME newVer) {
		eSet(ArduinoPackage.Literals.ARDUINO__VER, newVer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Port> getCommPorts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DigitalPort getDigitalPortFromChannel(int channel) {
		for (DigitalPort p : getDigitalPorts()) {
			if (p.getChannel() == channel) {
				return p;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AnalogPort getAnalogicPortFromChannel(int channel) {
		for (AnalogPort p : getAnalogPorts()) {
			if (p.getChannel() == channel) {
				return p;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARDUINO_BOARD_KIND getBoard() {
		return (ARDUINO_BOARD_KIND)eGet(ArduinoPackage.Literals.ARDUINO__BOARD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoard(ARDUINO_BOARD_KIND newBoard) {
		eSet(ArduinoPackage.Literals.ARDUINO__BOARD, newBoard);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARDUINO_ATMEGA_168_SERIES getSeries() {
		return (ARDUINO_ATMEGA_168_SERIES)eGet(ArduinoPackage.Literals.ARDUINO__SERIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeries(ARDUINO_ATMEGA_168_SERIES newSeries) {
		eSet(ArduinoPackage.Literals.ARDUINO__SERIES, newSeries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DigitalPort> getDigitalPorts() {
		return (EList<DigitalPort>)eGet(ArduinoPackage.Literals.ARDUINO__DIGITAL_PORTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AnalogPort> getAnalogPorts() {
		return (EList<AnalogPort>)eGet(ArduinoPackage.Literals.ARDUINO__ANALOG_PORTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TxPort getTx() {
		return (TxPort)eGet(ArduinoPackage.Literals.ARDUINO__TX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTx(TxPort newTx) {
		eSet(ArduinoPackage.Literals.ARDUINO__TX, newTx);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GndPort> getGroundPorts() {
		return (EList<GndPort>)eGet(ArduinoPackage.Literals.ARDUINO__GROUND_PORTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RxPort getRx() {
		return (RxPort)eGet(ArduinoPackage.Literals.ARDUINO__RX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRx(RxPort newRx) {
		eSet(ArduinoPackage.Literals.ARDUINO__RX, newRx);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port3V3 getPwm3V3() {
		return (Port3V3)eGet(ArduinoPackage.Literals.ARDUINO__PWM3_V3, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPwm3V3(Port3V3 newPwm3V3) {
		eSet(ArduinoPackage.Literals.ARDUINO__PWM3_V3, newPwm3V3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return (String)eGet(ArduinoPackage.Literals.ARDUINO__LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		eSet(ArduinoPackage.Literals.ARDUINO__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARDUINO_COMM getComm() {
		return (ARDUINO_COMM)eGet(ArduinoPackage.Literals.ARDUINO__COMM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComm(ARDUINO_COMM newComm) {
		eSet(ArduinoPackage.Literals.ARDUINO__COMM, newComm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RstPort getResetPort() {
		return (RstPort)eGet(ArduinoPackage.Literals.ARDUINO__RESET_PORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResetPort(RstPort newResetPort) {
		eSet(ArduinoPackage.Literals.ARDUINO__RESET_PORT, newResetPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port9V getPwm9V() {
		return (Port9V)eGet(ArduinoPackage.Literals.ARDUINO__PWM9_V, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPwm9V(Port9V newPwm9V) {
		eSet(ArduinoPackage.Literals.ARDUINO__PWM9_V, newPwm9V);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port5V getPwm5V() {
		return (Port5V)eGet(ArduinoPackage.Literals.ARDUINO__PWM5_V, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPwm5V(Port5V newPwm5V) {
		eSet(ArduinoPackage.Literals.ARDUINO__PWM5_V, newPwm5V);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortIO7 getIo7() {
		return (PortIO7)eGet(ArduinoPackage.Literals.ARDUINO__IO7, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIo7(PortIO7 newIo7) {
		eSet(ArduinoPackage.Literals.ARDUINO__IO7, newIo7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortVIN getVin() {
		return (PortVIN)eGet(ArduinoPackage.Literals.ARDUINO__VIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVin(PortVIN newVin) {
		eSet(ArduinoPackage.Literals.ARDUINO__VIN, newVin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AREFPort getAref() {
		return (AREFPort)eGet(ArduinoPackage.Literals.ARDUINO__AREF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAref(AREFPort newAref) {
		eSet(ArduinoPackage.Literals.ARDUINO__AREF, newAref);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARDUINO_FIRMWARE_MODE getFirmataMode() {
		return (ARDUINO_FIRMWARE_MODE)eGet(ArduinoPackage.Literals.ARDUINO__FIRMATA_MODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirmataMode(ARDUINO_FIRMWARE_MODE newFirmataMode) {
		eSet(ArduinoPackage.Literals.ARDUINO__FIRMATA_MODE, newFirmataMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIN_MAPPING getLockedPin() {
		return (PIN_MAPPING)eGet(ArduinoPackage.Literals.ARDUINO__LOCKED_PIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLockedPin(PIN_MAPPING newLockedPin) {
		eSet(ArduinoPackage.Literals.ARDUINO__LOCKED_PIN, newLockedPin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSynchronizing() {
		return (Boolean)eGet(ArduinoPackage.Literals.ARDUINO__SYNCHRONIZING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronizing(boolean newSynchronizing) {
		eSet(ArduinoPackage.Literals.ARDUINO__SYNCHRONIZING, newSynchronizing);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARDUINO_STATUS_MODE getStatus() {
		return (ARDUINO_STATUS_MODE)eGet(ArduinoPackage.Literals.ARDUINO__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ARDUINO_STATUS_MODE newStatus) {
		eSet(ArduinoPackage.Literals.ARDUINO__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARDUINO_BOARD_UID getKind() {
		return (ARDUINO_BOARD_UID)eGet(ArduinoPackage.Literals.ARDUINO__KIND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ARDUINO_BOARD_UID newKind) {
		eSet(ArduinoPackage.Literals.ARDUINO__KIND, newKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(ArduinoPackage.Literals.ARDUINO__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ArduinoPackage.Literals.ARDUINO__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void digitalIOMessage(float data, PIN_MAPPING pin) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void digitalIOMessage(int data, PIN_MAPPING pin) {
		for (Port p : getPorts()) {
			if (p.getMap().equals(pin)) {
				((DigitalPort)p).setValue(data);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void analogIOMessage(float data, PIN_MAPPING pin) {
		for (Port p : getPorts()) {
			if (p.getMap().equals(pin)) {
				((AnalogPort)p).setValue(data);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void reportAnalogPin(ARDUINO_REPORT_MODE mode, final PIN_MAPPING pin) {
		for (Port p : getPorts()) {
			if (p.getMap().equals(pin)) {
				p.setReport(
					mode == ARDUINO_REPORT_MODE.ACTIVATE ? 
						ARDUINO_REPORT_MODE.DEACTIVATE : 
						ARDUINO_REPORT_MODE.ACTIVATE
				);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void reportDigitalPin(ARDUINO_REPORT_MODE mode, PIN_MAPPING pin) {
		for (Port p : getPorts()) {
			if (p.getMap().equals(pin)) {
				p.setReport(
					mode == ARDUINO_REPORT_MODE.ACTIVATE ? 
					ARDUINO_REPORT_MODE.DEACTIVATE : 
					ARDUINO_REPORT_MODE.ACTIVATE
				);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean synchronizingArduinoModel(PIN_MAPPING pin) {
		return pin.equals(getLockedPin());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean synchronizingArduinoHardware(PIN_MAPPING pin) {
		return pin.equals(getLockedPin());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AnalogPort getAnalogicPort(PIN_MAPPING pin) {
		for (AnalogPort p : getAnalogPorts()) {
			if (p.getMap().equals(pin)) {
				return p;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DigitalPort getDigitalPort(PIN_MAPPING pin) {
		for (DigitalPort p : getDigitalPorts()) {
			if (p.getMap().equals(pin)) {
				return p;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AnalogPort getAnalogicPort(int pin) {
		for (AnalogPort p : getAnalogPorts()) {
			if (p.getMap().getValue() == pin) {
				return p;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DigitalPort getDigitalPort(int pin) {
		for (DigitalPort p : getDigitalPorts()) {
			if (p.getMap().getValue() == pin) {
				return p;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Port> getPorts() {
		EList<Port> lst = new BasicEList<Port>();
		for (EReference ref : eClass().getEAllContainments()) {
			if (	ref.getEReferenceType().equals(ArduinoPackage.Literals.ARDUINO__ANALOG_PORTS) ||
					ref.getEReferenceType().equals(ArduinoPackage.Literals.ARDUINO__DIGITAL_PORTS) ||
					ref.getEReferenceType().equals(ArduinoPackage.Literals.ARDUINO__GROUND_PORTS) ||
					ref.getEReferenceType().equals(ArduinoPackage.Literals.TX_PORT) ||
					ref.getEReferenceType().equals(ArduinoPackage.Literals.RX_PORT) ||
					ref.getEReferenceType().equals(ArduinoPackage.Literals.ARDUINO__AREF) ||
					ref.getEReferenceType().equals(ArduinoPackage.Literals.ARDUINO__PWM3_V3) ||
					ref.getEReferenceType().equals(ArduinoPackage.Literals.ARDUINO__PWM5_V) ||
					ref.getEReferenceType().equals(ArduinoPackage.Literals.ARDUINO__PWM9_V) ||
					ref.getEReferenceType().equals(ArduinoPackage.Literals.ARDUINO__VIN) ||
					ref.getEReferenceType().equals(ArduinoPackage.Literals.ARDUINO__PWM9_V) ||
					ref.getEReferenceType().equals(ArduinoPackage.Literals.ARDUINO__RESET_PORT)
			) {
				if (eClass().eGet(ref) instanceof List) {
					@SuppressWarnings("unchecked")
					EList<Port> analogPorts = (EList<Port>) eClass().eGet(ref);
					lst.addAll(analogPorts);
				} else if (eClass().eGet(ref) instanceof Port) {
					lst.add((Port)eClass().eGet(ref));
				}
			} 
		}
		return lst;
	}

} //ArduinoImpl
