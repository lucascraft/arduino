/**
 * Generated with Acceleo
 */
package net.sf.smbt.mdl.arduino.providers;

import net.sf.smbt.mdl.arduino.util.ArduinoAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;

/**
 * 
 * 
 */
public class ArduinoEEFAdapterFactory extends ArduinoAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see net.sf.smbt.mdl.arduino.util.ArduinoAdapterFactory#createArduinoAdapter()
	 * 
	 */
	public Adapter createArduinoAdapter() {
		return new ArduinoPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.sf.smbt.mdl.arduino.util.ArduinoAdapterFactory#createPortAdapter()
	 * 
	 */
	public Adapter createPortAdapter() {
		return new PortPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.sf.smbt.mdl.arduino.util.ArduinoAdapterFactory#createDigitalPortAdapter()
	 * 
	 */
	public Adapter createDigitalPortAdapter() {
		return new DigitalPortPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.sf.smbt.mdl.arduino.util.ArduinoAdapterFactory#createAnalogPortAdapter()
	 * 
	 */
	public Adapter createAnalogPortAdapter() {
		return new AnalogPortPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.sf.smbt.mdl.arduino.util.ArduinoAdapterFactory#createRxPortAdapter()
	 * 
	 */
	public Adapter createRxPortAdapter() {
		return new RxPortPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.sf.smbt.mdl.arduino.util.ArduinoAdapterFactory#createTxPortAdapter()
	 * 
	 */
	public Adapter createTxPortAdapter() {
		return new TxPortPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.sf.smbt.mdl.arduino.util.ArduinoAdapterFactory#createGndPortAdapter()
	 * 
	 */
	public Adapter createGndPortAdapter() {
		return new GndPortPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.sf.smbt.mdl.arduino.util.ArduinoAdapterFactory#createPort3V3Adapter()
	 * 
	 */
	public Adapter createPort3V3Adapter() {
		return new Port3V3PropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.sf.smbt.mdl.arduino.util.ArduinoAdapterFactory#createRstPortAdapter()
	 * 
	 */
	public Adapter createRstPortAdapter() {
		return new RstPortPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.sf.smbt.mdl.arduino.util.ArduinoAdapterFactory#createPort5VAdapter()
	 * 
	 */
	public Adapter createPort5VAdapter() {
		return new Port5VPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.sf.smbt.mdl.arduino.util.ArduinoAdapterFactory#createPort9VAdapter()
	 * 
	 */
	public Adapter createPort9VAdapter() {
		return new Port9VPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.sf.smbt.mdl.arduino.util.ArduinoAdapterFactory#createPortIO7Adapter()
	 * 
	 */
	public Adapter createPortIO7Adapter() {
		return new PortIO7PropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.sf.smbt.mdl.arduino.util.ArduinoAdapterFactory#createAREFPortAdapter()
	 * 
	 */
	public Adapter createAREFPortAdapter() {
		return new AREFPortPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.sf.smbt.mdl.arduino.util.ArduinoAdapterFactory#createPortVINAdapter()
	 * 
	 */
	public Adapter createPortVINAdapter() {
		return new PortVINPropertiesEditionProvider();
	}

}
