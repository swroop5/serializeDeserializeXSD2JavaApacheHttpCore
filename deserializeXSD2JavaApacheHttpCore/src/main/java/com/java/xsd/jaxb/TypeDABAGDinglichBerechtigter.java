//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.13 at 01:28:34 PM CEST 
//


package com.java.xsd.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.DABAG.DinglichBerechtigter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.DABAG.DinglichBerechtigter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lfdNummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *         &lt;element name="anteil" type="{http://www.xjustiz.de}Type.DABAG.Anteil" minOccurs="0"/>
 *         &lt;element name="buchungsstelle" type="{http://www.xjustiz.de}Type.DABAG.Ref.DinglichBerechtigter" minOccurs="0"/>
 *         &lt;element name="herrschvermerk" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.DABAG.DinglichBerechtigter", propOrder = {
    "lfdNummer",
    "anteil",
    "buchungsstelle",
    "herrschvermerk"
})
public class TypeDABAGDinglichBerechtigter {

    protected String lfdNummer;
    protected TypeDABAGAnteil anteil;
    protected TypeDABAGRefDinglichBerechtigter buchungsstelle;
    protected Boolean herrschvermerk;

    /**
     * Gets the value of the lfdNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLfdNummer() {
        return lfdNummer;
    }

    /**
     * Sets the value of the lfdNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLfdNummer(String value) {
        this.lfdNummer = value;
    }

    /**
     * Gets the value of the anteil property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDABAGAnteil }
     *     
     */
    public TypeDABAGAnteil getAnteil() {
        return anteil;
    }

    /**
     * Sets the value of the anteil property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDABAGAnteil }
     *     
     */
    public void setAnteil(TypeDABAGAnteil value) {
        this.anteil = value;
    }

    /**
     * Gets the value of the buchungsstelle property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDABAGRefDinglichBerechtigter }
     *     
     */
    public TypeDABAGRefDinglichBerechtigter getBuchungsstelle() {
        return buchungsstelle;
    }

    /**
     * Sets the value of the buchungsstelle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDABAGRefDinglichBerechtigter }
     *     
     */
    public void setBuchungsstelle(TypeDABAGRefDinglichBerechtigter value) {
        this.buchungsstelle = value;
    }

    /**
     * Gets the value of the herrschvermerk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHerrschvermerk() {
        return herrschvermerk;
    }

    /**
     * Sets the value of the herrschvermerk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHerrschvermerk(Boolean value) {
        this.herrschvermerk = value;
    }

}
