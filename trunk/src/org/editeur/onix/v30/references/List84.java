//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.15 at 09:12:39 AM IST 
//


package org.editeur.onix.v30.references;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for List84.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List84">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAM"/>
 *     &lt;enumeration value="LIF"/>
 *     &lt;enumeration value="MAC"/>
 *     &lt;enumeration value="OXF"/>
 *     &lt;enumeration value="NNT"/>
 *     &lt;enumeration value="NOX"/>
 *     &lt;enumeration value="NSB"/>
 *     &lt;enumeration value="RYR"/>
 *     &lt;enumeration value="SCO"/>
 *     &lt;enumeration value="SPR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List84")
@XmlEnum
public enum List84 {


    /**
     * Contains the work of Howard Clark Kee including a summary of the development of the canon, introductions to the books, notes and cross references. Originally published in 1993, NRSV.
     * 
     */
    CAM,

    /**
     * A project of Tyndale House Publishers and Zondervan intended to help readers apply the Bible to daily living. Living Bible, King James, New International, NASB.
     * 
     */
    LIF,

    /**
     * A King James version study Bible with notes by James Macarthur first published in 1997.
     * 
     */
    MAC,

    /**
     * A study Bible originally published in the 1960s and based on the RSV / NRSV.
     * 
     */
    OXF,

    /**
     * Norwegian study Bible, New Testament.
     * 
     */
    NNT,

    /**
     * Published in 1991 and based on the New Revised Standard version.
     * 
     */
    NOX,

    /**
     * Norwegian study Bible.
     * 
     */
    NSB,

    /**
     * Based on the work of Charles C. Ryrie. King James, NI, NASB.
     * 
     */
    RYR,

    /**
     * A study Bible based on the early 20th century work of C.I. Scofield. Based on the King James version.
     * 
     */
    SCO,

    /**
     * A transdenominational study Bible for persons from the Pentecostal/Charismatic traditions.
     * 
     */
    SPR;

    public String value() {
        return name();
    }

    public static List84 fromValue(String v) {
        return valueOf(v);
    }

}
