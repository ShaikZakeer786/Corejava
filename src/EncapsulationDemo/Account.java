package EncapsulationDemo;

public class Account {
	private int accountNumber;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public  void accountNumber(int i) {
		accountNumber = i;
		
	}
	
	public static void main(String[] args) {
		Account obj = new Account();
		
		obj.accountNumber(1234);
		
		int accountNumber=obj.getAccountNumber();
		System.out.println("Account Number :"+accountNumber);
	}


	
}
