
public class Cycle {

	private int numberOfWheels;
	private int weight;
	
	public Cycle(int numOfWheels, int weight) {
		this.numberOfWheels = numOfWheels;
		this.weight = weight;
	}
	
	public Cycle() {
		this(100, 1000);
	}

	@Override
	public String toString() {
		return "Cycle [numberOfWheels=" + numberOfWheels + ", weight=" + weight + "]";
	}

}


