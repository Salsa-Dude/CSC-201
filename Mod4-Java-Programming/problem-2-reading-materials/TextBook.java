
public class TextBook extends ReadingMaterial {
	String subject;
	int courseNumber;
	String title;
	int isbn;
	
	public TextBook(String subject, String title, int courseNumber, int numOfPages, String publication) {
		super(numOfPages, publication);
		this.subject = subject;
		this.title = title;
		this.courseNumber = courseNumber;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	public int getIsbn() {
		return this.isbn;
	}
	
}
