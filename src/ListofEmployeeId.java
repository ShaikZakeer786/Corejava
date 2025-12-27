
import java.util.ArrayList;
import java.util.List;

public class ListofEmployeeId {

    public static void main(String[] args) {

        List<Integer> employeeIds = new ArrayList<>();
        
        employeeIds.add(101);
        employeeIds.add(102);
        employeeIds.add(103);

        System.out.println("Employee IDs:");

        for (Integer id : employeeIds) {
            System.out.println(id);
        }
    }
}
