package de.ja.lieferfix.model;

import de.ja.lieferfix.entity.Address;
import de.ja.lieferfix.entity.Customer;
import de.ja.lieferfix.entity.Delivery;
import de.ja.lieferfix.entity.Type;
import de.ja.lieferfix.service.CustomerService;
import de.ja.lieferfix.service.MailService;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@SessionScoped
public class MailModel implements Serializable {

    @Inject
    private MailService mailService;

    @Inject
    private CustomerService customerService;

    private Customer sender, recipent;

    private String s_street;
    private String s_streetNr;
    private String s_zipCode;
    private String s_city;
    private String s_firstName;
    private String s_lastName;
    private String s_companyName;
    private String s_email;
    private String s_phoneNumber;

    private String r_street;
    private String r_streetNr;
    private String r_zipCode;
    private String r_city;
    private String r_firstName;
    private String r_lastName;
    private String r_companyName;

    private Delivery newDelivery;

    private String type = "";
    private String errorMsg = "";

    public String makeLabel(Customer customer) {

        if (!type.equals("")) {
            if (customer == null) {
                Address s_Address = new Address(s_city, s_zipCode, s_street, s_streetNr);
                sender = new Customer(s_firstName, s_lastName, s_companyName, s_Address, s_email, s_phoneNumber);
                customerService.createCustomer(sender);
            } else {
                sender = customer;
            }

            Address r_Address = new Address(r_city, r_zipCode, r_street, r_streetNr);
            recipent = new Customer(r_firstName, r_lastName, r_companyName, r_Address, "", "");
            customerService.createCustomer(recipent);

            if (type.equals("letter_s")) {
                newDelivery = new Delivery(sender, recipent, Type.BRIEF_KLEIN);

            } else if (type.equals("letter_l")) {
                newDelivery = new Delivery(sender, recipent, Type.BRIEF_GROSS);

            } else if (type.equals("package_s")) {
                newDelivery = new Delivery(sender, recipent, Type.PAKET_KLEIN);

            } else if (type.equals("package_m")) {
                newDelivery = new Delivery(sender, recipent, Type.PAKET_MITTEL);

            } else if (type.equals("package_l")) {
                newDelivery = new Delivery(sender, recipent, Type.PAKET_GROSS);
            }

            if (customer != null) {
                customer.deliveries.add(newDelivery);
            }
            
            mailService.orderLabel(newDelivery);

            return "show_label";
        } else {
            errorMsg = "Bitte wählen Sie einen Typ aus.";
            return "label_fail";
        }
    }

    public boolean hasLabel() {
        if (this.newDelivery != null) {
            return true;
        } else {
            return false;
        }
    }

    public Delivery getNewDelivery() {
        return newDelivery;
    }

    public void setNewDelivery(Delivery newDelivery) {
        this.newDelivery = newDelivery;
    }

    public MailService getPostService() {
        return mailService;
    }

    public void setPostService(MailService postService) {
        this.mailService = postService;
    }

    public Customer getSender() {
        return sender;
    }

    public void setSender(Customer sender) {
        this.sender = sender;
    }

    public Customer getRecipent() {
        return recipent;
    }

    public void setRecipent(Customer recipent) {
        this.recipent = recipent;
    }

    public String getS_street() {
        return s_street;
    }

    public void setS_street(String s_street) {
        this.s_street = s_street;
    }

    public String getS_streetNr() {
        return s_streetNr;
    }

    public void setS_streetNr(String s_streetNr) {
        this.s_streetNr = s_streetNr;
    }

    public String getS_zipCode() {
        return s_zipCode;
    }

    public void setS_zipCode(String s_zipCode) {
        this.s_zipCode = s_zipCode;
    }

    public String getS_city() {
        return s_city;
    }

    public void setS_city(String s_town) {
        this.s_city = s_town;
    }

    public String getS_firstName() {
        return s_firstName;
    }

    public void setS_firstName(String s_firstName) {
        this.s_firstName = s_firstName;
    }

    public String getS_lastName() {
        return s_lastName;
    }

    public void setS_lastName(String s_lastName) {
        this.s_lastName = s_lastName;
    }

    public String getS_companyName() {
        return s_companyName;
    }

    public void setS_companyName(String s_companyName) {
        this.s_companyName = s_companyName;
    }

    public String getS_email() {
        return s_email;
    }

    public void setS_email(String s_email) {
        this.s_email = s_email;
    }

    public String getS_phoneNumber() {
        return s_phoneNumber;
    }

    public void setS_phoneNumber(String s_phoneNumber) {
        this.s_phoneNumber = s_phoneNumber;
    }

    public String getR_street() {
        return r_street;
    }

    public void setR_street(String r_street) {
        this.r_street = r_street;
    }

    public String getR_streetNr() {
        return r_streetNr;
    }

    public void setR_streetNr(String r_streetNr) {
        this.r_streetNr = r_streetNr;
    }

    public String getR_zipCode() {
        return r_zipCode;
    }

    public void setR_zipCode(String r_zipCode) {
        this.r_zipCode = r_zipCode;
    }

    public String getR_city() {
        return r_city;
    }

    public void setR_city(String r_town) {
        this.r_city = r_town;
    }

    public String getR_firstName() {
        return r_firstName;
    }

    public void setR_firstName(String r_firstName) {
        this.r_firstName = r_firstName;
    }

    public String getR_lastName() {
        return r_lastName;
    }

    public void setR_lastName(String r_lastName) {
        this.r_lastName = r_lastName;
    }

    public String getR_companyName() {
        return r_companyName;
    }

    public void setR_companyName(String r_companyName) {
        this.r_companyName = r_companyName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

}
