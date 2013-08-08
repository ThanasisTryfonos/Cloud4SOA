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


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eu.cloud4soa.api.repository;

import eu.cloud4soa.api.datamodel.core.ApplicationInstance;
import eu.cloud4soa.api.datamodel.core.PaaSInstance;
import eu.cloud4soa.api.datamodel.repository.QueryResultTable;
import eu.cloud4soa.api.util.exception.SparqlQueryException;
import eu.cloud4soa.api.util.exception.soa.SOAException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author vincenzo
 */
public interface SearchAndDiscoveryInterfaces {
//    List<core.PaaSInstance> searchForMatchingPlatform(core.ApplicationInstance);
    Map<PaaSInstance,Float> searchForMatchingPlatform(ApplicationInstance applicationInstance) throws SOAException;
//    core.PaaSInstance searchForPass(ui.PaaSInstance);
    PaaSInstance searchForPass(eu.cloud4soa.api.datamodel.frontend.PaaSInstance paaSInstance);
    
    public QueryResultTable sparqlSelect(String query) throws SparqlQueryException;
}
