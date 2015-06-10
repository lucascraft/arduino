/**
 * Generated with Acceleo
 */
package net.sf.smbt.mdl.arduino.components;

// Start of user code for imports
import net.sf.smbt.mdl.arduino.ARDUINO_REPORT_MODE;
import net.sf.smbt.mdl.arduino.ArduinoPackage;
import net.sf.smbt.mdl.arduino.PIN_MAPPING;
import net.sf.smbt.mdl.arduino.Port5V;

import net.sf.smbt.mdl.arduino.parts.ArduinoViewsRepository;
import net.sf.smbt.mdl.arduino.parts.Port5VPropertiesEditionPart;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;


// End of user code

/**
 * 
 * 
 */
public class Port5VPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public Port5VPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject port5V, String editing_mode) {
		super(editingContext, port5V, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ArduinoViewsRepository.class;
		partKey = ArduinoViewsRepository.Port5V.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final Port5V port5V = (Port5V)elt;
			final Port5VPropertiesEditionPart basePart = (Port5VPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ArduinoViewsRepository.Port5V.Properties.map)) {
				basePart.initMap(EEFUtils.choiceOfValues(port5V, ArduinoPackage.eINSTANCE.getPort_Map()), port5V.getMap());
			}
			if (isAccessible(ArduinoViewsRepository.Port5V.Properties.report)) {
				basePart.initReport(EEFUtils.choiceOfValues(port5V, ArduinoPackage.eINSTANCE.getPort_Report()), port5V.getReport());
			}
			if (isAccessible(ArduinoViewsRepository.Port5V.Properties.channel)) {
				basePart.setChannel(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, port5V.getChannel()));
			}
			
			if (isAccessible(ArduinoViewsRepository.Port5V.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, port5V.getName()));
			
			// init filters
			
			
			
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}







	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == ArduinoViewsRepository.Port5V.Properties.map) {
			return ArduinoPackage.eINSTANCE.getPort_Map();
		}
		if (editorKey == ArduinoViewsRepository.Port5V.Properties.report) {
			return ArduinoPackage.eINSTANCE.getPort_Report();
		}
		if (editorKey == ArduinoViewsRepository.Port5V.Properties.channel) {
			return ArduinoPackage.eINSTANCE.getPort_Channel();
		}
		if (editorKey == ArduinoViewsRepository.Port5V.Properties.name) {
			return ArduinoPackage.eINSTANCE.getPort_Name();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Port5V port5V = (Port5V)semanticObject;
		if (ArduinoViewsRepository.Port5V.Properties.map == event.getAffectedEditor()) {
			port5V.setMap((PIN_MAPPING)event.getNewValue());
		}
		if (ArduinoViewsRepository.Port5V.Properties.report == event.getAffectedEditor()) {
			port5V.setReport((ARDUINO_REPORT_MODE)event.getNewValue());
		}
		if (ArduinoViewsRepository.Port5V.Properties.channel == event.getAffectedEditor()) {
			port5V.setChannel((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (ArduinoViewsRepository.Port5V.Properties.name == event.getAffectedEditor()) {
			port5V.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			Port5VPropertiesEditionPart basePart = (Port5VPropertiesEditionPart)editingPart;
			if (ArduinoPackage.eINSTANCE.getPort_Map().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(ArduinoViewsRepository.Port5V.Properties.map))
				basePart.setMap((PIN_MAPPING)msg.getNewValue());
			
			if (ArduinoPackage.eINSTANCE.getPort_Report().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(ArduinoViewsRepository.Port5V.Properties.report))
				basePart.setReport((ARDUINO_REPORT_MODE)msg.getNewValue());
			
			if (ArduinoPackage.eINSTANCE.getPort_Channel().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ArduinoViewsRepository.Port5V.Properties.channel)) {
				if (msg.getNewValue() != null) {
					basePart.setChannel(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setChannel("");
				}
			}
			if (ArduinoPackage.eINSTANCE.getPort_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ArduinoViewsRepository.Port5V.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			ArduinoPackage.eINSTANCE.getPort_Map(),
			ArduinoPackage.eINSTANCE.getPort_Report(),
			ArduinoPackage.eINSTANCE.getPort_Channel(),
			ArduinoPackage.eINSTANCE.getPort_Name()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (ArduinoViewsRepository.Port5V.Properties.map == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ArduinoPackage.eINSTANCE.getPort_Map().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArduinoPackage.eINSTANCE.getPort_Map().getEAttributeType(), newValue);
				}
				if (ArduinoViewsRepository.Port5V.Properties.report == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ArduinoPackage.eINSTANCE.getPort_Report().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArduinoPackage.eINSTANCE.getPort_Report().getEAttributeType(), newValue);
				}
				if (ArduinoViewsRepository.Port5V.Properties.channel == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ArduinoPackage.eINSTANCE.getPort_Channel().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArduinoPackage.eINSTANCE.getPort_Channel().getEAttributeType(), newValue);
				}
				if (ArduinoViewsRepository.Port5V.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ArduinoPackage.eINSTANCE.getPort_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArduinoPackage.eINSTANCE.getPort_Name().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

	

}
