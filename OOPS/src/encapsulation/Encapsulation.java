package encapsulation;

public class Encapsulation {
	public String name;
	public int id;
	
//	public Encapsulation(String name, int id){
//		this.name = name;
//		this.id = id;
//	}
	
	final public String setName(String name) {
		this.name = name;
		return name;
		
	}
	
	public int setId(int id) {
		this.id = id;
		return id;
		
	}
	
	
	
}
