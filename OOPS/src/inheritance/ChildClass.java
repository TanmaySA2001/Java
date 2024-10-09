package inheritance;

public class ChildClass extends ParentClass{
	void displayDataChildClass() {
		System.out.println("In Child Class constructor "+ name + " "+ id);
	}
	public ChildClass(int i) {
		System.out.println("In Child Class constructor ");
	}
	
	public void Display() {
		System.out.println("Hii");
	}
	
	public static void main(String[] args) {
		ChildClass cc = new ChildClass(3);
		cc.Display();
		
	}
}
