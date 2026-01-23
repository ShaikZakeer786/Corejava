package Arrays;

public class TwoDArray {
    public static void main(String[] args) {

        // 1️⃣ Declare and initialize 2D array
        int[][] numbers = {
            {10, 20, 30},
            {40, 50, 60}
        };

        // 2️⃣ Print elements using for loop
        System.out.println("2D Array Elements:");

        for (int i = 0; i < numbers.length; i++) {          // rows
            for (int j = 0; j < numbers[i].length; j++) {   // columns
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }
    }
}
