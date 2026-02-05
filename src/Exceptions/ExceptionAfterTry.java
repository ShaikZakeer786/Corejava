package Exceptions;

class ExceptionAfterTry {
    public static void main(String[] args) {
        try {
            System.out.println(1);
        } catch (Exception e) {
            System.out.println(2);
        } finally {
            System.out.println(3);
        }
        int a = 10 / 0;
    }
}

