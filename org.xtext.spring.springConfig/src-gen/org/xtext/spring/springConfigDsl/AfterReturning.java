/**
 * generated by Xtext 2.14.0
 */
package org.xtext.spring.springConfigDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>After Returning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.AfterReturning#getReturningValue <em>Returning Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getAfterReturning()
 * @model
 * @generated
 */
public interface AfterReturning extends Advise
{
  /**
   * Returns the value of the '<em><b>Returning Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Returning Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Returning Value</em>' attribute.
   * @see #setReturningValue(String)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getAfterReturning_ReturningValue()
   * @model
   * @generated
   */
  String getReturningValue();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.AfterReturning#getReturningValue <em>Returning Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Returning Value</em>' attribute.
   * @see #getReturningValue()
   * @generated
   */
  void setReturningValue(String value);

} // AfterReturning
