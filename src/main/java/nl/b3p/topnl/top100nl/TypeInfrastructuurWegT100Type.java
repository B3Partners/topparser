//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.07 at 02:40:39 PM CET 
//


package nl.b3p.topnl.top100nl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeInfrastructuurWegT100Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeInfrastructuurWegT100Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="verbinding"/>
 *     &lt;enumeration value="overig verkeersgebied"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeInfrastructuurWegT100Type", namespace = "http://register.geostandaarden.nl/gmlapplicatieschema/top100nl/1.1.0")
@XmlEnum
public enum TypeInfrastructuurWegT100Type {

    @XmlEnumValue("verbinding")
    VERBINDING("verbinding"),
    @XmlEnumValue("overig verkeersgebied")
    OVERIG_VERKEERSGEBIED("overig verkeersgebied");
    private final String value;

    TypeInfrastructuurWegT100Type(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeInfrastructuurWegT100Type fromValue(String v) {
        for (TypeInfrastructuurWegT100Type c: TypeInfrastructuurWegT100Type.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
