//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.11 at 10:06:39 PM IST 
//


package org.editeur.onix.v21.shorts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;choice>
 *               &lt;element ref="{http://www.editeur.org/onix/2.1/short}supplieridentifier" maxOccurs="unbounded"/>
 *               &lt;element ref="{http://www.editeur.org/onix/2.1/short}j136"/>
 *               &lt;sequence>
 *                 &lt;element ref="{http://www.editeur.org/onix/2.1/short}j135"/>
 *                 &lt;element ref="{http://www.editeur.org/onix/2.1/short}j136" minOccurs="0"/>
 *               &lt;/sequence>
 *             &lt;/choice>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}j137" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/short}j137"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}j270" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}j271" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}j272" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}website" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}j292" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;choice>
 *             &lt;sequence>
 *               &lt;element ref="{http://www.editeur.org/onix/2.1/short}j138" maxOccurs="unbounded"/>
 *               &lt;element ref="{http://www.editeur.org/onix/2.1/short}j397" minOccurs="0"/>
 *               &lt;element ref="{http://www.editeur.org/onix/2.1/short}j139" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;/sequence>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}j397"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}j139" maxOccurs="unbounded"/>
 *           &lt;/choice>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/short}j140" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}j399" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/short}j268"/>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/short}j269"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}j387" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}j141"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}j396" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}j348" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}j396"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}j348" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/short}j348"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}newsupplier" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/short}j260" minOccurs="0"/>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/short}j142"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}j143" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}j144" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}stock" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}j145" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/short}j146"/>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/short}j147" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/short}j151"/>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/short}j192"/>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/short}price" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}reissue" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.editeur.org/onix/2.1/short}generalAttributes"/>
 *       &lt;attribute name="refname" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="SupplyDetail" />
 *       &lt;attribute name="shortname" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="supplydetail" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "supplydetail")
public class Supplydetail {

    @XmlElementRefs({
        @XmlElementRef(name = "j272", namespace = "http://www.editeur.org/onix/2.1/short", type = J272 .class, required = false),
        @XmlElementRef(name = "j260", namespace = "http://www.editeur.org/onix/2.1/short", type = J260 .class, required = false),
        @XmlElementRef(name = "j141", namespace = "http://www.editeur.org/onix/2.1/short", type = J141 .class, required = false),
        @XmlElementRef(name = "j138", namespace = "http://www.editeur.org/onix/2.1/short", type = J138 .class, required = false),
        @XmlElementRef(name = "newsupplier", namespace = "http://www.editeur.org/onix/2.1/short", type = Newsupplier.class, required = false),
        @XmlElementRef(name = "j144", namespace = "http://www.editeur.org/onix/2.1/short", type = J144 .class, required = false),
        @XmlElementRef(name = "stock", namespace = "http://www.editeur.org/onix/2.1/short", type = Stock.class, required = false),
        @XmlElementRef(name = "supplieridentifier", namespace = "http://www.editeur.org/onix/2.1/short", type = Supplieridentifier.class, required = false),
        @XmlElementRef(name = "j135", namespace = "http://www.editeur.org/onix/2.1/short", type = J135 .class, required = false),
        @XmlElementRef(name = "j192", namespace = "http://www.editeur.org/onix/2.1/short", type = J192 .class, required = false),
        @XmlElementRef(name = "j270", namespace = "http://www.editeur.org/onix/2.1/short", type = J270 .class, required = false),
        @XmlElementRef(name = "price", namespace = "http://www.editeur.org/onix/2.1/short", type = Price.class, required = false),
        @XmlElementRef(name = "j271", namespace = "http://www.editeur.org/onix/2.1/short", type = J271 .class, required = false),
        @XmlElementRef(name = "j397", namespace = "http://www.editeur.org/onix/2.1/short", type = J397 .class, required = false),
        @XmlElementRef(name = "j147", namespace = "http://www.editeur.org/onix/2.1/short", type = J147 .class, required = false),
        @XmlElementRef(name = "j139", namespace = "http://www.editeur.org/onix/2.1/short", type = J139 .class, required = false),
        @XmlElementRef(name = "j146", namespace = "http://www.editeur.org/onix/2.1/short", type = J146 .class, required = false),
        @XmlElementRef(name = "j140", namespace = "http://www.editeur.org/onix/2.1/short", type = J140 .class, required = false),
        @XmlElementRef(name = "j143", namespace = "http://www.editeur.org/onix/2.1/short", type = J143 .class, required = false),
        @XmlElementRef(name = "j142", namespace = "http://www.editeur.org/onix/2.1/short", type = J142 .class, required = false),
        @XmlElementRef(name = "j151", namespace = "http://www.editeur.org/onix/2.1/short", type = J151 .class, required = false),
        @XmlElementRef(name = "j145", namespace = "http://www.editeur.org/onix/2.1/short", type = J145 .class, required = false),
        @XmlElementRef(name = "j348", namespace = "http://www.editeur.org/onix/2.1/short", type = J348 .class, required = false),
        @XmlElementRef(name = "j292", namespace = "http://www.editeur.org/onix/2.1/short", type = J292 .class, required = false),
        @XmlElementRef(name = "j137", namespace = "http://www.editeur.org/onix/2.1/short", type = J137 .class, required = false),
        @XmlElementRef(name = "reissue", namespace = "http://www.editeur.org/onix/2.1/short", type = Reissue.class, required = false),
        @XmlElementRef(name = "j136", namespace = "http://www.editeur.org/onix/2.1/short", type = J136 .class, required = false),
        @XmlElementRef(name = "j399", namespace = "http://www.editeur.org/onix/2.1/short", type = J399 .class, required = false),
        @XmlElementRef(name = "j269", namespace = "http://www.editeur.org/onix/2.1/short", type = J269 .class, required = false),
        @XmlElementRef(name = "j387", namespace = "http://www.editeur.org/onix/2.1/short", type = J387 .class, required = false),
        @XmlElementRef(name = "j268", namespace = "http://www.editeur.org/onix/2.1/short", type = J268 .class, required = false),
        @XmlElementRef(name = "j396", namespace = "http://www.editeur.org/onix/2.1/short", type = J396 .class, required = false),
        @XmlElementRef(name = "website", namespace = "http://www.editeur.org/onix/2.1/short", type = Website.class, required = false)
    })
    protected List<java.lang.Object> content;
    @XmlAttribute(name = "refname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String refname;
    @XmlAttribute(name = "shortname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String shortname;
    @XmlAttribute(name = "textformat")
    protected String textformat;
    @XmlAttribute(name = "textcase")
    protected String textcase;
    @XmlAttribute(name = "language")
    protected List74 language;
    @XmlAttribute(name = "transliteration")
    protected List138 transliteration;
    @XmlAttribute(name = "datestamp")
    protected String datestamp;
    @XmlAttribute(name = "sourcetype")
    protected String sourcetype;
    @XmlAttribute(name = "sourcename")
    protected String sourcename;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "J136" is used by two different parts of a schema. See: 
     * line 5441 of file:/C:/DEV/Projects/Jonix/onix_doc/v2.1/ONIX_BookProduct_Release2.1_short.xsd
     * line 5438 of file:/C:/DEV/Projects/Jonix/onix_doc/v2.1/ONIX_BookProduct_Release2.1_short.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link J272 }
     * {@link J260 }
     * {@link J141 }
     * {@link Newsupplier }
     * {@link J138 }
     * {@link J144 }
     * {@link Supplieridentifier }
     * {@link Stock }
     * {@link J135 }
     * {@link J270 }
     * {@link J192 }
     * {@link J271 }
     * {@link Price }
     * {@link J397 }
     * {@link J147 }
     * {@link J139 }
     * {@link J146 }
     * {@link J140 }
     * {@link J143 }
     * {@link J142 }
     * {@link J348 }
     * {@link J145 }
     * {@link J151 }
     * {@link J292 }
     * {@link J137 }
     * {@link J136 }
     * {@link Reissue }
     * {@link J399 }
     * {@link J387 }
     * {@link J269 }
     * {@link J396 }
     * {@link J268 }
     * {@link Website }
     * 
     * 
     */
    public List<java.lang.Object> getContent() {
        if (content == null) {
            content = new ArrayList<java.lang.Object>();
        }
        return this.content;
    }

    /**
     * Gets the value of the refname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefname() {
        if (refname == null) {
            return "SupplyDetail";
        } else {
            return refname;
        }
    }

    /**
     * Sets the value of the refname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefname(String value) {
        this.refname = value;
    }

    /**
     * Gets the value of the shortname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortname() {
        if (shortname == null) {
            return "supplydetail";
        } else {
            return shortname;
        }
    }

    /**
     * Sets the value of the shortname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortname(String value) {
        this.shortname = value;
    }

    /**
     * Gets the value of the textformat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextformat() {
        if (textformat == null) {
            return "00";
        } else {
            return textformat;
        }
    }

    /**
     * Sets the value of the textformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextformat(String value) {
        this.textformat = value;
    }

    /**
     * Gets the value of the textcase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextcase() {
        if (textcase == null) {
            return "00";
        } else {
            return textcase;
        }
    }

    /**
     * Sets the value of the textcase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextcase(String value) {
        this.textcase = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link List74 }
     *     
     */
    public List74 getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link List74 }
     *     
     */
    public void setLanguage(List74 value) {
        this.language = value;
    }

    /**
     * Gets the value of the transliteration property.
     * 
     * @return
     *     possible object is
     *     {@link List138 }
     *     
     */
    public List138 getTransliteration() {
        return transliteration;
    }

    /**
     * Sets the value of the transliteration property.
     * 
     * @param value
     *     allowed object is
     *     {@link List138 }
     *     
     */
    public void setTransliteration(List138 value) {
        this.transliteration = value;
    }

    /**
     * Gets the value of the datestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatestamp() {
        return datestamp;
    }

    /**
     * Sets the value of the datestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatestamp(String value) {
        this.datestamp = value;
    }

    /**
     * Gets the value of the sourcetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcetype() {
        if (sourcetype == null) {
            return "00";
        } else {
            return sourcetype;
        }
    }

    /**
     * Sets the value of the sourcetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcetype(String value) {
        this.sourcetype = value;
    }

    /**
     * Gets the value of the sourcename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcename() {
        return sourcename;
    }

    /**
     * Sets the value of the sourcename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcename(String value) {
        this.sourcename = value;
    }

}