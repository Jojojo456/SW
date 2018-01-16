package de.ja.lieferfix.entity;

import de.ja.lieferfix.entity.utils.GeneratedIdEntity;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Shipment extends GeneratedIdEntity{

   
    @OneToOne(cascade = {CascadeType.PERSIST})
    private Employee employee;
    @OneToOne(cascade = {CascadeType.PERSIST})
    private Vehicle vehicle;

    
    public Shipment() {
        super();
        this.employee = new Employee();
        this.vehicle = new Vehicle();
    }

    public Shipment(Employee employee, Vehicle vehicle) {
        
        super();
        this.employee = employee;
        this.vehicle = vehicle;
    }
    

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    


}//end Shipment
