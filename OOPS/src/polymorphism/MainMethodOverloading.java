package polymorphism;

public class MainMethodOverloading {
	public static void main(String[] args) {
		MethodOverloading mol = new MethodOverloading();
		mol.method1();
		mol.method1(23);
		mol.method1(23, 45);
	}
}
