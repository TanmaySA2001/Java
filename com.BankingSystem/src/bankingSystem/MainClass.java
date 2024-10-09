package bankingSystem;

public class MainClass {
	public static void main(String[] args) {
		SavingsAccount  sa = new SavingsAccount();
		sa.setUserInfo(1201, "Tanmay", 50000);
		sa.checkBalance();
		sa.deposit(5000);
		sa.checkBalance();
		sa.withdrawl(8000);
		sa.checkBalance();
		sa.withdrawl(38000);
		sa.checkBalance();
	}
}
