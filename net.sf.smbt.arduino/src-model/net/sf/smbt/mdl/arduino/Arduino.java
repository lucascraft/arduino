/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.mdl.arduino;

import java.util.List;

import net.sf.smbt.arduino.utils.IPortListener;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.mdl.arduino.Arduino#getVer <em>Ver</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.Arduino#getBoard <em>Board</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.Arduino#getSeries <em>Series</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.Arduino#getDigitalPorts <em>Digital Ports</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.Arduino#getAnalogPorts <em>Analog Ports</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.Arduino#getTx <em>Tx</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.Arduino#getGroundPorts <em>Ground Ports</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.Arduino#getRx <em>Rx</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.Arduino#getPwm3V3 <em>Pwm3 V3</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.Arduino#getLabel <em>Label</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.Arduino#getComm <em>Comm</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.Arduino#getResetPort <em>Reset Port</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.Arduino#getPwm9V <em>Pwm9 V</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.Arduino#getPwm5V <em>Pwm5 V</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.Arduino#getIo7 <em>Io7</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.Arduino#getVin <em>Vin</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.Arduino#getAref <em>Aref</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.Arduino#getFirmataMode <em>Firmata Mode</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.Arduino#getLockedPin <em>Locked Pin</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.Arduino#isSynchronizing <em>Synchronizing</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.Arduino#getStatus <em>Status</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.Arduino#getKind <em>Kind</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.Arduino#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.mdl.arduino.ArduinoPackage#getArduino()
 * @model
 * @generated
 */
public interface Arduino extends EObject {
	void addPortIOMessageListner(IPortListener listener);
	void removePortIOMessageListner(IPortListener listener);
	List<IPortListener> getPortsToListen();
	
	/**
	 * Returns the value of the '<em><b>Ver</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.mdl.arduino.ARDUINO_VER_BRAND_NAME}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ver</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ver</em>' attribute.
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_VER_BRAND_NAME
	 * @see #setVer(ARDUINO_VER_BRAND_NAME)
	 * @see net.sf.smbt.mdl.arduino.ArduinoPackage#getArduino_Ver()
	 * @model
	 * @generated
	 */
	ARDUINO_VER_BRAND_NAME getVer();

	/**
	 * Sets the value of the '{@link net.sf.smbt.mdl.arduino.Arduino#getVer <em>Ver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ver</em>' attribute.
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_VER_BRAND_NAME
	 * @see #getVer()
	 * @generated
	 */
	void setVer(ARDUINO_VER_BRAND_NAME value);

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comm Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation" upper="2"
	 * @generated
	 */
	EList<Port> getCommPorts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DigitalPort getDigitalPortFromChannel(int channel);
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AnalogPort getAnalogicPortFromChannel(int channel);
	/**
	 * Returns the value of the '<em><b>Board</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.mdl.arduino.ARDUINO_BOARD_KIND}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Board</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' attribute.
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_BOARD_KIND
	 * @see #setBoard(ARDUINO_BOARD_KIND)
	 * @see net.sf.smbt.mdl.arduino.ArduinoPackage#getArduino_Board()
	 * @model
	 * @generated
	 */
	ARDUINO_BOARD_KIND getBoard();

	/**
	 * Sets the value of the '{@link net.sf.smbt.mdl.arduino.Arduino#getBoard <em>Board</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board</em>' attribute.
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_BOARD_KIND
	 * @see #getBoard()
	 * @generated
	 */
	void setBoard(ARDUINO_BOARD_KIND value);

	/**
	 * Returns the value of the '<em><b>Series</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.mdl.arduino.ARDUINO_ATMEGA_168_SERIES}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Series</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series</em>' attribute.
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_ATMEGA_168_SERIES
	 * @see #setSeries(ARDUINO_ATMEGA_168_SERIES)
	 * @see net.sf.smbt.mdl.arduino.ArduinoPackage#getArduino_Series()
	 * @model
	 * @generated
	 */
	ARDUINO_ATMEGA_168_SERIES getSeries();

	/**
	 * Sets the value of the '{@link net.sf.smbt.mdl.arduino.Arduino#getSeries <em>Series</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series</em>' attribute.
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_ATMEGA_168_SERIES
	 * @see #getSeries()
	 * @generated
	 */
	void setSeries(ARDUINO_ATMEGA_168_SERIES value);

	/**
	 * Returns the value of the '<em><b>Digital Ports</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.mdl.arduino.DigitalPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digital Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digital Ports</em>' containment reference list.
	 * @see net.sf.smbt.mdl.arduino.ArduinoPackage#getArduino_DigitalPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<DigitalPort> getDigitalPorts();

	/**
	 * Returns the value of the '<em><b>Analog Ports</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.mdl.arduino.AnalogPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analog Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analog Ports</em>' containment reference list.
	 * @see net.sf.smbt.mdl.arduino.ArduinoPackage#getArduino_AnalogPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnalogPort> getAnalogPorts();

	/**
	 * Returns the value of the '<em><b>Tx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tx</em>' containment reference.
	 * @see #setTx(TxPort)
	 * @see net.sf.smbt.mdl.arduino.ArduinoPackage#getArduino_Tx()
	 * @model containment="true"
	 * @generated
	 */
	TxPort getTx();

	/**
	 * Sets the value of the '{@link net.sf.smbt.mdl.arduino.Arduino#getTx <em>Tx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tx</em>' containment reference.
	 * @see #getTx()
	 * @generated
	 */
	void setTx(TxPort value);

	/**
	 * Returns the value of the '<em><b>Ground Ports</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.mdl.arduino.GndPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ground Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Ports</em>' containment reference list.
	 * @see net.sf.smbt.mdl.arduino.ArduinoPackage#getArduino_GroundPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<GndPort> getGroundPorts();

	/**
	 * Returns the value of the '<em><b>Rx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rx</em>' containment reference.
	 * @see #setRx(RxPort)
	 * @see net.sf.smbt.mdl.arduino.ArduinoPackage#getArduino_Rx()
	 * @model containment="true"
	 * @generated
	 */
	RxPort getRx();

	/**
	 * Sets the value of the '{@link net.sf.smbt.mdl.arduino.Arduino#getRx <em>Rx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rx</em>' containment reference.
	 * @see #getRx()
	 * @generated
	 */
	void setRx(RxPort value);

	/**
	 * Returns the value of the '<em><b>Pwm3 V3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pwm3 V3</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pwm3 V3</em>' containment reference.
	 * @see #setPwm3V3(Port3V3)
	 * @see net.sf.smbt.mdl.arduino.ArduinoPackage#getArduino_Pwm3V3()
	 * @model containment="true"
	 * @generated
	 */
	Port3V3 getPwm3V3();

	/**
	 * Sets the value of the '{@link net.sf.smbt.mdl.arduino.Arduino#getPwm3V3 <em>Pwm3 V3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pwm3 V3</em>' containment reference.
	 * @see #getPwm3V3()
	 * @generated
	 */
	void setPwm3V3(Port3V3 value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see net.sf.smbt.mdl.arduino.ArduinoPackage#getArduino_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link net.sf.smbt.mdl.arduino.Arduino#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Comm</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.mdl.arduino.ARDUINO_COMM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm</em>' attribute.
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_COMM
	 * @see #setComm(ARDUINO_COMM)
	 * @see net.sf.smbt.mdl.arduino.ArduinoPackage#getArduino_Comm()
	 * @model
	 * @generated
	 */
	ARDUINO_COMM getComm();

	/**
	 * Sets the value of the '{@link net.sf.smbt.mdl.arduino.Arduino#getComm <em>Comm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comm</em>' attribute.
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_COMM
	 * @see #getComm()
	 * @generated
	 */
	void setComm(ARDUINO_COMM value);

	/**
	 * Returns the value of the '<em><b>Reset Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reset Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Port</em>' containment reference.
	 * @see #setResetPort(RstPort)
	 * @see net.sf.smbt.mdl.arduino.ArduinoPackage#getArduino_ResetPort()
	 * @model containment="true"
	 * @generated
	 */
	RstPort getResetPort();

	/**
	 * Sets the value of the '{@link net.sf.smbt.mdl.arduino.Arduino#getResetPort <em>Reset Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Port</em>' containment reference.
	 * @see #getResetPort()
	 * @generated
	 */
	void setResetPort(RstPort value);

	/**
	 * Returns the value of the '<em><b>Pwm9 V</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pwm9 V</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pwm9 V</em>' containment reference.
	 * @see #setPwm9V(Port9V)
	 * @see net.sf.smbt.mdl.arduino.ArduinoPackage#getArduino_Pwm9V()
	 * @model containment="true"
	 * @generated
	 */
	Port9V getPwm9V();

	/**
	 * Sets the value of the '{@link net.sf.smbt.mdl.arduino.Arduino#getPwm9V <em>Pwm9 V</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pwm9 V</em>' containment reference.
	 * @see #getPwm9V()
	 * @generated
	 */
	void setPwm9V(Port9V value);

	/**
	 * Returns the value of the '<em><b>Pwm5 V</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pwm5 V</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pwm5 V</em>' containment reference.
	 * @see #setPwm5V(Port5V)
	 * @see net.sf.smbt.mdl.arduino.ArduinoPackage#getArduino_Pwm5V()
	 * @model containment="true"
	 * @generated
	 */
	Port5V getPwm5V();

	/**
	 * Sets the value of the '{@link net.sf.smbt.mdl.arduino.Arduino#getPwm5V <em>Pwm5 V</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pwm5 V</em>' containment reference.
	 * @see #getPwm5V()
	 * @generated
	 */
	void setPwm5V(Port5V value);

	/**
	 * Returns the value of the '<em><b>Io7</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Io7</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Io7</em>' containment reference.
	 * @see #setIo7(PortIO7)
	 * @see net.sf.smbt.mdl.arduino.ArduinoPackage#getArduino_Io7()
	 * @model containment="true"
	 * @generated
	 */
	PortIO7 getIo7();

	/**
	 * Sets the value of the '{@link net.sf.smbt.mdl.arduino.Arduino#getIo7 <em>Io7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Io7</em>' containment reference.
	 * @see #getIo7()
	 * @generated
	 */
	void setIo7(PortIO7 value);

	/**
	 * Returns the value of the '<em><b>Vin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vin</em>' containment reference.
	 * @see #setVin(PortVIN)
	 * @see net.sf.smbt.mdl.arduino.ArduinoPackage#getArduino_Vin()
	 * @model containment="true"
	 * @generated
	 */
	PortVIN getVin();

	/**
	 * Sets the value of the '{@link net.sf.smbt.mdl.arduino.Arduino#getVin <em>Vin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vin</em>' containment reference.
	 * @see #getVin()
	 * @generated
	 */
	void setVin(PortVIN value);

	/**
	 * Returns the value of the '<em><b>Aref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aref</em>' containment reference.
	 * @see #setAref(AREFPort)
	 * @see net.sf.smbt.mdl.arduino.ArduinoPackage#getArduino_Aref()
	 * @model containment="true"
	 * @generated
	 */
	AREFPort getAref();

	/**
	 * Sets the value of the '{@link net.sf.smbt.mdl.arduino.Arduino#getAref <em>Aref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aref</em>' containment reference.
	 * @see #getAref()
	 * @generated
	 */
	void setAref(AREFPort value);

	/**
	 * Returns the value of the '<em><b>Firmata Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firmata Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firmata Mode</em>' attribute.
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE
	 * @see #setFirmataMode(ARDUINO_FIRMWARE_MODE)
	 * @see net.sf.smbt.mdl.arduino.ArduinoPackage#getArduino_FirmataMode()
	 * @model
	 * @generated
	 */
	ARDUINO_FIRMWARE_MODE getFirmataMode();
	/**
	 * Sets the value of the '{@link net.sf.smbt.mdl.arduino.Arduino#getFirmataMode <em>Firmata Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firmata Mode</em>' attribute.
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE
	 * @see #getFirmataMode()
	 * @generated
	 */
	void setFirmataMode(ARDUINO_FIRMWARE_MODE value);
	/**
	 * Returns the value of the '<em><b>Locked Pin</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.mdl.arduino.PIN_MAPPING}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locked Pin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locked Pin</em>' attribute.
	 * @see net.sf.smbt.mdl.arduino.PIN_MAPPING
	 * @see #setLockedPin(PIN_MAPPING)
	 * @see net.sf.smbt.mdl.arduino.ArduinoPackage#getArduino_LockedPin()
	 * @model
	 * @generated
	 */
	PIN_MAPPING getLockedPin();
	/**
	 * Sets the value of the '{@link net.sf.smbt.mdl.arduino.Arduino#getLockedPin <em>Locked Pin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locked Pin</em>' attribute.
	 * @see net.sf.smbt.mdl.arduino.PIN_MAPPING
	 * @see #getLockedPin()
	 * @generated
	 */
	void setLockedPin(PIN_MAPPING value);
	/**
	 * Returns the value of the '<em><b>Synchronizing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronizing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronizing</em>' attribute.
	 * @see #setSynchronizing(boolean)
	 * @see net.sf.smbt.mdl.arduino.ArduinoPackage#getArduino_Synchronizing()
	 * @model
	 * @generated
	 */
	boolean isSynchronizing();
	/**
	 * Sets the value of the '{@link net.sf.smbt.mdl.arduino.Arduino#isSynchronizing <em>Synchronizing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronizing</em>' attribute.
	 * @see #isSynchronizing()
	 * @generated
	 */
	void setSynchronizing(boolean value);
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.mdl.arduino.ARDUINO_STATUS_MODE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_STATUS_MODE
	 * @see #setStatus(ARDUINO_STATUS_MODE)
	 * @see net.sf.smbt.mdl.arduino.ArduinoPackage#getArduino_Status()
	 * @model
	 * @generated
	 */
	ARDUINO_STATUS_MODE getStatus();
	/**
	 * Sets the value of the '{@link net.sf.smbt.mdl.arduino.Arduino#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_STATUS_MODE
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ARDUINO_STATUS_MODE value);
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID
	 * @see #setKind(ARDUINO_BOARD_UID)
	 * @see net.sf.smbt.mdl.arduino.ArduinoPackage#getArduino_Kind()
	 * @model
	 * @generated
	 */
	ARDUINO_BOARD_UID getKind();
	/**
	 * Sets the value of the '{@link net.sf.smbt.mdl.arduino.Arduino#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ARDUINO_BOARD_UID value);
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.sf.smbt.mdl.arduino.ArduinoPackage#getArduino_Name()
	 * @model
	 * @generated
	 */
	String getName();
	/**
	 * Sets the value of the '{@link net.sf.smbt.mdl.arduino.Arduino#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void digitalIOMessage(float data, PIN_MAPPING pin);
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void analogIOMessage(float data, PIN_MAPPING pin);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void reportAnalogPin(ARDUINO_REPORT_MODE mode, PIN_MAPPING pin);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void reportDigitalPin(ARDUINO_REPORT_MODE mode, PIN_MAPPING pin);
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean synchronizingArduinoModel(PIN_MAPPING pin);
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean synchronizingArduinoHardware(PIN_MAPPING pin);
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AnalogPort getAnalogicPort(PIN_MAPPING pin);
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DigitalPort getDigitalPort(PIN_MAPPING pin);
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AnalogPort getAnalogicPort(int pin);
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DigitalPort getDigitalPort(int pin);
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Port> getPorts();

} // Arduino
