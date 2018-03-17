/**
 * generated by Xtext 2.12.0
 */
package org.xtext.spring.springConfigDsl.tests;

import junit.textui.TestRunner;

import org.xtext.spring.springConfigDsl.SpringConfigDslFactory;
import org.xtext.spring.springConfigDsl.sList;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>sList</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class sListTest extends CollectionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(sListTest.class);
	}

	/**
	 * Constructs a new sList test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sListTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this sList test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected sList getFixture() {
		return (sList)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpringConfigDslFactory.eINSTANCE.createsList());
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

} //sListTest
