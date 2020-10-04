
public class CombinationLock {
	int comboNum1;
	int comboNum2;
	int comboNum3;
	int dial;

	public CombinationLock() {
		this.comboNum1 = 0;
		this.comboNum2 = 0;
		this.comboNum3 = 0;
		this.dial = 0;
	}
	
	public CombinationLock(int num1, int num2, int num3) {
		this.comboNum1 = num1;
		this.comboNum2 = num2;
		this.comboNum3 = num3;
		this.dial = 0;
	}
	
	// resets the dial to position 0
	public void resetDial() {
		this.dial = 0;
	}
	
	// will turn the dial to the left a certain number of ticks from the current position. 
	// The number of ticks to turn will be passed as an input argument to this method.
	public int turnLeft(int numOfTicks) {
		
		int subtractNum = this.dial - numOfTicks;
		this.dial = this.dial - subtractNum;
		
		return dial;
		
	}
	
	public int turnRight(int numOfTicks) {
		
		if(this.dial == 0) {
			this.dial = numOfTicks;
		} else {
			int addNumber = numOfTicks - this.dial;
			this.dial = this.dial + addNumber;
		}
		
		return dial;
			
	}
	
	// The combination that is tried will be passed as three input arguments to this method. 
	// This method will return true if the lock opens successfully 
	// and will return false if the lock is not opened successfully.
	public boolean openLock(int num1, int num2, int num3) {
		turnRight(num1);
		if(this.comboNum1 == dial) {
			turnLeft(num2);
			if(this.comboNum2 == dial) {
				turnRight(num3);
				if(this.comboNum3 == dial) {
					return true;
				}
			} 
		} 
		
		return false;
		
	}
	
	// Getters
	
	public int getComboNumber1() {
		return this.comboNum1;
	}
	
	public int getComboNumber2() {
		return this.comboNum2;
	}
	
	public int getComboNumber3() {
		return this.comboNum3;
	}
	
	public int getDial() {
		return this.dial;
	}
	
	// Setters
	
	public void setComboNumber1(int num1) {
		this.comboNum1 = num1;
	}
	
	public void setComboNumber2(int num2) {
		this.comboNum1 = num2;
	}
	
	public void setComboNumber3(int num3) {
		this.comboNum1 = num3;
	}
	
	
	
    
}
