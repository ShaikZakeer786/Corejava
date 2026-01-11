package Exceptions;

class CatchParentException {
    public static void main(String[] args) {
        try {
            String s = null;
            s.length();
        } catch (Exception e) {
            System.out.println(1);
        }
    }
}
