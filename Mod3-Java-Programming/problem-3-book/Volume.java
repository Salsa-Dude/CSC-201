import java.util.Arrays;

public class Volume {

	String volumeName;
	int numberOfBooks;
	Book[] books;
	
	public Volume(String volumeName, int numberOfBooks, Book book[]) {
		this.volumeName = volumeName;
		this.numberOfBooks = numberOfBooks;
		this.books = book;
	}
	
	public String getBookArray() {
		
		String bookList = "";
		for(Book book: this.books) {
			bookList += book +"\n";
		}
		
		return bookList;
	}

	@Override
	public String toString() {
		return "Volume [volumeName=" + volumeName + ", numberOfBooks=" + numberOfBooks + ", books="
				+ Arrays.toString(books) + "]";
	}
	
	
	
}
