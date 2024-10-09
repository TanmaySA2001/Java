package libraryManagementSystem;

public class MainClass {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setTitle("One of us is lying");
		b1.setAuthor("Tanmay A");
		b1.setISBN(1201);
		b1.setQuantity(2);
		
		Book b2 = new Book();
		b2.setTitle("Riverdale");
		b2.setAuthor("Vipassana T");
		b2.setISBN(1202);
		b2.setQuantity(4);
		
		Book b3 = new Book();
		b3.setTitle("Stranger Things");
		b3.setAuthor("Sarang Z");
		b3.setISBN(1203);
		b3.setQuantity(1);
		
		Library lib = new Library();
		lib.AddBook(b1,b2,b3);
		lib.Display();
		
		
		
		
		
	}
}
