/**
 * generated by Xtext 2.18.0
 */
package fr.imt.ales.springdsl.springDSL.impl;

import fr.imt.ales.springdsl.springDSL.AfterReturning;
import fr.imt.ales.springdsl.springDSL.SpringDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>After Returning</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.impl.AfterReturningImpl#getReturningValue <em>Returning Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AfterReturningImpl extends AdviseImpl implements AfterReturning
{
  /**
   * The default value of the '{@link #getReturningValue() <em>Returning Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturningValue()
   * @generated
   * @ordered
   */
  protected static final String RETURNING_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReturningValue() <em>Returning Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturningValue()
   * @generated
   * @ordered
   */
  protected String returningValue = RETURNING_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AfterReturningImpl()
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
    return SpringDSLPackage.Literals.AFTER_RETURNING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getReturningValue()
  {
    return returningValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReturningValue(String newReturningValue)
  {
    String oldReturningValue = returningValue;
    returningValue = newReturningValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringDSLPackage.AFTER_RETURNING__RETURNING_VALUE, oldReturningValue, returningValue));
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
      case SpringDSLPackage.AFTER_RETURNING__RETURNING_VALUE:
        return getReturningValue();
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
      case SpringDSLPackage.AFTER_RETURNING__RETURNING_VALUE:
        setReturningValue((String)newValue);
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
      case SpringDSLPackage.AFTER_RETURNING__RETURNING_VALUE:
        setReturningValue(RETURNING_VALUE_EDEFAULT);
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
      case SpringDSLPackage.AFTER_RETURNING__RETURNING_VALUE:
        return RETURNING_VALUE_EDEFAULT == null ? returningValue != null : !RETURNING_VALUE_EDEFAULT.equals(returningValue);
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
    result.append(" (returningValue: ");
    result.append(returningValue);
    result.append(')');
    return result.toString();
  }

} //AfterReturningImpl