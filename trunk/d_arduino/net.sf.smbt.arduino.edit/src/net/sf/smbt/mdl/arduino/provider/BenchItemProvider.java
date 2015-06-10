/**
 */
package net.sf.smbt.mdl.arduino.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.arduino.utils.ArduinoBoardUtils;
import net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID;
import net.sf.smbt.mdl.arduino.Arduino;
import net.sf.smbt.mdl.arduino.ArduinoFactory;
import net.sf.smbt.mdl.arduino.ArduinoPackage;
import net.sf.smbt.mdl.arduino.Bench;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.CommandParameter;
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
 * This is the item provider adapter for a {@link net.sf.smbt.mdl.arduino.Bench} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BenchItemProvider 
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
	public BenchItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_Bench_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Bench_name_feature", "_UI_Bench_type"),
				 ArduinoPackage.Literals.BENCH__NAME,
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
			childrenFeatures.add(ArduinoPackage.Literals.BENCH__BOARDS);
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
	 * This returns Bench.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Bench"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Bench)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Bench_type") :
			getString("_UI_Bench_type") + " " + label;
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

		switch (notification.getFeatureID(Bench.class)) {
			case ArduinoPackage.BENCH__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ArduinoPackage.BENCH__BOARDS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		if (feature.equals(ArduinoPackage.Literals.BENCH__BOARDS) && child instanceof Arduino){
			return ((Arduino)child).getVer().getLiteral();
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}
	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

//		newChildDescriptors.add
//			(createChildParameter
//				(ArduinoPackage.Literals.BENCH__BOARDS,
//				 ArduinoFactory.eINSTANCE.createArduino()));
		
		newChildDescriptors.add
		(createChildParameter
			(ArduinoPackage.Literals.BENCH__BOARDS,
				EcoreUtil.copy(ArduinoBoardUtils.INSTANCE.getSupportedArduinoDevices().get(ARDUINO_BOARD_UID.DIECMILA_ATMEGA_168))
			));
		
		newChildDescriptors.add
		(createChildParameter
			(ArduinoPackage.Literals.BENCH__BOARDS,
				EcoreUtil.copy(ArduinoBoardUtils.INSTANCE.getSupportedArduinoDevices().get(ARDUINO_BOARD_UID.UNO_ATMEGA328))
			));
		newChildDescriptors.add
		(createChildParameter
			(ArduinoPackage.Literals.BENCH__BOARDS,
					EcoreUtil.copy(ArduinoBoardUtils.INSTANCE.getSupportedArduinoDevices().get(ARDUINO_BOARD_UID.FUNNEL_IO_ATMEGA328P))
			));
		newChildDescriptors.add
		(createChildParameter
			(ArduinoPackage.Literals.BENCH__BOARDS,
					EcoreUtil.copy(ArduinoBoardUtils.INSTANCE.getSupportedArduinoDevices().get(ARDUINO_BOARD_UID.DUEMILANOVE_ATMEGA_328))
			));
		newChildDescriptors.add
		(createChildParameter
			(ArduinoPackage.Literals.BENCH__BOARDS,
					EcoreUtil.copy(ArduinoBoardUtils.INSTANCE.getSupportedArduinoDevices().get(ARDUINO_BOARD_UID.DUEMILANOVE_ATMEGA_168))
			));
		newChildDescriptors.add
		(createChildParameter
			(ArduinoPackage.Literals.BENCH__BOARDS,
					EcoreUtil.copy(ArduinoBoardUtils.INSTANCE.getSupportedArduinoDevices().get(ARDUINO_BOARD_UID.MINI_ATMEGA_168))
			));
		newChildDescriptors.add
		(createChildParameter
			(ArduinoPackage.Literals.BENCH__BOARDS,
					EcoreUtil.copy(ArduinoBoardUtils.INSTANCE.getSupportedArduinoDevices().get(ARDUINO_BOARD_UID.LEONARDO_ATMEGA32U4))
			));
		newChildDescriptors.add
		(createChildParameter
			(ArduinoPackage.Literals.BENCH__BOARDS,
					EcoreUtil.copy(ArduinoBoardUtils.INSTANCE.getSupportedArduinoDevices().get(ARDUINO_BOARD_UID.UNO_ATMEGA328))
			));
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
