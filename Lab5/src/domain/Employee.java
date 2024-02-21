package domain;

public class Employee {
    private final int empId;
    private String name;
    private final String ssn;
    private double salary;


    // Getter methods
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    // SSN is private, no getter provided

    public double getSalary() {
        return salary;
    }

    // Constructor with parameters
    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }


    // Setter method only for name
    public void setName(String name) {
        this.name = name;
    }

    // Method to raise salary
    public void raiseSalary(double increase) {
        salary += increase;

    }


    public String getSsn() {
        return ssn;
    }
}



