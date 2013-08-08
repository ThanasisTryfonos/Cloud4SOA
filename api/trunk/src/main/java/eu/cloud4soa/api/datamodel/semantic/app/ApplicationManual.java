/*
 *  Copyright 2013 Cloud4SOA, www.cloud4soa.eu
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */


/**
 * generated by http://RDFReactor.semweb4j.org ($Id: CodeGenerator.java 1765 2010-02-11 09:51:13Z max.at.xam.de $) on 9/16/11 12:57 PM
 */
package eu.cloud4soa.api.datamodel.semantic.app;

import com.viceversatech.rdfbeans.annotations.RDF;
import com.viceversatech.rdfbeans.annotations.RDFBean;
import com.viceversatech.rdfbeans.annotations.RDFSubject;
import eu.cloud4soa.api.datamodel.semantic.foaf.Document;
/**
 * This class manages access to these properties:
 * <ul>
 *   <li> Manualof </li>
 * </ul>
 *
 * This class was generated by <a href="http://RDFReactor.semweb4j.org">RDFReactor</a> on 9/16/11 12:57 PM
 * Modified version 0.1
 */
@RDFBean("http://www.imolinfo.it/ontologie/ea/v1.1/application-domain-model#")
public class ApplicationManual extends Document {

	private Application manualof;





	@Override
	@RDFSubject(prefix="http://www.imolinfo.it/ontologie/ea/v1.1/application-domain-model#Application_Manual/")
	public String getUriId() {
		return super.getUriId();
	}
	


    @RDF("http://www.imolinfo.it/ontologie/ea/v1.1/application-domain-model#is_manual_of")
	public Application getManualof() {
		return manualof;
	}
	
	public void setManualof( Application manualof ) {
		this.manualof = manualof;
	}

}