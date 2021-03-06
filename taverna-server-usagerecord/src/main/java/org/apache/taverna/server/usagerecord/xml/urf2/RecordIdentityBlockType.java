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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Open Grid Forum GFD.204 Usage Record type <code>RecordIdentityBlockType</code>
 * 
 * @see <a href="https://www.ogf.org/documents/GFD.204.pdf#section.3">GFD.204 section 3</a>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordIdentityBlockType", propOrder = {
    "recordId",
    "createTime",
    "site",
    "infrastructure"
})
public class RecordIdentityBlockType {

    @XmlElement(name = "RecordId", required = true)
    protected String recordId;
    @XmlElement(name = "CreateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    @XmlElement(name = "Site")
    protected String site;
    @XmlElement(name = "Infrastructure")
    protected InfrastructureType infrastructure;

    /**
     * Gets the value of the recordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordId() {
        return recordId;
    }

    /**
     * Sets the value of the recordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordId(String value) {
        this.recordId = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateTime(XMLGregorianCalendar value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite(String value) {
        this.site = value;
    }

    /**
     * Gets the value of the infrastructure property.
     * 
     * @return
     *     possible object is
     *     {@link InfrastructureType }
     *     
     */
    public InfrastructureType getInfrastructure() {
        return infrastructure;
    }

    /**
     * Sets the value of the infrastructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfrastructureType }
     *     
     */
    public void setInfrastructure(InfrastructureType value) {
        this.infrastructure = value;
    }

}
