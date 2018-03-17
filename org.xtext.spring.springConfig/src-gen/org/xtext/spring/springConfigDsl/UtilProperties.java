/**
 * generated by Xtext 2.12.0
 */
package org.xtext.spring.springConfigDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Util Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.UtilProperties#getPropertyfile <em>Propertyfile</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.UtilProperties#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.UtilProperties#getIgnoreResourceNotFound <em>Ignore Resource Not Found</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.UtilProperties#getLocalOverride <em>Local Override</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.UtilProperties#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getUtilProperties()
 * @model
 * @generated
 */
public interface UtilProperties extends Props
{
  /**
   * Returns the value of the '<em><b>Propertyfile</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Propertyfile</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Propertyfile</em>' containment reference.
   * @see #setPropertyfile(PropertyFile)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getUtilProperties_Propertyfile()
   * @model containment="true"
   * @generated
   */
  PropertyFile getPropertyfile();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.UtilProperties#getPropertyfile <em>Propertyfile</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Propertyfile</em>' containment reference.
   * @see #getPropertyfile()
   * @generated
   */
  void setPropertyfile(PropertyFile value);

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
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getUtilProperties_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.UtilProperties#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Ignore Resource Not Found</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.spring.springConfigDsl.sBoolean}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ignore Resource Not Found</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ignore Resource Not Found</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.sBoolean
   * @see #setIgnoreResourceNotFound(sBoolean)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getUtilProperties_IgnoreResourceNotFound()
   * @model
   * @generated
   */
  sBoolean getIgnoreResourceNotFound();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.UtilProperties#getIgnoreResourceNotFound <em>Ignore Resource Not Found</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ignore Resource Not Found</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.sBoolean
   * @see #getIgnoreResourceNotFound()
   * @generated
   */
  void setIgnoreResourceNotFound(sBoolean value);

  /**
   * Returns the value of the '<em><b>Local Override</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.spring.springConfigDsl.sBoolean}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Local Override</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Local Override</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.sBoolean
   * @see #setLocalOverride(sBoolean)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getUtilProperties_LocalOverride()
   * @model
   * @generated
   */
  sBoolean getLocalOverride();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.UtilProperties#getLocalOverride <em>Local Override</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Local Override</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.sBoolean
   * @see #getLocalOverride()
   * @generated
   */
  void setLocalOverride(sBoolean value);

  /**
   * Returns the value of the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scope</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scope</em>' attribute.
   * @see #setScope(String)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getUtilProperties_Scope()
   * @model
   * @generated
   */
  String getScope();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.UtilProperties#getScope <em>Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scope</em>' attribute.
   * @see #getScope()
   * @generated
   */
  void setScope(String value);

} // UtilProperties
