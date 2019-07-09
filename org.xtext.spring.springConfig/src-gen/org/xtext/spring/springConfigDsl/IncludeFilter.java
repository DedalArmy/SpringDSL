/**
 * generated by Xtext 2.17.0.M3
 */
package org.xtext.spring.springConfigDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.IncludeFilter#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.IncludeFilter#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getIncludeFilter()
 * @model
 * @generated
 */
public interface IncludeFilter extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.spring.springConfigDsl.EnumTypeFilter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.EnumTypeFilter
   * @see #setType(EnumTypeFilter)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getIncludeFilter_Type()
   * @model
   * @generated
   */
  EnumTypeFilter getType();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.IncludeFilter#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.xtext.spring.springConfigDsl.EnumTypeFilter
   * @see #getType()
   * @generated
   */
  void setType(EnumTypeFilter value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' attribute.
   * @see #setExpression(String)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getIncludeFilter_Expression()
   * @model
   * @generated
   */
  String getExpression();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.IncludeFilter#getExpression <em>Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' attribute.
   * @see #getExpression()
   * @generated
   */
  void setExpression(String value);

} // IncludeFilter
