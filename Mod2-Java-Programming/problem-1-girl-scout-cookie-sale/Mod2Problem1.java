import java.util.Scanner;

/* 
 * Create an array with a length of 5 to represent the different box categories
 * Ask the user to enter the total number of girls and save it into a variable called numberOfGirls
 * Use the value of numberOfGirls to create another array that represents the boxes for each girl
 * Create a For loop from 1 to the value of numberOfGirls and for each iteration
 *  - Print out Boxes of cookies for girl #i
 *  - Save the input into a variable called boxInput
 *  - Since we are starting from 1, subtract boxInput by 1 and save it to the the value of boxesArray[i -1] to keep track of each girl's sold boxes
 *  - Use the boxInput to also keep track on which box category to increment by using a if/else statement
 * 
 */

public class Mod2Problem1 {

	public static void main(String[] args) {
		
		
		int[] boxCategory  = new int[5];
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the total number of girls in the troop selling cookies");
		
		int numberOfGirls = input.nextInt();
		// Use the value of numberOfGirls to create an array for each girl's total boxes
		int[] boxesArray = new int[numberOfGirls];
		
		for(int i = 1; i <= numberOfGirls; i++) {
			System.out.println("Boxes of cookies for girl #" + i);
			int boxInput = input.nextInt();
			
			boxesArray[i-1] = boxInput;
			
			if(boxInput > 0 && boxInput <= 10) {
				boxCategory[0]++;
			} else if (boxInput <= 20) {
				boxCategory[1]++;
			} else if (boxInput <= 30) {
				boxCategory[2]++;
			} else if (boxInput <= 40) {
				boxCategory[3]++;
			} else if (boxInput >= 41) {
				boxCategory[4]++;
			}
		}
		
		System.out.println("");
		
		
		for(int i = 0; i < boxesArray.length; i++) {
			int num = i + 1;
			System.out.println("Boxes of cookies for girl #" + num + " " + " = " + boxesArray[i]);
		}
		
		System.out.println("");
		
		System.out.println("TOTAL BOXES" + " " + " " + " " + "Number Of Girl Scouts");
		System.out.println("0 to 10 " + " " + " " + " " + " " + " " + " " + " " + " " + boxCategory[0]);
		System.out.println("11 to 20 " + " " + " " + " " + " " + " " + " " + " " + boxCategory[1]);
		System.out.println("21 to 30 " + " " + " " + " " + " " + " " + " " + " " + boxCategory[2]);
		System.out.println("31 to 40 " + " " + " " + " " + " " + " " + " " + " " + boxCategory[3]);
		System.out.println("41 or more " + " " + " " + " " + " " + " " + boxCategory[4]);
		
		
		
		
		
		
		

	}

}
