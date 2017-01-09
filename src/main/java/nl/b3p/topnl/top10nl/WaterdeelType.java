//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.09 at 01:06:57 PM CET 
//


package nl.b3p.topnl.top10nl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for WaterdeelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaterdeelType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://register.geostandaarden.nl/gmlapplicatieschema/top10nl/1.2.0}_Top10nlObjectType">
 *       &lt;sequence>
 *         &lt;element name="typeWater" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *         &lt;element name="breedteklasse" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="hoofdafwatering" type="{http://register.geostandaarden.nl/gmlapplicatieschema/brt-algemeen/1.2.0}BRTJaNeeWaardeType"/>
 *         &lt;element name="fysiekVoorkomen" type="{http://www.opengis.net/gml/3.2}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="voorkomen" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="hoogteniveau" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="functie" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *         &lt;element name="getijdeinvloed" type="{http://register.geostandaarden.nl/gmlapplicatieschema/brt-algemeen/1.2.0}BRTJaNeeWaardeType"/>
 *         &lt;element name="vaarwegklasse" type="{http://www.opengis.net/gml/3.2}CodeType" minOccurs="0"/>
 *         &lt;element name="naamOfficieel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="naamNL" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="naamFries" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isBAGnaam" type="{http://register.geostandaarden.nl/gmlapplicatieschema/brt-algemeen/1.2.0}BRTJaNeeWaardeType" minOccurs="0"/>
 *         &lt;element name="sluisnaam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brugnaam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "WaterdeelType", namespace = "http://register.geostandaarden.nl/gmlapplicatieschema/top10nl/1.2.0", propOrder = {
    "typeWater",
    "breedteklasse",
    "hoofdafwatering",
    "fysiekVoorkomen",
    "voorkomen",
    "hoogteniveau",
    "functie",
    "getijdeinvloed",
    "vaarwegklasse",
    "naamOfficieel",
    "naamNL",
    "naamFries",
    "isBAGnaam",
    "sluisnaam",
    "brugnaam",
    "geometrie"
})
public class WaterdeelType
    extends Top10NlObjectType
{

    @XmlElement(required = true)
    protected CodeType typeWater;
    protected CodeType breedteklasse;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected BRTJaNeeWaardeType hoofdafwatering;
    protected List<CodeType> fysiekVoorkomen;
    protected CodeType voorkomen;
    @XmlElement(required = true)
    protected BigInteger hoogteniveau;
    @XmlElement(required = true)
    protected CodeType functie;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected BRTJaNeeWaardeType getijdeinvloed;
    protected CodeType vaarwegklasse;
    protected String naamOfficieel;
    protected List<String> naamNL;
    protected List<String> naamFries;
    @XmlSchemaType(name = "string")
    protected BRTJaNeeWaardeType isBAGnaam;
    protected String sluisnaam;
    protected String brugnaam;
    @XmlAnyElement
    protected Element geometrie;

    /**
     * Gets the value of the typeWater property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTypeWater() {
        return typeWater;
    }

    /**
     * Sets the value of the typeWater property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTypeWater(CodeType value) {
        this.typeWater = value;
    }

    /**
     * Gets the value of the breedteklasse property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getBreedteklasse() {
        return breedteklasse;
    }

    /**
     * Sets the value of the breedteklasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setBreedteklasse(CodeType value) {
        this.breedteklasse = value;
    }

    /**
     * Gets the value of the hoofdafwatering property.
     * 
     * @return
     *     possible object is
     *     {@link BRTJaNeeWaardeType }
     *     
     */
    public BRTJaNeeWaardeType getHoofdafwatering() {
        return hoofdafwatering;
    }

    /**
     * Sets the value of the hoofdafwatering property.
     * 
     * @param value
     *     allowed object is
     *     {@link BRTJaNeeWaardeType }
     *     
     */
    public void setHoofdafwatering(BRTJaNeeWaardeType value) {
        this.hoofdafwatering = value;
    }

    /**
     * Gets the value of the fysiekVoorkomen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fysiekVoorkomen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFysiekVoorkomen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getFysiekVoorkomen() {
        if (fysiekVoorkomen == null) {
            fysiekVoorkomen = new ArrayList<CodeType>();
        }
        return this.fysiekVoorkomen;
    }

    /**
     * Gets the value of the voorkomen property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getVoorkomen() {
        return voorkomen;
    }

    /**
     * Sets the value of the voorkomen property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setVoorkomen(CodeType value) {
        this.voorkomen = value;
    }

    /**
     * Gets the value of the hoogteniveau property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHoogteniveau() {
        return hoogteniveau;
    }

    /**
     * Sets the value of the hoogteniveau property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHoogteniveau(BigInteger value) {
        this.hoogteniveau = value;
    }

    /**
     * Gets the value of the functie property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getFunctie() {
        return functie;
    }

    /**
     * Sets the value of the functie property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setFunctie(CodeType value) {
        this.functie = value;
    }

    /**
     * Gets the value of the getijdeinvloed property.
     * 
     * @return
     *     possible object is
     *     {@link BRTJaNeeWaardeType }
     *     
     */
    public BRTJaNeeWaardeType getGetijdeinvloed() {
        return getijdeinvloed;
    }

    /**
     * Sets the value of the getijdeinvloed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BRTJaNeeWaardeType }
     *     
     */
    public void setGetijdeinvloed(BRTJaNeeWaardeType value) {
        this.getijdeinvloed = value;
    }

    /**
     * Gets the value of the vaarwegklasse property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getVaarwegklasse() {
        return vaarwegklasse;
    }

    /**
     * Sets the value of the vaarwegklasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setVaarwegklasse(CodeType value) {
        this.vaarwegklasse = value;
    }

    /**
     * Gets the value of the naamOfficieel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaamOfficieel() {
        return naamOfficieel;
    }

    /**
     * Sets the value of the naamOfficieel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaamOfficieel(String value) {
        this.naamOfficieel = value;
    }

    /**
     * Gets the value of the naamNL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the naamNL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNaamNL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNaamNL() {
        if (naamNL == null) {
            naamNL = new ArrayList<String>();
        }
        return this.naamNL;
    }

    /**
     * Gets the value of the naamFries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the naamFries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNaamFries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNaamFries() {
        if (naamFries == null) {
            naamFries = new ArrayList<String>();
        }
        return this.naamFries;
    }

    /**
     * Gets the value of the isBAGnaam property.
     * 
     * @return
     *     possible object is
     *     {@link BRTJaNeeWaardeType }
     *     
     */
    public BRTJaNeeWaardeType getIsBAGnaam() {
        return isBAGnaam;
    }

    /**
     * Sets the value of the isBAGnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link BRTJaNeeWaardeType }
     *     
     */
    public void setIsBAGnaam(BRTJaNeeWaardeType value) {
        this.isBAGnaam = value;
    }

    /**
     * Gets the value of the sluisnaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSluisnaam() {
        return sluisnaam;
    }

    /**
     * Sets the value of the sluisnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSluisnaam(String value) {
        this.sluisnaam = value;
    }

    /**
     * Gets the value of the brugnaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrugnaam() {
        return brugnaam;
    }

    /**
     * Sets the value of the brugnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrugnaam(String value) {
        this.brugnaam = value;
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
