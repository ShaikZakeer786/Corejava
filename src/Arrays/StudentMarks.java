package Arrays;

public class StudentMarks {
    public static void main(String[] args) {

        int[][] marks = {
            {80, 75, 90},   // Student 1
            {60, 85, 70}    // Student 2
        };

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
