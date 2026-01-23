package BasicsConditionsandLoops;

public class FibonacciSeries {
    public static void main(String[] args) {

        int n = 5;
        int a = 0;
        int b = 1;

        System.out.print("Fibonacci: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
