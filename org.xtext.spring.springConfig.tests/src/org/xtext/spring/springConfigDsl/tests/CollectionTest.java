/**
 * generated by Xtext 2.12.0
 */
package org.xtext.spring.springConfigDsl.tests;

import junit.textui.TestRunner;

import org.xtext.spring.springConfigDsl.Collection;
import org.xtext.spring.springConfigDsl.SpringConfigDslFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CollectionTest extends AbstractArtefactTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CollectionTest.class);
	}

	/**
	 * Constructs a new Collection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Collection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Collection getFixture() {
		return (Collection)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpringConfigDslFactory.eINSTANCE.createCollection());
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

} //CollectionTest
