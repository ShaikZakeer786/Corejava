package Exceptions;

public class ExceptionInnerCatch{

    public static void main(String[] args) {

        try {                                
            System.out.println(1);            

            try {                               
                System.out.println(2);        
                int a = 10 / 0;              
            }
            catch (NullPointerException e) {   
                System.out.println(3);           

            }
            finally {
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
