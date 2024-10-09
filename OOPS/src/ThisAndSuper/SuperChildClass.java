package ThisAndSuper;

public class SuperChildClass extends SuperParentClass{
	String name = "Aditya";
	
	SuperChildClass(){
		super();
		System.out.println("Child class constructor");
	}
	void operations() {
		super.operations();
		System.out.println("My name is: "+ name);
		System.out.println("The subtraction of 10 and 6 is: "+ (10-6));
	}
}
