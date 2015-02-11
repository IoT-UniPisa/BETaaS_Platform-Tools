/*
 Copyright 2014-2015 Hewlett-Packard Development Company, L.P.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package eu.betaas.service.bigdatamanager.core.services;

import org.osgi.framework.BundleContext;

import eu.betaas.taas.bigdatamanager.core.services.ITaasBigDataManager;


public interface IBigDataDistributedCoreService {
	
	public void startService();	
	
	public void setService(ITaasBigDataManager service);
	
	public void setContext(BundleContext context);
	
	public void setFrequencyDelivery(long freq);
	
	public void closeService();
	
}
