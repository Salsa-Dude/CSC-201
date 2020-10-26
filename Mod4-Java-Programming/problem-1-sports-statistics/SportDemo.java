
public class SportDemo {

	public static void main(String[] args) {
		Soccer soccer = new Soccer("Soccer","soccer ball");
		System.out.println("Sport name is " + soccer.getName());
		soccer.setnumOfPlayers(11);
		System.out.println("There could only be " + soccer.getnumOfPlayers() + " players in the field");
		System.out.println("Players play with a " + soccer.getBall());
		System.out.println(soccer.getPositions());
		System.out.println();
		
		BasketBall basketball = new BasketBall("BasketBall","basketball");
		System.out.println("Sport name is " + basketball.getName());
		basketball.setnumOfPlayers(5);
		System.out.println("There could only be " + basketball.getnumOfPlayers() + " players in the field");
		System.out.println("Players play with a " + basketball.getBall());
		System.out.println(basketball.getPoints());
		System.out.println();
		
		Football football = new Football("Football","football");
		System.out.println("Sport name is " + football.getName());
		football.setnumOfPlayers(11);
		System.out.println("There could only be " + football.getnumOfPlayers() + " players in the field");
		System.out.println("Players play with a " + football.getBall());
		System.out.println(football.getRule());
		

	}

}
