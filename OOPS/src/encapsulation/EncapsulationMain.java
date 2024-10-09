package encapsulation;

public class EncapsulationMain {
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		String x = e.setName("Aniket");
		int y = e.setId(21);
		System.out.println("The name and id is: "+ x+ " "+ y);
		
		final int a = 32;
	    //a = 43;
		System.out.println(a);
		
		EncapsulationChild ec = new EncapsulationChild();
		int y1 = ec.setId(2);
		String x1 = ec.setName("Tanmay");
		System.out.println("The name and id is: "+ x1+ " "+ y1);
	}
}
