//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.09 at 01:06:57 PM CET 
//


package nl.b3p.topnl.top10nl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for PlanTopografieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlanTopografieType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://register.geostandaarden.nl/gmlapplicatieschema/top10nl/1.2.0}_Top10nlObjectType">
 *       &lt;sequence>
 *         &lt;element name="typeObject" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *         &lt;element name="naam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geometrie" type="{http://register.geostandaarden.nl/gmlapplicatieschema/brt-algemeen/1.2.0}BRTVlakLijnOfPuntPropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlanTopografieType", namespace = "http://register.geostandaarden.nl/gmlapplicatieschema/top10nl/1.2.0", propOrder = {
    "typeObject",
    "naam",
    "geometrie"
})
public class PlanTopografieType
    extends Top10NlObjectType
{

    @XmlElement(required = true)
    protected CodeType typeObject;
    protected String naam;
    @XmlAnyElement
    protected Element geometrie;

    /**
     * Gets the value of the typeObject property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTypeObject() {
        return typeObject;
    }

    /**
     * Sets the value of the typeObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTypeObject(CodeType value) {
        this.typeObject = value;
    }

    /**
     * Gets the value of the naam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaam() {
        return naam;
    }

    /**
     * Sets the value of the naam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaam(String value) {
        this.naam = value;
    }

    /**
     * Gets the value of the geometrie property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     
     */
    public Element getGeometrie() {
        return geometrie;
    }

    /**
     * Sets the value of the geometrie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     
     */
    public void setGeometrie(Element value) {
        this.geometrie = value;
    }

}
