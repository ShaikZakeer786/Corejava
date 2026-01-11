package Exceptions;

class ExceptionBeforeTry {
    public static void main(String[] args) {
        int a = 10 / 0;
        try {
            System.out.println(1);
        } catch (Exception e) {
            System.out.println(2);
        }
    }
}
