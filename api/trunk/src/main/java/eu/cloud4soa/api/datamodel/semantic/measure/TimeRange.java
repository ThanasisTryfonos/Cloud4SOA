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


package eu.cloud4soa.api.datamodel.semantic.measure;

import com.viceversatech.rdfbeans.annotations.RDF;
import com.viceversatech.rdfbeans.annotations.RDFBean;
import com.viceversatech.rdfbeans.annotations.RDFSubject;
import java.util.ArrayList;
import java.util.List;

@RDFBean("http://www.cloud4soa.eu/v0.1/measure#TimeRange")
public class TimeRange extends MeasurementRange {

    private TimeUnit maxTimeValue;
    private TimeUnit minTimeValue;
    private TimeUnit timeStep;
    private List<TimeUnit> offeredTimeValues = new ArrayList<TimeUnit>();

    @Override
    @RDFSubject(prefix = "http://www.cloud4soa.eu/v0.1/measure#")
    public String getUriId() {
        return super.getUriId();
    }
    
    @RDF("http://www.cloud4soa.eu/v0.1/measure#hasTimeValue")
    public List<TimeUnit> getOfferedTimeValues() {
        return offeredTimeValues;
    }

    public void setOfferedTimeValues(List<TimeUnit> offeredTimeValues) {
        this.offeredTimeValues = offeredTimeValues;
    }

    @RDF("http://www.cloud4soa.eu/v0.1/measure#hasMaxTimeValue")
    public TimeUnit getMax() {
        return maxTimeValue;
    }

    public void setMax(TimeUnit maxTimeValue) {
        this.maxTimeValue = maxTimeValue;
    }

    @RDF("http://www.cloud4soa.eu/v0.1/measure#hasMinTimeValue")
    public TimeUnit getMin() {
        return minTimeValue;
    }

    public void setMin(TimeUnit minTimeValue) {
        this.minTimeValue = minTimeValue;
    }

    @RDF("http://www.cloud4soa.eu/v0.1/measure#hasTimeStep")
    public TimeUnit getStep() {
        return timeStep;
    }

    public void setStep(TimeUnit timeStep) {
        this.timeStep = timeStep;
    }
}