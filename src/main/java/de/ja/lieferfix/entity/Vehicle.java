package de.ja.lieferfix.entity;

import de.ja.lieferfix.entity.utils.StringIdEntity;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Vehicle extends StringIdEntity {

    private String Brand;
    private String Model;
    private String registrationDate;

    @OneToOne(mappedBy = "vehicle")
    private Shipment actualShipment;

    private Long insuranceId;

    public Vehicle() {
        super();
    }

    public Vehicle(String fahrgestellNr, String Brand, String Model,
            String registrationDate, Long insuranceId) {
        super(fahrgestellNr);
        this.Brand = Brand;
        this.Model = Model;
        this.registrationDate = registrationDate;
        this.insuranceId = insuranceId;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Long getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(Long insuranceId) {
        this.insuranceId = insuranceId;
    }

}//end Vehicle
