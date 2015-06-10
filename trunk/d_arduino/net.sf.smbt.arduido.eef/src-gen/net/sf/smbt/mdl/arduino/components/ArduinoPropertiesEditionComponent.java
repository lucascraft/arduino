/**
 * Generated with Acceleo
 */
package net.sf.smbt.mdl.arduino.components;

// Start of user code for imports
import net.sf.smbt.mdl.arduino.ARDUINO_ATMEGA_168_SERIES;
import net.sf.smbt.mdl.arduino.ARDUINO_BOARD_KIND;
import net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID;
import net.sf.smbt.mdl.arduino.ARDUINO_COMM;
import net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE;
import net.sf.smbt.mdl.arduino.ARDUINO_STATUS_MODE;
import net.sf.smbt.mdl.arduino.ARDUINO_VER_BRAND_NAME;
import net.sf.smbt.mdl.arduino.AnalogPort;
import net.sf.smbt.mdl.arduino.Arduino;
import net.sf.smbt.mdl.arduino.ArduinoPackage;
import net.sf.smbt.mdl.arduino.DigitalPort;
import net.sf.smbt.mdl.arduino.GndPort;
import net.sf.smbt.mdl.arduino.PIN_MAPPING;

import net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart;
import net.sf.smbt.mdl.arduino.parts.ArduinoViewsRepository;

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

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public class ArduinoPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for digitalPorts ReferencesTable
	 */
	protected ReferencesTableSettings digitalPortsSettings;
	
	/**
	 * Settings for analogPorts ReferencesTable
	 */
	protected ReferencesTableSettings analogPortsSettings;
	
	/**
	 * Settings for groundPorts ReferencesTable
	 */
	protected ReferencesTableSettings groundPortsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ArduinoPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject arduino, String editing_mode) {
		super(editingContext, arduino, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ArduinoViewsRepository.class;
		partKey = ArduinoViewsRepository.Arduino_.class;
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
			
			final Arduino arduino = (Arduino)elt;
			final ArduinoPropertiesEditionPart basePart = (ArduinoPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ArduinoViewsRepository.Arduino_.Properties.ver)) {
				basePart.initVer(EEFUtils.choiceOfValues(arduino, ArduinoPackage.eINSTANCE.getArduino_Ver()), arduino.getVer());
			}
			if (isAccessible(ArduinoViewsRepository.Arduino_.Properties.board)) {
				basePart.initBoard(EEFUtils.choiceOfValues(arduino, ArduinoPackage.eINSTANCE.getArduino_Board()), arduino.getBoard());
			}
			if (isAccessible(ArduinoViewsRepository.Arduino_.Properties.series)) {
				basePart.initSeries(EEFUtils.choiceOfValues(arduino, ArduinoPackage.eINSTANCE.getArduino_Series()), arduino.getSeries());
			}
			if (isAccessible(ArduinoViewsRepository.Arduino_.Properties.digitalPorts)) {
				digitalPortsSettings = new ReferencesTableSettings(arduino, ArduinoPackage.eINSTANCE.getArduino_DigitalPorts());
				basePart.initDigitalPorts(digitalPortsSettings);
			}
			if (isAccessible(ArduinoViewsRepository.Arduino_.Properties.analogPorts)) {
				analogPortsSettings = new ReferencesTableSettings(arduino, ArduinoPackage.eINSTANCE.getArduino_AnalogPorts());
				basePart.initAnalogPorts(analogPortsSettings);
			}
			if (isAccessible(ArduinoViewsRepository.Arduino_.Properties.groundPorts)) {
				groundPortsSettings = new ReferencesTableSettings(arduino, ArduinoPackage.eINSTANCE.getArduino_GroundPorts());
				basePart.initGroundPorts(groundPortsSettings);
			}
			if (isAccessible(ArduinoViewsRepository.Arduino_.Properties.label))
				basePart.setLabel(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, arduino.getLabel()));
			
			if (isAccessible(ArduinoViewsRepository.Arduino_.Properties.comm)) {
				basePart.initComm(EEFUtils.choiceOfValues(arduino, ArduinoPackage.eINSTANCE.getArduino_Comm()), arduino.getComm());
			}
			if (isAccessible(ArduinoViewsRepository.Arduino_.Properties.firmataMode)) {
				basePart.initFirmataMode(EEFUtils.choiceOfValues(arduino, ArduinoPackage.eINSTANCE.getArduino_FirmataMode()), arduino.getFirmataMode());
			}
			if (isAccessible(ArduinoViewsRepository.Arduino_.Properties.lockedPin)) {
				basePart.initLockedPin(EEFUtils.choiceOfValues(arduino, ArduinoPackage.eINSTANCE.getArduino_LockedPin()), arduino.getLockedPin());
			}
			if (isAccessible(ArduinoViewsRepository.Arduino_.Properties.synchronizing)) {
				basePart.setSynchronizing(arduino.isSynchronizing());
			}
			if (isAccessible(ArduinoViewsRepository.Arduino_.Properties.status)) {
				basePart.initStatus(EEFUtils.choiceOfValues(arduino, ArduinoPackage.eINSTANCE.getArduino_Status()), arduino.getStatus());
			}
			if (isAccessible(ArduinoViewsRepository.Arduino_.Properties.kind)) {
				basePart.initKind(EEFUtils.choiceOfValues(arduino, ArduinoPackage.eINSTANCE.getArduino_Kind()), arduino.getKind());
			}
			if (isAccessible(ArduinoViewsRepository.Arduino_.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, arduino.getName()));
			
			// init filters
			
			
			
			if (isAccessible(ArduinoViewsRepository.Arduino_.Properties.digitalPorts)) {
				basePart.addFilterToDigitalPorts(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof DigitalPort); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for digitalPorts
				// End of user code
			}
			if (isAccessible(ArduinoViewsRepository.Arduino_.Properties.analogPorts)) {
				basePart.addFilterToAnalogPorts(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof AnalogPort); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for analogPorts
				// End of user code
			}
			if (isAccessible(ArduinoViewsRepository.Arduino_.Properties.groundPorts)) {
				basePart.addFilterToGroundPorts(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof GndPort); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for groundPorts
				// End of user code
			}
			
			
			
			
			
			
			
			
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
		if (editorKey == ArduinoViewsRepository.Arduino_.Properties.ver) {
			return ArduinoPackage.eINSTANCE.getArduino_Ver();
		}
		if (editorKey == ArduinoViewsRepository.Arduino_.Properties.board) {
			return ArduinoPackage.eINSTANCE.getArduino_Board();
		}
		if (editorKey == ArduinoViewsRepository.Arduino_.Properties.series) {
			return ArduinoPackage.eINSTANCE.getArduino_Series();
		}
		if (editorKey == ArduinoViewsRepository.Arduino_.Properties.digitalPorts) {
			return ArduinoPackage.eINSTANCE.getArduino_DigitalPorts();
		}
		if (editorKey == ArduinoViewsRepository.Arduino_.Properties.analogPorts) {
			return ArduinoPackage.eINSTANCE.getArduino_AnalogPorts();
		}
		if (editorKey == ArduinoViewsRepository.Arduino_.Properties.groundPorts) {
			return ArduinoPackage.eINSTANCE.getArduino_GroundPorts();
		}
		if (editorKey == ArduinoViewsRepository.Arduino_.Properties.label) {
			return ArduinoPackage.eINSTANCE.getArduino_Label();
		}
		if (editorKey == ArduinoViewsRepository.Arduino_.Properties.comm) {
			return ArduinoPackage.eINSTANCE.getArduino_Comm();
		}
		if (editorKey == ArduinoViewsRepository.Arduino_.Properties.firmataMode) {
			return ArduinoPackage.eINSTANCE.getArduino_FirmataMode();
		}
		if (editorKey == ArduinoViewsRepository.Arduino_.Properties.lockedPin) {
			return ArduinoPackage.eINSTANCE.getArduino_LockedPin();
		}
		if (editorKey == ArduinoViewsRepository.Arduino_.Properties.synchronizing) {
			return ArduinoPackage.eINSTANCE.getArduino_Synchronizing();
		}
		if (editorKey == ArduinoViewsRepository.Arduino_.Properties.status) {
			return ArduinoPackage.eINSTANCE.getArduino_Status();
		}
		if (editorKey == ArduinoViewsRepository.Arduino_.Properties.kind) {
			return ArduinoPackage.eINSTANCE.getArduino_Kind();
		}
		if (editorKey == ArduinoViewsRepository.Arduino_.Properties.name) {
			return ArduinoPackage.eINSTANCE.getArduino_Name();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Arduino arduino = (Arduino)semanticObject;
		if (ArduinoViewsRepository.Arduino_.Properties.ver == event.getAffectedEditor()) {
			arduino.setVer((ARDUINO_VER_BRAND_NAME)event.getNewValue());
		}
		if (ArduinoViewsRepository.Arduino_.Properties.board == event.getAffectedEditor()) {
			arduino.setBoard((ARDUINO_BOARD_KIND)event.getNewValue());
		}
		if (ArduinoViewsRepository.Arduino_.Properties.series == event.getAffectedEditor()) {
			arduino.setSeries((ARDUINO_ATMEGA_168_SERIES)event.getNewValue());
		}
		if (ArduinoViewsRepository.Arduino_.Properties.digitalPorts == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, digitalPortsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				digitalPortsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				digitalPortsSettings.move(event.getNewIndex(), (DigitalPort) event.getNewValue());
			}
		}
		if (ArduinoViewsRepository.Arduino_.Properties.analogPorts == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, analogPortsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				analogPortsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				analogPortsSettings.move(event.getNewIndex(), (AnalogPort) event.getNewValue());
			}
		}
		if (ArduinoViewsRepository.Arduino_.Properties.groundPorts == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, groundPortsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				groundPortsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				groundPortsSettings.move(event.getNewIndex(), (GndPort) event.getNewValue());
			}
		}
		if (ArduinoViewsRepository.Arduino_.Properties.label == event.getAffectedEditor()) {
			arduino.setLabel((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (ArduinoViewsRepository.Arduino_.Properties.comm == event.getAffectedEditor()) {
			arduino.setComm((ARDUINO_COMM)event.getNewValue());
		}
		if (ArduinoViewsRepository.Arduino_.Properties.firmataMode == event.getAffectedEditor()) {
			arduino.setFirmataMode((ARDUINO_FIRMWARE_MODE)event.getNewValue());
		}
		if (ArduinoViewsRepository.Arduino_.Properties.lockedPin == event.getAffectedEditor()) {
			arduino.setLockedPin((PIN_MAPPING)event.getNewValue());
		}
		if (ArduinoViewsRepository.Arduino_.Properties.synchronizing == event.getAffectedEditor()) {
			arduino.setSynchronizing((Boolean)event.getNewValue());
		}
		if (ArduinoViewsRepository.Arduino_.Properties.status == event.getAffectedEditor()) {
			arduino.setStatus((ARDUINO_STATUS_MODE)event.getNewValue());
		}
		if (ArduinoViewsRepository.Arduino_.Properties.kind == event.getAffectedEditor()) {
			arduino.setKind((ARDUINO_BOARD_UID)event.getNewValue());
		}
		if (ArduinoViewsRepository.Arduino_.Properties.name == event.getAffectedEditor()) {
			arduino.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ArduinoPropertiesEditionPart basePart = (ArduinoPropertiesEditionPart)editingPart;
			if (ArduinoPackage.eINSTANCE.getArduino_Ver().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(ArduinoViewsRepository.Arduino_.Properties.ver))
				basePart.setVer((ARDUINO_VER_BRAND_NAME)msg.getNewValue());
			
			if (ArduinoPackage.eINSTANCE.getArduino_Board().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(ArduinoViewsRepository.Arduino_.Properties.board))
				basePart.setBoard((ARDUINO_BOARD_KIND)msg.getNewValue());
			
			if (ArduinoPackage.eINSTANCE.getArduino_Series().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(ArduinoViewsRepository.Arduino_.Properties.series))
				basePart.setSeries((ARDUINO_ATMEGA_168_SERIES)msg.getNewValue());
			
			if (ArduinoPackage.eINSTANCE.getArduino_DigitalPorts().equals(msg.getFeature()) && isAccessible(ArduinoViewsRepository.Arduino_.Properties.digitalPorts))
				basePart.updateDigitalPorts();
			if (ArduinoPackage.eINSTANCE.getArduino_AnalogPorts().equals(msg.getFeature()) && isAccessible(ArduinoViewsRepository.Arduino_.Properties.analogPorts))
				basePart.updateAnalogPorts();
			if (ArduinoPackage.eINSTANCE.getArduino_GroundPorts().equals(msg.getFeature()) && isAccessible(ArduinoViewsRepository.Arduino_.Properties.groundPorts))
				basePart.updateGroundPorts();
			if (ArduinoPackage.eINSTANCE.getArduino_Label().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ArduinoViewsRepository.Arduino_.Properties.label)) {
				if (msg.getNewValue() != null) {
					basePart.setLabel(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setLabel("");
				}
			}
			if (ArduinoPackage.eINSTANCE.getArduino_Comm().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(ArduinoViewsRepository.Arduino_.Properties.comm))
				basePart.setComm((ARDUINO_COMM)msg.getNewValue());
			
			if (ArduinoPackage.eINSTANCE.getArduino_FirmataMode().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(ArduinoViewsRepository.Arduino_.Properties.firmataMode))
				basePart.setFirmataMode((ARDUINO_FIRMWARE_MODE)msg.getNewValue());
			
			if (ArduinoPackage.eINSTANCE.getArduino_LockedPin().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(ArduinoViewsRepository.Arduino_.Properties.lockedPin))
				basePart.setLockedPin((PIN_MAPPING)msg.getNewValue());
			
			if (ArduinoPackage.eINSTANCE.getArduino_Synchronizing().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ArduinoViewsRepository.Arduino_.Properties.synchronizing))
				basePart.setSynchronizing((Boolean)msg.getNewValue());
			
			if (ArduinoPackage.eINSTANCE.getArduino_Status().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(ArduinoViewsRepository.Arduino_.Properties.status))
				basePart.setStatus((ARDUINO_STATUS_MODE)msg.getNewValue());
			
			if (ArduinoPackage.eINSTANCE.getArduino_Kind().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(ArduinoViewsRepository.Arduino_.Properties.kind))
				basePart.setKind((ARDUINO_BOARD_UID)msg.getNewValue());
			
			if (ArduinoPackage.eINSTANCE.getArduino_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ArduinoViewsRepository.Arduino_.Properties.name)) {
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
			ArduinoPackage.eINSTANCE.getArduino_Ver(),
			ArduinoPackage.eINSTANCE.getArduino_Board(),
			ArduinoPackage.eINSTANCE.getArduino_Series(),
			ArduinoPackage.eINSTANCE.getArduino_DigitalPorts(),
			ArduinoPackage.eINSTANCE.getArduino_AnalogPorts(),
			ArduinoPackage.eINSTANCE.getArduino_GroundPorts(),
			ArduinoPackage.eINSTANCE.getArduino_Label(),
			ArduinoPackage.eINSTANCE.getArduino_Comm(),
			ArduinoPackage.eINSTANCE.getArduino_FirmataMode(),
			ArduinoPackage.eINSTANCE.getArduino_LockedPin(),
			ArduinoPackage.eINSTANCE.getArduino_Synchronizing(),
			ArduinoPackage.eINSTANCE.getArduino_Status(),
			ArduinoPackage.eINSTANCE.getArduino_Kind(),
			ArduinoPackage.eINSTANCE.getArduino_Name()		);
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
				if (ArduinoViewsRepository.Arduino_.Properties.ver == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ArduinoPackage.eINSTANCE.getArduino_Ver().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArduinoPackage.eINSTANCE.getArduino_Ver().getEAttributeType(), newValue);
				}
				if (ArduinoViewsRepository.Arduino_.Properties.board == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ArduinoPackage.eINSTANCE.getArduino_Board().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArduinoPackage.eINSTANCE.getArduino_Board().getEAttributeType(), newValue);
				}
				if (ArduinoViewsRepository.Arduino_.Properties.series == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ArduinoPackage.eINSTANCE.getArduino_Series().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArduinoPackage.eINSTANCE.getArduino_Series().getEAttributeType(), newValue);
				}
				if (ArduinoViewsRepository.Arduino_.Properties.label == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ArduinoPackage.eINSTANCE.getArduino_Label().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArduinoPackage.eINSTANCE.getArduino_Label().getEAttributeType(), newValue);
				}
				if (ArduinoViewsRepository.Arduino_.Properties.comm == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ArduinoPackage.eINSTANCE.getArduino_Comm().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArduinoPackage.eINSTANCE.getArduino_Comm().getEAttributeType(), newValue);
				}
				if (ArduinoViewsRepository.Arduino_.Properties.firmataMode == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ArduinoPackage.eINSTANCE.getArduino_FirmataMode().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArduinoPackage.eINSTANCE.getArduino_FirmataMode().getEAttributeType(), newValue);
				}
				if (ArduinoViewsRepository.Arduino_.Properties.lockedPin == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ArduinoPackage.eINSTANCE.getArduino_LockedPin().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArduinoPackage.eINSTANCE.getArduino_LockedPin().getEAttributeType(), newValue);
				}
				if (ArduinoViewsRepository.Arduino_.Properties.synchronizing == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ArduinoPackage.eINSTANCE.getArduino_Synchronizing().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArduinoPackage.eINSTANCE.getArduino_Synchronizing().getEAttributeType(), newValue);
				}
				if (ArduinoViewsRepository.Arduino_.Properties.status == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ArduinoPackage.eINSTANCE.getArduino_Status().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArduinoPackage.eINSTANCE.getArduino_Status().getEAttributeType(), newValue);
				}
				if (ArduinoViewsRepository.Arduino_.Properties.kind == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ArduinoPackage.eINSTANCE.getArduino_Kind().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArduinoPackage.eINSTANCE.getArduino_Kind().getEAttributeType(), newValue);
				}
				if (ArduinoViewsRepository.Arduino_.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ArduinoPackage.eINSTANCE.getArduino_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArduinoPackage.eINSTANCE.getArduino_Name().getEAttributeType(), newValue);
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
