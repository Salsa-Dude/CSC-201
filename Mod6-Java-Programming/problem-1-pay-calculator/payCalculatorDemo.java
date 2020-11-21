
public class payCalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PayCalculator regPay = new RegularPay(30.00);
		PayCalculator hazPay = new HazardPay(40.00);
		
		System.out.println("8 hours of Regular pay would be " + "$" + regPay.computePay(8));
		System.out.println("The payrate for regular pay is " + "$" + regPay.getPayRate() + " an hour");
		System.out.println();
		System.out.println("8 hours of Hazard pay would be " + "$" + hazPay.computePay(8));
	
		
	}

}
