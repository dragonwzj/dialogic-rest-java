//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.04 at 02:42:49 PM EDT 
//


package com.dialogic.xms.msml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for audioMixType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="audioMixType">
 *   &lt;complexContent>
 *     &lt;extension base="{}basicAudioMixType">
 *       &lt;all>
 *         &lt;element name="asn" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ri" use="required" type="{}posDuration.datatype" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="n-loudest" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="n" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                       &lt;minInclusive value="2"/>
 *                       &lt;maxInclusive value="10"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "audioMixType", propOrder = {
    "asn",
    "nLoudest"
})
public class AudioMixType
    extends BasicAudioMixType
{

    protected AudioMixType.Asn asn;
    @XmlElement(name = "n-loudest")
    protected AudioMixType.NLoudest nLoudest;

    /**
     * Gets the value of the asn property.
     * 
     * @return
     *     possible object is
     *     {@link AudioMixType.Asn }
     *     
     */
    public AudioMixType.Asn getAsn() {
        return asn;
    }

    /**
     * Sets the value of the asn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioMixType.Asn }
     *     
     */
    public void setAsn(AudioMixType.Asn value) {
        this.asn = value;
    }

    /**
     * Gets the value of the nLoudest property.
     * 
     * @return
     *     possible object is
     *     {@link AudioMixType.NLoudest }
     *     
     */
    public AudioMixType.NLoudest getNLoudest() {
        return nLoudest;
    }

    /**
     * Sets the value of the nLoudest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioMixType.NLoudest }
     *     
     */
    public void setNLoudest(AudioMixType.NLoudest value) {
        this.nLoudest = value;
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
     *       &lt;attribute name="ri" use="required" type="{}posDuration.datatype" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Asn {

        @XmlAttribute(name = "ri", required = true)
        protected String ri;

        /**
         * Gets the value of the ri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRi() {
            return ri;
        }

        /**
         * Sets the value of the ri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRi(String value) {
            this.ri = value;
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
     *       &lt;attribute name="n" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *             &lt;minInclusive value="2"/>
     *             &lt;maxInclusive value="10"/>
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
    @XmlType(name = "")
    public static class NLoudest {

        @XmlAttribute(name = "n", required = true)
        protected int n;

        /**
         * Gets the value of the n property.
         * 
         */
        public int getN() {
            return n;
        }

        /**
         * Sets the value of the n property.
         * 
         */
        public void setN(int value) {
            this.n = value;
        }

    }

}