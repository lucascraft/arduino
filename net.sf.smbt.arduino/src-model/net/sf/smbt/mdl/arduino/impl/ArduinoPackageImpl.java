/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.mdl.arduino.impl;

import net.sf.smbt.mdl.arduino.AREFPort;
import net.sf.smbt.mdl.arduino.AnalogPort;
import net.sf.smbt.mdl.arduino.Arduino;
import net.sf.smbt.mdl.arduino.ArduinoFactory;
import net.sf.smbt.mdl.arduino.ArduinoPackage;
import net.sf.smbt.mdl.arduino.Bench;
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArduinoPackageImpl extends EPackageImpl implements ArduinoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduinoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digitalPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analogPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rxPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass txPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gndPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass port3V3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rstPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass port5VEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass port9VEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portIO7EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arefPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portVINEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass benchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arduinO_VER_BRAND_NAMEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arduinO_BOARD_KINDEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arduinO_COMMEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum piN_MAPPINGEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arduinO_ATMEGA_168_SERIESEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arduinO_BOARD_UIDEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arduinO_REPORT_MODEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arduinO_FIRMWARE_MODEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arduinO_STATUS_MODEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum piN_MODEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pwM_MODEEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.sf.smbt.mdl.arduino.ArduinoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArduinoPackageImpl() {
		super(eNS_URI, ArduinoFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ArduinoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArduinoPackage init() {
		if (isInited) return (ArduinoPackage)EPackage.Registry.INSTANCE.getEPackage(ArduinoPackage.eNS_URI);

		// Obtain or create and register package
		ArduinoPackageImpl theArduinoPackage = (ArduinoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArduinoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArduinoPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theArduinoPackage.createPackageContents();

		// Initialize created meta-data
		theArduinoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArduinoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArduinoPackage.eNS_URI, theArduinoPackage);
		return theArduinoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduino() {
		return arduinoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduino_Ver() {
		return (EAttribute)arduinoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduino_Board() {
		return (EAttribute)arduinoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduino_Series() {
		return (EAttribute)arduinoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_DigitalPorts() {
		return (EReference)arduinoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_AnalogPorts() {
		return (EReference)arduinoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_Tx() {
		return (EReference)arduinoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_GroundPorts() {
		return (EReference)arduinoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_Rx() {
		return (EReference)arduinoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_Pwm3V3() {
		return (EReference)arduinoEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduino_Label() {
		return (EAttribute)arduinoEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduino_Comm() {
		return (EAttribute)arduinoEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_ResetPort() {
		return (EReference)arduinoEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_Pwm9V() {
		return (EReference)arduinoEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_Pwm5V() {
		return (EReference)arduinoEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_Io7() {
		return (EReference)arduinoEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_Vin() {
		return (EReference)arduinoEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArduino_Aref() {
		return (EReference)arduinoEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduino_FirmataMode() {
		return (EAttribute)arduinoEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduino_LockedPin() {
		return (EAttribute)arduinoEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduino_Synchronizing() {
		return (EAttribute)arduinoEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduino_Status() {
		return (EAttribute)arduinoEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduino_Kind() {
		return (EAttribute)arduinoEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduino_Name() {
		return (EAttribute)arduinoEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Map() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Report() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Channel() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Name() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDigitalPort() {
		return digitalPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDigitalPort_Value() {
		return (EAttribute)digitalPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalogPort() {
		return analogPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalogPort_Value() {
		return (EAttribute)analogPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRxPort() {
		return rxPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTxPort() {
		return txPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGndPort() {
		return gndPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort3V3() {
		return port3V3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRstPort() {
		return rstPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort5V() {
		return port5VEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort9V() {
		return port9VEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortIO7() {
		return portIO7EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAREFPort() {
		return arefPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortVIN() {
		return portVINEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBench() {
		return benchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBench_Boards() {
		return (EReference)benchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBench_Name() {
		return (EAttribute)benchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getARDUINO_VER_BRAND_NAME() {
		return arduinO_VER_BRAND_NAMEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getARDUINO_BOARD_KIND() {
		return arduinO_BOARD_KINDEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getARDUINO_COMM() {
		return arduinO_COMMEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPIN_MAPPING() {
		return piN_MAPPINGEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getARDUINO_ATMEGA_168_SERIES() {
		return arduinO_ATMEGA_168_SERIESEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getARDUINO_BOARD_UID() {
		return arduinO_BOARD_UIDEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getARDUINO_REPORT_MODE() {
		return arduinO_REPORT_MODEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getARDUINO_FIRMWARE_MODE() {
		return arduinO_FIRMWARE_MODEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getARDUINO_STATUS_MODE() {
		return arduinO_STATUS_MODEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPIN_MODE() {
		return piN_MODEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPWM_MODE() {
		return pwM_MODEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoFactory getArduinoFactory() {
		return (ArduinoFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		arduinoEClass = createEClass(ARDUINO);
		createEAttribute(arduinoEClass, ARDUINO__VER);
		createEAttribute(arduinoEClass, ARDUINO__BOARD);
		createEAttribute(arduinoEClass, ARDUINO__SERIES);
		createEReference(arduinoEClass, ARDUINO__DIGITAL_PORTS);
		createEReference(arduinoEClass, ARDUINO__ANALOG_PORTS);
		createEReference(arduinoEClass, ARDUINO__TX);
		createEReference(arduinoEClass, ARDUINO__GROUND_PORTS);
		createEReference(arduinoEClass, ARDUINO__RX);
		createEReference(arduinoEClass, ARDUINO__PWM3_V3);
		createEAttribute(arduinoEClass, ARDUINO__LABEL);
		createEAttribute(arduinoEClass, ARDUINO__COMM);
		createEReference(arduinoEClass, ARDUINO__RESET_PORT);
		createEReference(arduinoEClass, ARDUINO__PWM9_V);
		createEReference(arduinoEClass, ARDUINO__PWM5_V);
		createEReference(arduinoEClass, ARDUINO__IO7);
		createEReference(arduinoEClass, ARDUINO__VIN);
		createEReference(arduinoEClass, ARDUINO__AREF);
		createEAttribute(arduinoEClass, ARDUINO__FIRMATA_MODE);
		createEAttribute(arduinoEClass, ARDUINO__LOCKED_PIN);
		createEAttribute(arduinoEClass, ARDUINO__SYNCHRONIZING);
		createEAttribute(arduinoEClass, ARDUINO__STATUS);
		createEAttribute(arduinoEClass, ARDUINO__KIND);
		createEAttribute(arduinoEClass, ARDUINO__NAME);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__MAP);
		createEAttribute(portEClass, PORT__REPORT);
		createEAttribute(portEClass, PORT__CHANNEL);
		createEAttribute(portEClass, PORT__NAME);

		digitalPortEClass = createEClass(DIGITAL_PORT);
		createEAttribute(digitalPortEClass, DIGITAL_PORT__VALUE);

		analogPortEClass = createEClass(ANALOG_PORT);
		createEAttribute(analogPortEClass, ANALOG_PORT__VALUE);

		rxPortEClass = createEClass(RX_PORT);

		txPortEClass = createEClass(TX_PORT);

		gndPortEClass = createEClass(GND_PORT);

		port3V3EClass = createEClass(PORT3_V3);

		rstPortEClass = createEClass(RST_PORT);

		port5VEClass = createEClass(PORT5_V);

		port9VEClass = createEClass(PORT9_V);

		portIO7EClass = createEClass(PORT_IO7);

		arefPortEClass = createEClass(AREF_PORT);

		portVINEClass = createEClass(PORT_VIN);

		benchEClass = createEClass(BENCH);
		createEReference(benchEClass, BENCH__BOARDS);
		createEAttribute(benchEClass, BENCH__NAME);

		// Create enums
		arduinO_VER_BRAND_NAMEEEnum = createEEnum(ARDUINO_VER_BRAND_NAME);
		arduinO_BOARD_KINDEEnum = createEEnum(ARDUINO_BOARD_KIND);
		arduinO_COMMEEnum = createEEnum(ARDUINO_COMM);
		piN_MAPPINGEEnum = createEEnum(PIN_MAPPING);
		arduinO_ATMEGA_168_SERIESEEnum = createEEnum(ARDUINO_ATMEGA_168_SERIES);
		arduinO_BOARD_UIDEEnum = createEEnum(ARDUINO_BOARD_UID);
		arduinO_REPORT_MODEEEnum = createEEnum(ARDUINO_REPORT_MODE);
		arduinO_FIRMWARE_MODEEEnum = createEEnum(ARDUINO_FIRMWARE_MODE);
		arduinO_STATUS_MODEEEnum = createEEnum(ARDUINO_STATUS_MODE);
		piN_MODEEEnum = createEEnum(PIN_MODE);
		pwM_MODEEEnum = createEEnum(PWM_MODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		digitalPortEClass.getESuperTypes().add(this.getPort());
		analogPortEClass.getESuperTypes().add(this.getPort());
		rxPortEClass.getESuperTypes().add(this.getPort());
		txPortEClass.getESuperTypes().add(this.getPort());
		gndPortEClass.getESuperTypes().add(this.getPort());
		port3V3EClass.getESuperTypes().add(this.getPort());
		rstPortEClass.getESuperTypes().add(this.getPort());
		port5VEClass.getESuperTypes().add(this.getPort());
		port9VEClass.getESuperTypes().add(this.getPort());
		portIO7EClass.getESuperTypes().add(this.getPort());
		arefPortEClass.getESuperTypes().add(this.getPort());
		portVINEClass.getESuperTypes().add(this.getPort());

		// Initialize classes and features; add operations and parameters
		initEClass(arduinoEClass, Arduino.class, "Arduino", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArduino_Ver(), this.getARDUINO_VER_BRAND_NAME(), "ver", null, 0, 1, Arduino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduino_Board(), this.getARDUINO_BOARD_KIND(), "board", null, 0, 1, Arduino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduino_Series(), this.getARDUINO_ATMEGA_168_SERIES(), "series", null, 0, 1, Arduino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduino_DigitalPorts(), this.getDigitalPort(), null, "digitalPorts", null, 0, -1, Arduino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduino_AnalogPorts(), this.getAnalogPort(), null, "analogPorts", null, 0, -1, Arduino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduino_Tx(), this.getTxPort(), null, "tx", null, 0, 1, Arduino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduino_GroundPorts(), this.getGndPort(), null, "groundPorts", null, 0, -1, Arduino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduino_Rx(), this.getRxPort(), null, "rx", null, 0, 1, Arduino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduino_Pwm3V3(), this.getPort3V3(), null, "pwm3V3", null, 0, 1, Arduino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduino_Label(), ecorePackage.getEString(), "label", null, 0, 1, Arduino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduino_Comm(), this.getARDUINO_COMM(), "comm", null, 0, 1, Arduino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduino_ResetPort(), this.getRstPort(), null, "resetPort", null, 0, 1, Arduino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduino_Pwm9V(), this.getPort9V(), null, "pwm9V", null, 0, 1, Arduino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduino_Pwm5V(), this.getPort5V(), null, "pwm5V", null, 0, 1, Arduino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduino_Io7(), this.getPortIO7(), null, "io7", null, 0, 1, Arduino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduino_Vin(), this.getPortVIN(), null, "vin", null, 0, 1, Arduino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduino_Aref(), this.getAREFPort(), null, "aref", null, 0, 1, Arduino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduino_FirmataMode(), this.getARDUINO_FIRMWARE_MODE(), "firmataMode", null, 0, 1, Arduino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduino_LockedPin(), this.getPIN_MAPPING(), "lockedPin", null, 0, 1, Arduino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduino_Synchronizing(), ecorePackage.getEBoolean(), "synchronizing", null, 0, 1, Arduino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduino_Status(), this.getARDUINO_STATUS_MODE(), "status", null, 0, 1, Arduino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduino_Kind(), this.getARDUINO_BOARD_UID(), "kind", null, 0, 1, Arduino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduino_Name(), ecorePackage.getEString(), "name", null, 0, 1, Arduino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(arduinoEClass, null, "digitalIOMessage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "data", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPIN_MAPPING(), "pin", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arduinoEClass, null, "analogIOMessage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "data", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPIN_MAPPING(), "pin", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arduinoEClass, null, "reportAnalogPin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getARDUINO_REPORT_MODE(), "mode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPIN_MAPPING(), "pin", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arduinoEClass, null, "reportDigitalPin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getARDUINO_REPORT_MODE(), "mode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPIN_MAPPING(), "pin", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arduinoEClass, ecorePackage.getEBoolean(), "synchronizingArduinoModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPIN_MAPPING(), "pin", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arduinoEClass, ecorePackage.getEBoolean(), "synchronizingArduinoHardware", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPIN_MAPPING(), "pin", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arduinoEClass, this.getAnalogPort(), "getAnalogicPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPIN_MAPPING(), "pin", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arduinoEClass, this.getDigitalPort(), "getDigitalPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPIN_MAPPING(), "pin", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arduinoEClass, this.getAnalogPort(), "getAnalogicPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "pin", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arduinoEClass, this.getDigitalPort(), "getDigitalPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "pin", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(arduinoEClass, this.getPort(), "getPorts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(arduinoEClass, this.getPort(), "getCommPorts", 0, 2, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arduinoEClass, this.getDigitalPort(), "getDigitalPortFromChannel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "channel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arduinoEClass, this.getAnalogPort(), "getAnalogicPortFromChannel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "channel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Map(), this.getPIN_MAPPING(), "map", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Report(), this.getARDUINO_REPORT_MODE(), "report", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Channel(), ecorePackage.getEInt(), "channel", "-999", 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Name(), ecorePackage.getEString(), "name", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(digitalPortEClass, DigitalPort.class, "DigitalPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDigitalPort_Value(), ecorePackage.getEInt(), "value", null, 0, 1, DigitalPort.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analogPortEClass, AnalogPort.class, "AnalogPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnalogPort_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, AnalogPort.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rxPortEClass, RxPort.class, "RxPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(txPortEClass, TxPort.class, "TxPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gndPortEClass, GndPort.class, "GndPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(port3V3EClass, Port3V3.class, "Port3V3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rstPortEClass, RstPort.class, "RstPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(port5VEClass, Port5V.class, "Port5V", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(port9VEClass, Port9V.class, "Port9V", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portIO7EClass, PortIO7.class, "PortIO7", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arefPortEClass, AREFPort.class, "AREFPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portVINEClass, PortVIN.class, "PortVIN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(benchEClass, Bench.class, "Bench", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBench_Boards(), this.getArduino(), null, "boards", null, 0, -1, Bench.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBench_Name(), ecorePackage.getEString(), "name", null, 0, 1, Bench.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(arduinO_VER_BRAND_NAMEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_VER_BRAND_NAME.class, "ARDUINO_VER_BRAND_NAME");
		addEEnumLiteral(arduinO_VER_BRAND_NAMEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_VER_BRAND_NAME.ARDUINO_DIECIMILA);
		addEEnumLiteral(arduinO_VER_BRAND_NAMEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_VER_BRAND_NAME.ARDUINO_DUEMILANOVE);
		addEEnumLiteral(arduinO_VER_BRAND_NAMEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_VER_BRAND_NAME.ARDUINO_NANO);
		addEEnumLiteral(arduinO_VER_BRAND_NAMEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_VER_BRAND_NAME.FUNNEL_IO);
		addEEnumLiteral(arduinO_VER_BRAND_NAMEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_VER_BRAND_NAME.LILYPAD);
		addEEnumLiteral(arduinO_VER_BRAND_NAMEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_VER_BRAND_NAME.ARDUINO_MINI);
		addEEnumLiteral(arduinO_VER_BRAND_NAMEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_VER_BRAND_NAME.ARDUINO_UNO);
		addEEnumLiteral(arduinO_VER_BRAND_NAMEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_VER_BRAND_NAME.ARDUINO_LEONARDO);
		addEEnumLiteral(arduinO_VER_BRAND_NAMEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_VER_BRAND_NAME.ARDUINO_PRO);
		addEEnumLiteral(arduinO_VER_BRAND_NAMEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_VER_BRAND_NAME.UNKNOWN);

		initEEnum(arduinO_BOARD_KINDEEnum, net.sf.smbt.mdl.arduino.ARDUINO_BOARD_KIND.class, "ARDUINO_BOARD_KIND");
		addEEnumLiteral(arduinO_BOARD_KINDEEnum, net.sf.smbt.mdl.arduino.ARDUINO_BOARD_KIND.ATMEGA_168);
		addEEnumLiteral(arduinO_BOARD_KINDEEnum, net.sf.smbt.mdl.arduino.ARDUINO_BOARD_KIND.ATMEGA_8);
		addEEnumLiteral(arduinO_BOARD_KINDEEnum, net.sf.smbt.mdl.arduino.ARDUINO_BOARD_KIND.BT_ATMEGA_168);
		addEEnumLiteral(arduinO_BOARD_KINDEEnum, net.sf.smbt.mdl.arduino.ARDUINO_BOARD_KIND.LILYPAD_168);
		addEEnumLiteral(arduinO_BOARD_KINDEEnum, net.sf.smbt.mdl.arduino.ARDUINO_BOARD_KIND.MINI_328P);
		addEEnumLiteral(arduinO_BOARD_KINDEEnum, net.sf.smbt.mdl.arduino.ARDUINO_BOARD_KIND.MINI_168);
		addEEnumLiteral(arduinO_BOARD_KINDEEnum, net.sf.smbt.mdl.arduino.ARDUINO_BOARD_KIND.UNKNOWN);

		initEEnum(arduinO_COMMEEnum, net.sf.smbt.mdl.arduino.ARDUINO_COMM.class, "ARDUINO_COMM");
		addEEnumLiteral(arduinO_COMMEEnum, net.sf.smbt.mdl.arduino.ARDUINO_COMM.USB);
		addEEnumLiteral(arduinO_COMMEEnum, net.sf.smbt.mdl.arduino.ARDUINO_COMM.NONE);
		addEEnumLiteral(arduinO_COMMEEnum, net.sf.smbt.mdl.arduino.ARDUINO_COMM.XBEE_SERIES_1);
		addEEnumLiteral(arduinO_COMMEEnum, net.sf.smbt.mdl.arduino.ARDUINO_COMM.XBEE_PRO);
		addEEnumLiteral(arduinO_COMMEEnum, net.sf.smbt.mdl.arduino.ARDUINO_COMM.ETHERNET);
		addEEnumLiteral(arduinO_COMMEEnum, net.sf.smbt.mdl.arduino.ARDUINO_COMM.BLUETOOTH);
		addEEnumLiteral(arduinO_COMMEEnum, net.sf.smbt.mdl.arduino.ARDUINO_COMM.MINI_USB);
		addEEnumLiteral(arduinO_COMMEEnum, net.sf.smbt.mdl.arduino.ARDUINO_COMM.UART);

		initEEnum(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.class, "PIN_MAPPING");
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_AREF);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_TX_I);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_TX);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_RX);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D2);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D3);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D4);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D5);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D6);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D7);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D8);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D9);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D10);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D11);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D12);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D13);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D14);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D15);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D16);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D17);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D18);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D19);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D20);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D21);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D37);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_GND_D);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_3V3_1);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_3V3_2);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_5V);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_9V);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_GND_9V);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_GND_3V);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_RST);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_A0);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_A1);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_A2);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_A3);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_A4);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_A5);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_A6);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_A7);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_A8);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_A9);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_A10);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_A11);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_A12);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_A13);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_A14);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_A15);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_VIN);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_TX_O);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D22);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D23);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D24);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D25);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D26);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D27);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D28);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D29);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D30);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D31);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D32);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D33);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D34);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D35);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D36);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D38);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D39);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D40);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D41);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D42);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D43);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D44);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D45);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D46);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D47);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D48);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D49);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D50);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D51);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_D52);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_IO7);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.UNKNOWN);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_A16);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_A17);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_A18);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_A19);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_A20);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_A21);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_A22);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_A23);
		addEEnumLiteral(piN_MAPPINGEEnum, net.sf.smbt.mdl.arduino.PIN_MAPPING.PIN_A24);

		initEEnum(arduinO_ATMEGA_168_SERIESEEnum, net.sf.smbt.mdl.arduino.ARDUINO_ATMEGA_168_SERIES.class, "ARDUINO_ATMEGA_168_SERIES");
		addEEnumLiteral(arduinO_ATMEGA_168_SERIESEEnum, net.sf.smbt.mdl.arduino.ARDUINO_ATMEGA_168_SERIES._168_ATMEGA_1280);
		addEEnumLiteral(arduinO_ATMEGA_168_SERIESEEnum, net.sf.smbt.mdl.arduino.ARDUINO_ATMEGA_168_SERIES._168_ATMEGA_328_PRO_8M_HZ);
		addEEnumLiteral(arduinO_ATMEGA_168_SERIESEEnum, net.sf.smbt.mdl.arduino.ARDUINO_ATMEGA_168_SERIES._168_ATMEGA_328);
		addEEnumLiteral(arduinO_ATMEGA_168_SERIESEEnum, net.sf.smbt.mdl.arduino.ARDUINO_ATMEGA_168_SERIES._168_ATMEGA_DIECIMILA);
		addEEnumLiteral(arduinO_ATMEGA_168_SERIESEEnum, net.sf.smbt.mdl.arduino.ARDUINO_ATMEGA_168_SERIES._168_NG);
		addEEnumLiteral(arduinO_ATMEGA_168_SERIESEEnum, net.sf.smbt.mdl.arduino.ARDUINO_ATMEGA_168_SERIES._168_PRO);
		addEEnumLiteral(arduinO_ATMEGA_168_SERIESEEnum, net.sf.smbt.mdl.arduino.ARDUINO_ATMEGA_168_SERIES.UNKNOWN);
		addEEnumLiteral(arduinO_ATMEGA_168_SERIESEEnum, net.sf.smbt.mdl.arduino.ARDUINO_ATMEGA_168_SERIES._168_ATMEGA_168);
		addEEnumLiteral(arduinO_ATMEGA_168_SERIESEEnum, net.sf.smbt.mdl.arduino.ARDUINO_ATMEGA_168_SERIES._168_ATMEGA_32U4);

		initEEnum(arduinO_BOARD_UIDEEnum, net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID.class, "ARDUINO_BOARD_UID");
		addEEnumLiteral(arduinO_BOARD_UIDEEnum, net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID.DIECMILA_ATMEGA_168);
		addEEnumLiteral(arduinO_BOARD_UIDEEnum, net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID.DIECIMILA_ATMEGA328);
		addEEnumLiteral(arduinO_BOARD_UIDEEnum, net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID.DIECIMILA_ATMEGA_328P);
		addEEnumLiteral(arduinO_BOARD_UIDEEnum, net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID.MINI_ATMEGA_168);
		addEEnumLiteral(arduinO_BOARD_UIDEEnum, net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID.MEGA_ATMEGA_1280);
		addEEnumLiteral(arduinO_BOARD_UIDEEnum, net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID.LILIPAD_ATMEGA_328V);
		addEEnumLiteral(arduinO_BOARD_UIDEEnum, net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID.DUEMILANOVE_ATMEGA_328);
		addEEnumLiteral(arduinO_BOARD_UIDEEnum, net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID.DUEMILANOVE_ATMEGA_168);
		addEEnumLiteral(arduinO_BOARD_UIDEEnum, net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID.MINI_PRO_ATMEGA_168);
		addEEnumLiteral(arduinO_BOARD_UIDEEnum, net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID.NANO_30_ATMEGA328);
		addEEnumLiteral(arduinO_BOARD_UIDEEnum, net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID.NANO_23_ATMEGA168);
		addEEnumLiteral(arduinO_BOARD_UIDEEnum, net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID.FUNNEL_IO_ATMEGA328P);
		addEEnumLiteral(arduinO_BOARD_UIDEEnum, net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID.PRO_ATMEGA_168);
		addEEnumLiteral(arduinO_BOARD_UIDEEnum, net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID.PRO_ATMEGA_328);
		addEEnumLiteral(arduinO_BOARD_UIDEEnum, net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID.BT_ATMEGA_168);
		addEEnumLiteral(arduinO_BOARD_UIDEEnum, net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID.PRO_MINI_ATMEGA_168);
		addEEnumLiteral(arduinO_BOARD_UIDEEnum, net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID.UNO_ATMEGA328);
		addEEnumLiteral(arduinO_BOARD_UIDEEnum, net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID.LEONARDO_ATMEGA32U4);
		addEEnumLiteral(arduinO_BOARD_UIDEEnum, net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID.PLACEHOLDER_VOID_BOARD);

		initEEnum(arduinO_REPORT_MODEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_REPORT_MODE.class, "ARDUINO_REPORT_MODE");
		addEEnumLiteral(arduinO_REPORT_MODEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_REPORT_MODE.ACTIVATE);
		addEEnumLiteral(arduinO_REPORT_MODEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_REPORT_MODE.DEACTIVATE);

		initEEnum(arduinO_FIRMWARE_MODEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE.class, "ARDUINO_FIRMWARE_MODE");
		addEEnumLiteral(arduinO_FIRMWARE_MODEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V10);
		addEEnumLiteral(arduinO_FIRMWARE_MODEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V20);
		addEEnumLiteral(arduinO_FIRMWARE_MODEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V11);
		addEEnumLiteral(arduinO_FIRMWARE_MODEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V23);
		addEEnumLiteral(arduinO_FIRMWARE_MODEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V22);
		addEEnumLiteral(arduinO_FIRMWARE_MODEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V21);
		addEEnumLiteral(arduinO_FIRMWARE_MODEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V10_I2C);
		addEEnumLiteral(arduinO_FIRMWARE_MODEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V11_I2C);
		addEEnumLiteral(arduinO_FIRMWARE_MODEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V20_I2C);
		addEEnumLiteral(arduinO_FIRMWARE_MODEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V23_I2C);
		addEEnumLiteral(arduinO_FIRMWARE_MODEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V22_I2C);
		addEEnumLiteral(arduinO_FIRMWARE_MODEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V21_I2C);
		addEEnumLiteral(arduinO_FIRMWARE_MODEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V10_SERVO);
		addEEnumLiteral(arduinO_FIRMWARE_MODEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V20_SERVO);
		addEEnumLiteral(arduinO_FIRMWARE_MODEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V11_SERVO);
		addEEnumLiteral(arduinO_FIRMWARE_MODEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V23_SERVO);
		addEEnumLiteral(arduinO_FIRMWARE_MODEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V22_SERVO);
		addEEnumLiteral(arduinO_FIRMWARE_MODEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V21_SERVO);
		addEEnumLiteral(arduinO_FIRMWARE_MODEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE.ARDUINO_DEFAULT);

		initEEnum(arduinO_STATUS_MODEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_STATUS_MODE.class, "ARDUINO_STATUS_MODE");
		addEEnumLiteral(arduinO_STATUS_MODEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_STATUS_MODE.CONNECTED);
		addEEnumLiteral(arduinO_STATUS_MODEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_STATUS_MODE.DISCONNECTED);
		addEEnumLiteral(arduinO_STATUS_MODEEEnum, net.sf.smbt.mdl.arduino.ARDUINO_STATUS_MODE.TRANSMITTING);

		initEEnum(piN_MODEEEnum, net.sf.smbt.mdl.arduino.PIN_MODE.class, "PIN_MODE");
		addEEnumLiteral(piN_MODEEEnum, net.sf.smbt.mdl.arduino.PIN_MODE.INPUT);
		addEEnumLiteral(piN_MODEEEnum, net.sf.smbt.mdl.arduino.PIN_MODE.OUTPUT);
		addEEnumLiteral(piN_MODEEEnum, net.sf.smbt.mdl.arduino.PIN_MODE.ANALOG);
		addEEnumLiteral(piN_MODEEEnum, net.sf.smbt.mdl.arduino.PIN_MODE.PWM);
		addEEnumLiteral(piN_MODEEEnum, net.sf.smbt.mdl.arduino.PIN_MODE.SERVO);
		addEEnumLiteral(piN_MODEEEnum, net.sf.smbt.mdl.arduino.PIN_MODE.SHIFT);
		addEEnumLiteral(piN_MODEEEnum, net.sf.smbt.mdl.arduino.PIN_MODE.I2C);
		addEEnumLiteral(piN_MODEEEnum, net.sf.smbt.mdl.arduino.PIN_MODE.UNKNOWN);

		initEEnum(pwM_MODEEEnum, net.sf.smbt.mdl.arduino.PWM_MODE.class, "PWM_MODE");
		addEEnumLiteral(pwM_MODEEEnum, net.sf.smbt.mdl.arduino.PWM_MODE.HIGH);
		addEEnumLiteral(pwM_MODEEEnum, net.sf.smbt.mdl.arduino.PWM_MODE.LOW);
		addEEnumLiteral(pwM_MODEEEnum, net.sf.smbt.mdl.arduino.PWM_MODE.NONE);
		addEEnumLiteral(pwM_MODEEEnum, net.sf.smbt.mdl.arduino.PWM_MODE.UNKNOWN);

		// Create resource
		createResource(eNS_URI);
	}

} //ArduinoPackageImpl
