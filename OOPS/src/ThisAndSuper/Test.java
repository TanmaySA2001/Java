package ThisAndSuper;

public class Test {
	void display() {
		System.out.println("Blank method");
	}
	void display(int num1) {
		this.display();
		System.out.println("Method with one parameter "+ num1);
	}
	void display(int num1, String name) {
		this.display(45);
		System.out.println("Method with two parameters "+ num1 +" "+ name);
	}
}
