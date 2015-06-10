/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.mdl.arduino.impl;

import net.sf.smbt.mdl.arduino.*;
import net.sf.smbt.arduino.utils.ArduinoPinEventAdapter;
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
import net.sf.smbt.mdl.arduino.ArduinoFactory;
import net.sf.smbt.mdl.arduino.ArduinoPackage;
import net.sf.smbt.mdl.arduino.DigitalPort;
import net.sf.smbt.mdl.arduino.GndPort;
import net.sf.smbt.mdl.arduino.PIN_MAPPING;
import net.sf.smbt.mdl.arduino.PIN_MODE;
import net.sf.smbt.mdl.arduino.PWM_MODE;
import net.sf.smbt.mdl.arduino.Port;
import net.sf.smbt.mdl.arduino.Port3V3;
import net.sf.smbt.mdl.arduino.Port5V;
import net.sf.smbt.mdl.arduino.Port9V;
import net.sf.smbt.mdl.arduino.PortIO7;
import net.sf.smbt.mdl.arduino.PortVIN;
import net.sf.smbt.mdl.arduino.RstPort;
import net.sf.smbt.mdl.arduino.RxPort;
import net.sf.smbt.mdl.arduino.TxPort;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ArduinoFactoryImpl extends EFactoryImpl implements ArduinoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArduinoFactory init() {
		try {
			ArduinoFactory theArduinoFactory = (ArduinoFactory)EPackage.Registry.INSTANCE.getEFactory(ArduinoPackage.eNS_URI);
			if (theArduinoFactory != null) {
				return theArduinoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArduinoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoFactoryImpl() {
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
			case ArduinoPackage.ARDUINO: return createArduino();
			case ArduinoPackage.PORT: return createPort();
			case ArduinoPackage.DIGITAL_PORT: return createDigitalPort();
			case ArduinoPackage.ANALOG_PORT: return createAnalogPort();
			case ArduinoPackage.RX_PORT: return createRxPort();
			case ArduinoPackage.TX_PORT: return createTxPort();
			case ArduinoPackage.GND_PORT: return createGndPort();
			case ArduinoPackage.PORT3_V3: return createPort3V3();
			case ArduinoPackage.RST_PORT: return createRstPort();
			case ArduinoPackage.PORT5_V: return createPort5V();
			case ArduinoPackage.PORT9_V: return createPort9V();
			case ArduinoPackage.PORT_IO7: return createPortIO7();
			case ArduinoPackage.AREF_PORT: return createAREFPort();
			case ArduinoPackage.PORT_VIN: return createPortVIN();
			case ArduinoPackage.BENCH: return createBench();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ArduinoPackage.ARDUINO_VER_BRAND_NAME:
				return createARDUINO_VER_BRAND_NAMEFromString(eDataType, initialValue);
			case ArduinoPackage.ARDUINO_BOARD_KIND:
				return createARDUINO_BOARD_KINDFromString(eDataType, initialValue);
			case ArduinoPackage.ARDUINO_COMM:
				return createARDUINO_COMMFromString(eDataType, initialValue);
			case ArduinoPackage.PIN_MAPPING:
				return createPIN_MAPPINGFromString(eDataType, initialValue);
			case ArduinoPackage.ARDUINO_ATMEGA_168_SERIES:
				return createARDUINO_ATMEGA_168_SERIESFromString(eDataType, initialValue);
			case ArduinoPackage.ARDUINO_BOARD_UID:
				return createARDUINO_BOARD_UIDFromString(eDataType, initialValue);
			case ArduinoPackage.ARDUINO_REPORT_MODE:
				return createARDUINO_REPORT_MODEFromString(eDataType, initialValue);
			case ArduinoPackage.ARDUINO_FIRMWARE_MODE:
				return createARDUINO_FIRMWARE_MODEFromString(eDataType, initialValue);
			case ArduinoPackage.ARDUINO_STATUS_MODE:
				return createARDUINO_STATUS_MODEFromString(eDataType, initialValue);
			case ArduinoPackage.PIN_MODE:
				return createPIN_MODEFromString(eDataType, initialValue);
			case ArduinoPackage.PWM_MODE:
				return createPWM_MODEFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ArduinoPackage.ARDUINO_VER_BRAND_NAME:
				return convertARDUINO_VER_BRAND_NAMEToString(eDataType, instanceValue);
			case ArduinoPackage.ARDUINO_BOARD_KIND:
				return convertARDUINO_BOARD_KINDToString(eDataType, instanceValue);
			case ArduinoPackage.ARDUINO_COMM:
				return convertARDUINO_COMMToString(eDataType, instanceValue);
			case ArduinoPackage.PIN_MAPPING:
				return convertPIN_MAPPINGToString(eDataType, instanceValue);
			case ArduinoPackage.ARDUINO_ATMEGA_168_SERIES:
				return convertARDUINO_ATMEGA_168_SERIESToString(eDataType, instanceValue);
			case ArduinoPackage.ARDUINO_BOARD_UID:
				return convertARDUINO_BOARD_UIDToString(eDataType, instanceValue);
			case ArduinoPackage.ARDUINO_REPORT_MODE:
				return convertARDUINO_REPORT_MODEToString(eDataType, instanceValue);
			case ArduinoPackage.ARDUINO_FIRMWARE_MODE:
				return convertARDUINO_FIRMWARE_MODEToString(eDataType, instanceValue);
			case ArduinoPackage.ARDUINO_STATUS_MODE:
				return convertARDUINO_STATUS_MODEToString(eDataType, instanceValue);
			case ArduinoPackage.PIN_MODE:
				return convertPIN_MODEToString(eDataType, instanceValue);
			case ArduinoPackage.PWM_MODE:
				return convertPWM_MODEToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino createArduino() {
		ArduinoImpl arduino = new ArduinoImpl();
		return arduino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DigitalPort createDigitalPort() {
		DigitalPortImpl digitalPort = new DigitalPortImpl();
		//
		// 
		//
		digitalPort.eAdapters().add(new ArduinoPinEventAdapter());
		return digitalPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AnalogPort createAnalogPort() {
		AnalogPortImpl analogPort = new AnalogPortImpl();
		//
		// 
		//
		analogPort.eAdapters().add(new ArduinoPinEventAdapter());
		return analogPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RxPort createRxPort() {
		RxPortImpl rxPort = new RxPortImpl();
		return rxPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TxPort createTxPort() {
		TxPortImpl txPort = new TxPortImpl();
		return txPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GndPort createGndPort() {
		GndPortImpl gndPort = new GndPortImpl();
		return gndPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port3V3 createPort3V3() {
		Port3V3Impl port3V3 = new Port3V3Impl();
		return port3V3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RstPort createRstPort() {
		RstPortImpl rstPort = new RstPortImpl();
		return rstPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port5V createPort5V() {
		Port5VImpl port5V = new Port5VImpl();
		return port5V;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port9V createPort9V() {
		Port9VImpl port9V = new Port9VImpl();
		return port9V;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortIO7 createPortIO7() {
		PortIO7Impl portIO7 = new PortIO7Impl();
		return portIO7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AREFPort createAREFPort() {
		AREFPortImpl arefPort = new AREFPortImpl();
		return arefPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortVIN createPortVIN() {
		PortVINImpl portVIN = new PortVINImpl();
		return portVIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bench createBench() {
		BenchImpl bench = new BenchImpl();
		return bench;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARDUINO_VER_BRAND_NAME createARDUINO_VER_BRAND_NAMEFromString(EDataType eDataType, String initialValue) {
		ARDUINO_VER_BRAND_NAME result = ARDUINO_VER_BRAND_NAME.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertARDUINO_VER_BRAND_NAMEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARDUINO_BOARD_KIND createARDUINO_BOARD_KINDFromString(EDataType eDataType, String initialValue) {
		ARDUINO_BOARD_KIND result = ARDUINO_BOARD_KIND.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertARDUINO_BOARD_KINDToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARDUINO_COMM createARDUINO_COMMFromString(EDataType eDataType, String initialValue) {
		ARDUINO_COMM result = ARDUINO_COMM.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertARDUINO_COMMToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIN_MAPPING createPIN_MAPPINGFromString(EDataType eDataType, String initialValue) {
		PIN_MAPPING result = PIN_MAPPING.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPIN_MAPPINGToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARDUINO_ATMEGA_168_SERIES createARDUINO_ATMEGA_168_SERIESFromString(EDataType eDataType, String initialValue) {
		ARDUINO_ATMEGA_168_SERIES result = ARDUINO_ATMEGA_168_SERIES.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertARDUINO_ATMEGA_168_SERIESToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARDUINO_BOARD_UID createARDUINO_BOARD_UIDFromString(EDataType eDataType, String initialValue) {
		ARDUINO_BOARD_UID result = ARDUINO_BOARD_UID.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertARDUINO_BOARD_UIDToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARDUINO_REPORT_MODE createARDUINO_REPORT_MODEFromString(EDataType eDataType, String initialValue) {
		ARDUINO_REPORT_MODE result = ARDUINO_REPORT_MODE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertARDUINO_REPORT_MODEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARDUINO_FIRMWARE_MODE createARDUINO_FIRMWARE_MODEFromString(EDataType eDataType, String initialValue) {
		ARDUINO_FIRMWARE_MODE result = ARDUINO_FIRMWARE_MODE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertARDUINO_FIRMWARE_MODEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARDUINO_STATUS_MODE createARDUINO_STATUS_MODEFromString(EDataType eDataType, String initialValue) {
		ARDUINO_STATUS_MODE result = ARDUINO_STATUS_MODE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertARDUINO_STATUS_MODEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIN_MODE createPIN_MODEFromString(EDataType eDataType, String initialValue) {
		PIN_MODE result = PIN_MODE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPIN_MODEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PWM_MODE createPWM_MODEFromString(EDataType eDataType, String initialValue) {
		PWM_MODE result = PWM_MODE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPWM_MODEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoPackage getArduinoPackage() {
		return (ArduinoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArduinoPackage getPackage() {
		return ArduinoPackage.eINSTANCE;
	}

} //ArduinoFactoryImpl
