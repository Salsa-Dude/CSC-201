
import java.util.Scanner;


public class Mod1Problem2 {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double total = 0;
		int paymentInput = -1;
	
		
		while(paymentInput != 0) {
			printPaymentMethod();
			paymentInput = input.nextInt();
		
			if(paymentInput == 1) {
				boolean coinFlag = true;
				
				while(coinFlag == true) {
					double roundedTotal = total * 100;
					roundedTotal = Math.round(roundedTotal);
					roundedTotal = roundedTotal /100;
					System.out.println("Current Total is " + "$" + roundedTotal);
					printCoinList();
					Scanner coinInput = new Scanner(System.in);
					int coin = coinInput.nextInt();
					
					
					switch (coin) {
					case 0:
						coinFlag = false;
						break;
					case 1: // penny
						total += 0.01;
						break;
					case 5: // nickle
						total += 0.05;
						break;
					case 10: // dime
						total += 0.10;
						break;
					case 25: // quarter
						total += 0.25;
						break;
					default:
						System.out.println("Invalid coin, Please enter a new coin");
					}
				}
			}
			
			else if(paymentInput == 2) {
				boolean billFlag = true;
				
				while(billFlag == true) {
					System.out.println(total);
					printBillList();
					Scanner billInput = new Scanner(System.in);
					int bill = billInput.nextInt();
				
					
					switch (bill) {
					case 0:
						billFlag = false;
						break;
					case 1: // 1 dollar bill
						total += 1.00;
						break;
					case 5: // 5 dollar bill
						total += 5.00;
						break;
					default:
						System.out.println("Invalid bill, Please enter a new bill");
					}
				}
			}
			
			else if(paymentInput == 0) {
				boolean selectionFlag = true;
				int retry = 0;
				
				while(selectionFlag == true) {
					
					if(retry == 4) {
						System.out.println("A maximum of 4 retries are allowed. Please try again");
						return;
					}
					
					printSelection();
					Scanner selectionInput = new Scanner(System.in);
					int selection = selectionInput.nextInt();
					
						
						switch (selection) {
						case 0:
							selectionFlag = false;
							break;
						case 1: // Orange Soda
							if(total >= 0.75) {
								total -= 0.75;
								selectionFlag = false;
								break;
							} else {
								System.out.println("Not enough funds, choose another selection");
								retry +=1;
								break;
							}
						case 2: // Sunchips
							if(total >= 1.25) {
								total -= 1.25;
								selectionFlag = false;
								break;
							} else {
								System.out.println("Not enough funds, choose another selection");
								retry +=1;
								break;
							}
						case 3: // Starburst
							if(total >= 0.5) {
								total -= 0.5;
								selectionFlag = false;
								break;
							} else {
								System.out.println("Not enough funds, choose another selection");
								retry +=1;
							
							}
						case 4: // Gatorade
							if(total >= 1.5) {
								total -= 1.5;
								selectionFlag = false;
								break;
							} else {
								System.out.println("Not enough funds, choose another selection");
								retry +=1;
								break;
							}
						case 5: // Rice Krispies Bar
							if(total >= 1.00) {
								total -= 1.00;
								selectionFlag = false;
								break;
							} else {
								System.out.println("Not enough funds, choose another selection");
								retry +=1;
								break;
							}
						default:
							System.out.println("Invalid selection, Please enter a selection");
						}
					} 
					
				}
				
				
				
				double roundedTotal = total * 100;
				roundedTotal = Math.round(roundedTotal);
				roundedTotal = roundedTotal /100;
				System.out.println("Total amount of change " + "$" + roundedTotal);
				getChange(roundedTotal);
				
			}
			
		}
	
	
	
	public static void getChange(double total) {
		if(total <= 0) {
			System.out.println("Transaction Completed.");
			return;
		}
		
		else if(total - 0.25 >= 0) {
	        System.out.println("quarter");
	        total -= 0.25;
	        getChange(total);
		}
		else if(total - 0.10 >= 0) {
	        System.out.println("dime");
	        total -= 0.10;
	        getChange(total);
		}
		else if(total - 0.05 >= 0) {
	        System.out.println("nickel");
	        total -= 0.05;
	        getChange(total);
		}
		else if(total - 0.01 >= 0) {
	        System.out.println("penny");
	        total -= 0.01;
	        double roundedTotal = total * 100;
			roundedTotal = Math.round(roundedTotal);
			roundedTotal = roundedTotal /100;
			getChange(roundedTotal);
	       
		}
	}
	
	public static void printPaymentMethod() {
		System.out.println("Please enter funds");
		System.out.println("0. Stop and choose a selection to buy");
		System.out.println("1. Enter coins");
		System.out.println("2. Enter bills");
	}
	
	public static void printCoinList() {
		System.out.println("Please enter a coin");
		System.out.println("0. To go back to the payment menu");
		System.out.println("1. Add penny");
		System.out.println("5. Add nickel");
		System.out.println("10. Add dime");
		System.out.println("25. Add quarter");
	}
	
	public static void printBillList() {
		System.out.println("Please enter a bill");
		System.out.println("0. To go back to the payment menu");
		System.out.println("1. Add dollar bill");
		System.out.println("5. Add five dollar bill");
	}
	
	public static void printSelection() {
		System.out.println("Please enter a selection");
		System.out.println("0. Cancel");
		System.out.println("1. Orange Soda - $0.75");
		System.out.println("2. Sunchips - $1.25");
		System.out.println("3. Starburst - $0.50");
		System.out.println("4. Gatorade - $1.50");
		System.out.println("5. Rice Krispies Bar - $1.00");
	}

}
