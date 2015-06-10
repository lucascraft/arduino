/**
 * Generated with Acceleo
 */
package net.sf.smbt.mdl.arduino.providers;

import net.sf.smbt.mdl.arduino.parts.ArduinoViewsRepository;

import net.sf.smbt.mdl.arduino.parts.forms.AREFPortPropertiesEditionPartForm;
import net.sf.smbt.mdl.arduino.parts.forms.AnalogPortPropertiesEditionPartForm;
import net.sf.smbt.mdl.arduino.parts.forms.ArduinoPropertiesEditionPartForm;
import net.sf.smbt.mdl.arduino.parts.forms.DigitalPortPropertiesEditionPartForm;
import net.sf.smbt.mdl.arduino.parts.forms.GndPortPropertiesEditionPartForm;
import net.sf.smbt.mdl.arduino.parts.forms.Port3V3PropertiesEditionPartForm;
import net.sf.smbt.mdl.arduino.parts.forms.Port5VPropertiesEditionPartForm;
import net.sf.smbt.mdl.arduino.parts.forms.Port9VPropertiesEditionPartForm;
import net.sf.smbt.mdl.arduino.parts.forms.PortIO7PropertiesEditionPartForm;
import net.sf.smbt.mdl.arduino.parts.forms.PortPropertiesEditionPartForm;
import net.sf.smbt.mdl.arduino.parts.forms.PortVINPropertiesEditionPartForm;
import net.sf.smbt.mdl.arduino.parts.forms.RstPortPropertiesEditionPartForm;
import net.sf.smbt.mdl.arduino.parts.forms.RxPortPropertiesEditionPartForm;
import net.sf.smbt.mdl.arduino.parts.forms.TxPortPropertiesEditionPartForm;

import net.sf.smbt.mdl.arduino.parts.impl.AREFPortPropertiesEditionPartImpl;
import net.sf.smbt.mdl.arduino.parts.impl.AnalogPortPropertiesEditionPartImpl;
import net.sf.smbt.mdl.arduino.parts.impl.ArduinoPropertiesEditionPartImpl;
import net.sf.smbt.mdl.arduino.parts.impl.DigitalPortPropertiesEditionPartImpl;
import net.sf.smbt.mdl.arduino.parts.impl.GndPortPropertiesEditionPartImpl;
import net.sf.smbt.mdl.arduino.parts.impl.Port3V3PropertiesEditionPartImpl;
import net.sf.smbt.mdl.arduino.parts.impl.Port5VPropertiesEditionPartImpl;
import net.sf.smbt.mdl.arduino.parts.impl.Port9VPropertiesEditionPartImpl;
import net.sf.smbt.mdl.arduino.parts.impl.PortIO7PropertiesEditionPartImpl;
import net.sf.smbt.mdl.arduino.parts.impl.PortPropertiesEditionPartImpl;
import net.sf.smbt.mdl.arduino.parts.impl.PortVINPropertiesEditionPartImpl;
import net.sf.smbt.mdl.arduino.parts.impl.RstPortPropertiesEditionPartImpl;
import net.sf.smbt.mdl.arduino.parts.impl.RxPortPropertiesEditionPartImpl;
import net.sf.smbt.mdl.arduino.parts.impl.TxPortPropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * 
 * 
 */
public class ArduinoPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == ArduinoViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == ArduinoViewsRepository.Arduino_.class) {
			if (kind == ArduinoViewsRepository.SWT_KIND)
				return new ArduinoPropertiesEditionPartImpl(component);
			if (kind == ArduinoViewsRepository.FORM_KIND)
				return new ArduinoPropertiesEditionPartForm(component);
		}
		if (key == ArduinoViewsRepository.Port.class) {
			if (kind == ArduinoViewsRepository.SWT_KIND)
				return new PortPropertiesEditionPartImpl(component);
			if (kind == ArduinoViewsRepository.FORM_KIND)
				return new PortPropertiesEditionPartForm(component);
		}
		if (key == ArduinoViewsRepository.DigitalPort.class) {
			if (kind == ArduinoViewsRepository.SWT_KIND)
				return new DigitalPortPropertiesEditionPartImpl(component);
			if (kind == ArduinoViewsRepository.FORM_KIND)
				return new DigitalPortPropertiesEditionPartForm(component);
		}
		if (key == ArduinoViewsRepository.AnalogPort.class) {
			if (kind == ArduinoViewsRepository.SWT_KIND)
				return new AnalogPortPropertiesEditionPartImpl(component);
			if (kind == ArduinoViewsRepository.FORM_KIND)
				return new AnalogPortPropertiesEditionPartForm(component);
		}
		if (key == ArduinoViewsRepository.RxPort.class) {
			if (kind == ArduinoViewsRepository.SWT_KIND)
				return new RxPortPropertiesEditionPartImpl(component);
			if (kind == ArduinoViewsRepository.FORM_KIND)
				return new RxPortPropertiesEditionPartForm(component);
		}
		if (key == ArduinoViewsRepository.TxPort.class) {
			if (kind == ArduinoViewsRepository.SWT_KIND)
				return new TxPortPropertiesEditionPartImpl(component);
			if (kind == ArduinoViewsRepository.FORM_KIND)
				return new TxPortPropertiesEditionPartForm(component);
		}
		if (key == ArduinoViewsRepository.GndPort.class) {
			if (kind == ArduinoViewsRepository.SWT_KIND)
				return new GndPortPropertiesEditionPartImpl(component);
			if (kind == ArduinoViewsRepository.FORM_KIND)
				return new GndPortPropertiesEditionPartForm(component);
		}
		if (key == ArduinoViewsRepository.Port3V3.class) {
			if (kind == ArduinoViewsRepository.SWT_KIND)
				return new Port3V3PropertiesEditionPartImpl(component);
			if (kind == ArduinoViewsRepository.FORM_KIND)
				return new Port3V3PropertiesEditionPartForm(component);
		}
		if (key == ArduinoViewsRepository.RstPort.class) {
			if (kind == ArduinoViewsRepository.SWT_KIND)
				return new RstPortPropertiesEditionPartImpl(component);
			if (kind == ArduinoViewsRepository.FORM_KIND)
				return new RstPortPropertiesEditionPartForm(component);
		}
		if (key == ArduinoViewsRepository.Port5V.class) {
			if (kind == ArduinoViewsRepository.SWT_KIND)
				return new Port5VPropertiesEditionPartImpl(component);
			if (kind == ArduinoViewsRepository.FORM_KIND)
				return new Port5VPropertiesEditionPartForm(component);
		}
		if (key == ArduinoViewsRepository.Port9V.class) {
			if (kind == ArduinoViewsRepository.SWT_KIND)
				return new Port9VPropertiesEditionPartImpl(component);
			if (kind == ArduinoViewsRepository.FORM_KIND)
				return new Port9VPropertiesEditionPartForm(component);
		}
		if (key == ArduinoViewsRepository.PortIO7.class) {
			if (kind == ArduinoViewsRepository.SWT_KIND)
				return new PortIO7PropertiesEditionPartImpl(component);
			if (kind == ArduinoViewsRepository.FORM_KIND)
				return new PortIO7PropertiesEditionPartForm(component);
		}
		if (key == ArduinoViewsRepository.AREFPort.class) {
			if (kind == ArduinoViewsRepository.SWT_KIND)
				return new AREFPortPropertiesEditionPartImpl(component);
			if (kind == ArduinoViewsRepository.FORM_KIND)
				return new AREFPortPropertiesEditionPartForm(component);
		}
		if (key == ArduinoViewsRepository.PortVIN.class) {
			if (kind == ArduinoViewsRepository.SWT_KIND)
				return new PortVINPropertiesEditionPartImpl(component);
			if (kind == ArduinoViewsRepository.FORM_KIND)
				return new PortVINPropertiesEditionPartForm(component);
		}
		return null;
	}

}
