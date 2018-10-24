/**
 * generated by Xtext 2.14.0
 */
package org.xtext.spring.springConfigDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mbean Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.MbeanServer#getAgentId <em>Agent Id</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.MbeanServer#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getMbeanServer()
 * @model
 * @generated
 */
public interface MbeanServer extends Context
{
  /**
   * Returns the value of the '<em><b>Agent Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Agent Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agent Id</em>' attribute.
   * @see #setAgentId(String)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getMbeanServer_AgentId()
   * @model
   * @generated
   */
  String getAgentId();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.MbeanServer#getAgentId <em>Agent Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Agent Id</em>' attribute.
   * @see #getAgentId()
   * @generated
   */
  void setAgentId(String value);

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
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getMbeanServer_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.MbeanServer#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // MbeanServer
