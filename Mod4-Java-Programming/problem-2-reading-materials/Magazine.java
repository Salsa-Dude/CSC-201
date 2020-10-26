
public class Magazine extends ReadingMaterial {
	String type;
	String headline;
	
	public Magazine(String type, String headline, int numOfPages, String publication) {
		super(numOfPages, publication);
		this.type = type;
		this.headline = headline;
	}

	public String gettype() {
		return type;
	}

	public void settype(String type) {
		this.type = type;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}
	
	
}
