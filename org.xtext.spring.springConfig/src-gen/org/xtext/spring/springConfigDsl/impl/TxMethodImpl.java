/**
 * generated by Xtext 2.12.0
 */
package org.xtext.spring.springConfigDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.spring.springConfigDsl.EnumIsolation;
import org.xtext.spring.springConfigDsl.SpringConfigDslPackage;
import org.xtext.spring.springConfigDsl.TxMethod;
import org.xtext.spring.springConfigDsl.sBoolean;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tx Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.TxMethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.TxMethodImpl#getIsolation <em>Isolation</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.TxMethodImpl#getNoRollBackFor <em>No Roll Back For</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.TxMethodImpl#getPropagation <em>Propagation</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.TxMethodImpl#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.TxMethodImpl#getRollbackFor <em>Rollback For</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.TxMethodImpl#getTimeOut <em>Time Out</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TxMethodImpl extends MinimalEObjectImpl.Container implements TxMethod
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
   * The default value of the '{@link #getIsolation() <em>Isolation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsolation()
   * @generated
   * @ordered
   */
  protected static final EnumIsolation ISOLATION_EDEFAULT = EnumIsolation.DEFAULT;

  /**
   * The cached value of the '{@link #getIsolation() <em>Isolation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsolation()
   * @generated
   * @ordered
   */
  protected EnumIsolation isolation = ISOLATION_EDEFAULT;

  /**
   * The default value of the '{@link #getNoRollBackFor() <em>No Roll Back For</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNoRollBackFor()
   * @generated
   * @ordered
   */
  protected static final String NO_ROLL_BACK_FOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNoRollBackFor() <em>No Roll Back For</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNoRollBackFor()
   * @generated
   * @ordered
   */
  protected String noRollBackFor = NO_ROLL_BACK_FOR_EDEFAULT;

  /**
   * The default value of the '{@link #getPropagation() <em>Propagation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropagation()
   * @generated
   * @ordered
   */
  protected static final EnumIsolation PROPAGATION_EDEFAULT = EnumIsolation.DEFAULT;

  /**
   * The cached value of the '{@link #getPropagation() <em>Propagation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropagation()
   * @generated
   * @ordered
   */
  protected EnumIsolation propagation = PROPAGATION_EDEFAULT;

  /**
   * The default value of the '{@link #getReadOnly() <em>Read Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReadOnly()
   * @generated
   * @ordered
   */
  protected static final sBoolean READ_ONLY_EDEFAULT = sBoolean.FALSE;

  /**
   * The cached value of the '{@link #getReadOnly() <em>Read Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReadOnly()
   * @generated
   * @ordered
   */
  protected sBoolean readOnly = READ_ONLY_EDEFAULT;

  /**
   * The default value of the '{@link #getRollbackFor() <em>Rollback For</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRollbackFor()
   * @generated
   * @ordered
   */
  protected static final String ROLLBACK_FOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRollbackFor() <em>Rollback For</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRollbackFor()
   * @generated
   * @ordered
   */
  protected String rollbackFor = ROLLBACK_FOR_EDEFAULT;

  /**
   * The default value of the '{@link #getTimeOut() <em>Time Out</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeOut()
   * @generated
   * @ordered
   */
  protected static final String TIME_OUT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTimeOut() <em>Time Out</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeOut()
   * @generated
   * @ordered
   */
  protected String timeOut = TIME_OUT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TxMethodImpl()
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
    return SpringConfigDslPackage.Literals.TX_METHOD;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.TX_METHOD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumIsolation getIsolation()
  {
    return isolation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsolation(EnumIsolation newIsolation)
  {
    EnumIsolation oldIsolation = isolation;
    isolation = newIsolation == null ? ISOLATION_EDEFAULT : newIsolation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.TX_METHOD__ISOLATION, oldIsolation, isolation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNoRollBackFor()
  {
    return noRollBackFor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNoRollBackFor(String newNoRollBackFor)
  {
    String oldNoRollBackFor = noRollBackFor;
    noRollBackFor = newNoRollBackFor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.TX_METHOD__NO_ROLL_BACK_FOR, oldNoRollBackFor, noRollBackFor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumIsolation getPropagation()
  {
    return propagation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropagation(EnumIsolation newPropagation)
  {
    EnumIsolation oldPropagation = propagation;
    propagation = newPropagation == null ? PROPAGATION_EDEFAULT : newPropagation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.TX_METHOD__PROPAGATION, oldPropagation, propagation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sBoolean getReadOnly()
  {
    return readOnly;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReadOnly(sBoolean newReadOnly)
  {
    sBoolean oldReadOnly = readOnly;
    readOnly = newReadOnly == null ? READ_ONLY_EDEFAULT : newReadOnly;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.TX_METHOD__READ_ONLY, oldReadOnly, readOnly));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRollbackFor()
  {
    return rollbackFor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRollbackFor(String newRollbackFor)
  {
    String oldRollbackFor = rollbackFor;
    rollbackFor = newRollbackFor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.TX_METHOD__ROLLBACK_FOR, oldRollbackFor, rollbackFor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTimeOut()
  {
    return timeOut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimeOut(String newTimeOut)
  {
    String oldTimeOut = timeOut;
    timeOut = newTimeOut;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.TX_METHOD__TIME_OUT, oldTimeOut, timeOut));
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
      case SpringConfigDslPackage.TX_METHOD__NAME:
        return getName();
      case SpringConfigDslPackage.TX_METHOD__ISOLATION:
        return getIsolation();
      case SpringConfigDslPackage.TX_METHOD__NO_ROLL_BACK_FOR:
        return getNoRollBackFor();
      case SpringConfigDslPackage.TX_METHOD__PROPAGATION:
        return getPropagation();
      case SpringConfigDslPackage.TX_METHOD__READ_ONLY:
        return getReadOnly();
      case SpringConfigDslPackage.TX_METHOD__ROLLBACK_FOR:
        return getRollbackFor();
      case SpringConfigDslPackage.TX_METHOD__TIME_OUT:
        return getTimeOut();
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
      case SpringConfigDslPackage.TX_METHOD__NAME:
        setName((String)newValue);
        return;
      case SpringConfigDslPackage.TX_METHOD__ISOLATION:
        setIsolation((EnumIsolation)newValue);
        return;
      case SpringConfigDslPackage.TX_METHOD__NO_ROLL_BACK_FOR:
        setNoRollBackFor((String)newValue);
        return;
      case SpringConfigDslPackage.TX_METHOD__PROPAGATION:
        setPropagation((EnumIsolation)newValue);
        return;
      case SpringConfigDslPackage.TX_METHOD__READ_ONLY:
        setReadOnly((sBoolean)newValue);
        return;
      case SpringConfigDslPackage.TX_METHOD__ROLLBACK_FOR:
        setRollbackFor((String)newValue);
        return;
      case SpringConfigDslPackage.TX_METHOD__TIME_OUT:
        setTimeOut((String)newValue);
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
      case SpringConfigDslPackage.TX_METHOD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SpringConfigDslPackage.TX_METHOD__ISOLATION:
        setIsolation(ISOLATION_EDEFAULT);
        return;
      case SpringConfigDslPackage.TX_METHOD__NO_ROLL_BACK_FOR:
        setNoRollBackFor(NO_ROLL_BACK_FOR_EDEFAULT);
        return;
      case SpringConfigDslPackage.TX_METHOD__PROPAGATION:
        setPropagation(PROPAGATION_EDEFAULT);
        return;
      case SpringConfigDslPackage.TX_METHOD__READ_ONLY:
        setReadOnly(READ_ONLY_EDEFAULT);
        return;
      case SpringConfigDslPackage.TX_METHOD__ROLLBACK_FOR:
        setRollbackFor(ROLLBACK_FOR_EDEFAULT);
        return;
      case SpringConfigDslPackage.TX_METHOD__TIME_OUT:
        setTimeOut(TIME_OUT_EDEFAULT);
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
      case SpringConfigDslPackage.TX_METHOD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SpringConfigDslPackage.TX_METHOD__ISOLATION:
        return isolation != ISOLATION_EDEFAULT;
      case SpringConfigDslPackage.TX_METHOD__NO_ROLL_BACK_FOR:
        return NO_ROLL_BACK_FOR_EDEFAULT == null ? noRollBackFor != null : !NO_ROLL_BACK_FOR_EDEFAULT.equals(noRollBackFor);
      case SpringConfigDslPackage.TX_METHOD__PROPAGATION:
        return propagation != PROPAGATION_EDEFAULT;
      case SpringConfigDslPackage.TX_METHOD__READ_ONLY:
        return readOnly != READ_ONLY_EDEFAULT;
      case SpringConfigDslPackage.TX_METHOD__ROLLBACK_FOR:
        return ROLLBACK_FOR_EDEFAULT == null ? rollbackFor != null : !ROLLBACK_FOR_EDEFAULT.equals(rollbackFor);
      case SpringConfigDslPackage.TX_METHOD__TIME_OUT:
        return TIME_OUT_EDEFAULT == null ? timeOut != null : !TIME_OUT_EDEFAULT.equals(timeOut);
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", isolation: ");
    result.append(isolation);
    result.append(", noRollBackFor: ");
    result.append(noRollBackFor);
    result.append(", propagation: ");
    result.append(propagation);
    result.append(", readOnly: ");
    result.append(readOnly);
    result.append(", rollbackFor: ");
    result.append(rollbackFor);
    result.append(", timeOut: ");
    result.append(timeOut);
    result.append(')');
    return result.toString();
  }

} //TxMethodImpl