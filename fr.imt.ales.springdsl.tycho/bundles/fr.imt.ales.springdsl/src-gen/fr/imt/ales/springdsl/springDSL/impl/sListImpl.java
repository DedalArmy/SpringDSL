/**
 * generated by Xtext 2.18.0
 */
package fr.imt.ales.springdsl.springDSL.impl;

import fr.imt.ales.springdsl.springDSL.AbstractArtefact;
import fr.imt.ales.springdsl.springDSL.SpringDSLPackage;
import fr.imt.ales.springdsl.springDSL.sList;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>sList</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.imt.ales.springdsl.springDSL.impl.sListImpl#getArtefacts <em>Artefacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class sListImpl extends CollectionImpl implements sList
{
  /**
   * The cached value of the '{@link #getArtefacts() <em>Artefacts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtefacts()
   * @generated
   * @ordered
   */
  protected EList<AbstractArtefact> artefacts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected sListImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SpringDSLPackage.Literals.SLIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<AbstractArtefact> getArtefacts()
  {
    if (artefacts == null)
    {
      artefacts = new EObjectContainmentEList<AbstractArtefact>(AbstractArtefact.class, this, SpringDSLPackage.SLIST__ARTEFACTS);
    }
    return artefacts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SpringDSLPackage.SLIST__ARTEFACTS:
        return ((InternalEList<?>)getArtefacts()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SpringDSLPackage.SLIST__ARTEFACTS:
        return getArtefacts();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SpringDSLPackage.SLIST__ARTEFACTS:
        getArtefacts().clear();
        getArtefacts().addAll((Collection<? extends AbstractArtefact>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SpringDSLPackage.SLIST__ARTEFACTS:
        getArtefacts().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SpringDSLPackage.SLIST__ARTEFACTS:
        return artefacts != null && !artefacts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //sListImpl