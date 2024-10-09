package polymorphism;

public class ConstructorOverloading {
	String name;
	int id;
	
	public ConstructorOverloading() {
		name = "Tanmay";
		id = 21;
		System.out.println("The name and id is: "+ name + " "+ id);
	}
	
	public ConstructorOverloading(String name) {
		this.name = name;
		id = 22;
		System.out.println("The name and id is: "+ name + " "+ id);
	}
	
	public ConstructorOverloading(String name, int id) {
		this.name = name;
		this.id = id;
		System.out.println("The name and id is: "+ name + " "+ id);
	}
}
