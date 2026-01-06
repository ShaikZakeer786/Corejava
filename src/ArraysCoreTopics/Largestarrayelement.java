package ArraysCoreTopics;

public class Largestarrayelement {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int largest = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }

        System.out.println("Largest array element: " + largest);
    }
}

