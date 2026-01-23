package CollectionsExample;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListExample {

    public static void main(String[] args) {

        // Step 1: Create List
        List<Employee> employeeList = new ArrayList<>();

        // Step 2: Add employees to List
        employeeList.add(new Employee(101, "Zakeer", "IT"));
        employeeList.add(new Employee(102, "abbas", "HR"));
        employeeList.add(new Employee(103, "Ramesh", "Finance"));
        employeeList.add(new Employee(101, "Rahul", "IT")); // duplicate allowed

        // Step 3: Display employees
        for (Employee emp : employeeList) {
            System.out.println(
                "ID: " + emp.id +
                ", Name: " + emp.name +
                ", Dept: " + emp.department
            );
        }
    }
}
