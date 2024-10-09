package inheritance;

public class GrandParentClass {
	
	String name = "Riya";
	int id = 101;
	
	static String schoolname  = "NVC";
	
	void displayDataGrandClass() {
		System.out.println("Grand Parent Class Method "+ name + " "+ id);
	}
	
	public GrandParentClass(){
		System.out.println("In Grand Parent Class constructor");
	}
}
