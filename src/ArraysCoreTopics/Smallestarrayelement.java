package ArraysCoreTopics;

public class Smallestarrayelement {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int smallest = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < smallest) {
                smallest = a[i];
            }
        }

        System.out.println("Smallest array element: " + smallest);
    }
}
