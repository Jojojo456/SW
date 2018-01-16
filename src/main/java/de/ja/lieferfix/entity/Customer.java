package de.ja.lieferfix.entity;

import de.ja.lieferfix.entity.utils.EntityUtils;
import de.ja.lieferfix.entity.utils.StringIdEntity;
import java.util.List;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Customer extends StringIdEntity {

    public static final String HASH_ALGORITHM = "SHA-512";

    private String firstName;
    private String lastName;
    private String companyName;

    @OneToOne(cascade = {CascadeType.ALL})
    private Address address; //EVTL als Liste

    private String email;
    private String phoneNumber;

    private String username;
    private String password;
    private String salt;

    @OneToMany(mappedBy = "sender", fetch = FetchType.EAGER)
    public List<Delivery> deliveries;

    public Customer() {
        super();

    }

    /*
    Account with username and password
     */
    public Customer(String username, String password, String firstName, String lastName,
            String companyName, Address address, String email, String phoneNumber) {

        super(username);

        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;

        this.username = username;
        this.password = password;

        this.salt = EntityUtils.createRandomString(4);
        try {
            this.password = EntityUtils.hashPassword(password, this.salt, HASH_ALGORITHM);
        } catch (EntityUtils.EntityUtilException ex) {
            throw new RuntimeException("password can not be hashed", ex);
        }
    }

    /*
    Unregistered users (sender and recipent)
     */
    public Customer(String firstName, String lastName,
            String companyName, Address address, String email, String phoneNumber) {

        super(firstName + "_" + lastName + UUID.randomUUID().toString().replace("-", ""));

        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;

        this.username = "unregistered";
        this.password = "none";
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*public long getCustomerID() {
        return customerID;
    }*/

 /*public Address getAddress() {
        return address;
    }*/
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getUserName() {
        return username;
    }

    public String getSalt() {
        return salt;
    }

    public String getPassword() {
        return password;
    }

    /* @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (this.customerID ^ (this.customerID >>> 32));
        return hash;
    }*/
 /*
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Customer other = (Customer) obj;
        if (this.customerID != other.customerID) {
            return false;
        }
        return true;
    }*/
    public void finalize() throws Throwable {

    }

}//end Customer
