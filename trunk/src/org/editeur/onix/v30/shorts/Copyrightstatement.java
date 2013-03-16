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
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}b087" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}copyrightowner" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://ns.editeur.org/onix/3.0/short}generalAttributes"/>
 *       &lt;attribute name="refname">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="CopyrightStatement"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="shortname">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="copyrightstatement"/>
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
    "b087",
    "copyrightowner"
})
@XmlRootElement(name = "copyrightstatement")
public class Copyrightstatement {

    @XmlElement(required = true)
    protected List<B087> b087;
    protected List<Copyrightowner> copyrightowner;
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
     * Gets the value of the b087 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the b087 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getB087().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link B087 }
     * 
     * 
     */
    public List<B087> getB087() {
        if (b087 == null) {
            b087 = new ArrayList<B087>();
        }
        return this.b087;
    }

    /**
     * Gets the value of the copyrightowner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copyrightowner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopyrightowner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Copyrightowner }
     * 
     * 
     */
    public List<Copyrightowner> getCopyrightowner() {
        if (copyrightowner == null) {
            copyrightowner = new ArrayList<Copyrightowner>();
        }
        return this.copyrightowner;
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
