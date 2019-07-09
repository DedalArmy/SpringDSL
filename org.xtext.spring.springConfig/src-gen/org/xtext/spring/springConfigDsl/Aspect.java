/**
 * generated by Xtext 2.17.0.M3
 */
package org.xtext.spring.springConfigDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.Aspect#getExposeProxy <em>Expose Proxy</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Aspect#getProxyTrajetClass <em>Proxy Trajet Class</em>}</li>
 * </ul>
 *
 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getAspect()
 * @model
 * @generated
 */
public interface Aspect extends EObject
{
  /**
   * Returns the value of the '<em><b>Expose Proxy</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.spring.springConfigDsl.sBoolean}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expose Proxy</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expose Proxy</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.sBoolean
   * @see #setExposeProxy(sBoolean)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getAspect_ExposeProxy()
   * @model
   * @generated
   */
  sBoolean getExposeProxy();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Aspect#getExposeProxy <em>Expose Proxy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expose Proxy</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.sBoolean
   * @see #getExposeProxy()
   * @generated
   */
  void setExposeProxy(sBoolean value);

  /**
   * Returns the value of the '<em><b>Proxy Trajet Class</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.spring.springConfigDsl.sBoolean}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Proxy Trajet Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proxy Trajet Class</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.sBoolean
   * @see #setProxyTrajetClass(sBoolean)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getAspect_ProxyTrajetClass()
   * @model
   * @generated
   */
  sBoolean getProxyTrajetClass();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Aspect#getProxyTrajetClass <em>Proxy Trajet Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Proxy Trajet Class</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.sBoolean
   * @see #getProxyTrajetClass()
   * @generated
   */
  void setProxyTrajetClass(sBoolean value);

} // Aspect
