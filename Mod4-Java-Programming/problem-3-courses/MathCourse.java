
public class MathCourse extends Course {
	boolean requireCalculator;

	public MathCourse(String title, int courseNumber, String desc, String department, String instructor ) {
		super(title, courseNumber, desc, department, instructor);
	}

	public boolean isRequireCalculator() {
		return requireCalculator;
	}

	public void setRequireCalculator(boolean requireCalculator) {
		this.requireCalculator = requireCalculator;
	}
	
	
}
