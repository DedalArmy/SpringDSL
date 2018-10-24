/**
 * generated by Xtext 2.14.0
 */
package org.xtext.spring.springConfigDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Type Filter</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.spring.springConfigDsl.SpringConfigDslPackage#getEnumTypeFilter()
 * @model
 * @generated
 */
public enum EnumTypeFilter implements Enumerator
{
  /**
   * The '<em><b>ANNOTATION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ANNOTATION_VALUE
   * @generated
   * @ordered
   */
  ANNOTATION(0, "ANNOTATION", "\"annotation\""),

  /**
   * The '<em><b>ASSIGNABLE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ASSIGNABLE_VALUE
   * @generated
   * @ordered
   */
  ASSIGNABLE(1, "ASSIGNABLE", "\"assignable\""),

  /**
   * The '<em><b>ASPECTJ</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ASPECTJ_VALUE
   * @generated
   * @ordered
   */
  ASPECTJ(2, "ASPECTJ", "\"aspectj\""),

  /**
   * The '<em><b>REGEX</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REGEX_VALUE
   * @generated
   * @ordered
   */
  REGEX(3, "REGEX", "\"regex\""),

  /**
   * The '<em><b>CUSTOM</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CUSTOM_VALUE
   * @generated
   * @ordered
   */
  CUSTOM(4, "CUSTOM", "\"custom\"");

  /**
   * The '<em><b>ANNOTATION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ANNOTATION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ANNOTATION
   * @model literal="\"annotation\""
   * @generated
   * @ordered
   */
  public static final int ANNOTATION_VALUE = 0;

  /**
   * The '<em><b>ASSIGNABLE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ASSIGNABLE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ASSIGNABLE
   * @model literal="\"assignable\""
   * @generated
   * @ordered
   */
  public static final int ASSIGNABLE_VALUE = 1;

  /**
   * The '<em><b>ASPECTJ</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ASPECTJ</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ASPECTJ
   * @model literal="\"aspectj\""
   * @generated
   * @ordered
   */
  public static final int ASPECTJ_VALUE = 2;

  /**
   * The '<em><b>REGEX</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>REGEX</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REGEX
   * @model literal="\"regex\""
   * @generated
   * @ordered
   */
  public static final int REGEX_VALUE = 3;

  /**
   * The '<em><b>CUSTOM</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CUSTOM</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CUSTOM
   * @model literal="\"custom\""
   * @generated
   * @ordered
   */
  public static final int CUSTOM_VALUE = 4;

  /**
   * An array of all the '<em><b>Enum Type Filter</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final EnumTypeFilter[] VALUES_ARRAY =
    new EnumTypeFilter[]
    {
      ANNOTATION,
      ASSIGNABLE,
      ASPECTJ,
      REGEX,
      CUSTOM,
    };

  /**
   * A public read-only list of all the '<em><b>Enum Type Filter</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<EnumTypeFilter> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Enum Type Filter</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EnumTypeFilter get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EnumTypeFilter result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Enum Type Filter</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EnumTypeFilter getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EnumTypeFilter result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Enum Type Filter</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EnumTypeFilter get(int value)
  {
    switch (value)
    {
      case ANNOTATION_VALUE: return ANNOTATION;
      case ASSIGNABLE_VALUE: return ASSIGNABLE;
      case ASPECTJ_VALUE: return ASPECTJ;
      case REGEX_VALUE: return REGEX;
      case CUSTOM_VALUE: return CUSTOM;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EnumTypeFilter(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //EnumTypeFilter
