/**
 * generated by Xtext 2.12.0
 */
package org.xtext.spring.springConfigDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.spring.springConfigDsl.SpringConfigDslPackage;
import org.xtext.spring.springConfigDsl.UtilMap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Util Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.UtilMapImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.UtilMapImpl#getMapClass <em>Map Class</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.UtilMapImpl#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UtilMapImpl extends MapImpl implements UtilMap
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
   * The default value of the '{@link #getMapClass() <em>Map Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapClass()
   * @generated
   * @ordered
   */
  protected static final String MAP_CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMapClass() <em>Map Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapClass()
   * @generated
   * @ordered
   */
  protected String mapClass = MAP_CLASS_EDEFAULT;

  /**
   * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScope()
   * @generated
   * @ordered
   */
  protected static final String SCOPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScope()
   * @generated
   * @ordered
   */
  protected String scope = SCOPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UtilMapImpl()
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
    return SpringConfigDslPackage.Literals.UTIL_MAP;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.UTIL_MAP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMapClass()
  {
    return mapClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMapClass(String newMapClass)
  {
    String oldMapClass = mapClass;
    mapClass = newMapClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.UTIL_MAP__MAP_CLASS, oldMapClass, mapClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getScope()
  {
    return scope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScope(String newScope)
  {
    String oldScope = scope;
    scope = newScope;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.UTIL_MAP__SCOPE, oldScope, scope));
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
      case SpringConfigDslPackage.UTIL_MAP__NAME:
        return getName();
      case SpringConfigDslPackage.UTIL_MAP__MAP_CLASS:
        return getMapClass();
      case SpringConfigDslPackage.UTIL_MAP__SCOPE:
        return getScope();
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
      case SpringConfigDslPackage.UTIL_MAP__NAME:
        setName((String)newValue);
        return;
      case SpringConfigDslPackage.UTIL_MAP__MAP_CLASS:
        setMapClass((String)newValue);
        return;
      case SpringConfigDslPackage.UTIL_MAP__SCOPE:
        setScope((String)newValue);
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
      case SpringConfigDslPackage.UTIL_MAP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SpringConfigDslPackage.UTIL_MAP__MAP_CLASS:
        setMapClass(MAP_CLASS_EDEFAULT);
        return;
      case SpringConfigDslPackage.UTIL_MAP__SCOPE:
        setScope(SCOPE_EDEFAULT);
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
      case SpringConfigDslPackage.UTIL_MAP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SpringConfigDslPackage.UTIL_MAP__MAP_CLASS:
        return MAP_CLASS_EDEFAULT == null ? mapClass != null : !MAP_CLASS_EDEFAULT.equals(mapClass);
      case SpringConfigDslPackage.UTIL_MAP__SCOPE:
        return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
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
    result.append(", mapClass: ");
    result.append(mapClass);
    result.append(", scope: ");
    result.append(scope);
    result.append(')');
    return result.toString();
  }

} //UtilMapImpl