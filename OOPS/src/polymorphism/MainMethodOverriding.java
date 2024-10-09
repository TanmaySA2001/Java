package polymorphism;

public class MainMethodOverriding {
	public static void main(String[] args) {
		
		MethodOverridingChildClass morcc = new MethodOverridingChildClass();
		morcc.displayMessage();//Method Overriden
		
		MethodOverridingChildClass.show();//Static method does not override
		
	}
}
