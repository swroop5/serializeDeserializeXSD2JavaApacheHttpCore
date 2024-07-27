//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.13 at 01:28:34 PM CEST 
//


package com.java.xsd.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Type.GDS.Tod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.GDS.Tod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sterbedatumZeitraum" type="{http://www.xjustiz.de}Type.GDS.Xdomea.ZeitraumType" minOccurs="0"/>
 *         &lt;element name="sterbedatum" type="{http://www.xjustiz.de}Type.GDS.Datumsangabe" minOccurs="0"/>
 *         &lt;element name="sterbeort" type="{http://www.xjustiz.de}Type.GDS.Anschrift" minOccurs="0"/>
 *         &lt;element name="sterbestandesamtBehoerdennummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *         &lt;element name="sterbestandesamtName" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeE" minOccurs="0"/>
 *         &lt;element name="sterberegisternummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *         &lt;element name="sterberegisterart" type="{http://www.xjustiz.de}Code.GDS.Registerart" minOccurs="0"/>
 *         &lt;element name="eintragungsdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="todErklaert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.GDS.Tod", propOrder = {
    "sterbedatumZeitraum",
    "sterbedatum",
    "sterbeort",
    "sterbestandesamtBehoerdennummer",
    "sterbestandesamtName",
    "sterberegisternummer",
    "sterberegisterart",
    "eintragungsdatum",
    "todErklaert"
})
public class TypeGDSTod {

    protected TypeGDSXdomeaZeitraumType sterbedatumZeitraum;
    protected String sterbedatum;
    protected TypeGDSAnschrift sterbeort;
    protected String sterbestandesamtBehoerdennummer;
    protected String sterbestandesamtName;
    protected String sterberegisternummer;
    protected CodeGDSRegisterart sterberegisterart;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eintragungsdatum;
    protected Boolean todErklaert;

    /**
     * Gets the value of the sterbedatumZeitraum property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSXdomeaZeitraumType }
     *     
     */
    public TypeGDSXdomeaZeitraumType getSterbedatumZeitraum() {
        return sterbedatumZeitraum;
    }

    /**
     * Sets the value of the sterbedatumZeitraum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSXdomeaZeitraumType }
     *     
     */
    public void setSterbedatumZeitraum(TypeGDSXdomeaZeitraumType value) {
        this.sterbedatumZeitraum = value;
    }

    /**
     * Gets the value of the sterbedatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSterbedatum() {
        return sterbedatum;
    }

    /**
     * Sets the value of the sterbedatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSterbedatum(String value) {
        this.sterbedatum = value;
    }

    /**
     * Gets the value of the sterbeort property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSAnschrift }
     *     
     */
    public TypeGDSAnschrift getSterbeort() {
        return sterbeort;
    }

    /**
     * Sets the value of the sterbeort property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSAnschrift }
     *     
     */
    public void setSterbeort(TypeGDSAnschrift value) {
        this.sterbeort = value;
    }

    /**
     * Gets the value of the sterbestandesamtBehoerdennummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSterbestandesamtBehoerdennummer() {
        return sterbestandesamtBehoerdennummer;
    }

    /**
     * Sets the value of the sterbestandesamtBehoerdennummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSterbestandesamtBehoerdennummer(String value) {
        this.sterbestandesamtBehoerdennummer = value;
    }

    /**
     * Gets the value of the sterbestandesamtName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSterbestandesamtName() {
        return sterbestandesamtName;
    }

    /**
     * Sets the value of the sterbestandesamtName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSterbestandesamtName(String value) {
        this.sterbestandesamtName = value;
    }

    /**
     * Gets the value of the sterberegisternummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSterberegisternummer() {
        return sterberegisternummer;
    }

    /**
     * Sets the value of the sterberegisternummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSterberegisternummer(String value) {
        this.sterberegisternummer = value;
    }

    /**
     * Gets the value of the sterberegisterart property.
     * 
     * @return
     *     possible object is
     *     {@link CodeGDSRegisterart }
     *     
     */
    public CodeGDSRegisterart getSterberegisterart() {
        return sterberegisterart;
    }

    /**
     * Sets the value of the sterberegisterart property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeGDSRegisterart }
     *     
     */
    public void setSterberegisterart(CodeGDSRegisterart value) {
        this.sterberegisterart = value;
    }

    /**
     * Gets the value of the eintragungsdatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEintragungsdatum() {
        return eintragungsdatum;
    }

    /**
     * Sets the value of the eintragungsdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEintragungsdatum(XMLGregorianCalendar value) {
        this.eintragungsdatum = value;
    }

    /**
     * Gets the value of the todErklaert property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTodErklaert() {
        return todErklaert;
    }

    /**
     * Sets the value of the todErklaert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTodErklaert(Boolean value) {
        this.todErklaert = value;
    }

}