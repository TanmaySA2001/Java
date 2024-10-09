package inheritance;

public class MyMainClass1 {
	public static void main(String[] args) {
		ChildClass childobject = new ChildClass(2);
		childobject.displayDataChildClass();// execute child class method
		
		ParentClass parentobject = new ParentClass();
		System.out.println(parentobject.name);
		System.out.println(parentobject.id);
		
		System.out.println("Accessed from child class "+ childobject.name);
		System.out.println("Accessed from child class "+ childobject.id);
		
		childobject.displayDataParentClass();
		childobject.displayDataGrandClass();
		
		
	}
}


