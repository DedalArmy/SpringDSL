/**
 * generated by Xtext 2.12.0
 */
package org.xtext.spring.springConfigDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aop Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.AopConfig#getAopPointcuts <em>Aop Pointcuts</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.AopConfig#getAopAdvisors <em>Aop Advisors</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.AopConfig#getAspects <em>Aspects</em>}</li>
 * </ul>
 *
 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getAopConfig()
 * @model
 * @generated
 */
public interface AopConfig extends Aspect
{
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
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getAopConfig_AopPointcuts()
   * @model containment="true"
   * @generated
   */
  EList<AopPointcut> getAopPointcuts();

  /**
   * Returns the value of the '<em><b>Aop Advisors</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.spring.springConfigDsl.AopAdvisor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aop Advisors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aop Advisors</em>' containment reference list.
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getAopConfig_AopAdvisors()
   * @model containment="true"
   * @generated
   */
  EList<AopAdvisor> getAopAdvisors();

  /**
   * Returns the value of the '<em><b>Aspects</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.spring.springConfigDsl.AopAspect}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aspects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aspects</em>' containment reference list.
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getAopConfig_Aspects()
   * @model containment="true"
   * @generated
   */
  EList<AopAspect> getAspects();

} // AopConfig
