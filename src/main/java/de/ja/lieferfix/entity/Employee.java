package de.ja.lieferfix.entity;

import de.ja.lieferfix.entity.utils.GeneratedIdEntity;
import de.ja.lieferfix.entity.utils.StringIdEntity;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee extends StringIdEntity{

    
    @OneToOne(cascade = {CascadeType.ALL})
    private Address address;
    private String firstName;
    private String lastName;
    
    @OneToMany(mappedBy = "employee", fetch = FetchType.EAGER)
    public List<Shipment> shipments;

    public Employee() {
        super();
    }

    public Employee(String id, Address address, String firstName, String lastName) {           
        super(id);
        
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
        this.shipments = null;
    }
    
    public void addShipment(Shipment newShipment){
        this.shipments.add(newShipment);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    


}//end Employee
