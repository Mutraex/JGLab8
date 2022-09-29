
import StudentCourses.*;

public class CourseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentList test = new StudentList();
		Courses cl = new Courses(test);
		test.getStudents();
		System.out.println("---------- Course Enrollments ----------");
		cl.getCourseList();
	}

}
