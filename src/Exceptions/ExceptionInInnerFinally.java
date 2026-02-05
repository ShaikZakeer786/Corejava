package Exceptions;

class ExceptionInInnerFinally {
    public static void main(String[] args) {
        try {
            try {
                System.out.println(1);
            } finally {
                int a = 10 / 0;
            }
        } catch (ArithmeticException e) {
            System.out.println(2);
        }
    }
}

