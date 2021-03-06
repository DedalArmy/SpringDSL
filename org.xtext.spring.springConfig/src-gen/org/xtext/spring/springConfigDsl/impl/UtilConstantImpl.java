/**
 * generated by Xtext 2.14.0
 */
package org.xtext.spring.springConfigDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.spring.springConfigDsl.SpringConfigDslPackage;
import org.xtext.spring.springConfigDsl.UtilConstant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Util Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.UtilConstantImpl#getStaticField <em>Static Field</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.UtilConstantImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UtilConstantImpl extends AttributeImpl implements UtilConstant
{
  /**
   * The default value of the '{@link #getStaticField() <em>Static Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStaticField()
   * @generated
   * @ordered
   */
  protected static final String STATIC_FIELD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStaticField() <em>Static Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStaticField()
   * @generated
   * @ordered
   */
  protected String staticField = STATIC_FIELD_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UtilConstantImpl()
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
    return SpringConfigDslPackage.Literals.UTIL_CONSTANT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStaticField()
  {
    return staticField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStaticField(String newStaticField)
  {
    String oldStaticField = staticField;
    staticField = newStaticField;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.UTIL_CONSTANT__STATIC_FIELD, oldStaticField, staticField));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.UTIL_CONSTANT__NAME, oldName, name));
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
      case SpringConfigDslPackage.UTIL_CONSTANT__STATIC_FIELD:
        return getStaticField();
      case SpringConfigDslPackage.UTIL_CONSTANT__NAME:
        return getName();
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
      case SpringConfigDslPackage.UTIL_CONSTANT__STATIC_FIELD:
        setStaticField((String)newValue);
        return;
      case SpringConfigDslPackage.UTIL_CONSTANT__NAME:
        setName((String)newValue);
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
      case SpringConfigDslPackage.UTIL_CONSTANT__STATIC_FIELD:
        setStaticField(STATIC_FIELD_EDEFAULT);
        return;
      case SpringConfigDslPackage.UTIL_CONSTANT__NAME:
        setName(NAME_EDEFAULT);
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
      case SpringConfigDslPackage.UTIL_CONSTANT__STATIC_FIELD:
        return STATIC_FIELD_EDEFAULT == null ? staticField != null : !STATIC_FIELD_EDEFAULT.equals(staticField);
      case SpringConfigDslPackage.UTIL_CONSTANT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (StaticField: ");
    result.append(staticField);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //UtilConstantImpl
