/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.mdl.arduino.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.mdl.arduino.ARDUINO_VER_BRAND_NAME;
import net.sf.smbt.mdl.arduino.Arduino;
import net.sf.smbt.mdl.arduino.ArduinoFactory;
import net.sf.smbt.mdl.arduino.ArduinoPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.sf.smbt.mdl.arduino.Arduino} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArduinoItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addVerPropertyDescriptor(object);
			addBoardPropertyDescriptor(object);
			addSeriesPropertyDescriptor(object);
			addDigitalPortsPropertyDescriptor(object);
			addAnalogPortsPropertyDescriptor(object);
			addTxPropertyDescriptor(object);
			addGroundPortsPropertyDescriptor(object);
			addRxPropertyDescriptor(object);
			addPwm3V3PropertyDescriptor(object);
			addLabelPropertyDescriptor(object);
			addCommPropertyDescriptor(object);
			addResetPortPropertyDescriptor(object);
			addPwm9VPropertyDescriptor(object);
			addPwm5VPropertyDescriptor(object);
			addIo7PropertyDescriptor(object);
			addVinPropertyDescriptor(object);
			addArefPropertyDescriptor(object);
			addFirmataModePropertyDescriptor(object);
			addLockedPinPropertyDescriptor(object);
			addSynchronizingPropertyDescriptor(object);
			addStatusPropertyDescriptor(object);
			addKindPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Ver feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Arduino_ver_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Arduino_ver_feature", "_UI_Arduino_type"),
				 ArduinoPackage.Literals.ARDUINO__VER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Board feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBoardPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Arduino_board_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Arduino_board_feature", "_UI_Arduino_type"),
				 ArduinoPackage.Literals.ARDUINO__BOARD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Series feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSeriesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Arduino_series_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Arduino_series_feature", "_UI_Arduino_type"),
				 ArduinoPackage.Literals.ARDUINO__SERIES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Digital Ports feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDigitalPortsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Arduino_digitalPorts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Arduino_digitalPorts_feature", "_UI_Arduino_type"),
				 ArduinoPackage.Literals.ARDUINO__DIGITAL_PORTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Analog Ports feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnalogPortsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Arduino_analogPorts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Arduino_analogPorts_feature", "_UI_Arduino_type"),
				 ArduinoPackage.Literals.ARDUINO__ANALOG_PORTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tx feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Arduino_tx_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Arduino_tx_feature", "_UI_Arduino_type"),
				 ArduinoPackage.Literals.ARDUINO__TX,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ground Ports feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroundPortsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Arduino_groundPorts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Arduino_groundPorts_feature", "_UI_Arduino_type"),
				 ArduinoPackage.Literals.ARDUINO__GROUND_PORTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rx feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Arduino_rx_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Arduino_rx_feature", "_UI_Arduino_type"),
				 ArduinoPackage.Literals.ARDUINO__RX,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pwm3 V3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPwm3V3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Arduino_pwm3V3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Arduino_pwm3V3_feature", "_UI_Arduino_type"),
				 ArduinoPackage.Literals.ARDUINO__PWM3_V3,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Arduino_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Arduino_label_feature", "_UI_Arduino_type"),
				 ArduinoPackage.Literals.ARDUINO__LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Comm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Arduino_comm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Arduino_comm_feature", "_UI_Arduino_type"),
				 ArduinoPackage.Literals.ARDUINO__COMM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reset Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResetPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Arduino_resetPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Arduino_resetPort_feature", "_UI_Arduino_type"),
				 ArduinoPackage.Literals.ARDUINO__RESET_PORT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pwm9 V feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPwm9VPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Arduino_pwm9V_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Arduino_pwm9V_feature", "_UI_Arduino_type"),
				 ArduinoPackage.Literals.ARDUINO__PWM9_V,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pwm5 V feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPwm5VPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Arduino_pwm5V_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Arduino_pwm5V_feature", "_UI_Arduino_type"),
				 ArduinoPackage.Literals.ARDUINO__PWM5_V,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Io7 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIo7PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Arduino_io7_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Arduino_io7_feature", "_UI_Arduino_type"),
				 ArduinoPackage.Literals.ARDUINO__IO7,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVinPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Arduino_vin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Arduino_vin_feature", "_UI_Arduino_type"),
				 ArduinoPackage.Literals.ARDUINO__VIN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Aref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Arduino_aref_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Arduino_aref_feature", "_UI_Arduino_type"),
				 ArduinoPackage.Literals.ARDUINO__AREF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Firmata Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirmataModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Arduino_firmataMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Arduino_firmataMode_feature", "_UI_Arduino_type"),
				 ArduinoPackage.Literals.ARDUINO__FIRMATA_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Locked Pin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLockedPinPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Arduino_lockedPin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Arduino_lockedPin_feature", "_UI_Arduino_type"),
				 ArduinoPackage.Literals.ARDUINO__LOCKED_PIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Synchronizing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSynchronizingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Arduino_synchronizing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Arduino_synchronizing_feature", "_UI_Arduino_type"),
				 ArduinoPackage.Literals.ARDUINO__SYNCHRONIZING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Arduino_status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Arduino_status_feature", "_UI_Arduino_type"),
				 ArduinoPackage.Literals.ARDUINO__STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Arduino_kind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Arduino_kind_feature", "_UI_Arduino_type"),
				 ArduinoPackage.Literals.ARDUINO__KIND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Arduino_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Arduino_name_feature", "_UI_Arduino_type"),
				 ArduinoPackage.Literals.ARDUINO__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ArduinoPackage.Literals.ARDUINO__DIGITAL_PORTS);
			childrenFeatures.add(ArduinoPackage.Literals.ARDUINO__ANALOG_PORTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Arduino.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Arduino"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((Arduino)object).getVer() + " (" + ((Arduino)object).getKind().getLiteral() + ")";
		return label == null || label.length() == 0 ?
			getString("_UI_Arduino_type") : label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Arduino.class)) {
			case ArduinoPackage.ARDUINO__VER:
			case ArduinoPackage.ARDUINO__BOARD:
			case ArduinoPackage.ARDUINO__SERIES:
			case ArduinoPackage.ARDUINO__LABEL:
			case ArduinoPackage.ARDUINO__COMM:
			case ArduinoPackage.ARDUINO__FIRMATA_MODE:
			case ArduinoPackage.ARDUINO__LOCKED_PIN:
			case ArduinoPackage.ARDUINO__SYNCHRONIZING:
			case ArduinoPackage.ARDUINO__STATUS:
			case ArduinoPackage.ARDUINO__KIND:
			case ArduinoPackage.ARDUINO__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ArduinoPackage.ARDUINO__DIGITAL_PORTS:
			case ArduinoPackage.ARDUINO__ANALOG_PORTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ArduinoPackage.Literals.ARDUINO__DIGITAL_PORTS,
				 ArduinoFactory.eINSTANCE.createDigitalPort()));

		newChildDescriptors.add
			(createChildParameter
				(ArduinoPackage.Literals.ARDUINO__ANALOG_PORTS,
				 ArduinoFactory.eINSTANCE.createAnalogPort()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ArduinoEditPlugin.INSTANCE;
	}

}
