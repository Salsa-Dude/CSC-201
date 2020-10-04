import java.util.Scanner;


public class Question29 {

	public static void main(String[] args) {
	
		System.out.println("Enter 3x3 Multidimensional Array1: ");
		int[][] multiArray1 = createMultiArray();
		
		
		System.out.println("Enter 3x3 Multidimensional Array2: ");
		int [][] multiArray2 = createMultiArray();
		
		System.out.println(equals(multiArray1, multiArray2));

	}
	
	public static boolean equals(int[][] m1, int[][] m2) {
		int[] arr1 = convertToSingleArray(m1);
		int [] arr2 = convertToSingleArray(m2);
		
		int[] sortedArray = sortArray(arr1);
		int[] sortedArray2 = sortArray(arr2);
		
		return sortedArray.equals(sortedArray2);
		
	}
	
	public static int[][] createMultiArray() {
		Scanner input = new Scanner(System.in);
		int rows = 3;
		int columns = 3;
		
		int [][] newArray = new int[rows][columns];
		
		for(int i = 0; i < newArray.length; i++) {
			for(int j = 0; j < newArray[i].length; j++) {
				newArray[i][j] = input.nextInt();
			}
		}
		
		return newArray;
	}
	
	public static int[] convertToSingleArray(int[][] multiArray) {
		int[] newArray = new int[9];
		int counter = 0;
		
		for(int i = 0; i < multiArray.length; i++) {
			for(int j = 0; j < multiArray[i].length; j++) {
				newArray[counter] = multiArray[i][j];
				counter++;
			}
		}
		
		return newArray;
		
	}
	
	public static int[] sortArray(int [] array) {
		int minNumber = array[0];
		
		
		for(int i = 0; i < array.length - 1; i++) {
			int currentIndex = i;
			
			for(int j = i + 1; j < array.length; j++) {
				if (array[j] <= minNumber) {
					minNumber = array[j];
					currentIndex = j;
				}
			}
			
			if(currentIndex != i) {
				array[currentIndex] = array[i];
				array[i] = minNumber;
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		return array;
	}
	


}
