package Exceptions;

class ExceptionMatched {
    public static void main(String[] args) {
        try {
            System.out.println(1);
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(2);
        } finally {
            System.out.println(3);
        }
        System.out.println(4);
    }
}

