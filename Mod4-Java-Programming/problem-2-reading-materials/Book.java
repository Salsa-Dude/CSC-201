
public class Book extends ReadingMaterial {
	String title;
	int isbn;
	String author;
	
	
	public Book(int numOfPages, String publication, String title, int isbn) {
		super(numOfPages, publication);
		this.title = title;
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	
}
