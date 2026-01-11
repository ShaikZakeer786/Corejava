package Constructors;

public class BankIntrest {
	/*
	 * 2.Bank Interest Calculation
	 * 
	 * Question: Create a class Bank.
	 * 
	 * Static variable: interestRate
	 * 
	 * Instance variables: accountNumber, balance
	 * 
	 * Write:
	 * 
	 * Static method to show interest rate
	 * 
	 * Non-static method to display account details
	 */
	
	static double interestRate = 3.5;
	int accountnumber;
	int balance ;
	
	
	public  void    intrest() {
		
	
		
		System.out.println("Bank interst rate : "+interestRate);
		System.out.println("Account Number : "+accountnumber);
		System.out.println("Balance  : "+balance );
	}
	public static void rateOfInt() {
		System.out.println("Bank interst rate : "+interestRate);
	}
	
	public static void main(String[] args) {
		BankIntrest obj = new BankIntrest();
		BankIntrest.rateOfInt();
		obj.accountnumber = 12345;
		obj.balance = 10000;
		obj.intrest();
		
		
		
	}
	
}
