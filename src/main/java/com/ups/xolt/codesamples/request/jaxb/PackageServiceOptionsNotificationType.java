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
 * <p>Java class for PackageServiceOptionsNotificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageServiceOptionsNotificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NotificationCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EMailMessage" type="{}PackageServiceOptionsNotificationEMailMessageType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageServiceOptionsNotificationType", propOrder = {
    "notificationCode",
    "eMailMessage"
})
public class PackageServiceOptionsNotificationType {

    @XmlElement(name = "NotificationCode", required = true)
    protected String notificationCode;
    @XmlElement(name = "EMailMessage", required = true)
    protected PackageServiceOptionsNotificationEMailMessageType eMailMessage;

    /**
     * Gets the value of the notificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationCode() {
        return notificationCode;
    }

    /**
     * Sets the value of the notificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationCode(String value) {
        this.notificationCode = value;
    }

    /**
     * Gets the value of the eMailMessage property.
     * 
     * @return
     *     possible object is
     *     {@link PackageServiceOptionsNotificationEMailMessageType }
     *     
     */
    public PackageServiceOptionsNotificationEMailMessageType getEMailMessage() {
        return eMailMessage;
    }

    /**
     * Sets the value of the eMailMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageServiceOptionsNotificationEMailMessageType }
     *     
     */
    public void setEMailMessage(PackageServiceOptionsNotificationEMailMessageType value) {
        this.eMailMessage = value;
    }

}
