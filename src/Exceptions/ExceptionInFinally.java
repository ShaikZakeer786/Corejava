package Exceptions;

class ExceptionInFinally {
    public static void main(String[] args) {
        try {
            System.out.println(1);
        } finally {
            int a = 10 / 0;
        }
    }
}
