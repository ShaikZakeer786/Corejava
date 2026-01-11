package Exceptions;

class ExceptionInCatch {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            int b = 10 / 0;
        } finally {
            System.out.println(3);
        }
    }
}
