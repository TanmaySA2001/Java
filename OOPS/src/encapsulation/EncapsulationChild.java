package encapsulation;

public class EncapsulationChild extends Encapsulation{
//	public String setName(String name) {
//		this.name = name;
//		return name;// cannot override this method bcoz of final keyword
//		
//	}
	public int setId(int id) {
		id = 34;
		return id;
		
	}
}
