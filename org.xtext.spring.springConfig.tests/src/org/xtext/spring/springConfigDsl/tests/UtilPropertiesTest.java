/**
 * generated by Xtext 2.12.0
 */
package org.xtext.spring.springConfigDsl.tests;

import junit.textui.TestRunner;

import org.xtext.spring.springConfigDsl.SpringConfigDslFactory;
import org.xtext.spring.springConfigDsl.UtilProperties;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Util Properties</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UtilPropertiesTest extends PropsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UtilPropertiesTest.class);
	}

	/**
	 * Constructs a new Util Properties test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilPropertiesTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Util Properties test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UtilProperties getFixture() {
		return (UtilProperties)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpringConfigDslFactory.eINSTANCE.createUtilProperties());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //UtilPropertiesTest
