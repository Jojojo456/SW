
package de.othr.sw.versicherung.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.othr.sw.versicherung.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Mitglied_QNAME = new QName("http://service.versicherung.sw.othr.de/", "mitglied");
    private final static QName _PrintLabel_QNAME = new QName("http://service.versicherung.sw.othr.de/", "printLabel");
    private final static QName _PrintLabelResponse_QNAME = new QName("http://service.versicherung.sw.othr.de/", "printLabelResponse");
    private final static QName _Leistung_QNAME = new QName("http://service.versicherung.sw.othr.de/", "leistung");
    private final static QName _Fahrzeugtyp_QNAME = new QName("http://service.versicherung.sw.othr.de/", "fahrzeugtyp");
    private final static QName _KuendigenResponse_QNAME = new QName("http://service.versicherung.sw.othr.de/", "kuendigenResponse");
    private final static QName _Versicherung_QNAME = new QName("http://service.versicherung.sw.othr.de/", "versicherung");
    private final static QName _AlleVersicherungenResponse_QNAME = new QName("http://service.versicherung.sw.othr.de/", "alleVersicherungenResponse");
    private final static QName _Versichern_QNAME = new QName("http://service.versicherung.sw.othr.de/", "versichern");
    private final static QName _AlleVersicherungen_QNAME = new QName("http://service.versicherung.sw.othr.de/", "alleVersicherungen");
    private final static QName _Kuendigen_QNAME = new QName("http://service.versicherung.sw.othr.de/", "kuendigen");
    private final static QName _VersichernResponse_QNAME = new QName("http://service.versicherung.sw.othr.de/", "versichernResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.othr.sw.versicherung.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Fahrzeugtyp }
     * 
     */
    public Fahrzeugtyp createFahrzeugtyp() {
        return new Fahrzeugtyp();
    }

    /**
     * Create an instance of {@link KuendigenResponse }
     * 
     */
    public KuendigenResponse createKuendigenResponse() {
        return new KuendigenResponse();
    }

    /**
     * Create an instance of {@link Leistung }
     * 
     */
    public Leistung createLeistung() {
        return new Leistung();
    }

    /**
     * Create an instance of {@link Versicherung }
     * 
     */
    public Versicherung createVersicherung() {
        return new Versicherung();
    }

    /**
     * Create an instance of {@link Mitglied }
     * 
     */
    public Mitglied createMitglied() {
        return new Mitglied();
    }

    /**
     * Create an instance of {@link PrintLabel }
     * 
     */
    public PrintLabel createPrintLabel() {
        return new PrintLabel();
    }

    /**
     * Create an instance of {@link PrintLabelResponse }
     * 
     */
    public PrintLabelResponse createPrintLabelResponse() {
        return new PrintLabelResponse();
    }

    /**
     * Create an instance of {@link AlleVersicherungen }
     * 
     */
    public AlleVersicherungen createAlleVersicherungen() {
        return new AlleVersicherungen();
    }

    /**
     * Create an instance of {@link Kuendigen }
     * 
     */
    public Kuendigen createKuendigen() {
        return new Kuendigen();
    }

    /**
     * Create an instance of {@link VersichernResponse }
     * 
     */
    public VersichernResponse createVersichernResponse() {
        return new VersichernResponse();
    }

    /**
     * Create an instance of {@link Versichern }
     * 
     */
    public Versichern createVersichern() {
        return new Versichern();
    }

    /**
     * Create an instance of {@link AlleVersicherungenResponse }
     * 
     */
    public AlleVersicherungenResponse createAlleVersicherungenResponse() {
        return new AlleVersicherungenResponse();
    }

    /**
     * Create an instance of {@link GeneratedIdEntity }
     * 
     */
    public GeneratedIdEntity createGeneratedIdEntity() {
        return new GeneratedIdEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mitglied }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.versicherung.sw.othr.de/", name = "mitglied")
    public JAXBElement<Mitglied> createMitglied(Mitglied value) {
        return new JAXBElement<Mitglied>(_Mitglied_QNAME, Mitglied.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintLabel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.versicherung.sw.othr.de/", name = "printLabel")
    public JAXBElement<PrintLabel> createPrintLabel(PrintLabel value) {
        return new JAXBElement<PrintLabel>(_PrintLabel_QNAME, PrintLabel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintLabelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.versicherung.sw.othr.de/", name = "printLabelResponse")
    public JAXBElement<PrintLabelResponse> createPrintLabelResponse(PrintLabelResponse value) {
        return new JAXBElement<PrintLabelResponse>(_PrintLabelResponse_QNAME, PrintLabelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Leistung }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.versicherung.sw.othr.de/", name = "leistung")
    public JAXBElement<Leistung> createLeistung(Leistung value) {
        return new JAXBElement<Leistung>(_Leistung_QNAME, Leistung.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Fahrzeugtyp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.versicherung.sw.othr.de/", name = "fahrzeugtyp")
    public JAXBElement<Fahrzeugtyp> createFahrzeugtyp(Fahrzeugtyp value) {
        return new JAXBElement<Fahrzeugtyp>(_Fahrzeugtyp_QNAME, Fahrzeugtyp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KuendigenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.versicherung.sw.othr.de/", name = "kuendigenResponse")
    public JAXBElement<KuendigenResponse> createKuendigenResponse(KuendigenResponse value) {
        return new JAXBElement<KuendigenResponse>(_KuendigenResponse_QNAME, KuendigenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Versicherung }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.versicherung.sw.othr.de/", name = "versicherung")
    public JAXBElement<Versicherung> createVersicherung(Versicherung value) {
        return new JAXBElement<Versicherung>(_Versicherung_QNAME, Versicherung.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlleVersicherungenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.versicherung.sw.othr.de/", name = "alleVersicherungenResponse")
    public JAXBElement<AlleVersicherungenResponse> createAlleVersicherungenResponse(AlleVersicherungenResponse value) {
        return new JAXBElement<AlleVersicherungenResponse>(_AlleVersicherungenResponse_QNAME, AlleVersicherungenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Versichern }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.versicherung.sw.othr.de/", name = "versichern")
    public JAXBElement<Versichern> createVersichern(Versichern value) {
        return new JAXBElement<Versichern>(_Versichern_QNAME, Versichern.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlleVersicherungen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.versicherung.sw.othr.de/", name = "alleVersicherungen")
    public JAXBElement<AlleVersicherungen> createAlleVersicherungen(AlleVersicherungen value) {
        return new JAXBElement<AlleVersicherungen>(_AlleVersicherungen_QNAME, AlleVersicherungen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Kuendigen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.versicherung.sw.othr.de/", name = "kuendigen")
    public JAXBElement<Kuendigen> createKuendigen(Kuendigen value) {
        return new JAXBElement<Kuendigen>(_Kuendigen_QNAME, Kuendigen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersichernResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.versicherung.sw.othr.de/", name = "versichernResponse")
    public JAXBElement<VersichernResponse> createVersichernResponse(VersichernResponse value) {
        return new JAXBElement<VersichernResponse>(_VersichernResponse_QNAME, VersichernResponse.class, null, value);
    }

}
