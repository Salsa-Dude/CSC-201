
/*
 * A locker for a high school student has a locker number, a student name assigned to it, a number of books stored inside the locker, and also a combination lock. The lock is constructed with a combination that has 3 numbers between 0 and 39. The lock is opened if the user turns the lock to the right to the first combination number, and then left to the second combination number, and then right to third combination number. When the dial is reset it will then be pointing to 0.
 * 
Create a class to represent the locker and another class to represent the combination lock. The Locker class will include an attribute that is of type CombinationLock. Each class must include a constructor with no input argument and also a constructor that requires input arguments for all attributes. Each class must include the appropriate set and get methods.

 * 
 */


public class LockerDemo {


	public static void main(String[] args) {
		
		CombinationLock mickeyComboLock = new CombinationLock(28,17,39);
		Locker mickeyLocker = new Locker(100, "Mickey Mouse", 3, mickeyComboLock);
		
		CombinationLock donaldComboLock = new CombinationLock(35,16,27);
		Locker donaldLocker = new Locker(275, "Donald Duck", 0, donaldComboLock);
		
		boolean access = false;
		
		while(access == false) {
			if(mickeyLocker.openLocker()) {
				access = true;
			}
		}
		
		mickeyLocker.putBookInLocker();
		mickeyLocker.putBookInLocker();
		mickeyLocker.putBookInLocker();
		
		donaldLocker.removeBookFromLocker();	
		
		System.out.println("");
		System.out.println("Student Name: " + mickeyLocker.studentName);
		System.out.println("Locker Number: " + mickeyLocker.lockerNumber);
		System.out.println("Number Of Books: " + mickeyLocker.numberOfBooks);
		
		System.out.println("");
		System.out.println("Student Name: " + donaldLocker.studentName);
		System.out.println("Locker Number: " + donaldLocker.lockerNumber);
		System.out.println("Number Of Books: " + donaldLocker.numberOfBooks);
		
	
	}

}
