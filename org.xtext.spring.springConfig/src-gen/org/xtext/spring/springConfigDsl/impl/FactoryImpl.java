/**
 * generated by Xtext 2.12.0
 */
package org.xtext.spring.springConfigDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.spring.springConfigDsl.Component;
import org.xtext.spring.springConfigDsl.Factory;
import org.xtext.spring.springConfigDsl.SpringConfigDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.FactoryImpl#getFactoryBean <em>Factory Bean</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactoryImpl extends ClassOrFactoryImpl implements Factory
{
  /**
   * The cached value of the '{@link #getFactoryBean() <em>Factory Bean</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactoryBean()
   * @generated
   * @ordered
   */
  protected Component factoryBean;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FactoryImpl()
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
    return SpringConfigDslPackage.Literals.FACTORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component getFactoryBean()
  {
    if (factoryBean != null && factoryBean.eIsProxy())
    {
      InternalEObject oldFactoryBean = (InternalEObject)factoryBean;
      factoryBean = (Component)eResolveProxy(oldFactoryBean);
      if (factoryBean != oldFactoryBean)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpringConfigDslPackage.FACTORY__FACTORY_BEAN, oldFactoryBean, factoryBean));
      }
    }
    return factoryBean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component basicGetFactoryBean()
  {
    return factoryBean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFactoryBean(Component newFactoryBean)
  {
    Component oldFactoryBean = factoryBean;
    factoryBean = newFactoryBean;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.FACTORY__FACTORY_BEAN, oldFactoryBean, factoryBean));
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
      case SpringConfigDslPackage.FACTORY__FACTORY_BEAN:
        if (resolve) return getFactoryBean();
        return basicGetFactoryBean();
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
      case SpringConfigDslPackage.FACTORY__FACTORY_BEAN:
        setFactoryBean((Component)newValue);
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
      case SpringConfigDslPackage.FACTORY__FACTORY_BEAN:
        setFactoryBean((Component)null);
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
      case SpringConfigDslPackage.FACTORY__FACTORY_BEAN:
        return factoryBean != null;
    }
    return super.eIsSet(featureID);
  }

} //FactoryImpl
