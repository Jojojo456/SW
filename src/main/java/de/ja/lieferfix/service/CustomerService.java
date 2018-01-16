package de.ja.lieferfix.service;

import de.ja.lieferfix.entity.Customer;
import de.ja.lieferfix.entity.utils.EntityUtils;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

@RequestScoped
public class CustomerService {

    @PersistenceContext(unitName = "LieferFixPU")
    private EntityManager em;
    
    
    
    @Transactional
    public Customer createCustomer(Customer newCustomer){
        
        if(checkIfNew(newCustomer.getUserName()) == false){
            return null;
        } else { 
            
            em.persist(newCustomer);
           
            return newCustomer;
        }
    }
    
    public boolean checkIfNew(String username){
        if(em.find(Customer.class, username) == null)
            return true;
        else 
            return false;
    }
    
    @Transactional
    public Customer deleteCustomer(Customer toDelete){
        toDelete = em.merge(toDelete);
        //hier evtl checks
        em.remove(toDelete);
        return toDelete;
    }
    
    public List<Customer> getAllCustomers(){
        TypedQuery<Customer> query = em.createQuery("SELECT c FROM Customer AS c", Customer.class);
        return query.getResultList();
    }
   
    public Customer checkCustomerPassword(String username, String password){
        Customer c = em.find(Customer.class, username);
        if(c == null)
            return null;
        try {
            if( EntityUtils.hashPassword(password, c.getSalt(), 
                    Customer.HASH_ALGORITHM).equals(c.getPassword()))
                return c;
            else
                return null;
        } catch(EntityUtils.EntityUtilException ex) {
            throw new RuntimeException("password can not be hashed", ex);
        }
    }
}
