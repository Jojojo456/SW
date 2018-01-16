package de.ja.lieferfix.service;

import de.ja.lieferfix.entity.Address;
import de.ja.lieferfix.entity.Customer;
import de.ja.lieferfix.entity.Employee;
import de.ja.lieferfix.entity.Vehicle;
import de.othr.sw.versicherung.service.Mitglied;
import de.othr.sw.versicherung.service.Versicherung;
import de.othr.sw.versicherung.service.VersicherungsService;
import de.othr.sw.versicherung.service.VersicherungsServiceService;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

@RequestScoped
public class CompanyService {

    @PersistenceContext(unitName = "LieferFixPU")
    private EntityManager em;

    public CompanyService() {

    }

    @Inject
    private CustomerService customerService;
    

    private static final List<Vehicle> vehicles = new ArrayList<>();
    private static final List<Employee> employees = new ArrayList<>();
    private static final List<Customer> customers = new ArrayList<>();

    public void createData() {

        VersicherungsServiceService service = new VersicherungsServiceService();
        VersicherungsService vs = service.getVersicherungsServicePort();

        customers.add(new Customer("admin", "admin", "Ober", "Boss", "LieferFix",
                new Address("Chefhausen", "1337", "Bigstreet", "1"),
                "chef@lieferfix.de", "65161"));
        customers.add(new Customer("user", "pass", "John", "Doe", "---",
                new Address("Funky Town", "092347", "Funkystreet", "45"),
                "john@gmail.com", "0982347034"));
        customers.add(new Customer("acc", "1234", "Sarah", "Lee", "Flowers inc.",
                new Address("Tulip Town", "35464", "Rosegarden", "87"),
                "sarah.lee@yahoo.com", "0519164161"));
        customers.add(new Customer("Franz", "Xaver", "---",
                new Address("Berghausen", "7542", "Bergstrasse", "2"),
                "franz@berg.de", "75272"));

        employees.add(new Employee("1", new Address("Iron Town", "923847", "Mainstreet", "344"),
                "Tony", "Stark"));
        employees.add(new Employee("2", new Address("Smallville", "3040234", "Candylane", "2"),
                "Clark", "Kent"));
        employees.add(new Employee("3", new Address("Gotham", "32523", "Batcave", "1"),
                "Bruce", "Wayne"));
        employees.add(new Employee("4", new Address("New York", "234234", "Bulevard", "42"),
                "Peter", "Parker"));

        Versicherung v1 = null, v2 = null, v3 = null, v4 = null;

        try { // Call Web Service Operation

            Mitglied member = new Mitglied();
            member.setAnrede("Firma");
            member.setMail("lieferfix@fix.de");
            member.setNachname("");
            member.setName("LieferFix");
            member.setPLZ("23423");
            member.setStadt("Lieferhausen");
            member.setStrasse("Lieferstrasse");
            member.setHausnr("42");

            v1 = vs.versichern(member, "Hagelschutz", "R-LF-1", "Lieferwagen");
            v2 = vs.versichern(member, "Hagelschutz", "R-LF-2", "Lieferwagen");
            v3 = vs.versichern(member, "Hagelschutz", "R-LF-3", "Lieferwagen");
            v4 = vs.versichern(member, "Hagelschutz", "R-LF-4", "Lieferwagen");

        } catch (Exception ex) {
            System.out.print("error with VersicherungsService");
        }

        long vID_1, vID_2, vID_3, vID_4;

        if (v1 == null) {
            vID_1 = 0;
            vID_2 = 0;
            vID_3 = 0;
            vID_4 = 0;
        } else {
            vID_1 = v1.getId();
            vID_2 = v2.getId();
            vID_3 = v3.getId();
            vID_4 = v4.getId();
        }

        vehicles.add(new Vehicle("1", "VW", "T5", "10.01.2017", vID_1));
        vehicles.add(new Vehicle("2", "VW", "T4", "17.06.2015", vID_2));
        vehicles.add(new Vehicle("3", "Streetscooter", "Elektro", "11.01.2018", vID_3));
        vehicles.add(new Vehicle("4", "Mercedes", "Sprinter", "24.05.2016", vID_4));

    }

    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public void gererateCompanyData() {
        Customer check = em.find(Customer.class, "user");
        if (check != null) {
            return;
        }

        createData();

        for (Customer c : customers) {
            em.persist(c);
        }
        for (Employee e : employees) {
            em.persist(e);
        }
        for (Vehicle v : vehicles) {
            em.persist(v);
        }
    }

    public List<Employee> getAllEmployees() {
        TypedQuery<Employee> query = em.createQuery("SELECT e FROM Employee AS e", Employee.class);
        return query.getResultList();
    }

    public List<Vehicle> getAllVehicles() {
        TypedQuery<Vehicle> query = em.createQuery("SELECT v FROM Vehicle AS v", Vehicle.class);
        return query.getResultList();
    }

}
