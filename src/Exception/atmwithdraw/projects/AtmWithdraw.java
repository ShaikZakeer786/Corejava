package Exception.atmwithdraw.projects;

import java.util.Scanner;

public class AtmWithdraw {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ATMService atm = new ATMService();

        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            boolean status = atm.withdraw(amount);

            if (status) {
                System.out.println("Transaction Completed");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Input Error: " + e.getMessage());

        } catch (InsufficientBalanceException e) {
            System.out.println("Balance Error: " + e.getMessage());
            
        }finally {
        	
            sc.close();
        }

    }
}
