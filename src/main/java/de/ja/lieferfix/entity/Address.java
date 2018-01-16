package de.ja.lieferfix.entity;

import de.ja.lieferfix.entity.utils.GeneratedIdEntity;
import javax.persistence.Entity;


@Entity
public class Address extends GeneratedIdEntity{
    
       
    private String city;
    private String zipCode;
    private String street;
    private String streetNr;

    public Address() {
       super();
    }

    public Address(String City, String zipCode, String Street, String StreetNr) {
        super();
        
        this.city = City;
        this.zipCode = zipCode;
        this.street = Street;
        this.streetNr = StreetNr;
    }
    

    public void finalize() throws Throwable {

    }

    public String getCity() {
        return city;
    }

    public void setCity(String City) {
        this.city = City;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String Street) {
        this.street = Street;
    }

    public String getStreetNr() {
        return streetNr;
    }

    public void setStreetNr(String StreetNr) {
        this.streetNr = StreetNr;
    }

    
    
    
}//end Address
