/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.mdl.arduino;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Com Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.mdl.arduino.ComPort#getMap <em>Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.mdl.arduino.ArduinoPackage#getComPort()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ComPort extends EObject {

	/**
	 * Returns the value of the '<em><b>Map</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.mdl.arduino.PIN_MAPPING}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' attribute.
	 * @see net.sf.smbt.mdl.arduino.PIN_MAPPING
	 * @see #setMap(PIN_MAPPING)
	 * @see net.sf.smbt.mdl.arduino.ArduinoPackage#getComPort_Map()
	 * @model
	 * @generated
	 */
	PIN_MAPPING getMap();

	/**
	 * Sets the value of the '{@link net.sf.smbt.mdl.arduino.ComPort#getMap <em>Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' attribute.
	 * @see net.sf.smbt.mdl.arduino.PIN_MAPPING
	 * @see #getMap()
	 * @generated
	 */
	void setMap(PIN_MAPPING value);
} // ComPort
