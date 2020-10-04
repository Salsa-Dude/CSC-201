
import java.util.Scanner;

public class Locker {
	
	int lockerNumber;
	String studentName;
	int numberOfBooks;
	
	CombinationLock comboLock;

	public Locker() {
		this.lockerNumber = 0;
		this.numberOfBooks = 0;
		this.comboLock = new CombinationLock(0,0,0);
	}
	
	public Locker(int lockerNum, String name, int numOfBooks, CombinationLock comboLock) {
		this.lockerNumber = lockerNum;
		this.studentName = name;
		this.numberOfBooks = numOfBooks;
		this.comboLock = comboLock;
	}
	
	public void putBookInLocker() {
		this.numberOfBooks ++;
	}
	
	public boolean removeBookFromLocker() {
		if(numberOfBooks >= 1) {
			numberOfBooks --;
			return true;
		}
		
		return false;
	}
	
	public boolean openLocker() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("");
		
		System.out.println("Enter combination #1");
		int num1 = input.nextInt();
		
		System.out.println("Enter combination #2");
		int num2 = input.nextInt();
		
		System.out.println("Enter combination #3");
		int num3 = input.nextInt();
		
		if(comboLock.openLock(num1, num2, num3)) {
			System.out.println("Access Granted");
			System.out.println("Welcome " + this.studentName);
			return true;
		} else {
			System.out.println("Please try again");
			return false;
		}
	}

}
