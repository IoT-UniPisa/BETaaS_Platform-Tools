/**
Copyright 2014-2015 Center for TeleInFrastruktur (CTIF), Aalborg University

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

package eu.betaas.service.securitymanager.capability.elements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.google.gson.JsonObject;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidityCondition" , propOrder = {
		"validAfter",
		"validBefore"
})

/**
 * This class describes the ValidityCondition data structure
 * 
 * @author Bayu Anggorojati [ba@es.aau.dk]
 * Center for TeleInFrastruktur, Aalborg University, Denmark
 *
 */
public class ValidityCondition {
	@XmlElement(name = "ValidAfter")
	private String validAfter;
	@XmlElement(name = "ValidBefore")
	private String validBefore;
	
	
	public String getValidAfter() {
		return validAfter;
	}
	public void setValidAfter(String validAfter) {
		this.validAfter = validAfter;
	}
	public String getValidBefore() {
		return validBefore;
	}
	public void setValidBefore(String validBefore) {
		this.validBefore = validBefore;
	}
	
	public String toString(){
		JsonObject jo = new JsonObject();
		
		jo.addProperty("ValidAfter", validAfter);
		jo.addProperty("ValidBefore", validBefore);
		
		return jo.toString();
	}
	
}
