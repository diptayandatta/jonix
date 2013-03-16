//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.15 at 09:12:45 AM IST 
//


package org.editeur.onix.v30.shorts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Flow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Flow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}block"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}inline"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Flow", propOrder = {
    "content"
})
@XmlSeeAlso({
    Div.class,
    Li.class,
    K169 .class,
    K168 .class,
    K309 .class,
    K166 .class,
    K165 .class,
    X406 .class,
    B395 .class,
    X453 .class,
    Td.class,
    Th.class,
    X440 .class,
    X434 .class,
    D104 .class,
    B207 .class,
    X424 .class,
    B062 .class,
    B360 .class,
    B342 .class,
    B052 .class,
    B049 .class,
    X478 .class,
    Dd.class,
    G343 .class,
    B048 .class,
    B294 .class,
    B044 .class,
    J366 .class
})
public class Flow {

    @XmlElementRefs({
        @XmlElementRef(name = "block", namespace = "http://ns.editeur.org/onix/3.0/short", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "inline", namespace = "http://ns.editeur.org/onix/3.0/short", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;

    /**
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
     * {@link JAXBElement }{@code <}{@link Small }{@code >}
     * {@link JAXBElement }{@code <}{@link Dl }{@code >}
     * {@link JAXBElement }{@code <}{@link H3 }{@code >}
     * {@link JAXBElement }{@code <}{@link Sub }{@code >}
     * {@link JAXBElement }{@code <}{@link Address }{@code >}
     * {@link JAXBElement }{@code <}{@link Img }{@code >}
     * {@link JAXBElement }{@code <}{@link Blockquote }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link Var }{@code >}
     * {@link JAXBElement }{@code <}{@link Hr }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Object }{@code >}
     * {@link JAXBElement }{@code <}{@link A }{@code >}
     * {@link JAXBElement }{@code <}{@link Div }{@code >}
     * {@link JAXBElement }{@code <}{@link H4 }{@code >}
     * {@link JAXBElement }{@code <}{@link Big }{@code >}
     * {@link JAXBElement }{@code <}{@link Span }{@code >}
     * {@link JAXBElement }{@code <}{@link Pre }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Strong }{@code >}
     * {@link JAXBElement }{@code <}{@link Cite }{@code >}
     * {@link JAXBElement }{@code <}{@link Samp }{@code >}
     * {@link JAXBElement }{@code <}{@link Abbr }{@code >}
     * {@link JAXBElement }{@code <}{@link Acronym }{@code >}
     * {@link JAXBElement }{@code <}{@link Dfn }{@code >}
     * {@link JAXBElement }{@code <}{@link Ul }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Object }{@code >}
     * {@link JAXBElement }{@code <}{@link H1 }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Q }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Sup }{@code >}
     * {@link JAXBElement }{@code <}{@link Table }{@code >}
     * {@link JAXBElement }{@code <}{@link I }{@code >}
     * {@link JAXBElement }{@code <}{@link H5 }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Em }{@code >}
     * {@link JAXBElement }{@code <}{@link Br }{@code >}
     * {@link JAXBElement }{@code <}{@link Tt }{@code >}
     * {@link JAXBElement }{@code <}{@link Ol }{@code >}
     * {@link JAXBElement }{@code <}{@link Code }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Object }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Object }{@code >}
     * {@link JAXBElement }{@code <}{@link org.editeur.onix.v30.shorts.Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Map }{@code >}
     * {@link JAXBElement }{@code <}{@link B }{@code >}
     * {@link JAXBElement }{@code <}{@link H6 }{@code >}
     * {@link JAXBElement }{@code <}{@link Kbd }{@code >}
     * {@link JAXBElement }{@code <}{@link Bdo }{@code >}
     * {@link JAXBElement }{@code <}{@link P }{@code >}
     * {@link JAXBElement }{@code <}{@link H2 }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

}
