
public class CourseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ComputerScienceCourse cs201 = new ComputerScienceCourse("Computer Science I", 201, "The main part of this course covers problem analysis and solution methods, algorithm development, program\n" + 
				"design methodologies, programming constructs, methods of documentation, and good programming style. ", "CSC", "Yingjin Cui");
		
		cs201.setPrerequisite("CSC 200");
		
		System.out.println("");
		
		System.out.println("Course title: " + cs201.getTitle());
		System.out.println("Course number: " + cs201.getCourseNumber());
		System.out.println("Course description: " + cs201.getDesc());
		System.out.println("Department of " + cs201.getDepartment());
		System.out.println("Course instructor: " + cs201.getInstructor());
		
		System.out.println("");
		
		MathCourse mth263 = new MathCourse("Calculus I", 263, "The general purpose of this first course in a three course sequence is to prepare students for further study in\n" + 
				"calculus with analytic geometry by providing them with the necessary competencies in finding limits,\n" + 
				"differentiation and integration.", "MTH", "Ala Abdelbaki");
		
		cs201.setPrerequisite("CSC 200");
		
		System.out.println("Course title: " + mth263.getTitle());
		System.out.println("Course number: " + mth263.getCourseNumber());
		System.out.println("Course description: " + mth263.getDesc());
		System.out.println("Department of " + mth263.getDepartment());
		System.out.println("Course instructor: " + mth263.getInstructor());

	}

}
