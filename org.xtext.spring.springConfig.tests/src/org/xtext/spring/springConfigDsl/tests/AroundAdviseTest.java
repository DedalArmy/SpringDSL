/**
 * generated by Xtext 2.12.0
 */
package org.xtext.spring.springConfigDsl.tests;

import junit.textui.TestRunner;

import org.xtext.spring.springConfigDsl.AroundAdvise;
import org.xtext.spring.springConfigDsl.SpringConfigDslFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Around Advise</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AroundAdviseTest extends AdviseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AroundAdviseTest.class);
	}

	/**
	 * Constructs a new Around Advise test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AroundAdviseTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Around Advise test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AroundAdvise getFixture() {
		return (AroundAdvise)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpringConfigDslFactory.eINSTANCE.createAroundAdvise());
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

} //AroundAdviseTest