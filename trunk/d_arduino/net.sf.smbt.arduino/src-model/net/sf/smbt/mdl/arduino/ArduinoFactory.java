/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.mdl.arduino;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.mdl.arduino.ArduinoPackage
 * @generated
 */
public interface ArduinoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArduinoFactory eINSTANCE = net.sf.smbt.mdl.arduino.impl.ArduinoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Arduino</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino</em>'.
	 * @generated
	 */
	Arduino createArduino();

	/**
	 * Returns a new object of class '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port</em>'.
	 * @generated
	 */
	Port createPort();

	/**
	 * Returns a new object of class '<em>Digital Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digital Port</em>'.
	 * @generated
	 */
	DigitalPort createDigitalPort();

	/**
	 * Returns a new object of class '<em>Analog Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analog Port</em>'.
	 * @generated
	 */
	AnalogPort createAnalogPort();

	/**
	 * Returns a new object of class '<em>Rx Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rx Port</em>'.
	 * @generated
	 */
	RxPort createRxPort();

	/**
	 * Returns a new object of class '<em>Tx Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tx Port</em>'.
	 * @generated
	 */
	TxPort createTxPort();

	/**
	 * Returns a new object of class '<em>Gnd Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gnd Port</em>'.
	 * @generated
	 */
	GndPort createGndPort();

	/**
	 * Returns a new object of class '<em>Port3 V3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port3 V3</em>'.
	 * @generated
	 */
	Port3V3 createPort3V3();

	/**
	 * Returns a new object of class '<em>Rst Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rst Port</em>'.
	 * @generated
	 */
	RstPort createRstPort();

	/**
	 * Returns a new object of class '<em>Port5 V</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port5 V</em>'.
	 * @generated
	 */
	Port5V createPort5V();

	/**
	 * Returns a new object of class '<em>Port9 V</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port9 V</em>'.
	 * @generated
	 */
	Port9V createPort9V();

	/**
	 * Returns a new object of class '<em>Port IO7</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port IO7</em>'.
	 * @generated
	 */
	PortIO7 createPortIO7();

	/**
	 * Returns a new object of class '<em>AREF Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AREF Port</em>'.
	 * @generated
	 */
	AREFPort createAREFPort();

	/**
	 * Returns a new object of class '<em>Port VIN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port VIN</em>'.
	 * @generated
	 */
	PortVIN createPortVIN();

	/**
	 * Returns a new object of class '<em>Bench</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bench</em>'.
	 * @generated
	 */
	Bench createBench();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ArduinoPackage getArduinoPackage();

} //ArduinoFactory
