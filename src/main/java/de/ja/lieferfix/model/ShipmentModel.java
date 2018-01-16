package de.ja.lieferfix.model;

import de.ja.lieferfix.entity.Customer;
import de.ja.lieferfix.entity.Delivery;
import de.ja.lieferfix.service.ShipmentStateService;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@SessionScoped
public class ShipmentModel implements Serializable {
    
 
    @Inject
    private ShipmentStateService shipmentService;
        
    private Delivery delivery;
    
    private String idToTrack;
   
    public String checkTrackingID(){
        
        delivery = shipmentService.checkShipmentState(idToTrack);
        
        if(delivery == null){
            idToTrack = "id wrong or not available";
            return "tracking";
        }
        idToTrack = "";
        
        return "tracking_info";
    }
    
    public String checkTrackingID(String id){
        this.idToTrack = id;
        
        return checkTrackingID();        
    }
    
    
    public boolean correctID() {
        if(this.delivery.getId() != null)
            return true;
        else
            return false;
    }
    
    public List<Delivery> allOrders(Customer customer) {
        return this.shipmentService.getAllOrders(customer);
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery Delivery) {
        this.delivery = Delivery;
    }

    public String getIdToTrack() {
        return idToTrack;
    }

    public void setIdToTrack(String idToTrack) {
        this.idToTrack = idToTrack;
    }

    
    
}
