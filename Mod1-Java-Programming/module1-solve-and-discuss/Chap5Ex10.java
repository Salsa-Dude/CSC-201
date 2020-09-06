
public class Chap5Ex10 {

	public static void main(String[] args) {
		
		int counter = 0;
		
		// test all numbers from 100 to 1000
		for(int i = 100; i <= 1000; i++) {
			// if counter equals to 10, print a new line and reset counter to 0
			if(counter == 10) {
				System.out.println("");
				counter = 0;
			}
			// check if number is divisible by 5 or 6
			else if(i % 5 == 0 && i % 6 == 0) {
				System.out.print(i + " ");
				counter++;
			}
		}
	}

}


