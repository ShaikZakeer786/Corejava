package Exceptions;

class ArrayIndexHandled {
    public static void main(String[] args) {
        try {
            int[] a = {1,2};
            System.out.println(a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(1);
        }
    }
}

