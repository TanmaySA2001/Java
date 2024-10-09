package atmSimulation;

public class MainClass {
	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount();
		sa.setBalance(50000);
		sa.deposit(4000);
		sa.checkBalance();
		sa.withdraw(5000);
		sa.withdraw(40000);
		
		CurrentAccount ca = new CurrentAccount();
		ca.setBalance(40000);
		ca.deposit(4000);
		ca.checkBalance();
		ca.withdraw(5000);
		ca.withdraw(40000);
	}
}
