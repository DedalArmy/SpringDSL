/**
 * generated by Xtext 2.14.0
 */
package org.xtext.spring.springConfigDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tx Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.TxMethod#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.TxMethod#getIsolation <em>Isolation</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.TxMethod#getNoRollBackFor <em>No Roll Back For</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.TxMethod#getPropagation <em>Propagation</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.TxMethod#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.TxMethod#getRollbackFor <em>Rollback For</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.TxMethod#getTimeOut <em>Time Out</em>}</li>
 * </ul>
 *
 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getTxMethod()
 * @model
 * @generated
 */
public interface TxMethod extends EObject
{
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
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getTxMethod_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.TxMethod#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Isolation</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.spring.springConfigDsl.EnumIsolation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Isolation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Isolation</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.EnumIsolation
   * @see #setIsolation(EnumIsolation)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getTxMethod_Isolation()
   * @model
   * @generated
   */
  EnumIsolation getIsolation();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.TxMethod#getIsolation <em>Isolation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Isolation</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.EnumIsolation
   * @see #getIsolation()
   * @generated
   */
  void setIsolation(EnumIsolation value);

  /**
   * Returns the value of the '<em><b>No Roll Back For</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>No Roll Back For</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>No Roll Back For</em>' attribute.
   * @see #setNoRollBackFor(String)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getTxMethod_NoRollBackFor()
   * @model
   * @generated
   */
  String getNoRollBackFor();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.TxMethod#getNoRollBackFor <em>No Roll Back For</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>No Roll Back For</em>' attribute.
   * @see #getNoRollBackFor()
   * @generated
   */
  void setNoRollBackFor(String value);

  /**
   * Returns the value of the '<em><b>Propagation</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.spring.springConfigDsl.EnumIsolation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Propagation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Propagation</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.EnumIsolation
   * @see #setPropagation(EnumIsolation)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getTxMethod_Propagation()
   * @model
   * @generated
   */
  EnumIsolation getPropagation();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.TxMethod#getPropagation <em>Propagation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Propagation</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.EnumIsolation
   * @see #getPropagation()
   * @generated
   */
  void setPropagation(EnumIsolation value);

  /**
   * Returns the value of the '<em><b>Read Only</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.spring.springConfigDsl.sBoolean}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Read Only</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Read Only</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.sBoolean
   * @see #setReadOnly(sBoolean)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getTxMethod_ReadOnly()
   * @model
   * @generated
   */
  sBoolean getReadOnly();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.TxMethod#getReadOnly <em>Read Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Read Only</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.sBoolean
   * @see #getReadOnly()
   * @generated
   */
  void setReadOnly(sBoolean value);

  /**
   * Returns the value of the '<em><b>Rollback For</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rollback For</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rollback For</em>' attribute.
   * @see #setRollbackFor(String)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getTxMethod_RollbackFor()
   * @model
   * @generated
   */
  String getRollbackFor();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.TxMethod#getRollbackFor <em>Rollback For</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rollback For</em>' attribute.
   * @see #getRollbackFor()
   * @generated
   */
  void setRollbackFor(String value);

  /**
   * Returns the value of the '<em><b>Time Out</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time Out</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time Out</em>' attribute.
   * @see #setTimeOut(String)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getTxMethod_TimeOut()
   * @model
   * @generated
   */
  String getTimeOut();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.TxMethod#getTimeOut <em>Time Out</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time Out</em>' attribute.
   * @see #getTimeOut()
   * @generated
   */
  void setTimeOut(String value);

} // TxMethod
