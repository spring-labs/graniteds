/**
 *   GRANITE DATA SERVICES
 *   Copyright (C) 2006-2015 GRANITE DATA SERVICES S.A.S.
 *
 *   This file is part of the Granite Data Services Platform.
 *
 *                               ***
 *
 *   Community License: GPL 3.0
 *
 *   This file is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published
 *   by the Free Software Foundation, either version 3 of the License,
 *   or (at your option) any later version.
 *
 *   This file is distributed in the hope that it will be useful, but
 *   WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 *                               ***
 *
 *   Available Commercial License: GraniteDS SLA 1.0
 *
 *   This is the appropriate option if you are creating proprietary
 *   applications and you are not prepared to distribute and share the
 *   source code of your application under the GPL v3 license.
 *
 *   Please visit http://www.granitedataservices.com/license for more
 *   details.
 */
package org.granite.client.tide;

import java.util.Map;

/**
 * SPI for platform-specific integration
 *
 * Allows to define default components available in all contexts or apply specific configurations on components annotated with {@link org.granite.client.tide.ApplicationConfigurable}
 *
 * @author William DRAI
 * @see org.granite.client.tide.ApplicationConfigurable
 */
public interface Application {

    /**
     * Define a map of beans that will be setup in the context before initialization
     * @param context Tide context
     * @param initialBeans map of bean instances keyed by name
     */
	public void initContext(Context context, Map<String, Object> initialBeans);

    /**
     * Configure a bean instance for platform-specific behaviour
     * @param instance bean instance
     */
	public void configure(Object instance);

    /**
     * Integration with deferred execution of a runnable on the UI thread
     * @param context context to run the UI thread
     * @param runnable runnable to execute in the UI thread
     */
	public void execute(Object context, Runnable runnable);
}
