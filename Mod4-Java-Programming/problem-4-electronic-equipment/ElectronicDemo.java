
public class ElectronicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("");
		
		Computer computer = new Computer(11.5, 579.99, 4.1, "Inspiron 24 5000", "Dell");
		System.out.println("The name of the computer is " + computer.getName());
		System.out.println("The computer is a " + computer.getBrand() + " computer");
		System.out.println("The computer weights " + computer.getWeight() + " pounds");
		System.out.println("The computer costs " + "$" + computer.getCost());
		
		System.out.println("");
		
		CellPhone cellphone = new CellPhone(
				6.84, 599.99, 900, "iPhone 11", "Apple");
		System.out.println("The name of the cellphone is " + cellphone.getName());
		System.out.println("The cellphone is a " + cellphone.getBrand() + " cellphone");
		System.out.println("The cellphone weights " + cellphone.getWeight() + " ounces");
		System.out.println("The cellphone costs " + "$" + cellphone.getCost());

	}

}
