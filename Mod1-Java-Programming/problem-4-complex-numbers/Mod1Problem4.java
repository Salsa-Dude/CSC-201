
import java.util.Scanner;

// get 4 numbers from the user
public class Mod1Problem4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int realNumA, realNumA2, imaginaryNumB, imaginaryNumB2;
		
		System.out.println("Enter the real part of complex number z1:");
		realNumA = scanner.nextInt();
		
		System.out.println("Enter the imaginary part of complex numer z1:");
		imaginaryNumB = scanner.nextInt();
		
		System.out.println("Enter the real part of complex numer z2:");
		realNumA2 = scanner.nextInt();
		
		System.out.println("Enter the imaginary part of complex numer z2:");
		imaginaryNumB2 = scanner.nextInt();
		
		
		System.out.println(addition(realNumA, imaginaryNumB,realNumA2, imaginaryNumB2));
		
		System.out.println(subtract(realNumA, imaginaryNumB,realNumA2, imaginaryNumB2));
		
		System.out.println(multiply(realNumA, imaginaryNumB,realNumA2, imaginaryNumB2));
		
		System.out.println(divide(realNumA, imaginaryNumB,realNumA2, imaginaryNumB2));
		
		
	
	}
	
	public static String addition(int realA, int imgB, int realA2, int imgB2) {
		// Addition: z1 + z2 = (a1 + a2) +  i*(b1 + b2)
		int firstAdd = realA + realA2;
		int secondAdd = imgB + imgB2;
		
		return "Addition: z1 + z2 = " + firstAdd + " + " + secondAdd + "i";
		
	}
	
	public static String subtract(int realA, int imgB, int realA2, int imgB2) {
		// Subtraction: z1 - z2 = (a1 - a2) +  i*(b1 - b2)
		int firstSubtract = realA - realA2;
		int secondSubtract = imgB - imgB2;
		
		return "Subtraction: z1 - z2 = " + firstSubtract + " + " + secondSubtract + "i";
		
	}
	
	public static String multiply(int realA, int imgB, int realA2, int imgB2) {
		// Multiplication: z1 * z2 = (a1 * a2 – b1 * b2) + i*(a1 * b2 + b1 * a2)
		int firstMultiply = (realA * realA2 - imgB * imgB2);
		int secondMultiply = (realA * imgB2 + imgB * realA2);
		
		return "Multiplication: z1 * z2 = " + firstMultiply + " + " + secondMultiply + "i";
		
	}
	
	public static String divide(int realA, int imgB, int realA2, int imgB2) {
		// Division: z1 / z2 = (a1 * a2 + b1 * b2) / (a2^2 + b2^2) + i*(b1 * a2 – a1 * b2) / (a2^2 + b2^2) 
		int firstPart = (realA * realA2 + imgB * imgB2);
		int secondPart = ((int)Math.pow(realA2, 2) + ((int)Math.pow(imgB2, 2)));
		int thirdPart = (imgB * realA2 - realA * imgB2);
		int fourthPart = ((int)Math.pow(realA2, 2) + ((int)Math.pow(imgB2, 2)));
		
		
		double firstDivide = firstPart / secondPart;
		double secondDivide = thirdPart / fourthPart;
		
		
		return "Divide: z1 / z2 = " + firstDivide + " + " + secondDivide + "i";
		
	}

}
