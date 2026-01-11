package Exceptions;

class MultipleCatch {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (NullPointerException e) {
            System.out.println(1);
        } catch (ArithmeticException e) {
            System.out.println(2);
        }
    }
}

