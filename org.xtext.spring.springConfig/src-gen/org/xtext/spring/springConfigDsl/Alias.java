/**
 * generated by Xtext 2.12.0
 */
package org.xtext.spring.springConfigDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alias</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.Alias#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.Alias#getAlias <em>Alias</em>}</li>
 * </ul>
 *
 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getAlias()
 * @model
 * @generated
 */
public interface Alias extends EObject
{
  /**
   * Returns the value of the '<em><b>Origin</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Origin</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Origin</em>' reference.
   * @see #setOrigin(Component)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getAlias_Origin()
   * @model
   * @generated
   */
  Component getOrigin();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Alias#getOrigin <em>Origin</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Origin</em>' reference.
   * @see #getOrigin()
   * @generated
   */
  void setOrigin(Component value);

  /**
   * Returns the value of the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alias</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alias</em>' attribute.
   * @see #setAlias(String)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getAlias_Alias()
   * @model
   * @generated
   */
  String getAlias();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.Alias#getAlias <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alias</em>' attribute.
   * @see #getAlias()
   * @generated
   */
  void setAlias(String value);

} // Alias