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
package eu.cloud4soa.cli.roo.addon.commands;

import eu.cloud4soa.api.util.exception.soa.SOAException;
import eu.cloud4soa.cli.soa.ApplicationDeploymentClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author frarav
 */
public class GetReposCommand extends Cloud4soaCommand {
    
    private static Logger logger  = LoggerFactory.getLogger( GetReposCommand.class );

    protected ApplicationDeploymentClient applicationDeploymentClient;
    
    protected String userUriId;
    
    
    
    public GetReposCommand( String c4sUserUriId ) {
        super( "" , "" );
        applicationDeploymentClient = new ApplicationDeploymentClient();
        this.userUriId = c4sUserUriId;
    }
    
    
    
    @Override
    public void execute() throws Exception {
        String  responseMessage;
        
        logger.debug("Before calling the getRepos method on applicationDeploymentClient");
        try {
            
            applicationDeploymentClient.getRepos( this.userUriId);
            this.successMessage = "method getRepos method on applicationDeploymentClient called";
//            this.successMessage = this.successMessage + "\n" + responseMessage;
        
        } catch( SOAException se) {
        
            this.displaySuccessMessage = false;
            this.failureMessage = se.getMessage();
            logger.error( se.getMessage() );
            throw se;
        
        } 
        
    }
    
    
}