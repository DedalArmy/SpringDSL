/**
 * generated by Xtext 2.12.0
 */
package org.xtext.spring.springConfigDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.spring.springConfigDsl.PropertyFile#getLocation <em>Location</em>}</li>
 *   <li>{@link org.xtext.spring.springConfigDsl.PropertyFile#getFileEncoding <em>File Encoding</em>}</li>
 * </ul>
 *
 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getPropertyFile()
 * @model
 * @generated
 */
public interface PropertyFile extends EObject
{
  /**
   * Returns the value of the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' attribute.
   * @see #setLocation(String)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getPropertyFile_Location()
   * @model
   * @generated
   */
  String getLocation();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.PropertyFile#getLocation <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' attribute.
   * @see #getLocation()
   * @generated
   */
  void setLocation(String value);

  /**
   * Returns the value of the '<em><b>File Encoding</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File Encoding</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>File Encoding</em>' attribute.
   * @see #setFileEncoding(String)
   * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getPropertyFile_FileEncoding()
   * @model
   * @generated
   */
  String getFileEncoding();

  /**
   * Sets the value of the '{@link org.xtext.spring.springConfigDsl.PropertyFile#getFileEncoding <em>File Encoding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File Encoding</em>' attribute.
   * @see #getFileEncoding()
   * @generated
   */
  void setFileEncoding(String value);

} // PropertyFile