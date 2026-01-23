package Exceptions;

class InnerCatchHandles {
    public static void main(String[] args) {
        try {
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println(1);
            }
        } catch (Exception e) {
            System.out.println(2);
        }
    }
}

