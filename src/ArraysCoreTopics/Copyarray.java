package ArraysCoreTopics;

public class Copyarray {
    public static void main(String[] args) {

        int[] a = {100,200,300};
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
