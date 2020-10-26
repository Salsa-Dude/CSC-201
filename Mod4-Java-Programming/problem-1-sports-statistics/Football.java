
public class Football extends Sport {
	
	public Football(String name, String ball) {
		super(name, ball);
	}
	
	public String getRule() {
		return "Each team gets 4 chances (downs) to move the ball 10 yards forward.";
	}
}
