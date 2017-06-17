package javabeans;

import java.util.Date;

/**
 * Created by barto on 17/06/2017.
 */
public class Employee {
    private String firstName = new String();
    private String lastName = new String();
    private Date birthDate = new Date();
    private double salary;
    private String email = new String();


    public Employee(String firstname, String lastname, Date birthdate, double salary, String email){
        this.firstName = firstname;
        this.lastName = lastname;
        this.birthDate = birthdate;
        this.salary = salary;
        this.email = email;
    }

    public String toString(Employee employee){
        String employeeRecord = new String();
        employeeRecord = employee.firstName + " " + employee.lastName + "/" + employee.birthDate.toString() + "/" + employee.salary + "€/" + employee.email;
        return employeeRecord;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


