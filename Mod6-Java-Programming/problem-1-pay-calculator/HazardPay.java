
public class HazardPay extends PayCalculator {
	
	public HazardPay (double payRate) {
		super(payRate);
	}
	
	public double computePay(int hours) {
		return hours * this.payRate * 1.5;
	}
}
