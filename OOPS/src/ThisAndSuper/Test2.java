package ThisAndSuper;


public class Test2 {
	Test2(){
		System.out.println("Zero parameters constructor");
	}
	Test2(int a){
		this();
		System.out.println("One parameters constructor");
	}
	Test2(int a, String name){
		this(21);
		System.out.println("Two parameters constructor");
	}
}
