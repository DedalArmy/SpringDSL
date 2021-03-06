/**
 * generated by Xtext 2.14.0
 */
package org.xtext.spring.springConfigDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.spring.springConfigDsl.Component;
import org.xtext.spring.springConfigDsl.ComponentScan;
import org.xtext.spring.springConfigDsl.EnumScopedProxy;
import org.xtext.spring.springConfigDsl.ExcludeFilter;
import org.xtext.spring.springConfigDsl.IncludeFilter;
import org.xtext.spring.springConfigDsl.SpringConfigDslPackage;
import org.xtext.spring.springConfigDsl.sBoolean;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Scan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.ComponentScanImpl#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.ComponentScanImpl#getAnnotationConfig <em>Annotation Config</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.ComponentScanImpl#getNameGeneratorBean <em>Name Generator Bean</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.ComponentScanImpl#getResourcePattern <em>Resource Pattern</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.ComponentScanImpl#getScopeResolver <em>Scope Resolver</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.ComponentScanImpl#getScopedProxy <em>Scoped Proxy</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.ComponentScanImpl#getUseDefaultFilters <em>Use Default Filters</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.ComponentScanImpl#getIncludeFilters <em>Include Filters</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.impl.ComponentScanImpl#getExcludeFilters <em>Exclude Filters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentScanImpl extends ContextImpl implements ComponentScan
{
  /**
   * The default value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasePackage()
   * @generated
   * @ordered
   */
  protected static final String BASE_PACKAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasePackage()
   * @generated
   * @ordered
   */
  protected String basePackage = BASE_PACKAGE_EDEFAULT;

  /**
   * The default value of the '{@link #getAnnotationConfig() <em>Annotation Config</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotationConfig()
   * @generated
   * @ordered
   */
  protected static final sBoolean ANNOTATION_CONFIG_EDEFAULT = sBoolean.FALSE;

  /**
   * The cached value of the '{@link #getAnnotationConfig() <em>Annotation Config</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotationConfig()
   * @generated
   * @ordered
   */
  protected sBoolean annotationConfig = ANNOTATION_CONFIG_EDEFAULT;

  /**
   * The cached value of the '{@link #getNameGeneratorBean() <em>Name Generator Bean</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameGeneratorBean()
   * @generated
   * @ordered
   */
  protected Component nameGeneratorBean;

  /**
   * The default value of the '{@link #getResourcePattern() <em>Resource Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourcePattern()
   * @generated
   * @ordered
   */
  protected static final String RESOURCE_PATTERN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getResourcePattern() <em>Resource Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourcePattern()
   * @generated
   * @ordered
   */
  protected String resourcePattern = RESOURCE_PATTERN_EDEFAULT;

  /**
   * The cached value of the '{@link #getScopeResolver() <em>Scope Resolver</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScopeResolver()
   * @generated
   * @ordered
   */
  protected Component scopeResolver;

  /**
   * The default value of the '{@link #getScopedProxy() <em>Scoped Proxy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScopedProxy()
   * @generated
   * @ordered
   */
  protected static final EnumScopedProxy SCOPED_PROXY_EDEFAULT = EnumScopedProxy.NO;

  /**
   * The cached value of the '{@link #getScopedProxy() <em>Scoped Proxy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScopedProxy()
   * @generated
   * @ordered
   */
  protected EnumScopedProxy scopedProxy = SCOPED_PROXY_EDEFAULT;

  /**
   * The default value of the '{@link #getUseDefaultFilters() <em>Use Default Filters</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUseDefaultFilters()
   * @generated
   * @ordered
   */
  protected static final sBoolean USE_DEFAULT_FILTERS_EDEFAULT = sBoolean.FALSE;

  /**
   * The cached value of the '{@link #getUseDefaultFilters() <em>Use Default Filters</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUseDefaultFilters()
   * @generated
   * @ordered
   */
  protected sBoolean useDefaultFilters = USE_DEFAULT_FILTERS_EDEFAULT;

  /**
   * The cached value of the '{@link #getIncludeFilters() <em>Include Filters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludeFilters()
   * @generated
   * @ordered
   */
  protected EList<IncludeFilter> includeFilters;

  /**
   * The cached value of the '{@link #getExcludeFilters() <em>Exclude Filters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExcludeFilters()
   * @generated
   * @ordered
   */
  protected EList<ExcludeFilter> excludeFilters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentScanImpl()
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
    return SpringConfigDslPackage.Literals.COMPONENT_SCAN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBasePackage()
  {
    return basePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBasePackage(String newBasePackage)
  {
    String oldBasePackage = basePackage;
    basePackage = newBasePackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.COMPONENT_SCAN__BASE_PACKAGE, oldBasePackage, basePackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sBoolean getAnnotationConfig()
  {
    return annotationConfig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnnotationConfig(sBoolean newAnnotationConfig)
  {
    sBoolean oldAnnotationConfig = annotationConfig;
    annotationConfig = newAnnotationConfig == null ? ANNOTATION_CONFIG_EDEFAULT : newAnnotationConfig;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.COMPONENT_SCAN__ANNOTATION_CONFIG, oldAnnotationConfig, annotationConfig));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component getNameGeneratorBean()
  {
    if (nameGeneratorBean != null && nameGeneratorBean.eIsProxy())
    {
      InternalEObject oldNameGeneratorBean = (InternalEObject)nameGeneratorBean;
      nameGeneratorBean = (Component)eResolveProxy(oldNameGeneratorBean);
      if (nameGeneratorBean != oldNameGeneratorBean)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpringConfigDslPackage.COMPONENT_SCAN__NAME_GENERATOR_BEAN, oldNameGeneratorBean, nameGeneratorBean));
      }
    }
    return nameGeneratorBean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component basicGetNameGeneratorBean()
  {
    return nameGeneratorBean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameGeneratorBean(Component newNameGeneratorBean)
  {
    Component oldNameGeneratorBean = nameGeneratorBean;
    nameGeneratorBean = newNameGeneratorBean;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.COMPONENT_SCAN__NAME_GENERATOR_BEAN, oldNameGeneratorBean, nameGeneratorBean));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getResourcePattern()
  {
    return resourcePattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResourcePattern(String newResourcePattern)
  {
    String oldResourcePattern = resourcePattern;
    resourcePattern = newResourcePattern;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.COMPONENT_SCAN__RESOURCE_PATTERN, oldResourcePattern, resourcePattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component getScopeResolver()
  {
    if (scopeResolver != null && scopeResolver.eIsProxy())
    {
      InternalEObject oldScopeResolver = (InternalEObject)scopeResolver;
      scopeResolver = (Component)eResolveProxy(oldScopeResolver);
      if (scopeResolver != oldScopeResolver)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpringConfigDslPackage.COMPONENT_SCAN__SCOPE_RESOLVER, oldScopeResolver, scopeResolver));
      }
    }
    return scopeResolver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component basicGetScopeResolver()
  {
    return scopeResolver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScopeResolver(Component newScopeResolver)
  {
    Component oldScopeResolver = scopeResolver;
    scopeResolver = newScopeResolver;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.COMPONENT_SCAN__SCOPE_RESOLVER, oldScopeResolver, scopeResolver));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumScopedProxy getScopedProxy()
  {
    return scopedProxy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScopedProxy(EnumScopedProxy newScopedProxy)
  {
    EnumScopedProxy oldScopedProxy = scopedProxy;
    scopedProxy = newScopedProxy == null ? SCOPED_PROXY_EDEFAULT : newScopedProxy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.COMPONENT_SCAN__SCOPED_PROXY, oldScopedProxy, scopedProxy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sBoolean getUseDefaultFilters()
  {
    return useDefaultFilters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUseDefaultFilters(sBoolean newUseDefaultFilters)
  {
    sBoolean oldUseDefaultFilters = useDefaultFilters;
    useDefaultFilters = newUseDefaultFilters == null ? USE_DEFAULT_FILTERS_EDEFAULT : newUseDefaultFilters;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpringConfigDslPackage.COMPONENT_SCAN__USE_DEFAULT_FILTERS, oldUseDefaultFilters, useDefaultFilters));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IncludeFilter> getIncludeFilters()
  {
    if (includeFilters == null)
    {
      includeFilters = new EObjectContainmentEList<IncludeFilter>(IncludeFilter.class, this, SpringConfigDslPackage.COMPONENT_SCAN__INCLUDE_FILTERS);
    }
    return includeFilters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExcludeFilter> getExcludeFilters()
  {
    if (excludeFilters == null)
    {
      excludeFilters = new EObjectContainmentEList<ExcludeFilter>(ExcludeFilter.class, this, SpringConfigDslPackage.COMPONENT_SCAN__EXCLUDE_FILTERS);
    }
    return excludeFilters;
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
      case SpringConfigDslPackage.COMPONENT_SCAN__INCLUDE_FILTERS:
        return ((InternalEList<?>)getIncludeFilters()).basicRemove(otherEnd, msgs);
      case SpringConfigDslPackage.COMPONENT_SCAN__EXCLUDE_FILTERS:
        return ((InternalEList<?>)getExcludeFilters()).basicRemove(otherEnd, msgs);
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
      case SpringConfigDslPackage.COMPONENT_SCAN__BASE_PACKAGE:
        return getBasePackage();
      case SpringConfigDslPackage.COMPONENT_SCAN__ANNOTATION_CONFIG:
        return getAnnotationConfig();
      case SpringConfigDslPackage.COMPONENT_SCAN__NAME_GENERATOR_BEAN:
        if (resolve) return getNameGeneratorBean();
        return basicGetNameGeneratorBean();
      case SpringConfigDslPackage.COMPONENT_SCAN__RESOURCE_PATTERN:
        return getResourcePattern();
      case SpringConfigDslPackage.COMPONENT_SCAN__SCOPE_RESOLVER:
        if (resolve) return getScopeResolver();
        return basicGetScopeResolver();
      case SpringConfigDslPackage.COMPONENT_SCAN__SCOPED_PROXY:
        return getScopedProxy();
      case SpringConfigDslPackage.COMPONENT_SCAN__USE_DEFAULT_FILTERS:
        return getUseDefaultFilters();
      case SpringConfigDslPackage.COMPONENT_SCAN__INCLUDE_FILTERS:
        return getIncludeFilters();
      case SpringConfigDslPackage.COMPONENT_SCAN__EXCLUDE_FILTERS:
        return getExcludeFilters();
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
      case SpringConfigDslPackage.COMPONENT_SCAN__BASE_PACKAGE:
        setBasePackage((String)newValue);
        return;
      case SpringConfigDslPackage.COMPONENT_SCAN__ANNOTATION_CONFIG:
        setAnnotationConfig((sBoolean)newValue);
        return;
      case SpringConfigDslPackage.COMPONENT_SCAN__NAME_GENERATOR_BEAN:
        setNameGeneratorBean((Component)newValue);
        return;
      case SpringConfigDslPackage.COMPONENT_SCAN__RESOURCE_PATTERN:
        setResourcePattern((String)newValue);
        return;
      case SpringConfigDslPackage.COMPONENT_SCAN__SCOPE_RESOLVER:
        setScopeResolver((Component)newValue);
        return;
      case SpringConfigDslPackage.COMPONENT_SCAN__SCOPED_PROXY:
        setScopedProxy((EnumScopedProxy)newValue);
        return;
      case SpringConfigDslPackage.COMPONENT_SCAN__USE_DEFAULT_FILTERS:
        setUseDefaultFilters((sBoolean)newValue);
        return;
      case SpringConfigDslPackage.COMPONENT_SCAN__INCLUDE_FILTERS:
        getIncludeFilters().clear();
        getIncludeFilters().addAll((Collection<? extends IncludeFilter>)newValue);
        return;
      case SpringConfigDslPackage.COMPONENT_SCAN__EXCLUDE_FILTERS:
        getExcludeFilters().clear();
        getExcludeFilters().addAll((Collection<? extends ExcludeFilter>)newValue);
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
      case SpringConfigDslPackage.COMPONENT_SCAN__BASE_PACKAGE:
        setBasePackage(BASE_PACKAGE_EDEFAULT);
        return;
      case SpringConfigDslPackage.COMPONENT_SCAN__ANNOTATION_CONFIG:
        setAnnotationConfig(ANNOTATION_CONFIG_EDEFAULT);
        return;
      case SpringConfigDslPackage.COMPONENT_SCAN__NAME_GENERATOR_BEAN:
        setNameGeneratorBean((Component)null);
        return;
      case SpringConfigDslPackage.COMPONENT_SCAN__RESOURCE_PATTERN:
        setResourcePattern(RESOURCE_PATTERN_EDEFAULT);
        return;
      case SpringConfigDslPackage.COMPONENT_SCAN__SCOPE_RESOLVER:
        setScopeResolver((Component)null);
        return;
      case SpringConfigDslPackage.COMPONENT_SCAN__SCOPED_PROXY:
        setScopedProxy(SCOPED_PROXY_EDEFAULT);
        return;
      case SpringConfigDslPackage.COMPONENT_SCAN__USE_DEFAULT_FILTERS:
        setUseDefaultFilters(USE_DEFAULT_FILTERS_EDEFAULT);
        return;
      case SpringConfigDslPackage.COMPONENT_SCAN__INCLUDE_FILTERS:
        getIncludeFilters().clear();
        return;
      case SpringConfigDslPackage.COMPONENT_SCAN__EXCLUDE_FILTERS:
        getExcludeFilters().clear();
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
      case SpringConfigDslPackage.COMPONENT_SCAN__BASE_PACKAGE:
        return BASE_PACKAGE_EDEFAULT == null ? basePackage != null : !BASE_PACKAGE_EDEFAULT.equals(basePackage);
      case SpringConfigDslPackage.COMPONENT_SCAN__ANNOTATION_CONFIG:
        return annotationConfig != ANNOTATION_CONFIG_EDEFAULT;
      case SpringConfigDslPackage.COMPONENT_SCAN__NAME_GENERATOR_BEAN:
        return nameGeneratorBean != null;
      case SpringConfigDslPackage.COMPONENT_SCAN__RESOURCE_PATTERN:
        return RESOURCE_PATTERN_EDEFAULT == null ? resourcePattern != null : !RESOURCE_PATTERN_EDEFAULT.equals(resourcePattern);
      case SpringConfigDslPackage.COMPONENT_SCAN__SCOPE_RESOLVER:
        return scopeResolver != null;
      case SpringConfigDslPackage.COMPONENT_SCAN__SCOPED_PROXY:
        return scopedProxy != SCOPED_PROXY_EDEFAULT;
      case SpringConfigDslPackage.COMPONENT_SCAN__USE_DEFAULT_FILTERS:
        return useDefaultFilters != USE_DEFAULT_FILTERS_EDEFAULT;
      case SpringConfigDslPackage.COMPONENT_SCAN__INCLUDE_FILTERS:
        return includeFilters != null && !includeFilters.isEmpty();
      case SpringConfigDslPackage.COMPONENT_SCAN__EXCLUDE_FILTERS:
        return excludeFilters != null && !excludeFilters.isEmpty();
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
    result.append(" (basePackage: ");
    result.append(basePackage);
    result.append(", annotationConfig: ");
    result.append(annotationConfig);
    result.append(", resourcePattern: ");
    result.append(resourcePattern);
    result.append(", scopedProxy: ");
    result.append(scopedProxy);
    result.append(", useDefaultFilters: ");
    result.append(useDefaultFilters);
    result.append(')');
    return result.toString();
  }

} //ComponentScanImpl
