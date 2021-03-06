/*
Copyright 2014-2015 Intecs Spa

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

// BETaaS - Building the Environment for the Things as a Service
//
// Component: IM
// Responsible: Intecs

package eu.betaas.service.instancemanager;

import eu.betaas.service.instancemanager.api.InstanceManagerExternalIF;

/**
 * Interface to be implemented by handlers of IM* service change events,
 * for example to request the join once IM* is discovered
 * @author Intecs
 *
 */
public interface IMStarHandler {

	/**
	 * It handles the event raised when an IM* service has been discovered
	 * @param IMStarService the IM* discovered service
	 */
	public void handleNewServiceNotification(InstanceManagerExternalIF IMStarService);
}
