package schoolManagementSystem;

public class Teacher extends Person{
	
	public int employeeID;
	public String subject;
	
	@Override
	void displayInfo(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("The name of the teacher is: "+ this.name+ " and their age is: "+ this.age);
	}
	
	
	void displayInfo(int employeeID, String subject) {
		this.employeeID = employeeID;
		this.subject = subject;
		System.out.println("The teacher ID is: "+ this.employeeID+ " and their subject is: "+ this.subject);
	}
}
