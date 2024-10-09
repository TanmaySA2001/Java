package employeePayrollSystem;

public class Employee {
	private String name;
	private int employeeID;
	private int salary;
	private int workingHours;
	
	public Employee(String name, int employeeID){
		this.name = name;
		this.employeeID = employeeID;
		System.out.println("The name of employee is: "+ this.name+ " and their ID is: "+ this.employeeID);
	}
	
	public Employee(String name, int employeeID, int workingHours){
		if(workingHours>140) {
			this.salary = 40000;
		}
		else if(workingHours>120 && workingHours<140){
			this.salary = 30000;
		}
		else {
			this.salary = 10000;
		}
		this.name = name;
		this.employeeID = employeeID;
		this.workingHours = workingHours;
		System.out.println("The name of employee is: "+ this.name+ " and their ID is: "+ this.employeeID+ " with salary "+ this.salary);
	}
	

}
