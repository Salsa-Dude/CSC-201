
public class CharacterArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder input = new StringBuilder("6901 Sudley Road");
		
		
		System.out.println("The original input is " + input);
		System.out.println("");
	
		for (int i = 0; i < input.length(); i++) {
	
			if(Character.isDigit(input.charAt(i))) {
				System.out.println("The character is a digit");
				System.out.println("*");
			} else if (Character.isLowerCase(input.charAt(i))){
				System.out.println("The character is a letter");
				System.out.println(Character.toUpperCase(input.charAt(i)));
			} else if (Character.isUpperCase(input.charAt(i))){
				System.out.println("The character is a letter");
				System.out.println(Character.toLowerCase(input.charAt(i)));
			}
		
		}
	}

}
