package Abstraction;

public class InterfaceDemoImpl implements InterfaceDemo{
	
	@Override
	public void show() {
		System.out.println("This is show method");
	}
	
	@Override
	public void display() {
		System.out.println("This is display method");
	}
	
}
