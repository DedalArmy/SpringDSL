/**
 * generated by Xtext 2.12.0
 */
package org.xtext.spring.springConfigDsl.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.xtext.spring.springConfigDsl.ComponentScan;
import org.xtext.spring.springConfigDsl.SpringConfigDslFactory;
import org.xtext.spring.springConfigDsl.SpringConfigDslPackage;

/**
 * This is the item provider adapter for a {@link org.xtext.spring.springConfigDsl.ComponentScan} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentScanItemProvider extends ContextItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentScanItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addBasePackagePropertyDescriptor(object);
			addAnnotationConfigPropertyDescriptor(object);
			addNameGeneratorBeanPropertyDescriptor(object);
			addResourcePatternPropertyDescriptor(object);
			addScopeResolverPropertyDescriptor(object);
			addScopedProxyPropertyDescriptor(object);
			addUseDefaultFiltersPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Base Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBasePackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentScan_basePackage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentScan_basePackage_feature", "_UI_ComponentScan_type"),
				 SpringConfigDslPackage.Literals.COMPONENT_SCAN__BASE_PACKAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Annotation Config feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnnotationConfigPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentScan_annotationConfig_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentScan_annotationConfig_feature", "_UI_ComponentScan_type"),
				 SpringConfigDslPackage.Literals.COMPONENT_SCAN__ANNOTATION_CONFIG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name Generator Bean feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNameGeneratorBeanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentScan_nameGeneratorBean_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentScan_nameGeneratorBean_feature", "_UI_ComponentScan_type"),
				 SpringConfigDslPackage.Literals.COMPONENT_SCAN__NAME_GENERATOR_BEAN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resource Pattern feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourcePatternPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentScan_resourcePattern_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentScan_resourcePattern_feature", "_UI_ComponentScan_type"),
				 SpringConfigDslPackage.Literals.COMPONENT_SCAN__RESOURCE_PATTERN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scope Resolver feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScopeResolverPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentScan_scopeResolver_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentScan_scopeResolver_feature", "_UI_ComponentScan_type"),
				 SpringConfigDslPackage.Literals.COMPONENT_SCAN__SCOPE_RESOLVER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scoped Proxy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScopedProxyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentScan_scopedProxy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentScan_scopedProxy_feature", "_UI_ComponentScan_type"),
				 SpringConfigDslPackage.Literals.COMPONENT_SCAN__SCOPED_PROXY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Default Filters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseDefaultFiltersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentScan_useDefaultFilters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentScan_useDefaultFilters_feature", "_UI_ComponentScan_type"),
				 SpringConfigDslPackage.Literals.COMPONENT_SCAN__USE_DEFAULT_FILTERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SpringConfigDslPackage.Literals.COMPONENT_SCAN__INCLUDE_FILTERS);
			childrenFeatures.add(SpringConfigDslPackage.Literals.COMPONENT_SCAN__EXCLUDE_FILTERS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ComponentScan.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentScan"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ComponentScan)object).getBasePackage();
		return label == null || label.length() == 0 ?
			getString("_UI_ComponentScan_type") :
			getString("_UI_ComponentScan_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ComponentScan.class)) {
			case SpringConfigDslPackage.COMPONENT_SCAN__BASE_PACKAGE:
			case SpringConfigDslPackage.COMPONENT_SCAN__ANNOTATION_CONFIG:
			case SpringConfigDslPackage.COMPONENT_SCAN__RESOURCE_PATTERN:
			case SpringConfigDslPackage.COMPONENT_SCAN__SCOPED_PROXY:
			case SpringConfigDslPackage.COMPONENT_SCAN__USE_DEFAULT_FILTERS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SpringConfigDslPackage.COMPONENT_SCAN__INCLUDE_FILTERS:
			case SpringConfigDslPackage.COMPONENT_SCAN__EXCLUDE_FILTERS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SpringConfigDslPackage.Literals.COMPONENT_SCAN__INCLUDE_FILTERS,
				 SpringConfigDslFactory.eINSTANCE.createIncludeFilter()));

		newChildDescriptors.add
			(createChildParameter
				(SpringConfigDslPackage.Literals.COMPONENT_SCAN__EXCLUDE_FILTERS,
				 SpringConfigDslFactory.eINSTANCE.createExcludeFilter()));
	}

}