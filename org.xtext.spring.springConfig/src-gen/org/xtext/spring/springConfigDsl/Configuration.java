/**
 * generated by Xtext 2.14.0
 */
package org.xtext.spring.springConfigDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.Configuration#getDefaultAutowire <em>Default Autowire</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Configuration#getDefaultInitMethod <em>Default Init Method</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Configuration#getDefaultAutowireCandidates <em>Default Autowire Candidates</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Configuration#getDefaultDestroyMethod <em>Default Destroy Method</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Configuration#getDefaultLazyInit <em>Default Lazy Init</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Configuration#getDefaultMerge <em>Default Merge</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Configuration#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Configuration#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Configuration#getComponents <em>Components</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Configuration#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Configuration#getImports <em>Imports</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Configuration#getContexts <em>Contexts</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Configuration#getMvcs <em>Mvcs</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Configuration#getAspects <em>Aspects</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Configuration#getUtilConstants <em>Util Constants</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Configuration#getUtilLists <em>Util Lists</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Configuration#getUtilMaps <em>Util Maps</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Configuration#getUtilProperties <em>Util Properties</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Configuration#getUtilSets <em>Util Sets</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Configuration#getUtilPropertiesPath <em>Util Properties Path</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Configuration#getTxAdvices <em>Tx Advices</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Configuration#getTxJtaTransactionManager <em>Tx Jta Transaction Manager</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Configuration#getConfigurationComposite <em>Configuration Composite</em>}</li>
 * </ul>
 *
 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject
{
  /**
   * Returns the value of the '<em><b>Default Autowire</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.spring.springConfigDsl.AutoWiredType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Autowire</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Autowire</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.AutoWiredType
   * @see #setDefaultAutowire(AutoWiredType)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getConfiguration_DefaultAutowire()
   * @model
   * @generated
   */
  AutoWiredType getDefaultAutowire();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Configuration#getDefaultAutowire <em>Default Autowire</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Autowire</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.AutoWiredType
   * @see #getDefaultAutowire()
   * @generated
   */
  void setDefaultAutowire(AutoWiredType value);

  /**
   * Returns the value of the '<em><b>Default Init Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Init Method</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Init Method</em>' attribute.
   * @see #setDefaultInitMethod(String)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getConfiguration_DefaultInitMethod()
   * @model
   * @generated
   */
  String getDefaultInitMethod();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Configuration#getDefaultInitMethod <em>Default Init Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Init Method</em>' attribute.
   * @see #getDefaultInitMethod()
   * @generated
   */
  void setDefaultInitMethod(String value);

  /**
   * Returns the value of the '<em><b>Default Autowire Candidates</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Autowire Candidates</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Autowire Candidates</em>' attribute.
   * @see #setDefaultAutowireCandidates(String)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getConfiguration_DefaultAutowireCandidates()
   * @model
   * @generated
   */
  String getDefaultAutowireCandidates();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Configuration#getDefaultAutowireCandidates <em>Default Autowire Candidates</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Autowire Candidates</em>' attribute.
   * @see #getDefaultAutowireCandidates()
   * @generated
   */
  void setDefaultAutowireCandidates(String value);

  /**
   * Returns the value of the '<em><b>Default Destroy Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Destroy Method</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Destroy Method</em>' attribute.
   * @see #setDefaultDestroyMethod(String)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getConfiguration_DefaultDestroyMethod()
   * @model
   * @generated
   */
  String getDefaultDestroyMethod();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Configuration#getDefaultDestroyMethod <em>Default Destroy Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Destroy Method</em>' attribute.
   * @see #getDefaultDestroyMethod()
   * @generated
   */
  void setDefaultDestroyMethod(String value);

  /**
   * Returns the value of the '<em><b>Default Lazy Init</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.spring.springConfigDsl.DefaultableBoolean}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Lazy Init</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Lazy Init</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.DefaultableBoolean
   * @see #setDefaultLazyInit(DefaultableBoolean)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getConfiguration_DefaultLazyInit()
   * @model
   * @generated
   */
  DefaultableBoolean getDefaultLazyInit();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Configuration#getDefaultLazyInit <em>Default Lazy Init</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Lazy Init</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.DefaultableBoolean
   * @see #getDefaultLazyInit()
   * @generated
   */
  void setDefaultLazyInit(DefaultableBoolean value);

  /**
   * Returns the value of the '<em><b>Default Merge</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.spring.springConfigDsl.DefaultableBoolean}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Merge</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Merge</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.DefaultableBoolean
   * @see #setDefaultMerge(DefaultableBoolean)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getConfiguration_DefaultMerge()
   * @model
   * @generated
   */
  DefaultableBoolean getDefaultMerge();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Configuration#getDefaultMerge <em>Default Merge</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Merge</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.DefaultableBoolean
   * @see #getDefaultMerge()
   * @generated
   */
  void setDefaultMerge(DefaultableBoolean value);

  /**
   * Returns the value of the '<em><b>Profile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Profile</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Profile</em>' attribute.
   * @see #setProfile(String)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getConfiguration_Profile()
   * @model
   * @generated
   */
  String getProfile();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Configuration#getProfile <em>Profile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Profile</em>' attribute.
   * @see #getProfile()
   * @generated
   */
  void setProfile(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getConfiguration_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Configuration#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.spring.springConfigDsl.Component}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getConfiguration_Components()
   * @model containment="true"
   * @generated
   */
  EList<Component> getComponents();

  /**
   * Returns the value of the '<em><b>Alias</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.spring.springConfigDsl.Alias}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alias</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alias</em>' containment reference list.
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getConfiguration_Alias()
   * @model containment="true"
   * @generated
   */
  EList<Alias> getAlias();

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.spring.springConfigDsl.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getConfiguration_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Contexts</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.spring.springConfigDsl.Context}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contexts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contexts</em>' containment reference list.
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getConfiguration_Contexts()
   * @model containment="true"
   * @generated
   */
  EList<Context> getContexts();

  /**
   * Returns the value of the '<em><b>Mvcs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.spring.springConfigDsl.MVC}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mvcs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mvcs</em>' containment reference list.
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getConfiguration_Mvcs()
   * @model containment="true"
   * @generated
   */
  EList<MVC> getMvcs();

  /**
   * Returns the value of the '<em><b>Aspects</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.spring.springConfigDsl.Aspect}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aspects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aspects</em>' containment reference list.
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getConfiguration_Aspects()
   * @model containment="true"
   * @generated
   */
  EList<Aspect> getAspects();

  /**
   * Returns the value of the '<em><b>Util Constants</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.spring.springConfigDsl.UtilConstant}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Util Constants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Util Constants</em>' containment reference list.
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getConfiguration_UtilConstants()
   * @model containment="true"
   * @generated
   */
  EList<UtilConstant> getUtilConstants();

  /**
   * Returns the value of the '<em><b>Util Lists</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.spring.springConfigDsl.UtilList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Util Lists</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Util Lists</em>' containment reference list.
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getConfiguration_UtilLists()
   * @model containment="true"
   * @generated
   */
  EList<UtilList> getUtilLists();

  /**
   * Returns the value of the '<em><b>Util Maps</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.spring.springConfigDsl.UtilMap}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Util Maps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Util Maps</em>' containment reference list.
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getConfiguration_UtilMaps()
   * @model containment="true"
   * @generated
   */
  EList<UtilMap> getUtilMaps();

  /**
   * Returns the value of the '<em><b>Util Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.spring.springConfigDsl.UtilProperties}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Util Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Util Properties</em>' containment reference list.
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getConfiguration_UtilProperties()
   * @model containment="true"
   * @generated
   */
  EList<UtilProperties> getUtilProperties();

  /**
   * Returns the value of the '<em><b>Util Sets</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.spring.springConfigDsl.UtilSet}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Util Sets</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Util Sets</em>' containment reference list.
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getConfiguration_UtilSets()
   * @model containment="true"
   * @generated
   */
  EList<UtilSet> getUtilSets();

  /**
   * Returns the value of the '<em><b>Util Properties Path</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.spring.springConfigDsl.UtilPropertyPath}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Util Properties Path</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Util Properties Path</em>' containment reference list.
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getConfiguration_UtilPropertiesPath()
   * @model containment="true"
   * @generated
   */
  EList<UtilPropertyPath> getUtilPropertiesPath();

  /**
   * Returns the value of the '<em><b>Tx Advices</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.spring.springConfigDsl.TxAdvise}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tx Advices</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tx Advices</em>' containment reference list.
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getConfiguration_TxAdvices()
   * @model containment="true"
   * @generated
   */
  EList<TxAdvise> getTxAdvices();

  /**
   * Returns the value of the '<em><b>Tx Jta Transaction Manager</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.spring.springConfigDsl.TxJtaTransactionManager}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tx Jta Transaction Manager</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tx Jta Transaction Manager</em>' containment reference list.
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getConfiguration_TxJtaTransactionManager()
   * @model containment="true"
   * @generated
   */
  EList<TxJtaTransactionManager> getTxJtaTransactionManager();

  /**
   * Returns the value of the '<em><b>Configuration Composite</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.spring.springConfigDsl.Configuration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Configuration Composite</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Configuration Composite</em>' containment reference list.
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getConfiguration_ConfigurationComposite()
   * @model containment="true"
   * @generated
   */
  EList<Configuration> getConfigurationComposite();

} // Configuration
