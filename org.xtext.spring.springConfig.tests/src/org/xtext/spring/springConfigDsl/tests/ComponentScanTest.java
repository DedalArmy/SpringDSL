/**
 * generated by Xtext 2.12.0
 */
package org.xtext.spring.springConfigDsl.tests;

import junit.textui.TestRunner;

import org.xtext.spring.springConfigDsl.ComponentScan;
import org.xtext.spring.springConfigDsl.SpringConfigDslFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Component Scan</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentScanTest extends ContextTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComponentScanTest.class);
	}

	/**
	 * Constructs a new Component Scan test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentScanTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Component Scan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ComponentScan getFixture() {
		return (ComponentScan)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpringConfigDslFactory.eINSTANCE.createComponentScan());
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

} //ComponentScanTest
