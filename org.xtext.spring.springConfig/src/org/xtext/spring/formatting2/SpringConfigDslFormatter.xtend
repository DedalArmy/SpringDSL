/*
 * generated by Xtext 2.17.0
 */
package org.xtext.spring.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.spring.services.SpringConfigDslGrammarAccess
import org.xtext.spring.springConfigDsl.Configuration
import org.xtext.spring.springConfigDsl.SpringProject
import org.xtext.spring.springConfigDsl.Component

class SpringConfigDslFormatter extends AbstractFormatter2 {
	
	@Inject extension SpringConfigDslGrammarAccess

	def dispatch void format(SpringProject springProject, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (configuration : springProject.configurations) {
			springProject.append[newLine]
			configuration.format
		}
	}

	def dispatch void format(Configuration configuration, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		
		for (component : configuration.components) {
			component.append[newLine]
			component.format
		}
		for (alias : configuration.alias) {
			alias.format
		}
		for (_import : configuration.imports) {
			_import.format
		}
		for (context : configuration.contexts) {
			context.format
		}
		for (mVC : configuration.mvcs) {
			mVC.format
		}
		for (aspect : configuration.aspects) {
			aspect.format
		}
		for (utilConstant : configuration.utilConstants) {
			utilConstant.format
		}
		for (utilList : configuration.utilLists) {
			utilList.format
		}
		for (utilMap : configuration.utilMaps) {
			utilMap.format
		}
		for (utilProperties : configuration.utilProperties) {
			utilProperties.format
		}
		for (utilSet : configuration.utilSets) {
			utilSet.format
		}
		for (utilPropertyPath : configuration.utilPropertiesPath) {
			utilPropertyPath.format
		}
		for (txAdvise : configuration.txAdvices) {
			txAdvise.format
		}
		for (txJtaTransactionManager : configuration.txJtaTransactionManager) {
			txJtaTransactionManager.format
		}
		for (_configuration : configuration.configurationComposite) {
			_configuration.format
		}
	}
	
	def dispatch void format(Component component, extension IFormattableDocument document) {
		for(feature : component.features) {
			feature.append[newLine]
			feature.format
		}
	}
	
	
	// TODO: implement for ComponentScan, PropertyPlaceholder, PropertyOverride, AopAspectJAutoproxy, AopConfig, AopAdvisor, AopAspect, DeclareParents, TxAdvise, TxAttribute, Component, CreationMethod, Feature, Qualifier, Array, sList, sSet, Props, Map, MapEntry, Key, UtilProperties, UtilList, UtilMap, UtilSet
}