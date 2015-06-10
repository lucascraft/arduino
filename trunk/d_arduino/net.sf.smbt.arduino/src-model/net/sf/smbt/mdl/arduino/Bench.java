/**
 */
package net.sf.smbt.mdl.arduino;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bench</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.mdl.arduino.Bench#getBoards <em>Boards</em>}</li>
 *   <li>{@link net.sf.smbt.mdl.arduino.Bench#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.mdl.arduino.ArduinoPackage#getBench()
 * @model
 * @generated
 */
public interface Bench extends EObject {
	/**
	 * Returns the value of the '<em><b>Boards</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.mdl.arduino.Arduino}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boards</em>' containment reference list.
	 * @see net.sf.smbt.mdl.arduino.ArduinoPackage#getBench_Boards()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arduino> getBoards();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.sf.smbt.mdl.arduino.ArduinoPackage#getBench_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.smbt.mdl.arduino.Bench#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Bench
