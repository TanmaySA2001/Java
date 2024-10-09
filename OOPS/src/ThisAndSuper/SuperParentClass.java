package ThisAndSuper;

public class SuperParentClass {
	
	String name = "Arman";
	
	SuperParentClass(){
		System.out.println("Parent class constructor");
	}
	
	void operations() {
		System.out.println("My name is: "+ name);
		System.out.println("The addition of 5 and 15 is: "+ (5+15));
	}
	
}
