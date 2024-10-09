package schoolManagementSystem;

public class Person {
	public String name;
	public int age;
	
	void displayInfo(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("The name of the person is: "+ this.name+ " and their age is: "+ this.age);
	}
}
