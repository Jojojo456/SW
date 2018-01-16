package de.ja.lieferfix.model;

import de.ja.lieferfix.entity.Address;
import de.ja.lieferfix.entity.Customer;
import de.ja.lieferfix.service.CustomerService;
import de.ja.lieferfix.service.CompanyService;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@SessionScoped
public class CustomerModel implements Serializable {

    @Inject
    private CustomerService customerService;

    @Inject
    private CompanyService companyService;

    @PostConstruct
    public void companyData() {
        companyService.gererateCompanyData();
    }

    private Customer lastGenerated = null;
    private Customer userInSession = null;

    private String message;

    private String firstName;
    private String lastName;
    private String companyName;
    private String street;
    private String streetNr;
    private String zipCode;
    private String city;
    private String email;
    private String phoneNumber;

    private String username;
    private String password;

    public String create() {

        Address newAddress = new Address(city, zipCode, street, streetNr);

        this.lastGenerated = customerService.createCustomer(new Customer(this.username, this.password, this.firstName, this.lastName,
                this.companyName, newAddress, this.email, this.phoneNumber));
        this.username = "";
        this.password = "";

        if (lastGenerated == null) {
            this.username = "user allready exists!";
            return "user_exists";
        } else {
            return "userCreated";
        }
    }

    public String login() {
        this.userInSession = customerService.checkCustomerPassword(username, password);
        this.username = "";
        this.password = "";
        if (this.userInSession == null) {
            this.password = "password wrong!";
            return "login_error";
        } else {
            System.out.println("login_ ok " + this.userInSession.getUserName());
            return "login_ok";
        }

    }

    public void logout() {
        this.userInSession = null;
    }

    public boolean hasActiveUser() {
        if (this.userInSession != null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isAdmin() {
        if (hasActiveUser()) {
            if (this.userInSession.getId().toLowerCase().contains("admin")) {
                return true;
            }
        }
        return false;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CustomerService getCustomerService() {
        return customerService;
    }

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public Customer getLastGenerated() {
        return lastGenerated;
    }

    public void setLastGenerated(Customer lastGenerated) {
        this.lastGenerated = lastGenerated;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNr() {
        return streetNr;
    }

    public void setStreetNr(String streetNr) {
        this.streetNr = streetNr;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Customer getUserInSession() {
        return userInSession;
    }

    public void setUserInSession(Customer userInSession) {
        this.userInSession = userInSession;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
