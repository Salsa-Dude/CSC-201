import java.util.Scanner;

/*
 * Save the number of judges as a variable
 * Create a inputValidScore method that prints a message to the user to enter a score and returns that score
 * Create a inputAllScore method that creates an array based on the number of judges
 * - For each iteration call the inputValidScore method and save the return value to the array.
 * Have the method return the array
 * Create a inputValidDegreeOfDifficulty method that prints a message to the user to enter a degree of difficulty score between 1.2 - 3.8 and returns that score
 * Create a calculateScore method that takes in an array
 * -  Sort the array by finding the smallest number in the array and swaps it with the first element. It then finds the smallest number remaining and swaps it the the second element and so on.
 * - Once the array has been sorted, For loop through the array excluding the first and last number which will be the Max and Min. 
 * - For each iteration add the value to the sum counter
 * - Once the for loop completes, multiply the sum and the degree of difficulty score
 * - Then multiply by 0.6 and return the total sum.
 */

public class Mod2Problem2 {
	
	static final int judges = 7;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double[] scores = inputAllScore();
		double value = calculateScore(scores);
		
		System.out.println("");
		System.out.println("The total score is " + value);
		
	}
	
	public static double inputValidScore(int judgeNumber) {
		System.out.println("Judge " + "#" + judgeNumber + " Enter a score between 0.0 - 10.0");
		double scoreInput = input.nextDouble();
		
		return scoreInput;
		
		
	}
	
	public static double[] inputAllScore() {
		double[] scores = new double[judges];
		
		// For every iteration call the inputValidScore method
		// Save the return value to the scores array
		for(int i = 1; i <= judges; i++) {
			scores[i - 1] = inputValidScore(i);
		}
		
		return scores;
	}
	
	public static double inputValidDegreeOfDifficulty() {
		System.out.println("");
		System.out.println("Enter a degree of difficulty score between 1.2 - 3.8");
		double degreeInput = input.nextDouble();
		
		return degreeInput;
		
	}
	
	public static double calculateScore(double[] scoresArray) {
		
		// Sort the array by finding the smallest number in the array 
		// and swaps it with the first element. 
		// It then finds the smallest number remaining 
		// and swaps it the the second element and so on. 
		
		
		for(int i = 0; i < scoresArray.length - 1; i++) {
			double currentMinValue = scoresArray[i];
			int currentMinIndex = i;
			
			for(int j = i + 1; j < scoresArray.length; j++) {
				if(currentMinValue > scoresArray[j]) {
					currentMinValue = scoresArray[j];
					currentMinIndex = j;
				}
			}
			
			if(currentMinIndex != i) {
				scoresArray[currentMinIndex] = scoresArray[i];
				scoresArray[i] = currentMinValue;
			}
		}
		
		double sum = 0;
		
		// Sum all scores expect for the first and last score which are the Min and Max.
		for(int i = 1; i < scoresArray.length - 1; i++) {
			sum += scoresArray[i];
		}
		
		double degreeOfDifficulty = inputValidDegreeOfDifficulty();
		
		double total = sum * degreeOfDifficulty;
		
		total = total * 0.6;
		
		double totalRoundOff = Math.round(total * 100.0) / 100.0;
		
		return totalRoundOff;
		
		
	}
 
}
