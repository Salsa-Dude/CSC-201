
public class Book {
	
	String title;
	String author;
	int numberOfPages;
	
	public Book(String title, String author, int numberOfPages) {
		this.title = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
		
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", numberOfPages=" + numberOfPages + "]";
	}
	
	

}
