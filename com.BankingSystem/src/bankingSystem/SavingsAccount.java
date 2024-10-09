package bankingSystem;

public class SavingsAccount extends BankAccount{
	
	void withdrawl(int balance) {
		if(this.balance - balance < 10000) {
			System.out.println("Cannot be withdrawn");
		}
		else {
			this.balance = this.balance - balance;
		}
	}
}
