import java.util.*;

public class Students {

    public static void main(String[] args) {

        // ==============================
        // Q1. Add Students
        // ==============================
        List<String> studentsList = new ArrayList<>();

        studentsList.add("Zakeer");
        studentsList.add("Zameer");
        studentsList.add("Taufiq");
        studentsList.add("Abbas");
        studentsList.add("Tahir");

        System.out.println("Q1. Students: " + studentsList);

        // ==============================
        // Q2. Get Student by Index
        // ==============================
        int index = 2;
        System.out.println("Q2. Student at index " + index + ": " + studentsList.get(index));

        // ==============================
        // Q3. Count Students
        // ==============================
        System.out.println("Q3. Total Students: " + studentsList.size());

        // ==============================
        // Q4. Check Student Exists
        // ==============================
        String searchName = "John";
        if (studentsList.contains(searchName)) {
            System.out.println("Q4. Student Found");
        } else {
            System.out.println("Q4. Student Not Found");
        }

        // ==============================
        // Q5. Create Product Price List
        // ==============================
        List<Integer> prices = new ArrayList<>();

        prices.add(100);
        prices.add(200);
        prices.add(300);
        prices.add(400);

        System.out.println("Q5. Prices: " + prices);

        // ==============================
        // Q6. Retrieve Product Price
        // ==============================
        int priceIndex = 3;
        System.out.println("Q6. Price at index " + priceIndex + ": " + prices.get(priceIndex));

        // ==============================
        // Q7. Insert Price in Middle
        // ==============================
        prices.add(1, 150);
        System.out.println("Q7. Updated Prices: " + prices);

        // ==============================
        // Q8. Update Price
        // ==============================
        prices.set(2, 250);
        System.out.println("Q8. After Update: " + prices);

        // ==============================
        // Q9. Create Customer Queue
        // ==============================
        List<String> queue = new LinkedList<>();

        queue.add("C1");
        queue.add("C2");
        queue.add("C3");

        System.out.println("Q9. Queue: " + queue);

        // ==============================
        // Q10. Add VIP Customer
        // ==============================
        ((LinkedList<String>) queue).addFirst("VIP");
        System.out.println("Q10. Queue After VIP: " + queue);

        // ==============================
        // Q11. Serve Customer
        // ==============================
        String servedCustomer = ((LinkedList<String>) queue).removeFirst();
        System.out.println("Q11. Served Customer: " + servedCustomer);
        System.out.println("     Remaining Queue: " + queue);

        // ==============================
        // Q12. Remove Last Customer
        // ==============================
        ((LinkedList<String>) queue).removeLast();
        System.out.println("Q12. Queue After Removal: " + queue);
    }
}

