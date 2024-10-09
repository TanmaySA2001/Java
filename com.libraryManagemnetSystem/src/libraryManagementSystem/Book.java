package libraryManagementSystem;

public class Book {
	private String title;
	private String author;
	private int ISBN;
	private int quantity = 0;
	private int count = 0;
	
	
	
	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public int getISBN() {
		return ISBN;
	}



	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}



	public int getQuantity() {
		count = count + 1;
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public int getCount() {
		return count;
	}



	public void setCount(int count) {
		this.count = count;
	}



//	@Override
//	public String toString() {
//		return "Book [title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", quantity=" + quantity + ", count="
//				+ count + "]";
//	}
	
	
	
	
}
