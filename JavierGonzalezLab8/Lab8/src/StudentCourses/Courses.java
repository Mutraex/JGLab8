package StudentCourses;

import java.util.TreeMap; 

public class Courses {

	TreeMap<String, Integer> courselist;
	StudentList sl;
	public Courses(StudentList sl){
		courselist = new TreeMap();
		this.sl = sl;
		setCourseList();
	}
	
	void setCourseList() {
		
        for(int i=0;i<sl.studentSize();i++){
            for(int j=0;j<sl.courseSize(i);j++){
                if(courselist.containsKey(sl.getCourse(i, j))){
                	int x= courselist.get(sl.getCourse(i, j));
                	courselist.remove(sl.getCourse(i, j));
                	courselist.put(sl.getCourse(i, j), x+1);
                }
                else
                	courselist.put(sl.getCourse(i, j), 1);
            }
        }
	}
	
	public void getCourseList() {
		for (String treeKey : courselist.keySet()) {
			System.out.println(treeKey+" -- "+courselist.get(treeKey));
		}
	}
	
	
	
	
}
