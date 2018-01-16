package de.ja.lieferfix.service;

import de.ja.lieferfix.entity.Customer;
import de.ja.lieferfix.entity.Delivery;
import de.ja.lieferfix.entity.State;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@RequestScoped
public class ShipmentStateService {


    @PersistenceContext(unitName = "LieferFixPU")
    private EntityManager em;

    public ShipmentStateService() {

    }
    
    public Delivery checkShipmentState(String id){
             
        Delivery delivery = em.find(Delivery.class, id);
        
        if(delivery == null)
            return null;
        else 
            return delivery;
    }
    
    public List<Delivery> getAllOrders(Customer customer) {
        //TODO return if null!
         
        TypedQuery<Delivery> query = em.createQuery
                        ("SELECT d FROM Delivery AS d Where d.sender = :customer", Delivery.class);
        query.setParameter("customer", customer);
        
        return query.getResultList();
    }
    
    private List<Delivery> getAllOrders() {
         
        TypedQuery<Delivery> query = em.createQuery
                        ("SELECT d FROM Delivery AS d", Delivery.class);
        
        return query.getResultList();
    }
    
    public void updateShipmentStates(){
        
        for(Delivery d : getAllOrders()){
            State actual = d.getShipmentState();

            switch(actual){
                case GEDRUCKT:
                    actual = State.BEZAHLT;
                break;
                case BEZAHLT:
                    actual = State.EINGELADEN;
                break;
                case EINGELADEN:
                    actual = State.AUSLIEFERUNG;
                break;
                case AUSLIEFERUNG:
                    actual = State.AUSGELIEFERT;
                break;
                case AUSGELIEFERT:
                    actual = State.AUSGELIEFERT;
                break;
                default:
            }
            
            d.setShipmentState(actual);
            em.merge(d);
            
        }
    }
    
}//end PostSe
    
