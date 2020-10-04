
public class DemoVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book alchemist = new Book("The Alchemist", "Paulo Coelho", 208);
		Book richDadPoorDad = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 207);
		Book introToJava = new Book("introduction to java programming", "Daniel Liang", 800);
		
		Book[] books =  { alchemist, richDadPoorDad, introToJava };
		
		Volume volume1 = new Volume("Joseph volume", 3, books);
		
		System.out.println(volume1);
		
		
		

	}

}
