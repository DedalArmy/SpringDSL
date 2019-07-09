/**
 * generated by Xtext 2.17.0.M3
 */
package org.xtext.spring.springConfigDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.spring.springConfigDsl.AopScopedProxy;
import org.xtext.spring.springConfigDsl.SpringConfigDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aop Scoped Proxy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.AopScopedProxyImpl#getProxyTargetClass <em>Proxy Target Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AopScopedProxyImpl extends MinimalEObjectImpl.Container implements AopScopedProxy
{
  /**
   * The default value of the '{@link #getProxyTargetClass() <em>Proxy Target Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProxyTargetClass()
   * @generated
   * @ordered
   */
  protected static final String PROXY_TARGET_CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProxyTargetClass() <em>Proxy Target Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProxyTargetClass()
   * @generated
   * @ordered
   */
  protected String proxyTargetClass = PROXY_TARGET_CLASS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AopScopedProxyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SpringConfigDslPackage.Literals.AOP_SCOPED_PROXY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getProxyTargetClass()
  {
    return proxyTargetClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProxyTargetClass(String newProxyTargetClass)
  {
    String oldProxyTargetClass = proxyTargetClass;
    proxyTargetClass = newProxyTargetClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.AOP_SCOPED_PROXY__PROXY_TARGET_CLASS, oldProxyTargetClass, proxyTargetClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SpringConfigDslPackage.AOP_SCOPED_PROXY__PROXY_TARGET_CLASS:
        return getProxyTargetClass();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SpringConfigDslPackage.AOP_SCOPED_PROXY__PROXY_TARGET_CLASS:
        setProxyTargetClass((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SpringConfigDslPackage.AOP_SCOPED_PROXY__PROXY_TARGET_CLASS:
        setProxyTargetClass(PROXY_TARGET_CLASS_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SpringConfigDslPackage.AOP_SCOPED_PROXY__PROXY_TARGET_CLASS:
        return PROXY_TARGET_CLASS_EDEFAULT == null ? proxyTargetClass != null : !PROXY_TARGET_CLASS_EDEFAULT.equals(proxyTargetClass);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (proxyTargetClass: ");
    result.append(proxyTargetClass);
    result.append(')');
    return result.toString();
  }

} //AopScopedProxyImpl
