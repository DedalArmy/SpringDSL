/**
 * generated by Xtext 2.14.0
 */
package org.xtext.spring.springConfigDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.spring.springConfigDsl.SpringConfigDslPackage;
import org.xtext.spring.springConfigDsl.TxAdvise;
import org.xtext.spring.springConfigDsl.TxAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tx Advise</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.TxAdviseImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.TxAdviseImpl#getTransactionManager <em>Transaction Manager</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.TxAdviseImpl#getTxAttribute <em>Tx Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TxAdviseImpl extends MinimalEObjectImpl.Container implements TxAdvise
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getTransactionManager() <em>Transaction Manager</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransactionManager()
   * @generated
   * @ordered
   */
  protected static final String TRANSACTION_MANAGER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTransactionManager() <em>Transaction Manager</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransactionManager()
   * @generated
   * @ordered
   */
  protected String transactionManager = TRANSACTION_MANAGER_EDEFAULT;

  /**
   * The cached value of the '{@link #getTxAttribute() <em>Tx Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTxAttribute()
   * @generated
   * @ordered
   */
  protected TxAttribute txAttribute;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TxAdviseImpl()
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
    return SpringConfigDslPackage.Literals.TX_ADVISE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.TX_ADVISE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTransactionManager()
  {
    return transactionManager;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransactionManager(String newTransactionManager)
  {
    String oldTransactionManager = transactionManager;
    transactionManager = newTransactionManager;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.TX_ADVISE__TRANSACTION_MANAGER, oldTransactionManager, transactionManager));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TxAttribute getTxAttribute()
  {
    return txAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTxAttribute(TxAttribute newTxAttribute, NotificationChain msgs)
  {
    TxAttribute oldTxAttribute = txAttribute;
    txAttribute = newTxAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.TX_ADVISE__TX_ATTRIBUTE, oldTxAttribute, newTxAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTxAttribute(TxAttribute newTxAttribute)
  {
    if (newTxAttribute != txAttribute)
    {
      NotificationChain msgs = null;
      if (txAttribute != null)
        msgs = ((InternalEObject)txAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpringConfigDslPackage.TX_ADVISE__TX_ATTRIBUTE, null, msgs);
      if (newTxAttribute != null)
        msgs = ((InternalEObject)newTxAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpringConfigDslPackage.TX_ADVISE__TX_ATTRIBUTE, null, msgs);
      msgs = basicSetTxAttribute(newTxAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.TX_ADVISE__TX_ATTRIBUTE, newTxAttribute, newTxAttribute));
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
      case SpringConfigDslPackage.TX_ADVISE__TX_ATTRIBUTE:
        return basicSetTxAttribute(null, msgs);
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
      case SpringConfigDslPackage.TX_ADVISE__NAME:
        return getName();
      case SpringConfigDslPackage.TX_ADVISE__TRANSACTION_MANAGER:
        return getTransactionManager();
      case SpringConfigDslPackage.TX_ADVISE__TX_ATTRIBUTE:
        return getTxAttribute();
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
      case SpringConfigDslPackage.TX_ADVISE__NAME:
        setName((String)newValue);
        return;
      case SpringConfigDslPackage.TX_ADVISE__TRANSACTION_MANAGER:
        setTransactionManager((String)newValue);
        return;
      case SpringConfigDslPackage.TX_ADVISE__TX_ATTRIBUTE:
        setTxAttribute((TxAttribute)newValue);
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
      case SpringConfigDslPackage.TX_ADVISE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SpringConfigDslPackage.TX_ADVISE__TRANSACTION_MANAGER:
        setTransactionManager(TRANSACTION_MANAGER_EDEFAULT);
        return;
      case SpringConfigDslPackage.TX_ADVISE__TX_ATTRIBUTE:
        setTxAttribute((TxAttribute)null);
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
      case SpringConfigDslPackage.TX_ADVISE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SpringConfigDslPackage.TX_ADVISE__TRANSACTION_MANAGER:
        return TRANSACTION_MANAGER_EDEFAULT == null ? transactionManager != null : !TRANSACTION_MANAGER_EDEFAULT.equals(transactionManager);
      case SpringConfigDslPackage.TX_ADVISE__TX_ATTRIBUTE:
        return txAttribute != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", transactionManager: ");
    result.append(transactionManager);
    result.append(')');
    return result.toString();
  }

} //TxAdviseImpl
