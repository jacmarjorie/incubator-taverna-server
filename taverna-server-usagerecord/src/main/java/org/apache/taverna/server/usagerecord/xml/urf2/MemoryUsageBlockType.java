/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.04 at 04:15:49 PM GMT 
//


package org.apache.taverna.server.usagerecord.xml.urf2;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Open Grid Forum GFD.204 Usage Record type <code>MemoryUsageBlockType</code>
 * 
 * @see <a href="https://www.ogf.org/documents/GFD.204.pdf#section.7">GFD.204 section 7</a>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemoryUsageBlockType", propOrder = {
    "memoryClass",
    "memoryResourceCapacityUsed",
    "memoryResourceCapacityAllocated",
    "memoryResourceCapacityRequested",
    "startTime",
    "endTime",
    "executionHost",
    "hostType",
    "charge"
})
public class MemoryUsageBlockType {

    @XmlElement(name = "MemoryClass", required = true)
    protected String memoryClass;
    @XmlElement(name = "MemoryResourceCapacityUsed", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger memoryResourceCapacityUsed;
    @XmlElement(name = "MemoryResourceCapacityAllocated")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger memoryResourceCapacityAllocated;
    @XmlElement(name = "MemoryResourceCapacityRequested")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger memoryResourceCapacityRequested;
    @XmlElement(name = "StartTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "EndTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "ExecutionHost")
    protected ExecutionHostType executionHost;
    @XmlElement(name = "HostType")
    protected String hostType;
    @XmlElement(name = "Charge")
    protected BigDecimal charge;

    /**
     * Gets the value of the memoryClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemoryClass() {
        return memoryClass;
    }

    /**
     * Sets the value of the memoryClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemoryClass(String value) {
        this.memoryClass = value;
    }

    /**
     * Gets the value of the memoryResourceCapacityUsed property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMemoryResourceCapacityUsed() {
        return memoryResourceCapacityUsed;
    }

    /**
     * Sets the value of the memoryResourceCapacityUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMemoryResourceCapacityUsed(BigInteger value) {
        this.memoryResourceCapacityUsed = value;
    }

    /**
     * Gets the value of the memoryResourceCapacityAllocated property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMemoryResourceCapacityAllocated() {
        return memoryResourceCapacityAllocated;
    }

    /**
     * Sets the value of the memoryResourceCapacityAllocated property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMemoryResourceCapacityAllocated(BigInteger value) {
        this.memoryResourceCapacityAllocated = value;
    }

    /**
     * Gets the value of the memoryResourceCapacityRequested property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMemoryResourceCapacityRequested() {
        return memoryResourceCapacityRequested;
    }

    /**
     * Sets the value of the memoryResourceCapacityRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMemoryResourceCapacityRequested(BigInteger value) {
        this.memoryResourceCapacityRequested = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the executionHost property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutionHostType }
     *     
     */
    public ExecutionHostType getExecutionHost() {
        return executionHost;
    }

    /**
     * Sets the value of the executionHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutionHostType }
     *     
     */
    public void setExecutionHost(ExecutionHostType value) {
        this.executionHost = value;
    }

    /**
     * Gets the value of the hostType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostType() {
        return hostType;
    }

    /**
     * Sets the value of the hostType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostType(String value) {
        this.hostType = value;
    }

    /**
     * Gets the value of the charge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCharge() {
        return charge;
    }

    /**
     * Sets the value of the charge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCharge(BigDecimal value) {
        this.charge = value;
    }

}
