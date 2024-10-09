package polymorphism;

public class MethodOverridingChildClass extends MethodOverridingParentClass{
	void displayMessage() {
		System.out.println("Hello!!! This is child class");
	}
	
	static void show() {
		 System.out.println("Hii!! This is child class");
	 }
}
