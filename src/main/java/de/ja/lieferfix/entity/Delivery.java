package de.ja.lieferfix.entity;

import de.ja.lieferfix.entity.utils.StringIdEntity;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Delivery extends StringIdEntity{

    @OneToOne(cascade = {CascadeType.ALL})
    private Customer recipent;
    @ManyToOne(cascade = {CascadeType.ALL})
    private Customer sender;
    @OneToOne(cascade = {CascadeType.ALL})
    private Shipment shipment;
    
    private State shipmentState;
    private Type type;
    private float price;
    

    public Delivery() {
        super("none");
    }

    public Delivery(Customer sender, Customer recipent, Type type) {
        
        super("toCalc");
        
        this.id = calcTrackingNr();
        
        this.recipent = recipent;
        this.sender = sender;
        //this.shipment = new Shipment(); //TODO
        this.shipmentState = State.GEDRUCKT;
        this.type = type;
        this.price = calcPrice();
    }
    
    public void processShipment(Employee e, Vehicle v){
        
        this.shipment = new Shipment(e, v);
    }
    
    public String calcTrackingNr(){
        
        String trackingNr;
        DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        trackingNr = df.format(new Date(System.currentTimeMillis())) + 
                            UUID.randomUUID().toString().replace("-", "");
        return trackingNr;
    }
    
    private float calcPrice(){
        
        float price = 0;
        
        if(null == type){
            //Throw exception here
        } else switch (type) {
            case BRIEF_KLEIN:
                price = 0.85f;
                break;
            case BRIEF_GROSS:
                price = 1.45f;
                break;
            case PAKET_KLEIN:
                price = 1.95f;
                break;
            case PAKET_MITTEL:
                price = 3.5f;
                break;
            case PAKET_GROSS:
                price = 4.99f;
                break;
            default:
                price = -1f;
                break;
        }
        
        return price;
    }
    

    public Customer getRecipent() {
        return recipent;
    }

    public void setRecipent(Customer recipent) {
        this.recipent = recipent;
    }

    public Customer getSender() {
        return sender;
    }

    public void setSender(Customer sender) {
        this.sender = sender;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    public State getShipmentState() {
        return shipmentState;
    }

    public void setShipmentState(State shipmentState) {
        this.shipmentState = shipmentState;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    
}//end Delivery
