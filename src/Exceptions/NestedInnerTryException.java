package Exceptions;

public class NestedInnerTryException {

    public static void main(String[] args) {

        try {
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);

            try {
                System.out.println(4);
                int a = 10 / 0;           // Arithmetic exception
                System.out.println(6);
            } catch (ArithmeticException e) {
                System.out.println(7);   // matched
            } finally {
                System.out.println(8);
            }

            System.out.println(9);

        } catch (NullPointerException e) {
            System.out.println(10);
        } finally {
            System.out.println(11);
        }

        System.out.println(12);
    }
}
