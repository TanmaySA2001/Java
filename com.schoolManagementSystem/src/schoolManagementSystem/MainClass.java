package schoolManagementSystem;

public class MainClass {
	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.displayInfo("Aditya", 22);
		s.displayInfo(1, 'A');
		
		s.displayInfo("Anuj", 23);
		s.displayInfo(2, 'B');
		
		s.displayInfo("Arman", 21);
		s.displayInfo(3, 'B');
		
		Teacher t = new Teacher();
		
		t.displayInfo("Elvina", 40);
		t.displayInfo(1, "English");
		
		t.displayInfo("Rukmini", 50);
		t.displayInfo(2, "Hindi");
		
		t.displayInfo("Kavita", 45);
		t.displayInfo(3, "Maths");
		
		
	}
}
