
import java.util.Scanner;

public class Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String statement = "Java is fun!";
		
		StringBuilder sb = new StringBuilder(statement);
		
		// display the capacity of the string
		System.out.println(sb.capacity());
		sb.append("I love it!");
		
		// Require the user to enter a string “Yes"
		Scanner input = new Scanner(System.in);
		System.out.println("Enter yes:");
		
		// insert the string, “Yes ” at the correct location 
		// such that the output of the entire string will be “Java is fun. Yes, I love it!” 
		String yes=input.nextLine();
	      
	    sb.insert(12, yes);
	    sb.deleteCharAt(11);//delete ! after Java is fun!
	    sb.replace(11, 11, ". ");//replace 11 character with .
	    sb.deleteCharAt(13);
	    sb.replace(13, 13, "Y");
	    sb.replace(16,16, ", ");
	    
	    System.out.println(sb);

	}

}
