//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.07 at 12:33:15 PM CET 
//


package nl.b3p.topnl.top250nl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BRTLijnOfPuntPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BRTLijnOfPuntPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://register.geostandaarden.nl/gmlapplicatieschema/brt-algemeen/1.2.0}BRTLijnOfPunt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BRTLijnOfPuntPropertyType", namespace = "http://register.geostandaarden.nl/gmlapplicatieschema/brt-algemeen/1.2.0", propOrder = {
    "brtLijnOfPunt"
})
public class BRTLijnOfPuntPropertyType {

    @XmlElement(name = "BRTLijnOfPunt", required = true)
    protected BRTLijnOfPuntType brtLijnOfPunt;

    /**
     * Gets the value of the brtLijnOfPunt property.
     * 
     * @return
     *     possible object is
     *     {@link BRTLijnOfPuntType }
     *     
     */
    public BRTLijnOfPuntType getBRTLijnOfPunt() {
        return brtLijnOfPunt;
    }

    /**
     * Sets the value of the brtLijnOfPunt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BRTLijnOfPuntType }
     *     
     */
    public void setBRTLijnOfPunt(BRTLijnOfPuntType value) {
        this.brtLijnOfPunt = value;
    }

}
