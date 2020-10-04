

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
