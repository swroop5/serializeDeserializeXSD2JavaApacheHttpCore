//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.13 at 01:28:34 PM CEST 
//


package com.java.xsd.jaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="nachrichtenkopf" type="{http://www.xjustiz.de}Type.GDS.Nachrichtenkopf"/>
 *         &lt;element name="grunddaten" type="{http://www.xjustiz.de}Type.GDS.Grunddaten"/>
 *         &lt;element name="fachdaten">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="steuerungsdaten">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="verwendungszweck" type="{http://www.xjustiz.de}Type.STRAF.BFJ.Verwendungszweck"/>
 *                             &lt;element name="auskunftsland" type="{http://www.xjustiz.de}Code.GDS.Staaten.Typ3"/>
 *                             &lt;element name="antworttyp" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="weitereAngabenBeteiligter" type="{http://www.xjustiz.de}Type.STRAF.BFJ.WeitereAngabenBeteiligter" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="entscheidungsdaten" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="anzahlEntscheidungen" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *                             &lt;element name="entscheidung" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ordnungsdaten" type="{http://www.xjustiz.de}Type.STRAF.BFJ.Ordnungsdaten"/>
 *                                       &lt;element name="inhaltDerEntscheidung">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="datumRechtskraft" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 &lt;element name="tat" type="{http://www.xjustiz.de}Type.STRAF.BFJ.Straftat" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="sanktion" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeE" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="zusatzinformationen" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeE" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="informationFehler" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeE" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "", propOrder = {
    "nachrichtenkopf",
    "grunddaten",
    "fachdaten"
})
@XmlRootElement(name = "nachricht.straf.bfj.bzr.auskunftserteilung.auslandsnachricht.0500103")
public class NachrichtStrafBfjBzrAuskunftserteilungAuslandsnachricht0500103 {

    @XmlElement(required = true)
    protected TypeGDSNachrichtenkopf nachrichtenkopf;
    @XmlElement(required = true)
    protected TypeGDSGrunddaten grunddaten;
    @XmlElement(required = true)
    protected NachrichtStrafBfjBzrAuskunftserteilungAuslandsnachricht0500103 .Fachdaten fachdaten;

    /**
     * Gets the value of the nachrichtenkopf property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSNachrichtenkopf }
     *     
     */
    public TypeGDSNachrichtenkopf getNachrichtenkopf() {
        return nachrichtenkopf;
    }

    /**
     * Sets the value of the nachrichtenkopf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSNachrichtenkopf }
     *     
     */
    public void setNachrichtenkopf(TypeGDSNachrichtenkopf value) {
        this.nachrichtenkopf = value;
    }

    /**
     * Gets the value of the grunddaten property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSGrunddaten }
     *     
     */
    public TypeGDSGrunddaten getGrunddaten() {
        return grunddaten;
    }

    /**
     * Sets the value of the grunddaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSGrunddaten }
     *     
     */
    public void setGrunddaten(TypeGDSGrunddaten value) {
        this.grunddaten = value;
    }

    /**
     * Gets the value of the fachdaten property.
     * 
     * @return
     *     possible object is
     *     {@link NachrichtStrafBfjBzrAuskunftserteilungAuslandsnachricht0500103 .Fachdaten }
     *     
     */
    public NachrichtStrafBfjBzrAuskunftserteilungAuslandsnachricht0500103 .Fachdaten getFachdaten() {
        return fachdaten;
    }

    /**
     * Sets the value of the fachdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link NachrichtStrafBfjBzrAuskunftserteilungAuslandsnachricht0500103 .Fachdaten }
     *     
     */
    public void setFachdaten(NachrichtStrafBfjBzrAuskunftserteilungAuslandsnachricht0500103 .Fachdaten value) {
        this.fachdaten = value;
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
     *         &lt;element name="steuerungsdaten">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="verwendungszweck" type="{http://www.xjustiz.de}Type.STRAF.BFJ.Verwendungszweck"/>
     *                   &lt;element name="auskunftsland" type="{http://www.xjustiz.de}Code.GDS.Staaten.Typ3"/>
     *                   &lt;element name="antworttyp" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="weitereAngabenBeteiligter" type="{http://www.xjustiz.de}Type.STRAF.BFJ.WeitereAngabenBeteiligter" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="entscheidungsdaten" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="anzahlEntscheidungen" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
     *                   &lt;element name="entscheidung" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ordnungsdaten" type="{http://www.xjustiz.de}Type.STRAF.BFJ.Ordnungsdaten"/>
     *                             &lt;element name="inhaltDerEntscheidung">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="datumRechtskraft" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="tat" type="{http://www.xjustiz.de}Type.STRAF.BFJ.Straftat" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="sanktion" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeE" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="zusatzinformationen" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeE" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="informationFehler" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeE" maxOccurs="unbounded" minOccurs="0"/>
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
        "steuerungsdaten",
        "weitereAngabenBeteiligter",
        "entscheidungsdaten",
        "informationFehler"
    })
    public static class Fachdaten {

        @XmlElement(required = true)
        protected NachrichtStrafBfjBzrAuskunftserteilungAuslandsnachricht0500103 .Fachdaten.Steuerungsdaten steuerungsdaten;
        protected List<TypeSTRAFBFJWeitereAngabenBeteiligter> weitereAngabenBeteiligter;
        protected NachrichtStrafBfjBzrAuskunftserteilungAuslandsnachricht0500103 .Fachdaten.Entscheidungsdaten entscheidungsdaten;
        protected List<String> informationFehler;

        /**
         * Gets the value of the steuerungsdaten property.
         * 
         * @return
         *     possible object is
         *     {@link NachrichtStrafBfjBzrAuskunftserteilungAuslandsnachricht0500103 .Fachdaten.Steuerungsdaten }
         *     
         */
        public NachrichtStrafBfjBzrAuskunftserteilungAuslandsnachricht0500103 .Fachdaten.Steuerungsdaten getSteuerungsdaten() {
            return steuerungsdaten;
        }

        /**
         * Sets the value of the steuerungsdaten property.
         * 
         * @param value
         *     allowed object is
         *     {@link NachrichtStrafBfjBzrAuskunftserteilungAuslandsnachricht0500103 .Fachdaten.Steuerungsdaten }
         *     
         */
        public void setSteuerungsdaten(NachrichtStrafBfjBzrAuskunftserteilungAuslandsnachricht0500103 .Fachdaten.Steuerungsdaten value) {
            this.steuerungsdaten = value;
        }

        /**
         * Gets the value of the weitereAngabenBeteiligter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the weitereAngabenBeteiligter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWeitereAngabenBeteiligter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeSTRAFBFJWeitereAngabenBeteiligter }
         * 
         * 
         */
        public List<TypeSTRAFBFJWeitereAngabenBeteiligter> getWeitereAngabenBeteiligter() {
            if (weitereAngabenBeteiligter == null) {
                weitereAngabenBeteiligter = new ArrayList<TypeSTRAFBFJWeitereAngabenBeteiligter>();
            }
            return this.weitereAngabenBeteiligter;
        }

        /**
         * Gets the value of the entscheidungsdaten property.
         * 
         * @return
         *     possible object is
         *     {@link NachrichtStrafBfjBzrAuskunftserteilungAuslandsnachricht0500103 .Fachdaten.Entscheidungsdaten }
         *     
         */
        public NachrichtStrafBfjBzrAuskunftserteilungAuslandsnachricht0500103 .Fachdaten.Entscheidungsdaten getEntscheidungsdaten() {
            return entscheidungsdaten;
        }

        /**
         * Sets the value of the entscheidungsdaten property.
         * 
         * @param value
         *     allowed object is
         *     {@link NachrichtStrafBfjBzrAuskunftserteilungAuslandsnachricht0500103 .Fachdaten.Entscheidungsdaten }
         *     
         */
        public void setEntscheidungsdaten(NachrichtStrafBfjBzrAuskunftserteilungAuslandsnachricht0500103 .Fachdaten.Entscheidungsdaten value) {
            this.entscheidungsdaten = value;
        }

        /**
         * Gets the value of the informationFehler property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the informationFehler property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInformationFehler().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getInformationFehler() {
            if (informationFehler == null) {
                informationFehler = new ArrayList<String>();
            }
            return this.informationFehler;
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
         *         &lt;element name="anzahlEntscheidungen" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
         *         &lt;element name="entscheidung" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ordnungsdaten" type="{http://www.xjustiz.de}Type.STRAF.BFJ.Ordnungsdaten"/>
         *                   &lt;element name="inhaltDerEntscheidung">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="datumRechtskraft" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="tat" type="{http://www.xjustiz.de}Type.STRAF.BFJ.Straftat" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="sanktion" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeE" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="zusatzinformationen" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeE" maxOccurs="unbounded" minOccurs="0"/>
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
        @XmlType(name = "", propOrder = {
            "anzahlEntscheidungen",
            "entscheidung"
        })
        public static class Entscheidungsdaten {

            @XmlElement(required = true)
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger anzahlEntscheidungen;
            protected List<NachrichtStrafBfjBzrAuskunftserteilungAuslandsnachricht0500103 .Fachdaten.Entscheidungsdaten.Entscheidung> entscheidung;

            /**
             * Gets the value of the anzahlEntscheidungen property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getAnzahlEntscheidungen() {
                return anzahlEntscheidungen;
            }

            /**
             * Sets the value of the anzahlEntscheidungen property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setAnzahlEntscheidungen(BigInteger value) {
                this.anzahlEntscheidungen = value;
            }

            /**
             * Gets the value of the entscheidung property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the entscheidung property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEntscheidung().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link NachrichtStrafBfjBzrAuskunftserteilungAuslandsnachricht0500103 .Fachdaten.Entscheidungsdaten.Entscheidung }
             * 
             * 
             */
            public List<NachrichtStrafBfjBzrAuskunftserteilungAuslandsnachricht0500103 .Fachdaten.Entscheidungsdaten.Entscheidung> getEntscheidung() {
                if (entscheidung == null) {
                    entscheidung = new ArrayList<NachrichtStrafBfjBzrAuskunftserteilungAuslandsnachricht0500103 .Fachdaten.Entscheidungsdaten.Entscheidung>();
                }
                return this.entscheidung;
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
             *         &lt;element name="ordnungsdaten" type="{http://www.xjustiz.de}Type.STRAF.BFJ.Ordnungsdaten"/>
             *         &lt;element name="inhaltDerEntscheidung">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="datumRechtskraft" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="tat" type="{http://www.xjustiz.de}Type.STRAF.BFJ.Straftat" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="sanktion" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeE" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="zusatzinformationen" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeE" maxOccurs="unbounded" minOccurs="0"/>
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
                "ordnungsdaten",
                "inhaltDerEntscheidung",
                "sanktion",
                "zusatzinformationen"
            })
            public static class Entscheidung {

                @XmlElement(required = true)
                protected TypeSTRAFBFJOrdnungsdaten ordnungsdaten;
                @XmlElement(required = true)
                protected NachrichtStrafBfjBzrAuskunftserteilungAuslandsnachricht0500103 .Fachdaten.Entscheidungsdaten.Entscheidung.InhaltDerEntscheidung inhaltDerEntscheidung;
                protected List<String> sanktion;
                protected List<String> zusatzinformationen;

                /**
                 * Gets the value of the ordnungsdaten property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TypeSTRAFBFJOrdnungsdaten }
                 *     
                 */
                public TypeSTRAFBFJOrdnungsdaten getOrdnungsdaten() {
                    return ordnungsdaten;
                }

                /**
                 * Sets the value of the ordnungsdaten property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TypeSTRAFBFJOrdnungsdaten }
                 *     
                 */
                public void setOrdnungsdaten(TypeSTRAFBFJOrdnungsdaten value) {
                    this.ordnungsdaten = value;
                }

                /**
                 * Gets the value of the inhaltDerEntscheidung property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link NachrichtStrafBfjBzrAuskunftserteilungAuslandsnachricht0500103 .Fachdaten.Entscheidungsdaten.Entscheidung.InhaltDerEntscheidung }
                 *     
                 */
                public NachrichtStrafBfjBzrAuskunftserteilungAuslandsnachricht0500103 .Fachdaten.Entscheidungsdaten.Entscheidung.InhaltDerEntscheidung getInhaltDerEntscheidung() {
                    return inhaltDerEntscheidung;
                }

                /**
                 * Sets the value of the inhaltDerEntscheidung property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link NachrichtStrafBfjBzrAuskunftserteilungAuslandsnachricht0500103 .Fachdaten.Entscheidungsdaten.Entscheidung.InhaltDerEntscheidung }
                 *     
                 */
                public void setInhaltDerEntscheidung(NachrichtStrafBfjBzrAuskunftserteilungAuslandsnachricht0500103 .Fachdaten.Entscheidungsdaten.Entscheidung.InhaltDerEntscheidung value) {
                    this.inhaltDerEntscheidung = value;
                }

                /**
                 * Gets the value of the sanktion property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the sanktion property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSanktion().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getSanktion() {
                    if (sanktion == null) {
                        sanktion = new ArrayList<String>();
                    }
                    return this.sanktion;
                }

                /**
                 * Gets the value of the zusatzinformationen property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the zusatzinformationen property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getZusatzinformationen().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getZusatzinformationen() {
                    if (zusatzinformationen == null) {
                        zusatzinformationen = new ArrayList<String>();
                    }
                    return this.zusatzinformationen;
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
                 *         &lt;element name="datumRechtskraft" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="tat" type="{http://www.xjustiz.de}Type.STRAF.BFJ.Straftat" maxOccurs="unbounded" minOccurs="0"/>
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
                    "datumRechtskraft",
                    "tat"
                })
                public static class InhaltDerEntscheidung {

                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar datumRechtskraft;
                    protected List<TypeSTRAFBFJStraftat> tat;

                    /**
                     * Gets the value of the datumRechtskraft property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDatumRechtskraft() {
                        return datumRechtskraft;
                    }

                    /**
                     * Sets the value of the datumRechtskraft property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDatumRechtskraft(XMLGregorianCalendar value) {
                        this.datumRechtskraft = value;
                    }

                    /**
                     * Gets the value of the tat property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the tat property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getTat().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link TypeSTRAFBFJStraftat }
                     * 
                     * 
                     */
                    public List<TypeSTRAFBFJStraftat> getTat() {
                        if (tat == null) {
                            tat = new ArrayList<TypeSTRAFBFJStraftat>();
                        }
                        return this.tat;
                    }

                }

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
         *         &lt;element name="verwendungszweck" type="{http://www.xjustiz.de}Type.STRAF.BFJ.Verwendungszweck"/>
         *         &lt;element name="auskunftsland" type="{http://www.xjustiz.de}Code.GDS.Staaten.Typ3"/>
         *         &lt;element name="antworttyp" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
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
            "verwendungszweck",
            "auskunftsland",
            "antworttyp"
        })
        public static class Steuerungsdaten {

            @XmlElement(required = true)
            protected TypeSTRAFBFJVerwendungszweck verwendungszweck;
            @XmlElement(required = true)
            protected CodeGDSStaatenTyp3 auskunftsland;
            @XmlElement(required = true)
            protected String antworttyp;

            /**
             * Gets the value of the verwendungszweck property.
             * 
             * @return
             *     possible object is
             *     {@link TypeSTRAFBFJVerwendungszweck }
             *     
             */
            public TypeSTRAFBFJVerwendungszweck getVerwendungszweck() {
                return verwendungszweck;
            }

            /**
             * Sets the value of the verwendungszweck property.
             * 
             * @param value
             *     allowed object is
             *     {@link TypeSTRAFBFJVerwendungszweck }
             *     
             */
            public void setVerwendungszweck(TypeSTRAFBFJVerwendungszweck value) {
                this.verwendungszweck = value;
            }

            /**
             * Gets the value of the auskunftsland property.
             * 
             * @return
             *     possible object is
             *     {@link CodeGDSStaatenTyp3 }
             *     
             */
            public CodeGDSStaatenTyp3 getAuskunftsland() {
                return auskunftsland;
            }

            /**
             * Sets the value of the auskunftsland property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodeGDSStaatenTyp3 }
             *     
             */
            public void setAuskunftsland(CodeGDSStaatenTyp3 value) {
                this.auskunftsland = value;
            }

            /**
             * Gets the value of the antworttyp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAntworttyp() {
                return antworttyp;
            }

            /**
             * Sets the value of the antworttyp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAntworttyp(String value) {
                this.antworttyp = value;
            }

        }

    }

}
