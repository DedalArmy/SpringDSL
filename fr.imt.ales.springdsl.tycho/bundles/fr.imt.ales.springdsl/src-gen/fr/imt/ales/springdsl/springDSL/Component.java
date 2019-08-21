/**
 * generated by Xtext 2.18.0
 */
package fr.imt.ales.springdsl.springDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.Component#getName <em>Name</em>}</li>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.Component#getNames <em>Names</em>}</li>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.Component#getClass_ <em>Class</em>}</li>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.Component#getFeatures <em>Features</em>}</li>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.Component#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.Component#getAutowireCandidate <em>Autowire Candidate</em>}</li>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.Component#getAutowire <em>Autowire</em>}</li>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.Component#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.Component#getDetroyMethod <em>Detroy Method</em>}</li>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.Component#getInitMethod <em>Init Method</em>}</li>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.Component#getLazyInit <em>Lazy Init</em>}</li>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.Component#getParent <em>Parent</em>}</li>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.Component#getPrimary <em>Primary</em>}</li>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.Component#getScope <em>Scope</em>}</li>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.Component#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.Component#getLookupMethods <em>Lookup Methods</em>}</li>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.Component#getQualifiers <em>Qualifiers</em>}</li>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.Component#getMeta <em>Meta</em>}</li>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.Component#getAopScopedProxy <em>Aop Scoped Proxy</em>}</li>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.Component#getUtilPropertiesPath <em>Util Properties Path</em>}</li>
 * </ul>
 *
 * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends AbstractArtefact
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getComponent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.imt.ales.springdsl.springDSL.Component#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Names</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Names</em>' attribute list.
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getComponent_Names()
   * @model unique="false"
   * @generated
   */
  EList<String> getNames();

  /**
   * Returns the value of the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' containment reference.
   * @see #setClass(CreationMethod)
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getComponent_Class()
   * @model containment="true"
   * @generated
   */
  CreationMethod getClass_();

  /**
   * Sets the value of the '{@link fr.imt.ales.springdsl.springDSL.Component#getClass_ <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' containment reference.
   * @see #getClass_()
   * @generated
   */
  void setClass(CreationMethod value);

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link fr.imt.ales.springdsl.springDSL.Feature}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getComponent_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * The literals are from the enumeration {@link fr.imt.ales.springdsl.springDSL.sBoolean}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see fr.imt.ales.springdsl.springDSL.sBoolean
   * @see #setAbstract(sBoolean)
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getComponent_Abstract()
   * @model
   * @generated
   */
  sBoolean getAbstract();

  /**
   * Sets the value of the '{@link fr.imt.ales.springdsl.springDSL.Component#getAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see fr.imt.ales.springdsl.springDSL.sBoolean
   * @see #getAbstract()
   * @generated
   */
  void setAbstract(sBoolean value);

  /**
   * Returns the value of the '<em><b>Autowire Candidate</b></em>' attribute.
   * The literals are from the enumeration {@link fr.imt.ales.springdsl.springDSL.DefaultableBoolean}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Autowire Candidate</em>' attribute.
   * @see fr.imt.ales.springdsl.springDSL.DefaultableBoolean
   * @see #setAutowireCandidate(DefaultableBoolean)
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getComponent_AutowireCandidate()
   * @model
   * @generated
   */
  DefaultableBoolean getAutowireCandidate();

  /**
   * Sets the value of the '{@link fr.imt.ales.springdsl.springDSL.Component#getAutowireCandidate <em>Autowire Candidate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Autowire Candidate</em>' attribute.
   * @see fr.imt.ales.springdsl.springDSL.DefaultableBoolean
   * @see #getAutowireCandidate()
   * @generated
   */
  void setAutowireCandidate(DefaultableBoolean value);

  /**
   * Returns the value of the '<em><b>Autowire</b></em>' attribute.
   * The literals are from the enumeration {@link fr.imt.ales.springdsl.springDSL.DefaultableBoolean}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Autowire</em>' attribute.
   * @see fr.imt.ales.springdsl.springDSL.DefaultableBoolean
   * @see #setAutowire(DefaultableBoolean)
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getComponent_Autowire()
   * @model
   * @generated
   */
  DefaultableBoolean getAutowire();

  /**
   * Sets the value of the '{@link fr.imt.ales.springdsl.springDSL.Component#getAutowire <em>Autowire</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Autowire</em>' attribute.
   * @see fr.imt.ales.springdsl.springDSL.DefaultableBoolean
   * @see #getAutowire()
   * @generated
   */
  void setAutowire(DefaultableBoolean value);

  /**
   * Returns the value of the '<em><b>Depends On</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Depends On</em>' reference.
   * @see #setDependsOn(Component)
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getComponent_DependsOn()
   * @model
   * @generated
   */
  Component getDependsOn();

  /**
   * Sets the value of the '{@link fr.imt.ales.springdsl.springDSL.Component#getDependsOn <em>Depends On</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Depends On</em>' reference.
   * @see #getDependsOn()
   * @generated
   */
  void setDependsOn(Component value);

  /**
   * Returns the value of the '<em><b>Detroy Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Detroy Method</em>' attribute.
   * @see #setDetroyMethod(String)
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getComponent_DetroyMethod()
   * @model
   * @generated
   */
  String getDetroyMethod();

  /**
   * Sets the value of the '{@link fr.imt.ales.springdsl.springDSL.Component#getDetroyMethod <em>Detroy Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Detroy Method</em>' attribute.
   * @see #getDetroyMethod()
   * @generated
   */
  void setDetroyMethod(String value);

  /**
   * Returns the value of the '<em><b>Init Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init Method</em>' attribute.
   * @see #setInitMethod(String)
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getComponent_InitMethod()
   * @model
   * @generated
   */
  String getInitMethod();

  /**
   * Sets the value of the '{@link fr.imt.ales.springdsl.springDSL.Component#getInitMethod <em>Init Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init Method</em>' attribute.
   * @see #getInitMethod()
   * @generated
   */
  void setInitMethod(String value);

  /**
   * Returns the value of the '<em><b>Lazy Init</b></em>' attribute.
   * The literals are from the enumeration {@link fr.imt.ales.springdsl.springDSL.DefaultableBoolean}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lazy Init</em>' attribute.
   * @see fr.imt.ales.springdsl.springDSL.DefaultableBoolean
   * @see #setLazyInit(DefaultableBoolean)
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getComponent_LazyInit()
   * @model
   * @generated
   */
  DefaultableBoolean getLazyInit();

  /**
   * Sets the value of the '{@link fr.imt.ales.springdsl.springDSL.Component#getLazyInit <em>Lazy Init</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lazy Init</em>' attribute.
   * @see fr.imt.ales.springdsl.springDSL.DefaultableBoolean
   * @see #getLazyInit()
   * @generated
   */
  void setLazyInit(DefaultableBoolean value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(Component)
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getComponent_Parent()
   * @model
   * @generated
   */
  Component getParent();

  /**
   * Sets the value of the '{@link fr.imt.ales.springdsl.springDSL.Component#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(Component value);

  /**
   * Returns the value of the '<em><b>Primary</b></em>' attribute.
   * The literals are from the enumeration {@link fr.imt.ales.springdsl.springDSL.sBoolean}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primary</em>' attribute.
   * @see fr.imt.ales.springdsl.springDSL.sBoolean
   * @see #setPrimary(sBoolean)
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getComponent_Primary()
   * @model
   * @generated
   */
  sBoolean getPrimary();

  /**
   * Sets the value of the '{@link fr.imt.ales.springdsl.springDSL.Component#getPrimary <em>Primary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primary</em>' attribute.
   * @see fr.imt.ales.springdsl.springDSL.sBoolean
   * @see #getPrimary()
   * @generated
   */
  void setPrimary(sBoolean value);

  /**
   * Returns the value of the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scope</em>' attribute.
   * @see #setScope(String)
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getComponent_Scope()
   * @model
   * @generated
   */
  String getScope();

  /**
   * Sets the value of the '{@link fr.imt.ales.springdsl.springDSL.Component#getScope <em>Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scope</em>' attribute.
   * @see #getScope()
   * @generated
   */
  void setScope(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getComponent_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link fr.imt.ales.springdsl.springDSL.Component#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Lookup Methods</b></em>' containment reference list.
   * The list contents are of type {@link fr.imt.ales.springdsl.springDSL.LookupMethod}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lookup Methods</em>' containment reference list.
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getComponent_LookupMethods()
   * @model containment="true"
   * @generated
   */
  EList<LookupMethod> getLookupMethods();

  /**
   * Returns the value of the '<em><b>Qualifiers</b></em>' containment reference list.
   * The list contents are of type {@link fr.imt.ales.springdsl.springDSL.Qualifier}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualifiers</em>' containment reference list.
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getComponent_Qualifiers()
   * @model containment="true"
   * @generated
   */
  EList<Qualifier> getQualifiers();

  /**
   * Returns the value of the '<em><b>Meta</b></em>' containment reference list.
   * The list contents are of type {@link fr.imt.ales.springdsl.springDSL.Meta}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta</em>' containment reference list.
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getComponent_Meta()
   * @model containment="true"
   * @generated
   */
  EList<Meta> getMeta();

  /**
   * Returns the value of the '<em><b>Aop Scoped Proxy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aop Scoped Proxy</em>' containment reference.
   * @see #setAopScopedProxy(AopScopedProxy)
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getComponent_AopScopedProxy()
   * @model containment="true"
   * @generated
   */
  AopScopedProxy getAopScopedProxy();

  /**
   * Sets the value of the '{@link fr.imt.ales.springdsl.springDSL.Component#getAopScopedProxy <em>Aop Scoped Proxy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aop Scoped Proxy</em>' containment reference.
   * @see #getAopScopedProxy()
   * @generated
   */
  void setAopScopedProxy(AopScopedProxy value);

  /**
   * Returns the value of the '<em><b>Util Properties Path</b></em>' containment reference list.
   * The list contents are of type {@link fr.imt.ales.springdsl.springDSL.UtilPropertyPath}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Util Properties Path</em>' containment reference list.
   * @see fr.imt.ales.springdsl.springDSL.SpringDSLPackage#getComponent_UtilPropertiesPath()
   * @model containment="true"
   * @generated
   */
  EList<UtilPropertyPath> getUtilPropertiesPath();

} // Component