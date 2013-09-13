/**
 *   GRANITE DATA SERVICES
 *   Copyright (C) 2006-2013 GRANITE DATA SERVICES S.A.S.
 *
 *   This file is part of Granite Data Services.
 *
 *   Granite Data Services is free software; you can redistribute it and/or modify
 *   it under the terms of the GNU Library General Public License as published by
 *   the Free Software Foundation; either version 2 of the License, or (at your
 *   option) any later version.
 *
 *   Granite Data Services is distributed in the hope that it will be useful, but
 *   WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 *   FITNESS FOR A PARTICULAR PURPOSE. See the GNU Library General Public License
 *   for more details.
 *
 *   You should have received a copy of the GNU Library General Public License
 *   along with this library; if not, see <http://www.gnu.org/licenses/>.
 */
package org.granite.test.tide.spring;

import org.granite.test.tide.TestDataUpdatePostprocessor.WrappedUpdate;
import org.granite.test.tide.data.Person;
import org.granite.test.tide.spring.service.HibernatePersonService;
import org.granite.tide.data.DataContext.EntityUpdateType;
import org.granite.tide.invocation.InvocationResult;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;


@ContextConfiguration(locations="/org/granite/test/tide/spring/test-context-dupp.xml")
public class AbstractTestTideRemotingDuppHibernate extends AbstractTideTestCase {
    
	@Test
    public void testPersistCall() {
        InvocationResult result = invokeComponent(null, HibernatePersonService.class, "create", new Object[] { "joe" });
        
        Assert.assertEquals("Update count", 1, result.getUpdates().length);
        Assert.assertEquals("Update type", EntityUpdateType.PERSIST.name(), result.getUpdates()[0][0]);
        Assert.assertEquals("Update class", WrappedUpdate.class, result.getUpdates()[0][1].getClass());
        Assert.assertEquals("Update class 2", Person.class, ((WrappedUpdate)result.getUpdates()[0][1]).getEntity().getClass());
    }
}