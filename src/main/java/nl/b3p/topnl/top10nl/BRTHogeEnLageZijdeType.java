//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.09 at 01:06:57 PM CET 
//


package nl.b3p.topnl.top10nl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BRTHogeEnLageZijdeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BRTHogeEnLageZijdeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hogeZijde" type="{http://www.opengis.net/gml/3.2}CurvePropertyType"/>
 *         &lt;element name="lageZijde" type="{http://www.opengis.net/gml/3.2}CurvePropertyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BRTHogeEnLageZijdeType", namespace = "http://register.geostandaarden.nl/gmlapplicatieschema/brt-algemeen/1.2.0", propOrder = {
    "hogeZijde",
    "lageZijde"
})
public class BRTHogeEnLageZijdeType {

    @XmlElement(required = true)
    protected CurvePropertyType hogeZijde;
    @XmlElement(required = true)
    protected CurvePropertyType lageZijde;

    /**
     * Gets the value of the hogeZijde property.
     * 
     * @return
     *     possible object is
     *     {@link CurvePropertyType }
     *     
     */
    public CurvePropertyType getHogeZijde() {
        return hogeZijde;
    }

    /**
     * Sets the value of the hogeZijde property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurvePropertyType }
     *     
     */
    public void setHogeZijde(CurvePropertyType value) {
        this.hogeZijde = value;
    }

    /**
     * Gets the value of the lageZijde property.
     * 
     * @return
     *     possible object is
     *     {@link CurvePropertyType }
     *     
     */
    public CurvePropertyType getLageZijde() {
        return lageZijde;
    }

    /**
     * Sets the value of the lageZijde property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurvePropertyType }
     *     
     */
    public void setLageZijde(CurvePropertyType value) {
        this.lageZijde = value;
    }

}
