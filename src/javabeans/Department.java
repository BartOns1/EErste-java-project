package javabeans;

import java.util.Date;

/**
 * Created by barto on 17/06/2017.
 */
public class Department {

    private String deptName = new String();
    private String location = new String();
    Date datum = new Date(1972,11,1);
    private Employee manager = new Employee("Bart", "Ons", datum, 0, "bart.ons@teleent.be");

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }
}


