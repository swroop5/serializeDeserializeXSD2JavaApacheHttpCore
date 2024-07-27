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
 *     &lt;extension base="{http://www.xjustiz.de}Type.GDS.Basisnachricht">
 *       &lt;sequence>
 *         &lt;element name="schriftgutobjekte" type="{http://www.xjustiz.de}Type.GDS.Schriftgutobjekte" minOccurs="0"/>
 *         &lt;element name="fachdaten">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="erledigung" type="{http://www.xjustiz.de}Type.STRAF.Erledigung" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="tatvorwurf" type="{http://www.xjustiz.de}Type.STRAF.Tatvorwurf" maxOccurs="unbounded"/>
 *                   &lt;element name="letzteTat" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="anfangsdatum" type="{http://www.xjustiz.de}Type.GDS.Datumsangabe"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="entscheidung" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entscheidungsbehoerde">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.xjustiz.de}Type.GDS.Behoerde">
 *                                     &lt;sequence>
 *                                       &lt;element name="bezeichnung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *                                       &lt;element name="aktenzeichen" type="{http://www.xjustiz.de}Type.GDS.Aktenzeichen" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="erstesEntscheidungsdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="rechtskraft" type="{http://www.xjustiz.de}Type.STRAF.Rechtskraft" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="entscheidungstenor" type="{http://www.xjustiz.de}Type.STRAF.Entscheidungstenor"/>
 *                             &lt;element name="gewerbezusammenhang" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="weitereAngaben" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="textkennzahl" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *                             &lt;element name="text" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *                             &lt;element name="zusatztext" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
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
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "schriftgutobjekte",
    "fachdaten"
})
@XmlRootElement(name = "nachricht.straf.bzr-auszug.justizZuExtern.0500004")
public class NachrichtStrafBzrAuszugJustizZuExtern0500004
    extends TypeGDSBasisnachricht
{

    protected TypeGDSSchriftgutobjekte schriftgutobjekte;
    @XmlElement(required = true)
    protected NachrichtStrafBzrAuszugJustizZuExtern0500004 .Fachdaten fachdaten;

    /**
     * Gets the value of the schriftgutobjekte property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSSchriftgutobjekte }
     *     
     */
    public TypeGDSSchriftgutobjekte getSchriftgutobjekte() {
        return schriftgutobjekte;
    }

    /**
     * Sets the value of the schriftgutobjekte property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSSchriftgutobjekte }
     *     
     */
    public void setSchriftgutobjekte(TypeGDSSchriftgutobjekte value) {
        this.schriftgutobjekte = value;
    }

    /**
     * Gets the value of the fachdaten property.
     * 
     * @return
     *     possible object is
     *     {@link NachrichtStrafBzrAuszugJustizZuExtern0500004 .Fachdaten }
     *     
     */
    public NachrichtStrafBzrAuszugJustizZuExtern0500004 .Fachdaten getFachdaten() {
        return fachdaten;
    }

    /**
     * Sets the value of the fachdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link NachrichtStrafBzrAuszugJustizZuExtern0500004 .Fachdaten }
     *     
     */
    public void setFachdaten(NachrichtStrafBzrAuszugJustizZuExtern0500004 .Fachdaten value) {
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
     *         &lt;element name="erledigung" type="{http://www.xjustiz.de}Type.STRAF.Erledigung" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="tatvorwurf" type="{http://www.xjustiz.de}Type.STRAF.Tatvorwurf" maxOccurs="unbounded"/>
     *         &lt;element name="letzteTat" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="anfangsdatum" type="{http://www.xjustiz.de}Type.GDS.Datumsangabe"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="entscheidung" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entscheidungsbehoerde">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.xjustiz.de}Type.GDS.Behoerde">
     *                           &lt;sequence>
     *                             &lt;element name="bezeichnung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
     *                             &lt;element name="aktenzeichen" type="{http://www.xjustiz.de}Type.GDS.Aktenzeichen" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="erstesEntscheidungsdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="rechtskraft" type="{http://www.xjustiz.de}Type.STRAF.Rechtskraft" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="entscheidungstenor" type="{http://www.xjustiz.de}Type.STRAF.Entscheidungstenor"/>
     *                   &lt;element name="gewerbezusammenhang" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="weitereAngaben" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="textkennzahl" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
     *                   &lt;element name="text" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
     *                   &lt;element name="zusatztext" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
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
        "erledigung",
        "tatvorwurf",
        "letzteTat",
        "entscheidung",
        "weitereAngaben"
    })
    public static class Fachdaten {

        protected List<TypeSTRAFErledigung> erledigung;
        @XmlElement(required = true)
        protected List<TypeSTRAFTatvorwurf> tatvorwurf;
        protected NachrichtStrafBzrAuszugJustizZuExtern0500004 .Fachdaten.LetzteTat letzteTat;
        protected NachrichtStrafBzrAuszugJustizZuExtern0500004 .Fachdaten.Entscheidung entscheidung;
        protected List<NachrichtStrafBzrAuszugJustizZuExtern0500004 .Fachdaten.WeitereAngaben> weitereAngaben;

        /**
         * Gets the value of the erledigung property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the erledigung property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getErledigung().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeSTRAFErledigung }
         * 
         * 
         */
        public List<TypeSTRAFErledigung> getErledigung() {
            if (erledigung == null) {
                erledigung = new ArrayList<TypeSTRAFErledigung>();
            }
            return this.erledigung;
        }

        /**
         * Gets the value of the tatvorwurf property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tatvorwurf property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTatvorwurf().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeSTRAFTatvorwurf }
         * 
         * 
         */
        public List<TypeSTRAFTatvorwurf> getTatvorwurf() {
            if (tatvorwurf == null) {
                tatvorwurf = new ArrayList<TypeSTRAFTatvorwurf>();
            }
            return this.tatvorwurf;
        }

        /**
         * Gets the value of the letzteTat property.
         * 
         * @return
         *     possible object is
         *     {@link NachrichtStrafBzrAuszugJustizZuExtern0500004 .Fachdaten.LetzteTat }
         *     
         */
        public NachrichtStrafBzrAuszugJustizZuExtern0500004 .Fachdaten.LetzteTat getLetzteTat() {
            return letzteTat;
        }

        /**
         * Sets the value of the letzteTat property.
         * 
         * @param value
         *     allowed object is
         *     {@link NachrichtStrafBzrAuszugJustizZuExtern0500004 .Fachdaten.LetzteTat }
         *     
         */
        public void setLetzteTat(NachrichtStrafBzrAuszugJustizZuExtern0500004 .Fachdaten.LetzteTat value) {
            this.letzteTat = value;
        }

        /**
         * Gets the value of the entscheidung property.
         * 
         * @return
         *     possible object is
         *     {@link NachrichtStrafBzrAuszugJustizZuExtern0500004 .Fachdaten.Entscheidung }
         *     
         */
        public NachrichtStrafBzrAuszugJustizZuExtern0500004 .Fachdaten.Entscheidung getEntscheidung() {
            return entscheidung;
        }

        /**
         * Sets the value of the entscheidung property.
         * 
         * @param value
         *     allowed object is
         *     {@link NachrichtStrafBzrAuszugJustizZuExtern0500004 .Fachdaten.Entscheidung }
         *     
         */
        public void setEntscheidung(NachrichtStrafBzrAuszugJustizZuExtern0500004 .Fachdaten.Entscheidung value) {
            this.entscheidung = value;
        }

        /**
         * Gets the value of the weitereAngaben property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the weitereAngaben property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWeitereAngaben().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NachrichtStrafBzrAuszugJustizZuExtern0500004 .Fachdaten.WeitereAngaben }
         * 
         * 
         */
        public List<NachrichtStrafBzrAuszugJustizZuExtern0500004 .Fachdaten.WeitereAngaben> getWeitereAngaben() {
            if (weitereAngaben == null) {
                weitereAngaben = new ArrayList<NachrichtStrafBzrAuszugJustizZuExtern0500004 .Fachdaten.WeitereAngaben>();
            }
            return this.weitereAngaben;
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
         *         &lt;element name="entscheidungsbehoerde">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.xjustiz.de}Type.GDS.Behoerde">
         *                 &lt;sequence>
         *                   &lt;element name="bezeichnung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
         *                   &lt;element name="aktenzeichen" type="{http://www.xjustiz.de}Type.GDS.Aktenzeichen" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="erstesEntscheidungsdatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="rechtskraft" type="{http://www.xjustiz.de}Type.STRAF.Rechtskraft" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="entscheidungstenor" type="{http://www.xjustiz.de}Type.STRAF.Entscheidungstenor"/>
         *         &lt;element name="gewerbezusammenhang" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
            "entscheidungsbehoerde",
            "erstesEntscheidungsdatum",
            "rechtskraft",
            "entscheidungstenor",
            "gewerbezusammenhang"
        })
        public static class Entscheidung {

            @XmlElement(required = true)
            protected NachrichtStrafBzrAuszugJustizZuExtern0500004 .Fachdaten.Entscheidung.Entscheidungsbehoerde entscheidungsbehoerde;
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar erstesEntscheidungsdatum;
            protected List<TypeSTRAFRechtskraft> rechtskraft;
            @XmlElement(required = true)
            protected TypeSTRAFEntscheidungstenor entscheidungstenor;
            protected boolean gewerbezusammenhang;

            /**
             * Gets the value of the entscheidungsbehoerde property.
             * 
             * @return
             *     possible object is
             *     {@link NachrichtStrafBzrAuszugJustizZuExtern0500004 .Fachdaten.Entscheidung.Entscheidungsbehoerde }
             *     
             */
            public NachrichtStrafBzrAuszugJustizZuExtern0500004 .Fachdaten.Entscheidung.Entscheidungsbehoerde getEntscheidungsbehoerde() {
                return entscheidungsbehoerde;
            }

            /**
             * Sets the value of the entscheidungsbehoerde property.
             * 
             * @param value
             *     allowed object is
             *     {@link NachrichtStrafBzrAuszugJustizZuExtern0500004 .Fachdaten.Entscheidung.Entscheidungsbehoerde }
             *     
             */
            public void setEntscheidungsbehoerde(NachrichtStrafBzrAuszugJustizZuExtern0500004 .Fachdaten.Entscheidung.Entscheidungsbehoerde value) {
                this.entscheidungsbehoerde = value;
            }

            /**
             * Gets the value of the erstesEntscheidungsdatum property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getErstesEntscheidungsdatum() {
                return erstesEntscheidungsdatum;
            }

            /**
             * Sets the value of the erstesEntscheidungsdatum property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setErstesEntscheidungsdatum(XMLGregorianCalendar value) {
                this.erstesEntscheidungsdatum = value;
            }

            /**
             * Gets the value of the rechtskraft property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the rechtskraft property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRechtskraft().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TypeSTRAFRechtskraft }
             * 
             * 
             */
            public List<TypeSTRAFRechtskraft> getRechtskraft() {
                if (rechtskraft == null) {
                    rechtskraft = new ArrayList<TypeSTRAFRechtskraft>();
                }
                return this.rechtskraft;
            }

            /**
             * Gets the value of the entscheidungstenor property.
             * 
             * @return
             *     possible object is
             *     {@link TypeSTRAFEntscheidungstenor }
             *     
             */
            public TypeSTRAFEntscheidungstenor getEntscheidungstenor() {
                return entscheidungstenor;
            }

            /**
             * Sets the value of the entscheidungstenor property.
             * 
             * @param value
             *     allowed object is
             *     {@link TypeSTRAFEntscheidungstenor }
             *     
             */
            public void setEntscheidungstenor(TypeSTRAFEntscheidungstenor value) {
                this.entscheidungstenor = value;
            }

            /**
             * Gets the value of the gewerbezusammenhang property.
             * 
             */
            public boolean isGewerbezusammenhang() {
                return gewerbezusammenhang;
            }

            /**
             * Sets the value of the gewerbezusammenhang property.
             * 
             */
            public void setGewerbezusammenhang(boolean value) {
                this.gewerbezusammenhang = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.xjustiz.de}Type.GDS.Behoerde">
             *       &lt;sequence>
             *         &lt;element name="bezeichnung" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
             *         &lt;element name="aktenzeichen" type="{http://www.xjustiz.de}Type.GDS.Aktenzeichen" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "bezeichnung",
                "aktenzeichen"
            })
            public static class Entscheidungsbehoerde
                extends TypeGDSBehoerde
            {

                protected String bezeichnung;
                protected TypeGDSAktenzeichen aktenzeichen;

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
                 * Gets the value of the aktenzeichen property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TypeGDSAktenzeichen }
                 *     
                 */
                public TypeGDSAktenzeichen getAktenzeichen() {
                    return aktenzeichen;
                }

                /**
                 * Sets the value of the aktenzeichen property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TypeGDSAktenzeichen }
                 *     
                 */
                public void setAktenzeichen(TypeGDSAktenzeichen value) {
                    this.aktenzeichen = value;
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
         *         &lt;element name="anfangsdatum" type="{http://www.xjustiz.de}Type.GDS.Datumsangabe"/>
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
            "anfangsdatum"
        })
        public static class LetzteTat {

            @XmlElement(required = true)
            protected String anfangsdatum;

            /**
             * Gets the value of the anfangsdatum property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAnfangsdatum() {
                return anfangsdatum;
            }

            /**
             * Sets the value of the anfangsdatum property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAnfangsdatum(String value) {
                this.anfangsdatum = value;
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
         *         &lt;element name="textkennzahl" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
         *         &lt;element name="text" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
         *         &lt;element name="zusatztext" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
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
            "textkennzahl",
            "text",
            "zusatztext"
        })
        public static class WeitereAngaben {

            protected String textkennzahl;
            @XmlElement(required = true)
            protected String text;
            protected String zusatztext;

            /**
             * Gets the value of the textkennzahl property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTextkennzahl() {
                return textkennzahl;
            }

            /**
             * Sets the value of the textkennzahl property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTextkennzahl(String value) {
                this.textkennzahl = value;
            }

            /**
             * Gets the value of the text property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getText() {
                return text;
            }

            /**
             * Sets the value of the text property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setText(String value) {
                this.text = value;
            }

            /**
             * Gets the value of the zusatztext property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getZusatztext() {
                return zusatztext;
            }

            /**
             * Sets the value of the zusatztext property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setZusatztext(String value) {
                this.zusatztext = value;
            }

        }

    }

}
