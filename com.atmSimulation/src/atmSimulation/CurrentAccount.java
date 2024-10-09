package atmSimulation;

public class CurrentAccount implements AccountOperations{
    private int balance;
	
	public void deposit(int balance) {
		this.balance = this.balance + balance;
		System.out.println("Your balance is: "+ this.balance);
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void checkBalance() {
		System.out.println("The current balance is: "+ this.balance);
	}
	
	public void withdraw(int balance) {
		if(this.balance-balance > 0) {
			this.balance = this.balance - balance;
			System.out.println("Your balance is: "+ this.balance);
		}
		else {
			System.out.println("Insufficient funds");
		}
	}
}
