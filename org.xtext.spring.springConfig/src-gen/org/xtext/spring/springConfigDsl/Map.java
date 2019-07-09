/**
 * generated by Xtext 2.17.0.M3
 */
package org.xtext.spring.springConfigDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.Map#getKeyType <em>Key Type</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Map#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getMap()
 * @model
 * @generated
 */
public interface Map extends Collection
{
  /**
   * Returns the value of the '<em><b>Key Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Type</em>' attribute.
   * @see #setKeyType(String)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getMap_KeyType()
   * @model
   * @generated
   */
  String getKeyType();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Map#getKeyType <em>Key Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key Type</em>' attribute.
   * @see #getKeyType()
   * @generated
   */
  void setKeyType(String value);

  /**
   * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.spring.springConfigDsl.MapEntry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entries</em>' containment reference list.
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getMap_Entries()
   * @model containment="true"
   * @generated
   */
  EList<MapEntry> getEntries();

} // Map
