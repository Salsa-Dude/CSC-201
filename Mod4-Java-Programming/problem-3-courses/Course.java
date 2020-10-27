
public class Course {
	String title;
	int courseNumber;
	String desc;
	String department;
	String instructor;
	
	public Course(String title, int courseNumber, String desc, String department, String instructor) {
		this.title = title;
		this.courseNumber = courseNumber;
		this.desc = desc;
		this.department = department;
		this.instructor = instructor;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	

}
