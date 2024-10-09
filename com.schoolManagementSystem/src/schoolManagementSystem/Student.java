package schoolManagementSystem;

public class Student extends Person{
	
	public int studentID;
	public char grade;
	
	@Override
	void displayInfo(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("The name of the student is: "+ this.name+ " and their age is: "+ this.age);
	}
	
	void displayInfo(int studentID, char grade) {
		this.studentID = studentID;
		this.grade = grade;
		System.out.println("The student ID is: "+ this.studentID+ " and their grade is: "+ this.grade);
	}
}
