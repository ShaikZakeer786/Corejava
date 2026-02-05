
import java.util.ArrayList;
import java.util.List;

public class AddEmployee {

    public static void main(String[] args) {

       
        List<Employee> employees = new ArrayList<>();

       
        employees.add(new Employee(101, "Zakeer", "IT"));
        employees.add(new Employee(102, "Abbas", "developer"));
        employees.add(new Employee(103, "Rahul", "Finance"));
        employees.add(new Employee(104, "Shahul", "engineer"));

        
        System.out.println("Employee List:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
