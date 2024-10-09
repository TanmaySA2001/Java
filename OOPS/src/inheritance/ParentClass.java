package inheritance;

public class ParentClass extends GrandParentClass {
	
	String name = "Tanmay";
	int id = 102;
	void displayDataParentClass() {
		System.out.println("Parent Class Method ");
	}
	
	public ParentClass(){
		System.out.println("In Parent Class constructor ");
		System.out.println("The name is: "+ name);
		System.out.println("The id is: "+ id);
	}
	
	public ParentClass(String s){
		System.out.println("In Parent Class constructor"+ name+ " "+ id);
	}
	
	public void Display() {
		System.out.println("Hello");
	}
}
