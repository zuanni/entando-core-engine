/*
 *
 * Copyright 2012 Entando S.r.l. (http://www.entando.com) All rights reserved.
 *
 * This file is part of Entando software.
 * Entando is a free software; 
 * you can redistribute it and/or modify it
 * under the terms of the GNU General Public License (GPL) as published by the Free Software Foundation; version 2.
 * 
 * See the file License for the specific language governing permissions   
 * and limitations under the License
 * 
 * 
 * 
 * Copyright 2012 Entando S.r.l. (http://www.entando.com) All rights reserved.
 *
 */

/**
 * 
 * @author W.Ambu
 */
package com.agiletec.aps;

import org.entando.entando.aps.system.services.api.TestApiCatalogManager;

import junit.framework.Test;
import junit.framework.TestSuite;
import com.agiletec.aps.system.TestApplicationContext;
import com.agiletec.aps.system.common.entity.TestEntityManager;
import com.agiletec.aps.system.services.authorization.TestAuthorityManager;
import com.agiletec.aps.system.services.authorization.TestAuthorizationManager;
import com.agiletec.aps.system.services.baseconfig.TestBaseConfigService;
import com.agiletec.aps.system.services.baseconfig.TestConfigItemDAO;
import com.agiletec.aps.system.services.cache.TestCacheManager;
import com.agiletec.aps.system.services.category.TestCategoryManager;
import com.agiletec.aps.system.services.controller.TestControllerManager;
import com.agiletec.aps.system.services.controller.control.TestAuthenticator;
import com.agiletec.aps.system.services.controller.control.TestErrorManager;
import com.agiletec.aps.system.services.controller.control.TestExecutor;
import com.agiletec.aps.system.services.controller.control.TestRequestAuthorizator;
import com.agiletec.aps.system.services.controller.control.TestRequestValidator;
import com.agiletec.aps.system.services.group.TestGroupManager;
import com.agiletec.aps.system.services.group.TestGroupUtilizer;
import com.agiletec.aps.system.services.i18n.TestI18nManager;
import com.agiletec.aps.system.services.keygenerator.TestKeyGeneratorDAO;
import com.agiletec.aps.system.services.keygenerator.TestKeyGeneratorManager;
import com.agiletec.aps.system.services.lang.TestLangManager;
import com.agiletec.aps.system.services.page.TestPageDAO;
import com.agiletec.aps.system.services.page.TestPageManager;
import com.agiletec.aps.system.services.page.showlet.TestNavigatorExpression;
import com.agiletec.aps.system.services.page.showlet.TestNavigatorParser;
import com.agiletec.aps.system.services.pagemodel.TestPageModelDAO;
import com.agiletec.aps.system.services.pagemodel.TestPageModelDOM;
import com.agiletec.aps.system.services.pagemodel.TestPageModelManager;
import com.agiletec.aps.system.services.role.TestPermissionDAO;
import com.agiletec.aps.system.services.role.TestRoleDAO;
import com.agiletec.aps.system.services.role.TestRoleManager;
import com.agiletec.aps.system.services.showlettype.TestShowletTypeDAO;
import com.agiletec.aps.system.services.showlettype.TestShowletTypeDOM;
import com.agiletec.aps.system.services.showlettype.TestShowletTypeManager;
import com.agiletec.aps.system.services.url.TestURLManager;
import com.agiletec.aps.system.services.user.TestAuthenticationProviderManager;
import com.agiletec.aps.system.services.user.TestUserDAO;
import com.agiletec.aps.system.services.user.TestUserManager;
import com.agiletec.aps.util.TestHtmlHandler;

public class AllTests {
	
	public static Test suite() {
		TestSuite suite = new TestSuite("Test for APS");
		
		//
		suite.addTestSuite(TestEntityManager.class);
		//
		suite.addTestSuite(TestApiCatalogManager.class);
		//
		suite.addTestSuite(TestAuthorizationManager.class);
		suite.addTestSuite(TestAuthorityManager.class);
		//
		suite.addTestSuite(TestBaseConfigService.class);
		suite.addTestSuite(TestConfigItemDAO.class);
		//
		suite.addTestSuite(TestCacheManager.class);
		//
		suite.addTestSuite(TestCategoryManager.class);
		//
		suite.addTestSuite(TestAuthenticator.class);
		suite.addTestSuite(TestRequestAuthorizator.class);
		suite.addTestSuite(TestErrorManager.class);
		suite.addTestSuite(TestExecutor.class);
		suite.addTestSuite(TestRequestValidator.class);
		suite.addTestSuite(TestControllerManager.class);
		//
		suite.addTestSuite(TestGroupManager.class);
		suite.addTestSuite(TestGroupUtilizer.class);
		//
		suite.addTestSuite(TestI18nManager.class);
		//
		suite.addTestSuite(TestKeyGeneratorDAO.class);
		suite.addTestSuite(TestKeyGeneratorManager.class);
		//
		suite.addTestSuite(TestLangManager.class);
		//
		suite.addTestSuite(TestPageDAO.class);
		suite.addTestSuite(TestPageManager.class);
		suite.addTestSuite(TestNavigatorExpression.class);
		suite.addTestSuite(TestNavigatorParser.class);
		//
		suite.addTestSuite(TestPageModelDAO.class);
		suite.addTestSuite(TestPageModelDOM.class);
		suite.addTestSuite(TestPageModelManager.class);
		//
		suite.addTestSuite(TestPermissionDAO.class);
		suite.addTestSuite(TestRoleDAO.class);
		suite.addTestSuite(TestRoleManager.class);
		
		//
		suite.addTestSuite(TestShowletTypeDAO.class);
		suite.addTestSuite(TestShowletTypeDOM.class);
		suite.addTestSuite(TestShowletTypeManager.class);
		//
		suite.addTestSuite(TestURLManager.class);
		//
		suite.addTestSuite(TestAuthenticationProviderManager.class);
		suite.addTestSuite(TestUserDAO.class);
		suite.addTestSuite(TestUserManager.class);
		//
		suite.addTestSuite(TestApplicationContext.class);	
		//
		suite.addTestSuite(TestHtmlHandler.class);
		
		return suite;
	}
}
