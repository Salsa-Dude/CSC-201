
public class ReadingMaterial {
	int numberOfPages;
	String publication;
	
	public ReadingMaterial(int numberOfPages, String publication) {
		this.numberOfPages = numberOfPages;
		this.publication = publication;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	@Override
	public String toString() {
		return "ReadingMaterial [numberOfPages=" + numberOfPages + ", publication=" + publication + "]";
	}
	
	
}
