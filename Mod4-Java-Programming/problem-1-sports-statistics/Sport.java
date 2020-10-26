
public class Sport {
	private String name;
	private int numOfPlayers;
	private String ball;
	
	public Sport(String name, String ball) {
		this.name = name;
		this.ball = ball;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getnumOfPlayers() {
		return numOfPlayers;
	}

	public void setnumOfPlayers(int numOfPlayers) {
		this.numOfPlayers = numOfPlayers;
	}
	
	public String getBall() {
		return this.ball;
	}
	
	
}
