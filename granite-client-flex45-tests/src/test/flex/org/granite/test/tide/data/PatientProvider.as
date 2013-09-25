/*
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
/**
 * Generated by Gas3 v1.1.0 (Granite Data Services) on Sat Jul 26 17:58:20 CEST 2008.
 *
 * WARNING: DO NOT CHANGE THIS FILE. IT MAY BE OVERRIDDEN EACH TIME YOU USE
 * THE GENERATOR. CHANGE INSTEAD THE INHERITED CLASS (Person.as).
 */

package org.granite.test.tide.data {

    import flash.utils.ByteArray;
    import flash.utils.IDataInput;
    import flash.utils.IDataOutput;
    
    import mx.collections.ListCollectionView;
    
    import org.granite.meta;
    import org.granite.test.tide.AbstractEntity;
    import org.granite.tide.IEntityManager;
    import org.granite.tide.IPropertyHolder;
    import org.granite.util.Enum;

    use namespace meta;

    [Managed]
    [RemoteClass(alias="org.granite.test.tide.PatientProvider")]
    public class PatientProvider extends AbstractEntity {

        private var _name:String;
		private var _patient:Patient7;
		private var _provider:Provider;
        
        		
		public function set name(value:String):void {
			_name = value;
		}
		public function get name():String {
			return _name;
		}
		
		public function set patient(value:Patient7):void {
			_patient = value;
		}
		public function get patient():Patient7 {
			return _patient;
		}
		
        public function set provider(value:Provider):void {
			_provider = value;
        }
        public function get provider():Provider {
            return _provider;
        }

        override meta function merge(em:IEntityManager, obj:*):void {
            var src:PatientProvider = PatientProvider(obj);
            super.meta::merge(em, obj);
            if (meta::isInitialized()) {
                em.meta_mergeExternal(src._name, _name, null, this, 'name', function setter(o:*):void{_name = o as String}) as String;
				em.meta_mergeExternal(src._patient, _patient, null, this, 'patient', function setter(o:*):void{_patient = o as Patient7}) as Patient7;
				em.meta_mergeExternal(src._provider, _provider, null, this, 'provider', function setter(o:*):void{_provider = o as Provider}) as Provider;
            }
        }

        override public function readExternal(input:IDataInput):void {
            super.readExternal(input);
            if (meta::isInitialized()) {
                _name = input.readObject() as String;
				_patient = input.readObject() as Patient7;
				_provider = input.readObject() as Provider;
            }
        }

        override public function writeExternal(output:IDataOutput):void {
            super.writeExternal(output);
            if (meta::isInitialized()) {
                output.writeObject((_name is IPropertyHolder) ? IPropertyHolder(_name).object : _name);
				output.writeObject((_patient is IPropertyHolder) ? IPropertyHolder(_patient).object : _patient);
				output.writeObject((_provider is IPropertyHolder) ? IPropertyHolder(_provider).object : _provider);
            }
        }
    }
}
