/**
 * generated by Xtext 2.14.0
 */
package org.xtext.spring.springConfigDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Placeholder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.PropertyPlaceholder#getSystemPropertiesMode <em>System Properties Mode</em>}</li>
 * </ul>
 *
 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getPropertyPlaceholder()
 * @model
 * @generated
 */
public interface PropertyPlaceholder extends PropertyHolder
{
  /**
   * Returns the value of the '<em><b>System Properties Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>System Properties Mode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>System Properties Mode</em>' attribute.
   * @see #setSystemPropertiesMode(String)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getPropertyPlaceholder_SystemPropertiesMode()
   * @model
   * @generated
   */
  String getSystemPropertiesMode();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.PropertyPlaceholder#getSystemPropertiesMode <em>System Properties Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>System Properties Mode</em>' attribute.
   * @see #getSystemPropertiesMode()
   * @generated
   */
  void setSystemPropertiesMode(String value);

} // PropertyPlaceholder
