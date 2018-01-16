
package de.othr.sw.versicherung.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für versicherung complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="versicherung">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="leistung" type="{http://service.versicherung.sw.othr.de/}leistung" minOccurs="0"/>
 *         &lt;element name="kfzNummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typ" type="{http://service.versicherung.sw.othr.de/}fahrzeugtyp" minOccurs="0"/>
 *         &lt;element name="mitglied" type="{http://service.versicherung.sw.othr.de/}mitglied" minOccurs="0"/>
 *         &lt;element name="preis" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="abschlussdatum" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "versicherung", propOrder = {
    "id",
    "leistung",
    "kfzNummer",
    "typ",
    "mitglied",
    "preis",
    "abschlussdatum"
})
public class Versicherung {

    protected Long id;
    protected Leistung leistung;
    protected String kfzNummer;
    protected Fahrzeugtyp typ;
    protected Mitglied mitglied;
    protected double preis;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar abschlussdatum;

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der leistung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Leistung }
     *     
     */
    public Leistung getLeistung() {
        return leistung;
    }

    /**
     * Legt den Wert der leistung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Leistung }
     *     
     */
    public void setLeistung(Leistung value) {
        this.leistung = value;
    }

    /**
     * Ruft den Wert der kfzNummer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKfzNummer() {
        return kfzNummer;
    }

    /**
     * Legt den Wert der kfzNummer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKfzNummer(String value) {
        this.kfzNummer = value;
    }

    /**
     * Ruft den Wert der typ-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Fahrzeugtyp }
     *     
     */
    public Fahrzeugtyp getTyp() {
        return typ;
    }

    /**
     * Legt den Wert der typ-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Fahrzeugtyp }
     *     
     */
    public void setTyp(Fahrzeugtyp value) {
        this.typ = value;
    }

    /**
     * Ruft den Wert der mitglied-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Mitglied }
     *     
     */
    public Mitglied getMitglied() {
        return mitglied;
    }

    /**
     * Legt den Wert der mitglied-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Mitglied }
     *     
     */
    public void setMitglied(Mitglied value) {
        this.mitglied = value;
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
     * Ruft den Wert der abschlussdatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAbschlussdatum() {
        return abschlussdatum;
    }

    /**
     * Legt den Wert der abschlussdatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAbschlussdatum(XMLGregorianCalendar value) {
        this.abschlussdatum = value;
    }

}
