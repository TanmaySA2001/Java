package inheritance;

public class MainHeirarchy extends ParentClass2 {
	public static void main(String[] args) {
		ChildClass2 cc = new ChildClass2();
		System.out.println(cc.add(23, 21));
		System.out.println(cc.sub(23, 21));
		
		ChildClass3 cc1 = new ChildClass3();
		System.out.println(cc1.mul(23, 21));
		System.out.println(cc1.div(23, 21));
		
		
	}
}
