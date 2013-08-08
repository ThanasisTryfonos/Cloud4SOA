/*
 * Copyright [2013] [Cloud4SOA, www.cloud4soa.eu]
 *
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package eu.cloud4soa.adapter.rest.request;

import java.io.Serializable;

import eu.cloud4soa.adapter.rest.aop.Ignore;
import eu.cloud4soa.adapter.rest.aop.Method;
import eu.cloud4soa.adapter.rest.aop.Method.HttpMethod;
import eu.cloud4soa.adapter.rest.aop.NotNull;
import eu.cloud4soa.adapter.rest.aop.Path;
import eu.cloud4soa.adapter.rest.aop.Path.Component;
import eu.cloud4soa.adapter.rest.aop.UrlPath;
import eu.cloud4soa.adapter.rest.response.UpdateApplicationResponse;

/**
 * Request for update of resource <strong>Application</strong>  
 * <br><code>htt[p|ps]://baseUrl/ems/application/${applicatioName}</code>.<br>
 * 
 * Response will contain result of update about that requested resource.
 * 
 * @author Denis Neuling (dn@cloudcontrol.de)
 */
@Method(HttpMethod.PUT)
@Path(component=Component.EMS,path="/application/${applicationName}")
public class UpdateApplicationRequest extends Request<UpdateApplicationResponse> implements Serializable{
	private static final long serialVersionUID = -5457426618721168112L;
	
	@NotNull @Ignore
	@UrlPath(pattern="${applicationName}")
	private String applicationName;
	
	public UpdateApplicationRequest() {
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
}
