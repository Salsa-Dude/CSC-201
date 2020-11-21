
public abstract class PayCalculator {
	double payRate;
	
	public PayCalculator(double payRate) {
		this.payRate = payRate;
	}
	
	public double computePay(int hours) {
		return hours * this.payRate;
		 
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	
	
}
