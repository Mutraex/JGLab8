package StudentCourses;

import java.util.ArrayList;

public class Student {
	public int ID;
    public String lastName;
    public ArrayList<String> courses;
    
    Student(int id, String ln){
        ID = id;
        lastName=ln;
        courses = new ArrayList<String>();
    }
}
