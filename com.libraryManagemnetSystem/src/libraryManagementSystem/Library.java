package libraryManagementSystem;

public class Library {
	
	Book b1;
	Book b2;
	Book b3;
	void AddBook(Book b1, Book b2, Book b3) {
		this.b1= b1;
		this.b2= b2;
		this.b3= b3;
		
		//System.out.println(this.b1);
		
	}
	
	void Display() {
		System.out.println(b1.getTitle()+" "+ b1.getAuthor()+ " "+ b1.getISBN()+ " "+ b1.getQuantity());
		System.out.println(b2.getTitle()+" "+ b2.getAuthor()+ " "+ b2.getISBN()+ " "+ b2.getQuantity());
		System.out.println(b3.getTitle()+" "+ b3.getAuthor()+ " "+ b3.getISBN()+ " "+ b3.getQuantity());
	}
	
}
