/**
 *   GRANITE DATA SERVICES
 *   Copyright (C) 2006-2013 GRANITE DATA SERVICES S.A.S.
 *
 *   This file is part of the Granite Data Services Platform.
 *
 *   Granite Data Services is free software; you can redistribute it and/or
 *   modify it under the terms of the GNU Lesser General Public
 *   License as published by the Free Software Foundation; either
 *   version 2.1 of the License, or (at your option) any later version.
 *
 *   Granite Data Services is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser
 *   General Public License for more details.
 *
 *   You should have received a copy of the GNU Lesser General Public
 *   License along with this library; if not, write to the Free Software
 *   Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301,
 *   USA, or see <http://www.gnu.org/licenses/>.
 */

package org.granite.builder;

import java.io.File;
import java.util.Map;

import org.granite.builder.properties.Gas3Source;
import org.granite.generator.as3.JavaAs3Input;

/**
 * @author Franck WOLFF
 */
public class BuilderJavaClientInput extends JavaAs3Input {

	private final Gas3Source gas3Source;
	
	public BuilderJavaClientInput(Class<?> type, File file, Gas3Source gas3Source, Map<String, String> attributes) {
		super(type, file, attributes);
		if (gas3Source == null)
			throw new NullPointerException("gas3Source cannot be null");
		this.gas3Source = gas3Source;
	}

	public Gas3Source getGas3Source() {
		return gas3Source;
	}
}
