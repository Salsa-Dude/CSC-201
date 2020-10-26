
public class ReadingMaterialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("");
		
		TextBook javaBook = new TextBook("Computer Science", "Introduction to Java", 201, 800, "TextBook");
		System.out.println("For the " + javaBook.subject + " "+ javaBook.courseNumber + " course, You need to buy the " + javaBook.title + " " + javaBook.publication);
		javaBook.setIsbn(013461103);
		System.out.println("The ISBN for this TextBook is " + javaBook.getIsbn());
		System.out.println("This book contains " + javaBook.getNumberOfPages() + " pages");
		
		System.out.println("");
		
		Magazine time = new Magazine("Politics", "Time", 25, "Magazine");
		System.out.println("This content is from the " + time.headline + " magazine");
		System.out.println("It contains " + time.getNumberOfPages() + " pages");
		System.out.println("The type of this magazine is " + time.gettype());
		
		System.out.println("");
		
		Book theAlchemist = new Book(197, "Book", "The Alchemist", 978006112);
		System.out.println("The title of this book is called " + theAlchemist.getTitle());
		System.out.println("This book contains " + theAlchemist.getNumberOfPages() + " pages");
		theAlchemist.setAuthor("Paulo Coelho");
		System.out.println("The author of this book is " + theAlchemist.getAuthor());
		
		
		
		

	}

}
