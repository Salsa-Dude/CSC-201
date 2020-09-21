import java.util.Scanner;

public class Mod2Problem3 {
	
	static int [][] monthlyHighAndLowTemp = new int [12][2];
	// Month Array
	static String[] monthsArray = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	
	static Scanner input = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		inputTempForYear();
		findHighestTemp(monthlyHighAndLowTemp);
		
	
		for(int row = 0; row < monthlyHighAndLowTemp.length; row++) {
			int highTemp=0;
			int lowTemp=0;
			// if column is equal to 0 set the value to high temperature
			for(int column = 0; column < monthlyHighAndLowTemp[row].length; column++) {
				if(column == 0) {
					highTemp = monthlyHighAndLowTemp[row][column];
					// else if column is equal to 1 set the value to low temperature
				} else {
					lowTemp = monthlyHighAndLowTemp[row][column];
				}
				
			}
			System.out.println("");
			System.out.println(monthsArray[row] + " has a High of " + highTemp + " and Low of " + lowTemp);
		}
		
		System.out.println("");
		System.out.println("The average high temperature for the year was " + calculateAverageHigh(monthlyHighAndLowTemp));
		
		System.out.println("");
		System.out.println("The average low temperature for the year was " + calculateAverageLow(monthlyHighAndLowTemp));
		
		System.out.println("");
		System.out.println("The hottest month for the year was " + monthsArray[findHighestTemp(monthlyHighAndLowTemp)]);
		
		System.out.println("");
		System.out.println("The coldest month for the year was " + findLowestTemp(monthlyHighAndLowTemp));
		
		

}
	
	public static void inputTempForMonth(int monthNumber, int[][] monthlyHighAndLowTemp) {
		System.out.println("Enter a high temperature for the month " + monthsArray[monthNumber]);
		int highTempInput = input.nextInt();
		monthlyHighAndLowTemp[monthNumber][0] = highTempInput;
		
		System.out.println("Enter a low temperature for the month " + monthsArray[monthNumber]);
		int lowTempInput = input.nextInt();
		monthlyHighAndLowTemp[monthNumber][1] = lowTempInput;
		
		
	}
	
	public static int[][] inputTempForYear() {
		// For each iteration call the inputTempForMonth method
		for(int i = 0; i < monthsArray.length; i++) {
			inputTempForMonth(i, monthlyHighAndLowTemp);
		}
		
		return monthlyHighAndLowTemp;
	}
	
	public static int calculateAverageHigh(int[][] monthlyHighAndLowTemp) {
		int averageHigh = 0;
		
		// For each iteration add the highest value of each month to the averageHigh total
		for(int i = 0; i < monthlyHighAndLowTemp.length; i++) {
			averageHigh += monthlyHighAndLowTemp[i][0];
		}
		
		return averageHigh / 12;
	}
	
	public static int calculateAverageLow (int[][] monthlyHighAndLowTemp) {
		int averageLow = 0;
		
		// For each iteration add the lowest value of each month to the averageLow total
		for(int i = 0; i < monthlyHighAndLowTemp.length; i++) {
			averageLow += monthlyHighAndLowTemp[i][1];
		}
		
		return averageLow / 12;
	}
	
	public static int findHighestTemp(int[][] monthlyHighAndLowTemp) {
		int highestTemp = monthlyHighAndLowTemp[0][0];
		int highestIndex = 0;
		
		// For each iteration check to see if the highest temperature of that month is higher than the current highestTemp. If true update the highestTemp and highestIndex
		for(int i = 0; i < monthlyHighAndLowTemp.length; i++) {
			if(monthlyHighAndLowTemp[i][0] > highestTemp) {
				highestTemp = monthlyHighAndLowTemp[i][0];
				highestIndex = i;
			}
		}
		
		return highestIndex;
	}
	
	public static int findLowestTemp(int[][] monthlyHighAndLowTemp) {
		int lowestTemp = monthlyHighAndLowTemp[0][1];
		int lowestIndex = 0;
		
		// For each iteration check to see if the lowest temperature of that month is lower than the current lowestTemp. If true update the lowestTemp and lowestIndex
		for(int i = 0; i < monthlyHighAndLowTemp.length; i++) {
			if(monthlyHighAndLowTemp[i][1] < lowestTemp) {
				lowestTemp = monthlyHighAndLowTemp[i][1];
				lowestIndex = i;
			}
		}
		
		return lowestIndex;
	}

}
