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
package eu.cloud4soa.api.datamodel.semantic.foaf;

import com.viceversatech.rdfbeans.annotations.RDF;
import com.viceversatech.rdfbeans.annotations.RDFBean;
import com.viceversatech.rdfbeans.annotations.RDFSubject;
import eu.cloud4soa.api.datamodel.semantic.Thing;
/**
 * This class manages access to these properties:
 * <ul>
 *   <li> AIMchatID </li>
 *   <li> Birthday </li>
 *   <li> Currentproject </li>
 *   <li> Familyname </li>
 *   <li> FirstName </li>
 *   <li> Geekcode </li>
 *   <li> Gender </li>
 *   <li> Holdsaccount </li>
 *   <li> Homepage </li>
 *   <li> ICQchatID </li>
 *   <li> Image </li>
 *   <li> Interest </li>
 *   <li> Interesttopic </li>
 *   <li> JabberID </li>
 *   <li> Knows </li>
 *   <li> MSNchatID </li>
 *   <li> Made </li>
 *   <li> MyersBriggs </li>
 *   <li> Openid </li>
 *   <li> Pastproject </li>
 *   <li> Personalmailbox </li>
 *   <li> Plan </li>
 *   <li> Publications </li>
 *   <li> SchoolHomepage </li>
 *   <li> Sha1sumofapersonalmailboxURIname </li>
 *   <li> Surname </li>
 *   <li> Tipjar </li>
 *   <li> Weblog </li>
 *   <li> Workinfohomepage </li>
 *   <li> Workplacehomepage </li>
 *   <li> YahoochatID </li>
 * </ul>
 *
 * This class was generated by <a href="http://RDFReactor.semweb4j.org">RDFReactor</a> on 9/16/11 12:57 PM
 * Modified version 0.1
 */
@RDFBean("http://xmlns.com/foaf/0.1/Person")
public class Person extends FoafAgent {
       
        private Thing currentproject;
        private java.lang.String familyname;
	private java.lang.String firstName;
	private java.lang.String geekcode;
        private FoafImage image;
        private Document interest;
	private Person knows;
        private java.lang.String myersBriggs;
        private Thing pastproject;
        private java.lang.String plan;
        private Document publications;
        private Document schoolHomepage;
        private java.lang.String surname;
        private Thing interesttopic;
	private Document workinfohomepage;
	private Document workplacehomepage;

        





	@Override
	@RDFSubject(prefix="http://xmlns.com/foaf/0.1/Person/")
	public String getUriId() {
		return super.getUriId();
	}

    @RDF("http://xmlns.com/foaf/0.1/currentProject")
	public Thing getCurrentproject() {
		return currentproject;
	}
	
	public void setCurrentproject( Thing currentproject ) {
		this.currentproject = currentproject;
	}
    @RDF("http://xmlns.com/foaf/0.1/family_name")
	public java.lang.String getFamilyname() {
		return familyname;
	}
	
	public void setFamilyname( java.lang.String familyname ) {
		this.familyname = familyname;
	}
    @RDF("http://xmlns.com/foaf/0.1/firstName")
	public java.lang.String getFirstName() {
		return firstName;
	}
	
	public void setFirstName( java.lang.String firstName ) {
		this.firstName = firstName;
	}
    @RDF("http://xmlns.com/foaf/0.1/geekcode")
	public java.lang.String getGeekcode() {
		return geekcode;
	}
	
	public void setGeekcode( java.lang.String geekcode ) {
		this.geekcode = geekcode;
	}
 
    @RDF("http://xmlns.com/foaf/0.1/img")
	public FoafImage getImage() {
		return image;
	}
	
	public void setImage( FoafImage image ) {
		this.image = image;
	}
    @RDF("http://xmlns.com/foaf/0.1/interest")
	public Document getInterest() {
		return interest;
	}
	
	public void setInterest( Document interest ) {
		this.interest = interest;
	}
    @RDF("http://xmlns.com/foaf/0.1/topic_interest")
	public Thing getInteresttopic() {
		return interesttopic;
	}
	
	public void setInteresttopic( Thing interesttopic ) {
		this.interesttopic = interesttopic;
	}
    @RDF("http://xmlns.com/foaf/0.1/knows")
	public Person getKnows() {
		return knows;
	}
	
	public void setKnows( Person knows ) {
		this.knows = knows;
	}
    @RDF("http://xmlns.com/foaf/0.1/myersBriggs")
	public java.lang.String getMyersBriggs() {
		return myersBriggs;
	}
	
	public void setMyersBriggs( java.lang.String myersBriggs ) {
		this.myersBriggs = myersBriggs;
	}
    @RDF("http://xmlns.com/foaf/0.1/pastProject")
	public Thing getPastproject() {
		return pastproject;
	}
	
	public void setPastproject( Thing pastproject ) {
		this.pastproject = pastproject;
	}
    @RDF("http://xmlns.com/foaf/0.1/plan")
	public java.lang.String getPlan() {
		return plan;
	}
	
	public void setPlan( java.lang.String plan ) {
		this.plan = plan;
	}
    @RDF("http://xmlns.com/foaf/0.1/publications")
	public Document getPublications() {
		return publications;
	}
	
	public void setPublications( Document publications ) {
		this.publications = publications;
	}
    @RDF("http://xmlns.com/foaf/0.1/schoolHomepage")
	public Document getSchoolHomepage() {
		return schoolHomepage;
	}
	
	public void setSchoolHomepage( Document schoolHomepage ) {
		this.schoolHomepage = schoolHomepage;
	}
    @RDF("http://xmlns.com/foaf/0.1/surname")
	public java.lang.String getSurname() {
		return surname;
	}
	
	public void setSurname( java.lang.String surname ) {
		this.surname = surname;
	}
    @RDF("http://xmlns.com/foaf/0.1/workInfoHomepage")
	public Document getWorkinfohomepage() {
		return workinfohomepage;
	}
	
	public void setWorkinfohomepage( Document workinfohomepage ) {
		this.workinfohomepage = workinfohomepage;
	}
    @RDF("http://xmlns.com/foaf/0.1/workplaceHomepage")
	public Document getWorkplacehomepage() {
		return workplacehomepage;
	}
	
	public void setWorkplacehomepage( Document workplacehomepage ) {
		this.workplacehomepage = workplacehomepage;
	}

}