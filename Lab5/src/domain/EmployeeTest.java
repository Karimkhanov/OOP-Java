package domain;

public class EmployeeTest {
    public static void main(String[] args) {
        Engineer engineer = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
        Manager manager = new Manager(207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing");
        Admin admin = new Admin(304, "Bill Monroe", "108-23-6509", 75_002.34);
        Director director = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);

        printEmployee(engineer);
        printEmployee(manager);
        printEmployee(admin);
        printEmployee(director);
    }

    public static void printEmployee(Employee emp) {
        System.out.println(); // Print a blank line as a separator        // Additional details can be printed based on the instance type
        // Print out the data in this Employee object
        System.out.println ("Employee id:	" + emp.getEmpId());
        System.out.println ("Employee name:	" + emp.getName());
        System.out.println ("Employee Soc Sec #: " + emp.getSsn());
        System.out.println ("Employee salary:	" + emp.getSalary());

    }
}
