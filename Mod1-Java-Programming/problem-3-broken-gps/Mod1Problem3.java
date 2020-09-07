/*

 * Initial points start at (0,0)
 * Set x = 0 and y = 0
 * The car is running at 60 miles/hour and every 5 mins it changes direction 
 * - There are 60 mins an a hour, so 60/5 = 12
 * - Create a for loop that loops 12 times 
 * - Each iteration, get a random direction either (North, East, South, West) 
 * - Set each direction with a value
 * - Based on the direction, factor the value into (x,y)
 * Calculate the distance between the initial points and x and y by using the equation.
 * Display the total distance

*/

public class Mod1Problem3 {

	public static void main(String[] args) {
		// initial points
		int x = 0;
		int y = 0;
		
		// the distance for every 5 mins
		int distance = 5;
		
		// loop for 12 times
		for(int i = 1; i <= 12; i++) {
			
			// call the randomNumber method
			int num = randomNumber();
			
			// based on the value of num, print out the next direction and factor it into the (x,y) points
			switch(num) {
			case 1: 
				System.out.println("Head North");
				y += distance;
				break;
			case 2: 
				System.out.println("Head East");
				x += distance;
				break;
			case 3:
				System.out.println("Head South");
				y -= distance;
				break;
			case 4:
				System.out.println("Head West");
				x -= distance;
				break;
			}
		}
		
		
		double totalDistance = calculateDistance(x, y, 0, 0);
		
		// Round Total Distance
		double roundedDistance = totalDistance * 100;
		roundedDistance = Math.round(roundedDistance);
		roundedDistance = roundedDistance /100;
		
		System.out.println("Initial point (0,0)");
		System.out.println("Ending point " + "(" + x + "," + y + ")");
		System.out.println("The total distance from the initial point after one hour of driving is " + roundedDistance);
		
		
	}
	
	
	public static int randomNumber() {
		// Return a random number between 1 to 4
		return (int)(Math.random() * (5-1) + 1);
	}
	
	public static double calculateDistance(int x, int y, int startX, int startY) {
		int xValue = x - startX;
		int yValue = y - startY;
		
		// equation to find the distance between two points
		return Math.sqrt((Math.pow(xValue, 2)) + (Math.pow(yValue, 2)));
		
	}

}
