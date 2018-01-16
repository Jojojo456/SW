package de.ja.lieferfix.service;

import de.ja.lieferfix.entity.Delivery;
import de.ja.lieferfix.entity.Employee;
import de.ja.lieferfix.entity.State;
import de.ja.lieferfix.entity.Vehicle;
import javax.enterprise.context.RequestScoped;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@WebService
@RequestScoped
public class MailService {


    @PersistenceContext(unitName = "LieferFixPU")
    private EntityManager em;

    public MailService() {

    }
    
    @WebMethod
    @Transactional
    public String orderLabel(@WebParam(name="delivery") Delivery newDelivery){
        
        String rndE =  Integer.toString(1 + (int)(Math.random() * 4));
        Employee e =  em.find(Employee.class, rndE);
//        e.addShipment(newDelivery.getShipment());
//        em.merge(e);

        String rndV = Integer.toString(1 + (int)(Math.random() * 4)); 
        Vehicle v = em.find(Vehicle.class, rndV);
       
        newDelivery.processShipment(e, v);
        newDelivery.setShipmentState(State.BEZAHLT);

        em.merge(newDelivery);
        
        return newDelivery.getId();
    }
}
    
