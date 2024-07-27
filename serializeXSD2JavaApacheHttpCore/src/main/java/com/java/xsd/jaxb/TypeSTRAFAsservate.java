//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.13 at 01:28:34 PM CEST 
//


package com.java.xsd.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Type.STRAF.Asservate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.STRAF.Asservate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *         &lt;element name="asservatenID" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *         &lt;element name="auswahl_asservatmitteilung" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="statusmitteilung" type="{http://www.xjustiz.de}Code.STRAF.Asservat.Statusmitteilung.Typ3"/>
 *                   &lt;element name="auftrag" type="{http://www.xjustiz.de}Code.STRAF.Asservat.Auftrag.Typ3"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="grund" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *         &lt;element name="gegenstandsart" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *         &lt;element name="aufbewahrungsbehoerde" type="{http://www.xjustiz.de}Type.GDS.Behoerde" minOccurs="0"/>
 *         &lt;element name="gefahrgut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lagerhinweis" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *         &lt;element name="bezeichnung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *         &lt;element name="menge" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *         &lt;element name="einheit" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *         &lt;element name="herkunft" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="person" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer"/>
 *                   &lt;element name="herkunftsart" type="{http://www.xjustiz.de}Code.STRAF.Herkunftsart.Typ3" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gruppe" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *         &lt;element name="laufendeNummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *         &lt;element name="einlagerungsdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.STRAF.Asservate", propOrder = {
    "nummer",
    "asservatenID",
    "auswahlAsservatmitteilung",
    "grund",
    "gegenstandsart",
    "aufbewahrungsbehoerde",
    "gefahrgut",
    "lagerhinweis",
    "bezeichnung",
    "menge",
    "einheit",
    "herkunft",
    "gruppe",
    "laufendeNummer",
    "einlagerungsdatum"
})
public class TypeSTRAFAsservate {

    protected String nummer;
    @XmlElement(required = true)
    protected String asservatenID;
    @XmlElement(name = "auswahl_asservatmitteilung")
    protected TypeSTRAFAsservate.AuswahlAsservatmitteilung auswahlAsservatmitteilung;
    protected String grund;
    protected String gegenstandsart;
    protected TypeGDSBehoerde aufbewahrungsbehoerde;
    protected Boolean gefahrgut;
    protected String lagerhinweis;
    protected String bezeichnung;
    protected String menge;
    protected String einheit;
    protected List<TypeSTRAFAsservate.Herkunft> herkunft;
    protected String gruppe;
    protected String laufendeNummer;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar einlagerungsdatum;

    /**
     * Gets the value of the nummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNummer() {
        return nummer;
    }

    /**
     * Sets the value of the nummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNummer(String value) {
        this.nummer = value;
    }

    /**
     * Gets the value of the asservatenID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsservatenID() {
        return asservatenID;
    }

    /**
     * Sets the value of the asservatenID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsservatenID(String value) {
        this.asservatenID = value;
    }

    /**
     * Gets the value of the auswahlAsservatmitteilung property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSTRAFAsservate.AuswahlAsservatmitteilung }
     *     
     */
    public TypeSTRAFAsservate.AuswahlAsservatmitteilung getAuswahlAsservatmitteilung() {
        return auswahlAsservatmitteilung;
    }

    /**
     * Sets the value of the auswahlAsservatmitteilung property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSTRAFAsservate.AuswahlAsservatmitteilung }
     *     
     */
    public void setAuswahlAsservatmitteilung(TypeSTRAFAsservate.AuswahlAsservatmitteilung value) {
        this.auswahlAsservatmitteilung = value;
    }

    /**
     * Gets the value of the grund property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrund() {
        return grund;
    }

    /**
     * Sets the value of the grund property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrund(String value) {
        this.grund = value;
    }

    /**
     * Gets the value of the gegenstandsart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGegenstandsart() {
        return gegenstandsart;
    }

    /**
     * Sets the value of the gegenstandsart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGegenstandsart(String value) {
        this.gegenstandsart = value;
    }

    /**
     * Gets the value of the aufbewahrungsbehoerde property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSBehoerde }
     *     
     */
    public TypeGDSBehoerde getAufbewahrungsbehoerde() {
        return aufbewahrungsbehoerde;
    }

    /**
     * Sets the value of the aufbewahrungsbehoerde property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSBehoerde }
     *     
     */
    public void setAufbewahrungsbehoerde(TypeGDSBehoerde value) {
        this.aufbewahrungsbehoerde = value;
    }

    /**
     * Gets the value of the gefahrgut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGefahrgut() {
        return gefahrgut;
    }

    /**
     * Sets the value of the gefahrgut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGefahrgut(Boolean value) {
        this.gefahrgut = value;
    }

    /**
     * Gets the value of the lagerhinweis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLagerhinweis() {
        return lagerhinweis;
    }

    /**
     * Sets the value of the lagerhinweis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLagerhinweis(String value) {
        this.lagerhinweis = value;
    }

    /**
     * Gets the value of the bezeichnung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Sets the value of the bezeichnung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBezeichnung(String value) {
        this.bezeichnung = value;
    }

    /**
     * Gets the value of the menge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMenge() {
        return menge;
    }

    /**
     * Sets the value of the menge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMenge(String value) {
        this.menge = value;
    }

    /**
     * Gets the value of the einheit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEinheit() {
        return einheit;
    }

    /**
     * Sets the value of the einheit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEinheit(String value) {
        this.einheit = value;
    }

    /**
     * Gets the value of the herkunft property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the herkunft property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHerkunft().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSTRAFAsservate.Herkunft }
     * 
     * 
     */
    public List<TypeSTRAFAsservate.Herkunft> getHerkunft() {
        if (herkunft == null) {
            herkunft = new ArrayList<TypeSTRAFAsservate.Herkunft>();
        }
        return this.herkunft;
    }

    /**
     * Gets the value of the gruppe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGruppe() {
        return gruppe;
    }

    /**
     * Sets the value of the gruppe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGruppe(String value) {
        this.gruppe = value;
    }

    /**
     * Gets the value of the laufendeNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaufendeNummer() {
        return laufendeNummer;
    }

    /**
     * Sets the value of the laufendeNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaufendeNummer(String value) {
        this.laufendeNummer = value;
    }

    /**
     * Gets the value of the einlagerungsdatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEinlagerungsdatum() {
        return einlagerungsdatum;
    }

    /**
     * Sets the value of the einlagerungsdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEinlagerungsdatum(XMLGregorianCalendar value) {
        this.einlagerungsdatum = value;
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
     *       &lt;choice>
     *         &lt;element name="statusmitteilung" type="{http://www.xjustiz.de}Code.STRAF.Asservat.Statusmitteilung.Typ3"/>
     *         &lt;element name="auftrag" type="{http://www.xjustiz.de}Code.STRAF.Asservat.Auftrag.Typ3"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "statusmitteilung",
        "auftrag"
    })
    public static class AuswahlAsservatmitteilung {

        protected CodeSTRAFAsservatStatusmitteilungTyp3 statusmitteilung;
        protected CodeSTRAFAsservatAuftragTyp3 auftrag;

        /**
         * Gets the value of the statusmitteilung property.
         * 
         * @return
         *     possible object is
         *     {@link CodeSTRAFAsservatStatusmitteilungTyp3 }
         *     
         */
        public CodeSTRAFAsservatStatusmitteilungTyp3 getStatusmitteilung() {
            return statusmitteilung;
        }

        /**
         * Sets the value of the statusmitteilung property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeSTRAFAsservatStatusmitteilungTyp3 }
         *     
         */
        public void setStatusmitteilung(CodeSTRAFAsservatStatusmitteilungTyp3 value) {
            this.statusmitteilung = value;
        }

        /**
         * Gets the value of the auftrag property.
         * 
         * @return
         *     possible object is
         *     {@link CodeSTRAFAsservatAuftragTyp3 }
         *     
         */
        public CodeSTRAFAsservatAuftragTyp3 getAuftrag() {
            return auftrag;
        }

        /**
         * Sets the value of the auftrag property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeSTRAFAsservatAuftragTyp3 }
         *     
         */
        public void setAuftrag(CodeSTRAFAsservatAuftragTyp3 value) {
            this.auftrag = value;
        }

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
     *         &lt;element name="person" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer"/>
     *         &lt;element name="herkunftsart" type="{http://www.xjustiz.de}Code.STRAF.Herkunftsart.Typ3" minOccurs="0"/>
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
        "person",
        "herkunftsart"
    })
    public static class Herkunft {

        @XmlElement(required = true)
        protected TypeGDSRefRollennummer person;
        protected CodeSTRAFHerkunftsartTyp3 herkunftsart;

        /**
         * Gets the value of the person property.
         * 
         * @return
         *     possible object is
         *     {@link TypeGDSRefRollennummer }
         *     
         */
        public TypeGDSRefRollennummer getPerson() {
            return person;
        }

        /**
         * Sets the value of the person property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeGDSRefRollennummer }
         *     
         */
        public void setPerson(TypeGDSRefRollennummer value) {
            this.person = value;
        }

        /**
         * Gets the value of the herkunftsart property.
         * 
         * @return
         *     possible object is
         *     {@link CodeSTRAFHerkunftsartTyp3 }
         *     
         */
        public CodeSTRAFHerkunftsartTyp3 getHerkunftsart() {
            return herkunftsart;
        }

        /**
         * Sets the value of the herkunftsart property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeSTRAFHerkunftsartTyp3 }
         *     
         */
        public void setHerkunftsart(CodeSTRAFHerkunftsartTyp3 value) {
            this.herkunftsart = value;
        }

    }

}