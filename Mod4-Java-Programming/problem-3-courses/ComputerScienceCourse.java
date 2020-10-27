
public class ComputerScienceCourse extends Course {
	String prerequisite;
	
	public ComputerScienceCourse(String title, int courseNumber, String desc, String department, String instructor) {
		super(title, courseNumber, desc, department, instructor);
	}

	public String getPrerequisite() {
		return prerequisite;
	}

	public void setPrerequisite(String prerequisite) {
		this.prerequisite = prerequisite;
	}
	
}
