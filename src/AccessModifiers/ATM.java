package AccessModifiers;

public class ATM {
/*	6️.Bank ATM Machine
	Task:
	Class ATM:
	static variable bankName
	non-static variable balance
	default constructor → set balance=0
	public constructor → set customerName
	switch menu → 1) Deposit 2) Withdraw 3) Check Balance
	Input: 1, amount=500
	Output: Deposited: 500
*/
	
	static String bankName = "HDFC";
	int balance;
	String name;
	
	ATM (){
		balance = 0;
	}
	public ATM(String n) {
		name = n;
	}
	public void menu(int menu) {
		switch (menu) {
		case  1:
			int balance = 500;
			System.out.println("Deposited : "+balance);
			break;
		case 2:
			System.out.println("Withdraw");
			break;
		case 3:
			System.out.println("Check Balance ");
			break;
			default :
				System.out.println("Inavalid Output");
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Bank Name : "+bankName);
		
		
		ATM obj = new ATM("ZAKEER");
		
		System.out.println("User : "+obj.name);
		System.out.println("Balance : "+obj.balance);
		
		obj.menu(1);
	}
}