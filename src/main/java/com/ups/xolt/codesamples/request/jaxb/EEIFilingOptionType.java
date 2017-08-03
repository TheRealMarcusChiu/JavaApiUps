//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.03 at 08:56:33 AM CDT 
//


package com.ups.xolt.codesamples.request.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EEIFilingOptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EEIFilingOptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EMailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UPSFiled" type="{}UPSFiledType" minOccurs="0"/&gt;
 *         &lt;element name="ShipperFiled" type="{}ShipperFiledType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EEIFilingOptionType", propOrder = {
    "code",
    "eMailAddress",
    "description",
    "upsFiled",
    "shipperFiled"
})
public class EEIFilingOptionType {

    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "EMailAddress")
    protected String eMailAddress;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "UPSFiled")
    protected UPSFiledType upsFiled;
    @XmlElement(name = "ShipperFiled")
    protected ShipperFiledType shipperFiled;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the eMailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMailAddress() {
        return eMailAddress;
    }

    /**
     * Sets the value of the eMailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMailAddress(String value) {
        this.eMailAddress = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the upsFiled property.
     * 
     * @return
     *     possible object is
     *     {@link UPSFiledType }
     *     
     */
    public UPSFiledType getUPSFiled() {
        return upsFiled;
    }

    /**
     * Sets the value of the upsFiled property.
     * 
     * @param value
     *     allowed object is
     *     {@link UPSFiledType }
     *     
     */
    public void setUPSFiled(UPSFiledType value) {
        this.upsFiled = value;
    }

    /**
     * Gets the value of the shipperFiled property.
     * 
     * @return
     *     possible object is
     *     {@link ShipperFiledType }
     *     
     */
    public ShipperFiledType getShipperFiled() {
        return shipperFiled;
    }

    /**
     * Sets the value of the shipperFiled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipperFiledType }
     *     
     */
    public void setShipperFiled(ShipperFiledType value) {
        this.shipperFiled = value;
    }

}
