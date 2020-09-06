import java.util.Scanner;

public class Mod1Problem1 {

	public static void main(String[] args) {
		
		// Create Scanner
		Scanner input = new Scanner(System.in);
	
		// Prompt the user to enter their student ID
		System.out.println("Please enter your student ID");
		
		int studentID = input.nextInt();
		
		int chapNumber = getChapter(studentID);
		
		int problemEx = getProblemExercise(chapNumber, studentID);
	
		printProblemExercise(chapNumber, problemEx);
		

	}
	
	// Generate a chapter number
	public static int getChapter(int id) {
		
		int num = (id % 3) + 3;
		
		return num;
	}
	
	// Generate a problem exercise
	public static int getProblemExercise(int chapNum, int id) {
		int result;
		
		switch(chapNum) {
			case 3: 
				result = (id % 34) + 1;
				return result;
			case 4:
				result = (id % 38) + 1;
				return result;
			case 5:
				result = (id % 46) + 1;
				return result;
			default: 
				System.out.println("Error: invalid number or ID");
				return 0;
		}
		
	}
	
	// Print the programming exercise
	public static void printProblemExercise(int chapNum, int problemEx) {
		
		if(problemEx == 0) {
			System.out.println("Error: invalid problem exercise number");
			return;
		} 
		
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the page number
		System.out.println("Please enter the page number where the specific problem is located in the textbook.");
		int pageNumber = input.nextInt();
		
		System.out.println("Please solve programming exercise " + problemEx + " from chapter " + chapNum + ", from page " + pageNumber);
	}

}
