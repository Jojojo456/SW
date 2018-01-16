
package de.othr.sw.versicherung.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für leistung complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="leistung">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.versicherung.sw.othr.de/}generatedIdEntity">
 *       &lt;sequence>
 *         &lt;element name="Titel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Preis" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Beschreibung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "leistung", propOrder = {
    "titel",
    "preis",
    "beschreibung"
})
public class Leistung
    extends GeneratedIdEntity
{

    @XmlElement(name = "Titel")
    protected String titel;
    @XmlElement(name = "Preis")
    protected double preis;
    @XmlElement(name = "Beschreibung")
    protected String beschreibung;

    /**
     * Ruft den Wert der titel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitel() {
        return titel;
    }

    /**
     * Legt den Wert der titel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitel(String value) {
        this.titel = value;
    }

    /**
     * Ruft den Wert der preis-Eigenschaft ab.
     * 
     */
    public double getPreis() {
        return preis;
    }

    /**
     * Legt den Wert der preis-Eigenschaft fest.
     * 
     */
    public void setPreis(double value) {
        this.preis = value;
    }

    /**
     * Ruft den Wert der beschreibung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * Legt den Wert der beschreibung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeschreibung(String value) {
        this.beschreibung = value;
    }

}
