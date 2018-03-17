/**
 * generated by Xtext 2.12.0
 */
package org.xtext.spring.springConfigDsl.tests;

import junit.textui.TestRunner;

import org.xtext.spring.springConfigDsl.PropertyHolder;
import org.xtext.spring.springConfigDsl.SpringConfigDslFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Property Holder</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyHolderTest extends ContextTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PropertyHolderTest.class);
	}

	/**
	 * Constructs a new Property Holder test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyHolderTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Property Holder test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PropertyHolder getFixture() {
		return (PropertyHolder)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpringConfigDslFactory.eINSTANCE.createPropertyHolder());
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

} //PropertyHolderTest
