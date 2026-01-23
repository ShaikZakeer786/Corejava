package Exceptions;

public class ExceptionInParentTry {

    public static void main(String[] args) {

        try {                                  
            System.out.println(1);            

            int a = 10 / 0;                 

            // This INNER TRY is NEVER reached
            try {
                System.out.println(2);
            } catch (Exception e) {
                System.out.println(3);
            } finally {
                System.out.println(4);
            }

            System.out.println(5);
        }
        catch (ArithmeticException e) {        
            System.out.println(6);
        }
        finally {
            System.out.println(7);             
        }

        System.out.println(8);                  
    }
}

