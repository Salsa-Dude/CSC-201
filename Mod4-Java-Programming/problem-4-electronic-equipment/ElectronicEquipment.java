
public class ElectronicEquipment {
	double weight;
	double cost;
	double power;
	String name;
	String brand;
	
	public ElectronicEquipment(double weight, double cost, double power, String name, String brand) {
		this.weight = weight;
		this.cost = cost;
		this.power = power;
		this.name = name;
		this.brand = brand;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
