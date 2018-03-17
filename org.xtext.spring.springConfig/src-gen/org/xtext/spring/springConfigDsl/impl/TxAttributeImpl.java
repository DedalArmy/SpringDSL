/**
 * generated by Xtext 2.12.0
 */
package org.xtext.spring.springConfigDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.spring.springConfigDsl.SpringConfigDslPackage;
import org.xtext.spring.springConfigDsl.TxAttribute;
import org.xtext.spring.springConfigDsl.TxMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tx Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.TxAttributeImpl#getTxMethods <em>Tx Methods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TxAttributeImpl extends MinimalEObjectImpl.Container implements TxAttribute
{
  /**
   * The cached value of the '{@link #getTxMethods() <em>Tx Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTxMethods()
   * @generated
   * @ordered
   */
  protected EList<TxMethod> txMethods;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TxAttributeImpl()
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
    return SpringConfigDslPackage.Literals.TX_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TxMethod> getTxMethods()
  {
    if (txMethods == null)
    {
      txMethods = new EObjectContainmentEList<TxMethod>(TxMethod.class, this, SpringConfigDslPackage.TX_ATTRIBUTE__TX_METHODS);
    }
    return txMethods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SpringConfigDslPackage.TX_ATTRIBUTE__TX_METHODS:
        return ((InternalEList<?>)getTxMethods()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SpringConfigDslPackage.TX_ATTRIBUTE__TX_METHODS:
        return getTxMethods();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SpringConfigDslPackage.TX_ATTRIBUTE__TX_METHODS:
        getTxMethods().clear();
        getTxMethods().addAll((Collection<? extends TxMethod>)newValue);
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
      case SpringConfigDslPackage.TX_ATTRIBUTE__TX_METHODS:
        getTxMethods().clear();
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
      case SpringConfigDslPackage.TX_ATTRIBUTE__TX_METHODS:
        return txMethods != null && !txMethods.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TxAttributeImpl
