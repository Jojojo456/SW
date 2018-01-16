
package de.othr.sw.versicherung.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für generatedIdEntity complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="generatedIdEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.versicherung.sw.othr.de/}singleIdEntity">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generatedIdEntity")
@XmlSeeAlso({
    Leistung.class
})
public class GeneratedIdEntity
    extends SingleIdEntity
{


}
