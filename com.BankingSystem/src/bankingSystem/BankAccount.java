package bankingSystem;

public class BankAccount {
	public int AccountNumber;
	public String AccountHolder; 
	public int balance;
	
	void setUserInfo(int AccountNumber, String AccountHolder, int balance) {
		this.AccountNumber = AccountNumber;
		this.AccountHolder = AccountHolder;
		this.balance = balance;
	}
	
	void checkBalance() {
		//System.out.println();
		System.out.println("Your account number is: "+ AccountNumber);
		System.out.println("Your name is: "+ AccountHolder);
		System.out.println("The balance is: "+ balance);
	}
	
	void deposit(int balance) {
		if(this.balance - balance > 0) {
			this.balance = this.balance + balance;
			System.out.println("Amount deposited successfully!!!");
		}
		else {
			System.out.println("Insufficient balance");
		}
		
		
	}
	
	void withdrawl(int balance) {
		this.balance = this.balance - balance;
		System.out.println("Amount withdrwn successfully!!!");
	}
	
	
}
