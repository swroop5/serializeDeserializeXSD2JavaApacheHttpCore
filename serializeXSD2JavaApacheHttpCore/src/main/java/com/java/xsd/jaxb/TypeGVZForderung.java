//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.13 at 01:28:34 PM CEST 
//


package com.java.xsd.jaxb;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Type.GVZ.Forderung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.GVZ.Forderung">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="verrechnungsart" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="� 367 ZPO"/>
 *               &lt;enumeration value="� 497 ZPO"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="buchung" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="buchungsart" type="{http://www.xjustiz.de}Code.GDS.Forderungsteil"/>
 *                   &lt;element name="buchungstext" type="{http://www.xjustiz.de}Code.GVZ.Buchungstext" minOccurs="0"/>
 *                   &lt;element name="betrag" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag"/>
 *                   &lt;element name="forderungsnummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *                   &lt;element name="zinssatz" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="zinsmethode" type="{http://www.xjustiz.de}Code.GVZ.Zinsmethode" minOccurs="0"/>
 *                   &lt;element name="zinsbeginndatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="zinsendedatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.GVZ.Forderung", propOrder = {
    "verrechnungsart",
    "buchung"
})
public class TypeGVZForderung {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String verrechnungsart;
    @XmlElement(required = true)
    protected List<TypeGVZForderung.Buchung> buchung;

    /**
     * Gets the value of the verrechnungsart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerrechnungsart() {
        return verrechnungsart;
    }

    /**
     * Sets the value of the verrechnungsart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerrechnungsart(String value) {
        this.verrechnungsart = value;
    }

    /**
     * Gets the value of the buchung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buchung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuchung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeGVZForderung.Buchung }
     * 
     * 
     */
    public List<TypeGVZForderung.Buchung> getBuchung() {
        if (buchung == null) {
            buchung = new ArrayList<TypeGVZForderung.Buchung>();
        }
        return this.buchung;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="buchungsart" type="{http://www.xjustiz.de}Code.GDS.Forderungsteil"/>
     *         &lt;element name="buchungstext" type="{http://www.xjustiz.de}Code.GVZ.Buchungstext" minOccurs="0"/>
     *         &lt;element name="betrag" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag"/>
     *         &lt;element name="forderungsnummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
     *         &lt;element name="zinssatz" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="zinsmethode" type="{http://www.xjustiz.de}Code.GVZ.Zinsmethode" minOccurs="0"/>
     *         &lt;element name="zinsbeginndatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="zinsendedatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "datum",
        "buchungsart",
        "buchungstext",
        "betrag",
        "forderungsnummer",
        "zinssatz",
        "zinsmethode",
        "zinsbeginndatum",
        "zinsendedatum"
    })
    public static class Buchung {

        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datum;
        @XmlElement(required = true)
        protected CodeGDSForderungsteil buchungsart;
        protected CodeGVZBuchungstext buchungstext;
        @XmlElement(required = true)
        protected TypeGDSGeldbetrag betrag;
        protected String forderungsnummer;
        protected BigDecimal zinssatz;
        protected CodeGVZZinsmethode zinsmethode;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar zinsbeginndatum;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar zinsendedatum;

        /**
         * Gets the value of the datum property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDatum() {
            return datum;
        }

        /**
         * Sets the value of the datum property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDatum(XMLGregorianCalendar value) {
            this.datum = value;
        }

        /**
         * Gets the value of the buchungsart property.
         * 
         * @return
         *     possible object is
         *     {@link CodeGDSForderungsteil }
         *     
         */
        public CodeGDSForderungsteil getBuchungsart() {
            return buchungsart;
        }

        /**
         * Sets the value of the buchungsart property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeGDSForderungsteil }
         *     
         */
        public void setBuchungsart(CodeGDSForderungsteil value) {
            this.buchungsart = value;
        }

        /**
         * Gets the value of the buchungstext property.
         * 
         * @return
         *     possible object is
         *     {@link CodeGVZBuchungstext }
         *     
         */
        public CodeGVZBuchungstext getBuchungstext() {
            return buchungstext;
        }

        /**
         * Sets the value of the buchungstext property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeGVZBuchungstext }
         *     
         */
        public void setBuchungstext(CodeGVZBuchungstext value) {
            this.buchungstext = value;
        }

        /**
         * Gets the value of the betrag property.
         * 
         * @return
         *     possible object is
         *     {@link TypeGDSGeldbetrag }
         *     
         */
        public TypeGDSGeldbetrag getBetrag() {
            return betrag;
        }

        /**
         * Sets the value of the betrag property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeGDSGeldbetrag }
         *     
         */
        public void setBetrag(TypeGDSGeldbetrag value) {
            this.betrag = value;
        }

        /**
         * Gets the value of the forderungsnummer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getForderungsnummer() {
            return forderungsnummer;
        }

        /**
         * Sets the value of the forderungsnummer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setForderungsnummer(String value) {
            this.forderungsnummer = value;
        }

        /**
         * Gets the value of the zinssatz property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZinssatz() {
            return zinssatz;
        }

        /**
         * Sets the value of the zinssatz property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZinssatz(BigDecimal value) {
            this.zinssatz = value;
        }

        /**
         * Gets the value of the zinsmethode property.
         * 
         * @return
         *     possible object is
         *     {@link CodeGVZZinsmethode }
         *     
         */
        public CodeGVZZinsmethode getZinsmethode() {
            return zinsmethode;
        }

        /**
         * Sets the value of the zinsmethode property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeGVZZinsmethode }
         *     
         */
        public void setZinsmethode(CodeGVZZinsmethode value) {
            this.zinsmethode = value;
        }

        /**
         * Gets the value of the zinsbeginndatum property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getZinsbeginndatum() {
            return zinsbeginndatum;
        }

        /**
         * Sets the value of the zinsbeginndatum property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setZinsbeginndatum(XMLGregorianCalendar value) {
            this.zinsbeginndatum = value;
        }

        /**
         * Gets the value of the zinsendedatum property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getZinsendedatum() {
            return zinsendedatum;
        }

        /**
         * Sets the value of the zinsendedatum property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setZinsendedatum(XMLGregorianCalendar value) {
            this.zinsendedatum = value;
        }

    }

}