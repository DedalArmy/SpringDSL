/**
 * generated by Xtext 2.12.0
 */
package org.xtext.spring.springConfigDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aop Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.AopAspect#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.AopAspect#getOrder <em>Order</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.AopAspect#getBackingBeanRef <em>Backing Bean Ref</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.AopAspect#getAopPointcuts <em>Aop Pointcuts</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.AopAspect#getDeclaredParents <em>Declared Parents</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.AopAspect#getAdvises <em>Advises</em>}</li>
 * </ul>
 *
 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getAopAspect()
 * @model
 * @generated
 */
public interface AopAspect extends EObject
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
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getAopAspect_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.AopAspect#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Order</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Order</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Order</em>' attribute.
   * @see #setOrder(String)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getAopAspect_Order()
   * @model
   * @generated
   */
  String getOrder();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.AopAspect#getOrder <em>Order</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Order</em>' attribute.
   * @see #getOrder()
   * @generated
   */
  void setOrder(String value);

  /**
   * Returns the value of the '<em><b>Backing Bean Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Backing Bean Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Backing Bean Ref</em>' reference.
   * @see #setBackingBeanRef(Component)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getAopAspect_BackingBeanRef()
   * @model
   * @generated
   */
  Component getBackingBeanRef();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.AopAspect#getBackingBeanRef <em>Backing Bean Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Backing Bean Ref</em>' reference.
   * @see #getBackingBeanRef()
   * @generated
   */
  void setBackingBeanRef(Component value);

  /**
   * Returns the value of the '<em><b>Aop Pointcuts</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.spring.springConfigDsl.AopPointcut}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aop Pointcuts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aop Pointcuts</em>' containment reference list.
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getAopAspect_AopPointcuts()
   * @model containment="true"
   * @generated
   */
  EList<AopPointcut> getAopPointcuts();

  /**
   * Returns the value of the '<em><b>Declared Parents</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.spring.springConfigDsl.DeclareParents}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declared Parents</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declared Parents</em>' containment reference list.
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getAopAspect_DeclaredParents()
   * @model containment="true"
   * @generated
   */
  EList<DeclareParents> getDeclaredParents();

  /**
   * Returns the value of the '<em><b>Advises</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.spring.springConfigDsl.Advise}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Advises</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Advises</em>' containment reference list.
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getAopAspect_Advises()
   * @model containment="true"
   * @generated
   */
  EList<Advise> getAdvises();

} // AopAspect