//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.03 at 08:56:33 AM CDT 
//


package com.ups.xolt.codesamples.request.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackagingType" type="{}PackagingTypeType" minOccurs="0"/&gt;
 *         &lt;element name="Dimensions" type="{}DimensionsType" minOccurs="0"/&gt;
 *         &lt;element name="DimWeight" type="{}PackageWeightType" minOccurs="0"/&gt;
 *         &lt;element name="PackageWeight" type="{}PackageWeightType" minOccurs="0"/&gt;
 *         &lt;element name="LargePackageIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceNumber" type="{}ReferenceNumberType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalHandling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackageServiceOptions" type="{}PackageServiceOptionsType" minOccurs="0"/&gt;
 *         &lt;element name="HazMatPackageInformation" type="{}HazMatPackageInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageType", propOrder = {
    "description",
    "packagingType",
    "dimensions",
    "dimWeight",
    "packageWeight",
    "largePackageIndicator",
    "referenceNumber",
    "additionalHandling",
    "packageServiceOptions",
    "hazMatPackageInformation"
})
public class PackageType {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "PackagingType")
    protected PackagingTypeType packagingType;
    @XmlElement(name = "Dimensions")
    protected DimensionsType dimensions;
    @XmlElement(name = "DimWeight")
    protected PackageWeightType dimWeight;
    @XmlElement(name = "PackageWeight")
    protected PackageWeightType packageWeight;
    @XmlElement(name = "LargePackageIndicator")
    protected String largePackageIndicator;
    @XmlElement(name = "ReferenceNumber")
    protected List<ReferenceNumberType> referenceNumber;
    @XmlElement(name = "AdditionalHandling")
    protected String additionalHandling;
    @XmlElement(name = "PackageServiceOptions")
    protected PackageServiceOptionsType packageServiceOptions;
    @XmlElement(name = "HazMatPackageInformation")
    protected HazMatPackageInformationType hazMatPackageInformation;

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
     * Gets the value of the packagingType property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingTypeType }
     *     
     */
    public PackagingTypeType getPackagingType() {
        return packagingType;
    }

    /**
     * Sets the value of the packagingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingTypeType }
     *     
     */
    public void setPackagingType(PackagingTypeType value) {
        this.packagingType = value;
    }

    /**
     * Gets the value of the dimensions property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionsType }
     *     
     */
    public DimensionsType getDimensions() {
        return dimensions;
    }

    /**
     * Sets the value of the dimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionsType }
     *     
     */
    public void setDimensions(DimensionsType value) {
        this.dimensions = value;
    }

    /**
     * Gets the value of the dimWeight property.
     * 
     * @return
     *     possible object is
     *     {@link PackageWeightType }
     *     
     */
    public PackageWeightType getDimWeight() {
        return dimWeight;
    }

    /**
     * Sets the value of the dimWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageWeightType }
     *     
     */
    public void setDimWeight(PackageWeightType value) {
        this.dimWeight = value;
    }

    /**
     * Gets the value of the packageWeight property.
     * 
     * @return
     *     possible object is
     *     {@link PackageWeightType }
     *     
     */
    public PackageWeightType getPackageWeight() {
        return packageWeight;
    }

    /**
     * Sets the value of the packageWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageWeightType }
     *     
     */
    public void setPackageWeight(PackageWeightType value) {
        this.packageWeight = value;
    }

    /**
     * Gets the value of the largePackageIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLargePackageIndicator() {
        return largePackageIndicator;
    }

    /**
     * Sets the value of the largePackageIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLargePackageIndicator(String value) {
        this.largePackageIndicator = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceNumberType }
     * 
     * 
     */
    public List<ReferenceNumberType> getReferenceNumber() {
        if (referenceNumber == null) {
            referenceNumber = new ArrayList<ReferenceNumberType>();
        }
        return this.referenceNumber;
    }

    /**
     * Gets the value of the additionalHandling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalHandling() {
        return additionalHandling;
    }

    /**
     * Sets the value of the additionalHandling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalHandling(String value) {
        this.additionalHandling = value;
    }

    /**
     * Gets the value of the packageServiceOptions property.
     * 
     * @return
     *     possible object is
     *     {@link PackageServiceOptionsType }
     *     
     */
    public PackageServiceOptionsType getPackageServiceOptions() {
        return packageServiceOptions;
    }

    /**
     * Sets the value of the packageServiceOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageServiceOptionsType }
     *     
     */
    public void setPackageServiceOptions(PackageServiceOptionsType value) {
        this.packageServiceOptions = value;
    }

    /**
     * Gets the value of the hazMatPackageInformation property.
     * 
     * @return
     *     possible object is
     *     {@link HazMatPackageInformationType }
     *     
     */
    public HazMatPackageInformationType getHazMatPackageInformation() {
        return hazMatPackageInformation;
    }

    /**
     * Sets the value of the hazMatPackageInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazMatPackageInformationType }
     *     
     */
    public void setHazMatPackageInformation(HazMatPackageInformationType value) {
        this.hazMatPackageInformation = value;
    }

}
