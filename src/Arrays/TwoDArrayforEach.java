package Arrays;

public class TwoDArrayforEach {
    public static void main(String[] args) {

        // 1️⃣ Declare and initialize 2D array
        int[][] numbers = {
            {10, 20, 30},
            {40, 50, 60}
        };

        // 2️⃣ Print elements using for-each loop
        System.out.println("2D Array Elements:");

        for (int[] row : numbers) {          // each row
            for (int value : row) {          // each value in row
                System.out.print(value + " ");
            }
            System.out.println();             // new line after each row
        }
    }
}

