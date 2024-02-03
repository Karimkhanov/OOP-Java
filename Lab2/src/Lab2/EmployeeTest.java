package Lab2;

import Lab2.Employee;
public class EmployeeTest {

    public static void main(String[] args){

        Employee employee = new Employee();

        employee.setE_id(22);
        employee.setE_name("Timka");
        employee.setE_soc_num("34293064");
        employee.setE_sal(1000000);


        System.out.println("Employee ID is: " + employee.getE_id());
        System.out.println("Employee Name is: " + employee.getE_name());
        System.out.println("Employee Social Number is: " + employee.getE_soc_num());
        System.out.println("Employee's salary is: " + employee.getE_sal());

    }
}
