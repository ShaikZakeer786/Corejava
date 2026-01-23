package oopsclassandobject;

public class Employee {
	
    // Variables
    int empId;
    String empName;

    // Constructor
    Employee(int id, String name) {
        empId = id;
        empName = name;
    }

    void showDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }

 public static void main(String[] args) {

        Employee e1 = new Employee(01, "Zakeer");
        e1.showDetails();
        
    }
}



