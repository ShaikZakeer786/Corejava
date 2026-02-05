package ArraysCoreTopics;

public class SecondLargestNumber {
    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 50};
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            } else if (a[i] > secondLargest && a[i] != largest) {
                secondLargest = a[i];
            }
        }

        System.out.println("Second largest Number: " + secondLargest);
    }
}

