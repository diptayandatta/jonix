//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.15 at 09:12:45 AM IST 
//


package org.editeur.onix.v30.shorts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}x414"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}nameidentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}b036" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}b037" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://ns.editeur.org/onix/3.0/short}b038" minOccurs="0"/>
 *           &lt;element ref="{http://ns.editeur.org/onix/3.0/short}b039" minOccurs="0"/>
 *           &lt;element ref="{http://ns.editeur.org/onix/3.0/short}b247" minOccurs="0"/>
 *           &lt;element ref="{http://ns.editeur.org/onix/3.0/short}b040"/>
 *           &lt;element ref="{http://ns.editeur.org/onix/3.0/short}b041" minOccurs="0"/>
 *           &lt;element ref="{http://ns.editeur.org/onix/3.0/short}b248" minOccurs="0"/>
 *           &lt;element ref="{http://ns.editeur.org/onix/3.0/short}b042" minOccurs="0"/>
 *           &lt;element ref="{http://ns.editeur.org/onix/3.0/short}b043" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}b047" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}x443" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://ns.editeur.org/onix/3.0/short}generalAttributes"/>
 *       &lt;attribute name="refname">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="AlternativeName"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="shortname">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="alternativename"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "x414",
    "nameidentifier",
    "b036",
    "b037",
    "b038",
    "b039",
    "b247",
    "b040",
    "b041",
    "b248",
    "b042",
    "b043",
    "b047",
    "x443"
})
@XmlRootElement(name = "alternativename")
public class Alternativename {

    @XmlElement(required = true)
    protected X414 x414;
    protected List<Nameidentifier> nameidentifier;
    protected B036 b036;
    protected B037 b037;
    protected B038 b038;
    protected B039 b039;
    protected B247 b247;
    protected B040 b040;
    protected B041 b041;
    protected B248 b248;
    protected B042 b042;
    protected B043 b043;
    protected B047 b047;
    protected X443 x443;
    @XmlAttribute(name = "refname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refname;
    @XmlAttribute(name = "shortname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shortname;
    @XmlAttribute(name = "datestamp")
    protected String datestamp;
    @XmlAttribute(name = "sourcetype")
    protected String sourcetype;
    @XmlAttribute(name = "sourcename")
    @XmlSchemaType(name = "anySimpleType")
    protected String sourcename;

    /**
     * Gets the value of the x414 property.
     * 
     * @return
     *     possible object is
     *     {@link X414 }
     *     
     */
    public X414 getX414() {
        return x414;
    }

    /**
     * Sets the value of the x414 property.
     * 
     * @param value
     *     allowed object is
     *     {@link X414 }
     *     
     */
    public void setX414(X414 value) {
        this.x414 = value;
    }

    /**
     * Gets the value of the nameidentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameidentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameidentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Nameidentifier }
     * 
     * 
     */
    public List<Nameidentifier> getNameidentifier() {
        if (nameidentifier == null) {
            nameidentifier = new ArrayList<Nameidentifier>();
        }
        return this.nameidentifier;
    }

    /**
     * Gets the value of the b036 property.
     * 
     * @return
     *     possible object is
     *     {@link B036 }
     *     
     */
    public B036 getB036() {
        return b036;
    }

    /**
     * Sets the value of the b036 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B036 }
     *     
     */
    public void setB036(B036 value) {
        this.b036 = value;
    }

    /**
     * Gets the value of the b037 property.
     * 
     * @return
     *     possible object is
     *     {@link B037 }
     *     
     */
    public B037 getB037() {
        return b037;
    }

    /**
     * Sets the value of the b037 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B037 }
     *     
     */
    public void setB037(B037 value) {
        this.b037 = value;
    }

    /**
     * Gets the value of the b038 property.
     * 
     * @return
     *     possible object is
     *     {@link B038 }
     *     
     */
    public B038 getB038() {
        return b038;
    }

    /**
     * Sets the value of the b038 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B038 }
     *     
     */
    public void setB038(B038 value) {
        this.b038 = value;
    }

    /**
     * Gets the value of the b039 property.
     * 
     * @return
     *     possible object is
     *     {@link B039 }
     *     
     */
    public B039 getB039() {
        return b039;
    }

    /**
     * Sets the value of the b039 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B039 }
     *     
     */
    public void setB039(B039 value) {
        this.b039 = value;
    }

    /**
     * Gets the value of the b247 property.
     * 
     * @return
     *     possible object is
     *     {@link B247 }
     *     
     */
    public B247 getB247() {
        return b247;
    }

    /**
     * Sets the value of the b247 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B247 }
     *     
     */
    public void setB247(B247 value) {
        this.b247 = value;
    }

    /**
     * Gets the value of the b040 property.
     * 
     * @return
     *     possible object is
     *     {@link B040 }
     *     
     */
    public B040 getB040() {
        return b040;
    }

    /**
     * Sets the value of the b040 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B040 }
     *     
     */
    public void setB040(B040 value) {
        this.b040 = value;
    }

    /**
     * Gets the value of the b041 property.
     * 
     * @return
     *     possible object is
     *     {@link B041 }
     *     
     */
    public B041 getB041() {
        return b041;
    }

    /**
     * Sets the value of the b041 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B041 }
     *     
     */
    public void setB041(B041 value) {
        this.b041 = value;
    }

    /**
     * Gets the value of the b248 property.
     * 
     * @return
     *     possible object is
     *     {@link B248 }
     *     
     */
    public B248 getB248() {
        return b248;
    }

    /**
     * Sets the value of the b248 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B248 }
     *     
     */
    public void setB248(B248 value) {
        this.b248 = value;
    }

    /**
     * Gets the value of the b042 property.
     * 
     * @return
     *     possible object is
     *     {@link B042 }
     *     
     */
    public B042 getB042() {
        return b042;
    }

    /**
     * Sets the value of the b042 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B042 }
     *     
     */
    public void setB042(B042 value) {
        this.b042 = value;
    }

    /**
     * Gets the value of the b043 property.
     * 
     * @return
     *     possible object is
     *     {@link B043 }
     *     
     */
    public B043 getB043() {
        return b043;
    }

    /**
     * Sets the value of the b043 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B043 }
     *     
     */
    public void setB043(B043 value) {
        this.b043 = value;
    }

    /**
     * Gets the value of the b047 property.
     * 
     * @return
     *     possible object is
     *     {@link B047 }
     *     
     */
    public B047 getB047() {
        return b047;
    }

    /**
     * Sets the value of the b047 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B047 }
     *     
     */
    public void setB047(B047 value) {
        this.b047 = value;
    }

    /**
     * Gets the value of the x443 property.
     * 
     * @return
     *     possible object is
     *     {@link X443 }
     *     
     */
    public X443 getX443() {
        return x443;
    }

    /**
     * Sets the value of the x443 property.
     * 
     * @param value
     *     allowed object is
     *     {@link X443 }
     *     
     */
    public void setX443(X443 value) {
        this.x443 = value;
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
        return refname;
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
        return shortname;
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
        return sourcetype;
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