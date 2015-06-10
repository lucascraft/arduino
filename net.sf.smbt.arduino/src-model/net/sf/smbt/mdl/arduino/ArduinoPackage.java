/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.mdl.arduino;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.smbt.mdl.arduino.ArduinoFactory
 * @model kind="package"
 * @generated
 */
public interface ArduinoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "arduino";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://arduino/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "arduino";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArduinoPackage eINSTANCE = net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.mdl.arduino.impl.ArduinoImpl <em>Arduino</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.mdl.arduino.impl.ArduinoImpl
	 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getArduino()
	 * @generated
	 */
	int ARDUINO = 0;

	/**
	 * The feature id for the '<em><b>Ver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO__VER = 0;

	/**
	 * The feature id for the '<em><b>Board</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO__BOARD = 1;

	/**
	 * The feature id for the '<em><b>Series</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO__SERIES = 2;

	/**
	 * The feature id for the '<em><b>Digital Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO__DIGITAL_PORTS = 3;

	/**
	 * The feature id for the '<em><b>Analog Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO__ANALOG_PORTS = 4;

	/**
	 * The feature id for the '<em><b>Tx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO__TX = 5;

	/**
	 * The feature id for the '<em><b>Ground Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO__GROUND_PORTS = 6;

	/**
	 * The feature id for the '<em><b>Rx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO__RX = 7;

	/**
	 * The feature id for the '<em><b>Pwm3 V3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO__PWM3_V3 = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO__LABEL = 9;

	/**
	 * The feature id for the '<em><b>Comm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO__COMM = 10;

	/**
	 * The feature id for the '<em><b>Reset Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO__RESET_PORT = 11;

	/**
	 * The feature id for the '<em><b>Pwm9 V</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO__PWM9_V = 12;

	/**
	 * The feature id for the '<em><b>Pwm5 V</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO__PWM5_V = 13;

	/**
	 * The feature id for the '<em><b>Io7</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO__IO7 = 14;

	/**
	 * The feature id for the '<em><b>Vin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO__VIN = 15;

	/**
	 * The feature id for the '<em><b>Aref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO__AREF = 16;

	/**
	 * The feature id for the '<em><b>Firmata Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO__FIRMATA_MODE = 17;

	/**
	 * The feature id for the '<em><b>Locked Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO__LOCKED_PIN = 18;

	/**
	 * The feature id for the '<em><b>Synchronizing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO__SYNCHRONIZING = 19;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO__STATUS = 20;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO__KIND = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO__NAME = 22;

	/**
	 * The number of structural features of the '<em>Arduino</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_FEATURE_COUNT = 23;

	/**
	 * The meta object id for the '{@link net.sf.smbt.mdl.arduino.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.mdl.arduino.impl.PortImpl
	 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 1;

	/**
	 * The feature id for the '<em><b>Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__MAP = 0;

	/**
	 * The feature id for the '<em><b>Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__REPORT = 1;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__CHANNEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = 3;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.mdl.arduino.impl.DigitalPortImpl <em>Digital Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.mdl.arduino.impl.DigitalPortImpl
	 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getDigitalPort()
	 * @generated
	 */
	int DIGITAL_PORT = 2;

	/**
	 * The feature id for the '<em><b>Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PORT__MAP = PORT__MAP;

	/**
	 * The feature id for the '<em><b>Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PORT__REPORT = PORT__REPORT;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PORT__CHANNEL = PORT__CHANNEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PORT__VALUE = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Digital Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.mdl.arduino.impl.AnalogPortImpl <em>Analog Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.mdl.arduino.impl.AnalogPortImpl
	 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getAnalogPort()
	 * @generated
	 */
	int ANALOG_PORT = 3;

	/**
	 * The feature id for the '<em><b>Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_PORT__MAP = PORT__MAP;

	/**
	 * The feature id for the '<em><b>Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_PORT__REPORT = PORT__REPORT;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_PORT__CHANNEL = PORT__CHANNEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_PORT__VALUE = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Analog Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOG_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.mdl.arduino.impl.RxPortImpl <em>Rx Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.mdl.arduino.impl.RxPortImpl
	 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getRxPort()
	 * @generated
	 */
	int RX_PORT = 4;

	/**
	 * The feature id for the '<em><b>Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RX_PORT__MAP = PORT__MAP;

	/**
	 * The feature id for the '<em><b>Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RX_PORT__REPORT = PORT__REPORT;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RX_PORT__CHANNEL = PORT__CHANNEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RX_PORT__NAME = PORT__NAME;

	/**
	 * The number of structural features of the '<em>Rx Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RX_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.mdl.arduino.impl.TxPortImpl <em>Tx Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.mdl.arduino.impl.TxPortImpl
	 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getTxPort()
	 * @generated
	 */
	int TX_PORT = 5;

	/**
	 * The feature id for the '<em><b>Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TX_PORT__MAP = PORT__MAP;

	/**
	 * The feature id for the '<em><b>Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TX_PORT__REPORT = PORT__REPORT;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TX_PORT__CHANNEL = PORT__CHANNEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TX_PORT__NAME = PORT__NAME;

	/**
	 * The number of structural features of the '<em>Tx Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TX_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.mdl.arduino.impl.GndPortImpl <em>Gnd Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.mdl.arduino.impl.GndPortImpl
	 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getGndPort()
	 * @generated
	 */
	int GND_PORT = 6;

	/**
	 * The feature id for the '<em><b>Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GND_PORT__MAP = PORT__MAP;

	/**
	 * The feature id for the '<em><b>Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GND_PORT__REPORT = PORT__REPORT;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GND_PORT__CHANNEL = PORT__CHANNEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GND_PORT__NAME = PORT__NAME;

	/**
	 * The number of structural features of the '<em>Gnd Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GND_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.mdl.arduino.impl.Port3V3Impl <em>Port3 V3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.mdl.arduino.impl.Port3V3Impl
	 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getPort3V3()
	 * @generated
	 */
	int PORT3_V3 = 7;

	/**
	 * The feature id for the '<em><b>Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT3_V3__MAP = PORT__MAP;

	/**
	 * The feature id for the '<em><b>Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT3_V3__REPORT = PORT__REPORT;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT3_V3__CHANNEL = PORT__CHANNEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT3_V3__NAME = PORT__NAME;

	/**
	 * The number of structural features of the '<em>Port3 V3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT3_V3_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.mdl.arduino.impl.RstPortImpl <em>Rst Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.mdl.arduino.impl.RstPortImpl
	 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getRstPort()
	 * @generated
	 */
	int RST_PORT = 8;

	/**
	 * The feature id for the '<em><b>Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RST_PORT__MAP = PORT__MAP;

	/**
	 * The feature id for the '<em><b>Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RST_PORT__REPORT = PORT__REPORT;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RST_PORT__CHANNEL = PORT__CHANNEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RST_PORT__NAME = PORT__NAME;

	/**
	 * The number of structural features of the '<em>Rst Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RST_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.mdl.arduino.impl.Port5VImpl <em>Port5 V</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.mdl.arduino.impl.Port5VImpl
	 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getPort5V()
	 * @generated
	 */
	int PORT5_V = 9;

	/**
	 * The feature id for the '<em><b>Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT5_V__MAP = PORT__MAP;

	/**
	 * The feature id for the '<em><b>Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT5_V__REPORT = PORT__REPORT;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT5_V__CHANNEL = PORT__CHANNEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT5_V__NAME = PORT__NAME;

	/**
	 * The number of structural features of the '<em>Port5 V</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT5_V_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.mdl.arduino.impl.Port9VImpl <em>Port9 V</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.mdl.arduino.impl.Port9VImpl
	 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getPort9V()
	 * @generated
	 */
	int PORT9_V = 10;

	/**
	 * The feature id for the '<em><b>Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT9_V__MAP = PORT__MAP;

	/**
	 * The feature id for the '<em><b>Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT9_V__REPORT = PORT__REPORT;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT9_V__CHANNEL = PORT__CHANNEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT9_V__NAME = PORT__NAME;

	/**
	 * The number of structural features of the '<em>Port9 V</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT9_V_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.mdl.arduino.impl.PortIO7Impl <em>Port IO7</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.mdl.arduino.impl.PortIO7Impl
	 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getPortIO7()
	 * @generated
	 */
	int PORT_IO7 = 11;

	/**
	 * The feature id for the '<em><b>Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_IO7__MAP = PORT__MAP;

	/**
	 * The feature id for the '<em><b>Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_IO7__REPORT = PORT__REPORT;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_IO7__CHANNEL = PORT__CHANNEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_IO7__NAME = PORT__NAME;

	/**
	 * The number of structural features of the '<em>Port IO7</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_IO7_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.mdl.arduino.impl.AREFPortImpl <em>AREF Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.mdl.arduino.impl.AREFPortImpl
	 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getAREFPort()
	 * @generated
	 */
	int AREF_PORT = 12;

	/**
	 * The feature id for the '<em><b>Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREF_PORT__MAP = PORT__MAP;

	/**
	 * The feature id for the '<em><b>Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREF_PORT__REPORT = PORT__REPORT;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREF_PORT__CHANNEL = PORT__CHANNEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREF_PORT__NAME = PORT__NAME;

	/**
	 * The number of structural features of the '<em>AREF Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREF_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.mdl.arduino.impl.PortVINImpl <em>Port VIN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.mdl.arduino.impl.PortVINImpl
	 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getPortVIN()
	 * @generated
	 */
	int PORT_VIN = 13;

	/**
	 * The feature id for the '<em><b>Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VIN__MAP = PORT__MAP;

	/**
	 * The feature id for the '<em><b>Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VIN__REPORT = PORT__REPORT;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VIN__CHANNEL = PORT__CHANNEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VIN__NAME = PORT__NAME;

	/**
	 * The number of structural features of the '<em>Port VIN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_VIN_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.mdl.arduino.impl.BenchImpl <em>Bench</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.mdl.arduino.impl.BenchImpl
	 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getBench()
	 * @generated
	 */
	int BENCH = 14;

	/**
	 * The feature id for the '<em><b>Boards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENCH__BOARDS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENCH__NAME = 1;

	/**
	 * The number of structural features of the '<em>Bench</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENCH_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.mdl.arduino.ARDUINO_VER_BRAND_NAME <em>ARDUINO VER BRAND NAME</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_VER_BRAND_NAME
	 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getARDUINO_VER_BRAND_NAME()
	 * @generated
	 */
	int ARDUINO_VER_BRAND_NAME = 15;

	/**
	 * The meta object id for the '{@link net.sf.smbt.mdl.arduino.ARDUINO_BOARD_KIND <em>ARDUINO BOARD KIND</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_BOARD_KIND
	 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getARDUINO_BOARD_KIND()
	 * @generated
	 */
	int ARDUINO_BOARD_KIND = 16;

	/**
	 * The meta object id for the '{@link net.sf.smbt.mdl.arduino.ARDUINO_COMM <em>ARDUINO COMM</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_COMM
	 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getARDUINO_COMM()
	 * @generated
	 */
	int ARDUINO_COMM = 17;

	/**
	 * The meta object id for the '{@link net.sf.smbt.mdl.arduino.PIN_MAPPING <em>PIN MAPPING</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.mdl.arduino.PIN_MAPPING
	 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getPIN_MAPPING()
	 * @generated
	 */
	int PIN_MAPPING = 18;


	/**
	 * The meta object id for the '{@link net.sf.smbt.mdl.arduino.ARDUINO_ATMEGA_168_SERIES <em>ARDUINO ATMEGA 168 SERIES</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_ATMEGA_168_SERIES
	 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getARDUINO_ATMEGA_168_SERIES()
	 * @generated
	 */
	int ARDUINO_ATMEGA_168_SERIES = 19;


	/**
	 * The meta object id for the '{@link net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID <em>ARDUINO BOARD UID</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID
	 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getARDUINO_BOARD_UID()
	 * @generated
	 */
	int ARDUINO_BOARD_UID = 20;


	/**
	 * The meta object id for the '{@link net.sf.smbt.mdl.arduino.ARDUINO_REPORT_MODE <em>ARDUINO REPORT MODE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_REPORT_MODE
	 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getARDUINO_REPORT_MODE()
	 * @generated
	 */
	int ARDUINO_REPORT_MODE = 21;


	/**
	 * The meta object id for the '{@link net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE <em>ARDUINO FIRMWARE MODE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE
	 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getARDUINO_FIRMWARE_MODE()
	 * @generated
	 */
	int ARDUINO_FIRMWARE_MODE = 22;


	/**
	 * The meta object id for the '{@link net.sf.smbt.mdl.arduino.ARDUINO_STATUS_MODE <em>ARDUINO STATUS MODE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_STATUS_MODE
	 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getARDUINO_STATUS_MODE()
	 * @generated
	 */
	int ARDUINO_STATUS_MODE = 23;


	/**
	 * The meta object id for the '{@link net.sf.smbt.mdl.arduino.PIN_MODE <em>PIN MODE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.mdl.arduino.PIN_MODE
	 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getPIN_MODE()
	 * @generated
	 */
	int PIN_MODE = 24;


	/**
	 * The meta object id for the '{@link net.sf.smbt.mdl.arduino.PWM_MODE <em>PWM MODE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.mdl.arduino.PWM_MODE
	 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getPWM_MODE()
	 * @generated
	 */
	int PWM_MODE = 25;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.mdl.arduino.Arduino <em>Arduino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino</em>'.
	 * @see net.sf.smbt.mdl.arduino.Arduino
	 * @generated
	 */
	EClass getArduino();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.mdl.arduino.Arduino#getVer <em>Ver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ver</em>'.
	 * @see net.sf.smbt.mdl.arduino.Arduino#getVer()
	 * @see #getArduino()
	 * @generated
	 */
	EAttribute getArduino_Ver();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.mdl.arduino.Arduino#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Board</em>'.
	 * @see net.sf.smbt.mdl.arduino.Arduino#getBoard()
	 * @see #getArduino()
	 * @generated
	 */
	EAttribute getArduino_Board();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.mdl.arduino.Arduino#getSeries <em>Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Series</em>'.
	 * @see net.sf.smbt.mdl.arduino.Arduino#getSeries()
	 * @see #getArduino()
	 * @generated
	 */
	EAttribute getArduino_Series();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.mdl.arduino.Arduino#getDigitalPorts <em>Digital Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Digital Ports</em>'.
	 * @see net.sf.smbt.mdl.arduino.Arduino#getDigitalPorts()
	 * @see #getArduino()
	 * @generated
	 */
	EReference getArduino_DigitalPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.mdl.arduino.Arduino#getAnalogPorts <em>Analog Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Analog Ports</em>'.
	 * @see net.sf.smbt.mdl.arduino.Arduino#getAnalogPorts()
	 * @see #getArduino()
	 * @generated
	 */
	EReference getArduino_AnalogPorts();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.mdl.arduino.Arduino#getTx <em>Tx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tx</em>'.
	 * @see net.sf.smbt.mdl.arduino.Arduino#getTx()
	 * @see #getArduino()
	 * @generated
	 */
	EReference getArduino_Tx();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.mdl.arduino.Arduino#getGroundPorts <em>Ground Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ground Ports</em>'.
	 * @see net.sf.smbt.mdl.arduino.Arduino#getGroundPorts()
	 * @see #getArduino()
	 * @generated
	 */
	EReference getArduino_GroundPorts();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.mdl.arduino.Arduino#getRx <em>Rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rx</em>'.
	 * @see net.sf.smbt.mdl.arduino.Arduino#getRx()
	 * @see #getArduino()
	 * @generated
	 */
	EReference getArduino_Rx();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.mdl.arduino.Arduino#getPwm3V3 <em>Pwm3 V3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pwm3 V3</em>'.
	 * @see net.sf.smbt.mdl.arduino.Arduino#getPwm3V3()
	 * @see #getArduino()
	 * @generated
	 */
	EReference getArduino_Pwm3V3();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.mdl.arduino.Arduino#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.sf.smbt.mdl.arduino.Arduino#getLabel()
	 * @see #getArduino()
	 * @generated
	 */
	EAttribute getArduino_Label();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.mdl.arduino.Arduino#getComm <em>Comm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comm</em>'.
	 * @see net.sf.smbt.mdl.arduino.Arduino#getComm()
	 * @see #getArduino()
	 * @generated
	 */
	EAttribute getArduino_Comm();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.mdl.arduino.Arduino#getResetPort <em>Reset Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reset Port</em>'.
	 * @see net.sf.smbt.mdl.arduino.Arduino#getResetPort()
	 * @see #getArduino()
	 * @generated
	 */
	EReference getArduino_ResetPort();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.mdl.arduino.Arduino#getPwm9V <em>Pwm9 V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pwm9 V</em>'.
	 * @see net.sf.smbt.mdl.arduino.Arduino#getPwm9V()
	 * @see #getArduino()
	 * @generated
	 */
	EReference getArduino_Pwm9V();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.mdl.arduino.Arduino#getPwm5V <em>Pwm5 V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pwm5 V</em>'.
	 * @see net.sf.smbt.mdl.arduino.Arduino#getPwm5V()
	 * @see #getArduino()
	 * @generated
	 */
	EReference getArduino_Pwm5V();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.mdl.arduino.Arduino#getIo7 <em>Io7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Io7</em>'.
	 * @see net.sf.smbt.mdl.arduino.Arduino#getIo7()
	 * @see #getArduino()
	 * @generated
	 */
	EReference getArduino_Io7();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.mdl.arduino.Arduino#getVin <em>Vin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vin</em>'.
	 * @see net.sf.smbt.mdl.arduino.Arduino#getVin()
	 * @see #getArduino()
	 * @generated
	 */
	EReference getArduino_Vin();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.mdl.arduino.Arduino#getAref <em>Aref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aref</em>'.
	 * @see net.sf.smbt.mdl.arduino.Arduino#getAref()
	 * @see #getArduino()
	 * @generated
	 */
	EReference getArduino_Aref();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.mdl.arduino.Arduino#getFirmataMode <em>Firmata Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firmata Mode</em>'.
	 * @see net.sf.smbt.mdl.arduino.Arduino#getFirmataMode()
	 * @see #getArduino()
	 * @generated
	 */
	EAttribute getArduino_FirmataMode();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.mdl.arduino.Arduino#getLockedPin <em>Locked Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locked Pin</em>'.
	 * @see net.sf.smbt.mdl.arduino.Arduino#getLockedPin()
	 * @see #getArduino()
	 * @generated
	 */
	EAttribute getArduino_LockedPin();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.mdl.arduino.Arduino#isSynchronizing <em>Synchronizing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchronizing</em>'.
	 * @see net.sf.smbt.mdl.arduino.Arduino#isSynchronizing()
	 * @see #getArduino()
	 * @generated
	 */
	EAttribute getArduino_Synchronizing();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.mdl.arduino.Arduino#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see net.sf.smbt.mdl.arduino.Arduino#getStatus()
	 * @see #getArduino()
	 * @generated
	 */
	EAttribute getArduino_Status();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.mdl.arduino.Arduino#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see net.sf.smbt.mdl.arduino.Arduino#getKind()
	 * @see #getArduino()
	 * @generated
	 */
	EAttribute getArduino_Kind();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.mdl.arduino.Arduino#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.mdl.arduino.Arduino#getName()
	 * @see #getArduino()
	 * @generated
	 */
	EAttribute getArduino_Name();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.mdl.arduino.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see net.sf.smbt.mdl.arduino.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.mdl.arduino.Port#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map</em>'.
	 * @see net.sf.smbt.mdl.arduino.Port#getMap()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Map();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.mdl.arduino.Port#getReport <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Report</em>'.
	 * @see net.sf.smbt.mdl.arduino.Port#getReport()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Report();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.mdl.arduino.Port#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel</em>'.
	 * @see net.sf.smbt.mdl.arduino.Port#getChannel()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Channel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.mdl.arduino.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.mdl.arduino.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.mdl.arduino.DigitalPort <em>Digital Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Port</em>'.
	 * @see net.sf.smbt.mdl.arduino.DigitalPort
	 * @generated
	 */
	EClass getDigitalPort();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.mdl.arduino.DigitalPort#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.mdl.arduino.DigitalPort#getValue()
	 * @see #getDigitalPort()
	 * @generated
	 */
	EAttribute getDigitalPort_Value();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.mdl.arduino.AnalogPort <em>Analog Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analog Port</em>'.
	 * @see net.sf.smbt.mdl.arduino.AnalogPort
	 * @generated
	 */
	EClass getAnalogPort();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.mdl.arduino.AnalogPort#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.mdl.arduino.AnalogPort#getValue()
	 * @see #getAnalogPort()
	 * @generated
	 */
	EAttribute getAnalogPort_Value();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.mdl.arduino.RxPort <em>Rx Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rx Port</em>'.
	 * @see net.sf.smbt.mdl.arduino.RxPort
	 * @generated
	 */
	EClass getRxPort();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.mdl.arduino.TxPort <em>Tx Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tx Port</em>'.
	 * @see net.sf.smbt.mdl.arduino.TxPort
	 * @generated
	 */
	EClass getTxPort();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.mdl.arduino.GndPort <em>Gnd Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gnd Port</em>'.
	 * @see net.sf.smbt.mdl.arduino.GndPort
	 * @generated
	 */
	EClass getGndPort();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.mdl.arduino.Port3V3 <em>Port3 V3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port3 V3</em>'.
	 * @see net.sf.smbt.mdl.arduino.Port3V3
	 * @generated
	 */
	EClass getPort3V3();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.mdl.arduino.RstPort <em>Rst Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rst Port</em>'.
	 * @see net.sf.smbt.mdl.arduino.RstPort
	 * @generated
	 */
	EClass getRstPort();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.mdl.arduino.Port5V <em>Port5 V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port5 V</em>'.
	 * @see net.sf.smbt.mdl.arduino.Port5V
	 * @generated
	 */
	EClass getPort5V();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.mdl.arduino.Port9V <em>Port9 V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port9 V</em>'.
	 * @see net.sf.smbt.mdl.arduino.Port9V
	 * @generated
	 */
	EClass getPort9V();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.mdl.arduino.PortIO7 <em>Port IO7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port IO7</em>'.
	 * @see net.sf.smbt.mdl.arduino.PortIO7
	 * @generated
	 */
	EClass getPortIO7();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.mdl.arduino.AREFPort <em>AREF Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AREF Port</em>'.
	 * @see net.sf.smbt.mdl.arduino.AREFPort
	 * @generated
	 */
	EClass getAREFPort();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.mdl.arduino.PortVIN <em>Port VIN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port VIN</em>'.
	 * @see net.sf.smbt.mdl.arduino.PortVIN
	 * @generated
	 */
	EClass getPortVIN();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.mdl.arduino.Bench <em>Bench</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bench</em>'.
	 * @see net.sf.smbt.mdl.arduino.Bench
	 * @generated
	 */
	EClass getBench();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.mdl.arduino.Bench#getBoards <em>Boards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boards</em>'.
	 * @see net.sf.smbt.mdl.arduino.Bench#getBoards()
	 * @see #getBench()
	 * @generated
	 */
	EReference getBench_Boards();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.mdl.arduino.Bench#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.mdl.arduino.Bench#getName()
	 * @see #getBench()
	 * @generated
	 */
	EAttribute getBench_Name();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.mdl.arduino.ARDUINO_VER_BRAND_NAME <em>ARDUINO VER BRAND NAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ARDUINO VER BRAND NAME</em>'.
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_VER_BRAND_NAME
	 * @generated
	 */
	EEnum getARDUINO_VER_BRAND_NAME();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.mdl.arduino.ARDUINO_BOARD_KIND <em>ARDUINO BOARD KIND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ARDUINO BOARD KIND</em>'.
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_BOARD_KIND
	 * @generated
	 */
	EEnum getARDUINO_BOARD_KIND();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.mdl.arduino.ARDUINO_COMM <em>ARDUINO COMM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ARDUINO COMM</em>'.
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_COMM
	 * @generated
	 */
	EEnum getARDUINO_COMM();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.mdl.arduino.PIN_MAPPING <em>PIN MAPPING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PIN MAPPING</em>'.
	 * @see net.sf.smbt.mdl.arduino.PIN_MAPPING
	 * @generated
	 */
	EEnum getPIN_MAPPING();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.mdl.arduino.ARDUINO_ATMEGA_168_SERIES <em>ARDUINO ATMEGA 168 SERIES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ARDUINO ATMEGA 168 SERIES</em>'.
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_ATMEGA_168_SERIES
	 * @generated
	 */
	EEnum getARDUINO_ATMEGA_168_SERIES();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID <em>ARDUINO BOARD UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ARDUINO BOARD UID</em>'.
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID
	 * @generated
	 */
	EEnum getARDUINO_BOARD_UID();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.mdl.arduino.ARDUINO_REPORT_MODE <em>ARDUINO REPORT MODE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ARDUINO REPORT MODE</em>'.
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_REPORT_MODE
	 * @generated
	 */
	EEnum getARDUINO_REPORT_MODE();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE <em>ARDUINO FIRMWARE MODE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ARDUINO FIRMWARE MODE</em>'.
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE
	 * @generated
	 */
	EEnum getARDUINO_FIRMWARE_MODE();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.mdl.arduino.ARDUINO_STATUS_MODE <em>ARDUINO STATUS MODE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ARDUINO STATUS MODE</em>'.
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_STATUS_MODE
	 * @generated
	 */
	EEnum getARDUINO_STATUS_MODE();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.mdl.arduino.PIN_MODE <em>PIN MODE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PIN MODE</em>'.
	 * @see net.sf.smbt.mdl.arduino.PIN_MODE
	 * @generated
	 */
	EEnum getPIN_MODE();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.mdl.arduino.PWM_MODE <em>PWM MODE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PWM MODE</em>'.
	 * @see net.sf.smbt.mdl.arduino.PWM_MODE
	 * @generated
	 */
	EEnum getPWM_MODE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArduinoFactory getArduinoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.smbt.mdl.arduino.impl.ArduinoImpl <em>Arduino</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.mdl.arduino.impl.ArduinoImpl
		 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getArduino()
		 * @generated
		 */
		EClass ARDUINO = eINSTANCE.getArduino();

		/**
		 * The meta object literal for the '<em><b>Ver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO__VER = eINSTANCE.getArduino_Ver();

		/**
		 * The meta object literal for the '<em><b>Board</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO__BOARD = eINSTANCE.getArduino_Board();

		/**
		 * The meta object literal for the '<em><b>Series</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO__SERIES = eINSTANCE.getArduino_Series();

		/**
		 * The meta object literal for the '<em><b>Digital Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO__DIGITAL_PORTS = eINSTANCE.getArduino_DigitalPorts();

		/**
		 * The meta object literal for the '<em><b>Analog Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO__ANALOG_PORTS = eINSTANCE.getArduino_AnalogPorts();

		/**
		 * The meta object literal for the '<em><b>Tx</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO__TX = eINSTANCE.getArduino_Tx();

		/**
		 * The meta object literal for the '<em><b>Ground Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO__GROUND_PORTS = eINSTANCE.getArduino_GroundPorts();

		/**
		 * The meta object literal for the '<em><b>Rx</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO__RX = eINSTANCE.getArduino_Rx();

		/**
		 * The meta object literal for the '<em><b>Pwm3 V3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO__PWM3_V3 = eINSTANCE.getArduino_Pwm3V3();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO__LABEL = eINSTANCE.getArduino_Label();

		/**
		 * The meta object literal for the '<em><b>Comm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO__COMM = eINSTANCE.getArduino_Comm();

		/**
		 * The meta object literal for the '<em><b>Reset Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO__RESET_PORT = eINSTANCE.getArduino_ResetPort();

		/**
		 * The meta object literal for the '<em><b>Pwm9 V</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO__PWM9_V = eINSTANCE.getArduino_Pwm9V();

		/**
		 * The meta object literal for the '<em><b>Pwm5 V</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO__PWM5_V = eINSTANCE.getArduino_Pwm5V();

		/**
		 * The meta object literal for the '<em><b>Io7</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO__IO7 = eINSTANCE.getArduino_Io7();

		/**
		 * The meta object literal for the '<em><b>Vin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO__VIN = eINSTANCE.getArduino_Vin();

		/**
		 * The meta object literal for the '<em><b>Aref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO__AREF = eINSTANCE.getArduino_Aref();

		/**
		 * The meta object literal for the '<em><b>Firmata Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO__FIRMATA_MODE = eINSTANCE.getArduino_FirmataMode();

		/**
		 * The meta object literal for the '<em><b>Locked Pin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO__LOCKED_PIN = eINSTANCE.getArduino_LockedPin();

		/**
		 * The meta object literal for the '<em><b>Synchronizing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO__SYNCHRONIZING = eINSTANCE.getArduino_Synchronizing();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO__STATUS = eINSTANCE.getArduino_Status();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO__KIND = eINSTANCE.getArduino_Kind();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO__NAME = eINSTANCE.getArduino_Name();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.mdl.arduino.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.mdl.arduino.impl.PortImpl
		 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__MAP = eINSTANCE.getPort_Map();

		/**
		 * The meta object literal for the '<em><b>Report</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__REPORT = eINSTANCE.getPort_Report();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__CHANNEL = eINSTANCE.getPort_Channel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getPort_Name();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.mdl.arduino.impl.DigitalPortImpl <em>Digital Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.mdl.arduino.impl.DigitalPortImpl
		 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getDigitalPort()
		 * @generated
		 */
		EClass DIGITAL_PORT = eINSTANCE.getDigitalPort();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGITAL_PORT__VALUE = eINSTANCE.getDigitalPort_Value();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.mdl.arduino.impl.AnalogPortImpl <em>Analog Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.mdl.arduino.impl.AnalogPortImpl
		 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getAnalogPort()
		 * @generated
		 */
		EClass ANALOG_PORT = eINSTANCE.getAnalogPort();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALOG_PORT__VALUE = eINSTANCE.getAnalogPort_Value();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.mdl.arduino.impl.RxPortImpl <em>Rx Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.mdl.arduino.impl.RxPortImpl
		 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getRxPort()
		 * @generated
		 */
		EClass RX_PORT = eINSTANCE.getRxPort();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.mdl.arduino.impl.TxPortImpl <em>Tx Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.mdl.arduino.impl.TxPortImpl
		 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getTxPort()
		 * @generated
		 */
		EClass TX_PORT = eINSTANCE.getTxPort();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.mdl.arduino.impl.GndPortImpl <em>Gnd Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.mdl.arduino.impl.GndPortImpl
		 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getGndPort()
		 * @generated
		 */
		EClass GND_PORT = eINSTANCE.getGndPort();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.mdl.arduino.impl.Port3V3Impl <em>Port3 V3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.mdl.arduino.impl.Port3V3Impl
		 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getPort3V3()
		 * @generated
		 */
		EClass PORT3_V3 = eINSTANCE.getPort3V3();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.mdl.arduino.impl.RstPortImpl <em>Rst Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.mdl.arduino.impl.RstPortImpl
		 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getRstPort()
		 * @generated
		 */
		EClass RST_PORT = eINSTANCE.getRstPort();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.mdl.arduino.impl.Port5VImpl <em>Port5 V</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.mdl.arduino.impl.Port5VImpl
		 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getPort5V()
		 * @generated
		 */
		EClass PORT5_V = eINSTANCE.getPort5V();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.mdl.arduino.impl.Port9VImpl <em>Port9 V</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.mdl.arduino.impl.Port9VImpl
		 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getPort9V()
		 * @generated
		 */
		EClass PORT9_V = eINSTANCE.getPort9V();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.mdl.arduino.impl.PortIO7Impl <em>Port IO7</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.mdl.arduino.impl.PortIO7Impl
		 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getPortIO7()
		 * @generated
		 */
		EClass PORT_IO7 = eINSTANCE.getPortIO7();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.mdl.arduino.impl.AREFPortImpl <em>AREF Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.mdl.arduino.impl.AREFPortImpl
		 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getAREFPort()
		 * @generated
		 */
		EClass AREF_PORT = eINSTANCE.getAREFPort();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.mdl.arduino.impl.PortVINImpl <em>Port VIN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.mdl.arduino.impl.PortVINImpl
		 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getPortVIN()
		 * @generated
		 */
		EClass PORT_VIN = eINSTANCE.getPortVIN();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.mdl.arduino.impl.BenchImpl <em>Bench</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.mdl.arduino.impl.BenchImpl
		 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getBench()
		 * @generated
		 */
		EClass BENCH = eINSTANCE.getBench();

		/**
		 * The meta object literal for the '<em><b>Boards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BENCH__BOARDS = eINSTANCE.getBench_Boards();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BENCH__NAME = eINSTANCE.getBench_Name();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.mdl.arduino.ARDUINO_VER_BRAND_NAME <em>ARDUINO VER BRAND NAME</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.mdl.arduino.ARDUINO_VER_BRAND_NAME
		 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getARDUINO_VER_BRAND_NAME()
		 * @generated
		 */
		EEnum ARDUINO_VER_BRAND_NAME = eINSTANCE.getARDUINO_VER_BRAND_NAME();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.mdl.arduino.ARDUINO_BOARD_KIND <em>ARDUINO BOARD KIND</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.mdl.arduino.ARDUINO_BOARD_KIND
		 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getARDUINO_BOARD_KIND()
		 * @generated
		 */
		EEnum ARDUINO_BOARD_KIND = eINSTANCE.getARDUINO_BOARD_KIND();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.mdl.arduino.ARDUINO_COMM <em>ARDUINO COMM</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.mdl.arduino.ARDUINO_COMM
		 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getARDUINO_COMM()
		 * @generated
		 */
		EEnum ARDUINO_COMM = eINSTANCE.getARDUINO_COMM();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.mdl.arduino.PIN_MAPPING <em>PIN MAPPING</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.mdl.arduino.PIN_MAPPING
		 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getPIN_MAPPING()
		 * @generated
		 */
		EEnum PIN_MAPPING = eINSTANCE.getPIN_MAPPING();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.mdl.arduino.ARDUINO_ATMEGA_168_SERIES <em>ARDUINO ATMEGA 168 SERIES</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.mdl.arduino.ARDUINO_ATMEGA_168_SERIES
		 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getARDUINO_ATMEGA_168_SERIES()
		 * @generated
		 */
		EEnum ARDUINO_ATMEGA_168_SERIES = eINSTANCE.getARDUINO_ATMEGA_168_SERIES();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID <em>ARDUINO BOARD UID</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID
		 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getARDUINO_BOARD_UID()
		 * @generated
		 */
		EEnum ARDUINO_BOARD_UID = eINSTANCE.getARDUINO_BOARD_UID();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.mdl.arduino.ARDUINO_REPORT_MODE <em>ARDUINO REPORT MODE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.mdl.arduino.ARDUINO_REPORT_MODE
		 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getARDUINO_REPORT_MODE()
		 * @generated
		 */
		EEnum ARDUINO_REPORT_MODE = eINSTANCE.getARDUINO_REPORT_MODE();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE <em>ARDUINO FIRMWARE MODE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE
		 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getARDUINO_FIRMWARE_MODE()
		 * @generated
		 */
		EEnum ARDUINO_FIRMWARE_MODE = eINSTANCE.getARDUINO_FIRMWARE_MODE();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.mdl.arduino.ARDUINO_STATUS_MODE <em>ARDUINO STATUS MODE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.mdl.arduino.ARDUINO_STATUS_MODE
		 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getARDUINO_STATUS_MODE()
		 * @generated
		 */
		EEnum ARDUINO_STATUS_MODE = eINSTANCE.getARDUINO_STATUS_MODE();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.mdl.arduino.PIN_MODE <em>PIN MODE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.mdl.arduino.PIN_MODE
		 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getPIN_MODE()
		 * @generated
		 */
		EEnum PIN_MODE = eINSTANCE.getPIN_MODE();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.mdl.arduino.PWM_MODE <em>PWM MODE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.mdl.arduino.PWM_MODE
		 * @see net.sf.smbt.mdl.arduino.impl.ArduinoPackageImpl#getPWM_MODE()
		 * @generated
		 */
		EEnum PWM_MODE = eINSTANCE.getPWM_MODE();

	}

} //ArduinoPackage
