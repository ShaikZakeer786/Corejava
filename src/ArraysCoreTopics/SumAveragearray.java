package ArraysCoreTopics;

public class SumAveragearray {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        int average = sum / a.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
