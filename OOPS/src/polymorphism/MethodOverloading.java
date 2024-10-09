package polymorphism;

public class MethodOverloading {
	//Method Overloading
	
	
	public void method1() {
		int num1 = 23;
		int num2 = 45;
		int res = num1 + num2;
		System.out.println("With zero args, The sum is: "+ res);
	}
	
	public void method1(int num1) {
		int num2 = 45;
		int res = num1 + num2;
		System.out.println("With one arg, The sum is: "+ res);
	}
	
	public void method1(int num1, int num2) {
		int res = num1 + num2;
		System.out.println("With two arg, The sum is: "+ res);
	}
}
