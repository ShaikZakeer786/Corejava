package Exceptions;

class NullPointerHandled {
    public static void main(String[] args) {
        try {
            String s = null;
            s.length();
        } catch (NullPointerException e) {
            System.out.println(1);
        }
        System.out.println(2);
    }
}

