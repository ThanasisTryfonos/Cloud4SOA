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
package eu.cloud4soa.api.datamodel.governance;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import eu.cloud4soa.api.datamodel.core.ApplicationInstance;
import eu.cloud4soa.api.datamodel.core.PaaSInstance;
import eu.cloud4soa.api.datamodel.core.qos.LatencyInstance;
import eu.cloud4soa.api.datamodel.core.qos.ServiceQualityInstance;
import eu.cloud4soa.api.datamodel.core.qos.UptimeInstance;
import eu.cloud4soa.api.datamodel.semantic.app.Application;
import eu.cloud4soa.api.datamodel.semantic.ea.Latency;
import eu.cloud4soa.api.datamodel.semantic.ea.Technology_Service_Quality;
import eu.cloud4soa.api.datamodel.semantic.ea.Uptime;
import eu.cloud4soa.api.datamodel.semantic.user.Developer;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement()
@XmlType(name = "slatemplate", namespace = "eu.cloud4soa.api.datamodel.governance")
public class SlaTemplate {

	static public enum ServiceGuaranteeType { LATENCY, UPTIME, UNRECOGNIZED }
	
	private final String DATEFORMAT = "dd-MMMM-yyyy";
	
    //TODO : Creating all fields as Strings for now 
    /** 
     * SLA Context info
     */

    private Long   id;
    private String agreementInitiator;
    private String agreementResponder;
    private String serviceProvider;
    private String expirationTime;
    private String templateName;
    /**
     * ServiceDescriptionTerms
     */
    private List<ServiceDescriptionTerm> serviceDescriptionTerms =
    		new ArrayList<ServiceDescriptionTerm>();
    /**
     * GuaranteeTerms
     */
    private List<GuaranteeTerm> guaranteeTerms =
    		new ArrayList<GuaranteeTerm>();

    public SlaTemplate() {
    }

    /**
     * Constructs an SLAContract instance from a given XML filename
     * @param filename
     */
    public SlaTemplate(ApplicationInstance applicationInstance, PaaSInstance paasInstance) {

        Application application = applicationInstance.getApplication();

        Developer developer = application.getOwner();
        agreementInitiator = developer.getFirstName() + " " + developer.getFamilyname();
        agreementResponder = paasInstance.getProviderTitle();
        serviceProvider = agreementResponder;
        expirationTime = getOneYearFromNow();

        //templateId = UUID.randomUUID().toString();
        templateName = " SLA between " + agreementInitiator + " and " + agreementResponder;

        // not sure which are the correct attributes to get from ApplicationInstance for these fields, settign to application description for now 
        String applicationName = application.getdescription();
        String serviceName = application.getdescription();

        ServiceDescriptionTerm serviceDescriptionTerm = new ServiceDescriptionTerm("ServiceTerm1", serviceName, applicationName, application.getVersion(), application.getdescription());
        serviceDescriptionTerms.add(serviceDescriptionTerm);
        
    	createGuranteeTerms(applicationInstance, paasInstance, serviceName);
    }

	private void createGuranteeTerms(ApplicationInstance applicationInstance, PaaSInstance paasInstance, String serviceName) {
		String latencyValue = null;
    	boolean paasHasLatencyQoS  = false;
    	String uptimeValue = null;
    	boolean paasHasUptimeQoS = false;
    	
    	// first check if paasInstance has Qos parameters
		List<Technology_Service_Quality> qtsqs = paasInstance.getPaaSOffering().getProvidesServiceQuality();
		
		for (int i = 0; i < qtsqs.size(); i++) {
			Technology_Service_Quality serviceQuality = qtsqs.get(i);

            if(serviceQuality instanceof Latency) {
            	latencyValue = new LatencyInstance((Latency)serviceQuality).getMaxValueMs().toString();
            	paasHasLatencyQoS = true;
            }
            if(serviceQuality instanceof Uptime) {
            	uptimeValue =  new UptimeInstance((Uptime)serviceQuality).getHasPercentage().toString();
            	paasHasUptimeQoS = true;
            }
		}
       	
		// then check if applicationInstance has Qos parameters
		List<ServiceQualityInstance> applicationSWqualities = applicationInstance.getServiceQualities();
		
		for (int i = 0; i < applicationSWqualities.size(); i++) {
			ServiceQualityInstance swAppQuality = applicationSWqualities.get(i);
			//LATENCY
			if (swAppQuality instanceof LatencyInstance) { 
				if (!paasHasLatencyQoS && ((LatencyInstance) swAppQuality).getMaxValueMs() != null)
					latencyValue = ((LatencyInstance) swAppQuality).getMaxValueMs().toString();
			}           
			//UPTIME
			if (swAppQuality instanceof UptimeInstance) { 
				if (!paasHasUptimeQoS && ((UptimeInstance) swAppQuality).getHasPercentage() != null)
					uptimeValue = ((UptimeInstance) swAppQuality).getHasPercentage().toString();
			} 
		}
		if (latencyValue == null || latencyValue.equals("")) 
			latencyValue = "200";
		if (uptimeValue == null || uptimeValue.equals("")) 
			uptimeValue = "99,9";
		
	   	GuaranteeTerm guaranteeTerm1 = new GuaranteeTerm("LATENCY_GUARANTEE", serviceName, "LATENCY", latencyValue, "Weekly", "Euro", "5","Weekly", "Euro", "10");
	   	GuaranteeTerm guaranteeTerm2 = new GuaranteeTerm("UPTIME_GUARANTEE", serviceName, "UPTIME", uptimeValue, "Weekly", "Euro", "5","Weekly", "Euro", "10");
	   	guaranteeTerms.add(guaranteeTerm1);
	   	guaranteeTerms.add(guaranteeTerm2);
	}
	
    private String getOneYearFromNow() {
        Calendar date = Calendar.getInstance();
        date.setTime(new Date());
        date.add(Calendar.YEAR, 1);
        Format f = new SimpleDateFormat(DATEFORMAT);

        return f.format(date.getTime());
    }

    public String getAgreementInitiator() {
        return agreementInitiator;
    }

    public String getAgreementResponder() {
        return agreementResponder;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public String getExpirationTime() {
        return expirationTime;
    }

    public Long getId() {
        return id;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setAgreementInitiator(String agreementInitiator) {
        this.agreementInitiator = agreementInitiator;
    }

    public void setAgreementResponder(String agreementResponder) {
        this.agreementResponder = agreementResponder;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public void setId(Long Id) {
        this.id = Id;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public void setServiceDescriptionTerms(List <ServiceDescriptionTerm> serviceDescriptionTerms) {
        this.serviceDescriptionTerms = serviceDescriptionTerms;
    }
    
    public List <ServiceDescriptionTerm> getServiceDescriptionTerms() {
        return serviceDescriptionTerms;
    }

    public void setGuaranteeTerms(List <GuaranteeTerm> guaranteeTerms) {
        this.guaranteeTerms = guaranteeTerms;
    }

    public List <GuaranteeTerm> getGuaranteeTerms() {
        return guaranteeTerms;
    }
    
    public String getDateFormat() {
    	return DATEFORMAT;
    }
}
