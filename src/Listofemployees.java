
import java.util.ArrayList;
import java.util.List;

public class Listofemployees {

    public static void main(String[] args) {

        // List of employee names
        List<String> employeeNames = new ArrayList<>();

        employeeNames.add("haneef ");
        employeeNames.add("Zakeer");
        employeeNames.add("Wasif");

        System.out.println("Employee Names:");

        for (String name : employeeNames) {
            System.out.println(name);
        }
    }
}

