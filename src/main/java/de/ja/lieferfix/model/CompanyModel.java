package de.ja.lieferfix.model;

import de.ja.lieferfix.entity.Employee;
import de.ja.lieferfix.entity.Vehicle;
import de.ja.lieferfix.service.CompanyService;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@SessionScoped
public class CompanyModel implements Serializable {
 
    @Inject
    private CompanyService companyService;
    
    public List<Employee> allEmployees() {
        return this.companyService.getAllEmployees();
    }
    
    public List<Vehicle> allVehicles() {
        return this.companyService.getAllVehicles();
    }

    
}
