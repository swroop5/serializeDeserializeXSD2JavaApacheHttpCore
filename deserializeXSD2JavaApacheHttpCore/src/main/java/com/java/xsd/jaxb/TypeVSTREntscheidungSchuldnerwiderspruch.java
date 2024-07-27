//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.13 at 01:28:34 PM CEST 
//


package com.java.xsd.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Type.VSTR.Entscheidung.Schuldnerwiderspruch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.VSTR.Entscheidung.Schuldnerwiderspruch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eintragungsanordnung.allgemein" type="{http://www.xjustiz.de}Type.VSTR.Eintragungsanordnung.Allgemein"/>
 *         &lt;element name="datumDerEntscheidung" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="inhaltDerEntscheidung" type="{http://www.xjustiz.de}Code.VSTR.Entscheidungsinhalt.Schuldnerwiderspruch"/>
 *         &lt;element name="korrekturLoeschung" type="{http://www.xjustiz.de}Code.VSTR.KorrekturLoeschung" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.VSTR.Entscheidung.Schuldnerwiderspruch", propOrder = {
    "eintragungsanordnungAllgemein",
    "datumDerEntscheidung",
    "inhaltDerEntscheidung",
    "korrekturLoeschung"
})
public class TypeVSTREntscheidungSchuldnerwiderspruch {

    @XmlElement(name = "eintragungsanordnung.allgemein", required = true)
    protected TypeVSTREintragungsanordnungAllgemein eintragungsanordnungAllgemein;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumDerEntscheidung;
    @XmlElement(required = true)
    protected CodeVSTREntscheidungsinhaltSchuldnerwiderspruch inhaltDerEntscheidung;
    protected CodeVSTRKorrekturLoeschung korrekturLoeschung;

    /**
     * Gets the value of the eintragungsanordnungAllgemein property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVSTREintragungsanordnungAllgemein }
     *     
     */
    public TypeVSTREintragungsanordnungAllgemein getEintragungsanordnungAllgemein() {
        return eintragungsanordnungAllgemein;
    }

    /**
     * Sets the value of the eintragungsanordnungAllgemein property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVSTREintragungsanordnungAllgemein }
     *     
     */
    public void setEintragungsanordnungAllgemein(TypeVSTREintragungsanordnungAllgemein value) {
        this.eintragungsanordnungAllgemein = value;
    }

    /**
     * Gets the value of the datumDerEntscheidung property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumDerEntscheidung() {
        return datumDerEntscheidung;
    }

    /**
     * Sets the value of the datumDerEntscheidung property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumDerEntscheidung(XMLGregorianCalendar value) {
        this.datumDerEntscheidung = value;
    }

    /**
     * Gets the value of the inhaltDerEntscheidung property.
     * 
     * @return
     *     possible object is
     *     {@link CodeVSTREntscheidungsinhaltSchuldnerwiderspruch }
     *     
     */
    public CodeVSTREntscheidungsinhaltSchuldnerwiderspruch getInhaltDerEntscheidung() {
        return inhaltDerEntscheidung;
    }

    /**
     * Sets the value of the inhaltDerEntscheidung property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeVSTREntscheidungsinhaltSchuldnerwiderspruch }
     *     
     */
    public void setInhaltDerEntscheidung(CodeVSTREntscheidungsinhaltSchuldnerwiderspruch value) {
        this.inhaltDerEntscheidung = value;
    }

    /**
     * Gets the value of the korrekturLoeschung property.
     * 
     * @return
     *     possible object is
     *     {@link CodeVSTRKorrekturLoeschung }
     *     
     */
    public CodeVSTRKorrekturLoeschung getKorrekturLoeschung() {
        return korrekturLoeschung;
    }

    /**
     * Sets the value of the korrekturLoeschung property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeVSTRKorrekturLoeschung }
     *     
     */
    public void setKorrekturLoeschung(CodeVSTRKorrekturLoeschung value) {
        this.korrekturLoeschung = value;
    }

}