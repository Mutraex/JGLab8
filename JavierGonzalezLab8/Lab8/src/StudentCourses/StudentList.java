package StudentCourses;

import java.util.ArrayList;

public class StudentList {
	ArrayList<Student> sList;
    
    public StudentList(){
         sList = new ArrayList<Student>();
         setStudentList();
         setCourseLists();
         sortStudentList();
    }
    
    void setStudentList(){
        sList.add(new Student(11,"Sanchez"));
        sList.add(new Student(1,"Ramirez"));
        sList.add(new Student(24,"Samburg"));
        sList.add(new Student(32,"Abernathy"));
        sList.add(new Student(11,"Asmodeus"));
        sList.add(new Student(49,"Belafonte"));
        sList.add(new Student(22,"Dominguez"));
        sList.add(new Student(92,"Jackson"));
        sList.add(new Student(53,"Nguyen"));
        sList.add(new Student(10,"Kamiya"));
        sList.add(new Student(5,"Fuchs"));
        sList.add(new Student(9,"Thompson"));
        sList.add(new Student(17,"Gomez"));
        sList.add(new Student(87,"Wong"));
        sList.add(new Student(0011,"Umehara"));
    }
    
    void sortStudentList(){
        ArrayList<Student> replace = new ArrayList<Student>();
        for(int i=0;i<sList.size();i++){
            if(i==0){
                replace.add(sList.get(i));
            }
            else{
                for(int j=0;j<replace.size();j++)
                {
                   if(j==replace.size()-1){
                       replace.add(sList.get(i));
                       break;
                   }
                   else if(sList.get(i).lastName.compareToIgnoreCase(replace.get(
                           j).lastName)<0){
                       replace.add(j,sList.get(i));
                       break;
                   } 
                   
                }
            }
        }
        sList.clear();
        for(int i=0; i<replace.size();i++){
            sList.add(replace.get(i));
        }
    }
    
    void setCourseLists(){
        sList.get(0).courses.add("COP3250");
        sList.get(0).courses.add("COP3337");
        sList.get(0).courses.add("ENC7100");
        
        sList.get(1).courses.add("COP2700");
        sList.get(1).courses.add("COP2250");
        sList.get(1).courses.add("COP3337");
        sList.get(1).courses.add("COP4250");
        
        sList.get(2).courses.add("COP2250");
        sList.get(2).courses.add("MAC2330");
        sList.get(2).courses.add("PSY2012");
        
        sList.get(3).courses.add("COP1210");
        sList.get(3).courses.add("COP2250");
        
        sList.get(4).courses.add("COP3337");
        sList.get(4).courses.add("COP2700");
        sList.get(4).courses.add("COP3250");
        
        sList.get(5).courses.add("COP2700");
        sList.get(5).courses.add("COP2250");
        sList.get(5).courses.add("COP3337");
        sList.get(5).courses.add("COP4250");
        
        sList.get(6).courses.add("COP2700");
        sList.get(6).courses.add("COP2250");
        sList.get(6).courses.add("COP3337");
        
        sList.get(7).courses.add("COP2250");
        sList.get(7).courses.add("MAC2330");
        sList.get(7).courses.add("PSY2012");
        
        sList.get(8).courses.add("ENC1105");
        sList.get(8).courses.add("ENC3250");
        sList.get(8).courses.add("PSY2012");
        
        sList.get(9).courses.add("COP2250");
        sList.get(9).courses.add("COP3337");
        sList.get(9).courses.add("COP4250");
        
        sList.get(10).courses.add("ART1210");
        sList.get(10).courses.add("ART1230");
        sList.get(10).courses.add("ART2220");
        
        sList.get(11).courses.add("ENC1105");
        sList.get(11).courses.add("ENC3250");
        sList.get(11).courses.add("PSY2012");
        
        sList.get(12).courses.add("COP2250");
        sList.get(12).courses.add("COP3337");
        sList.get(12).courses.add("COP4250");
        
        sList.get(13).courses.add("COP2250");
        sList.get(13).courses.add("COP3337");
        sList.get(13).courses.add("COP4250");
        
        sList.get(14).courses.add("ENC1105");
        sList.get(14).courses.add("ENC3250");
        sList.get(14).courses.add("PSY2012");
    }
    
    public void getStudents() {
    	for(int i=0;i<sList.size();i++){
            System.out.printf("%04d, %-12s", sList.get(i).ID,
                    sList.get(i).lastName);
            for(int j=0;j<sList.get(i).courses.size();j++){
                System.out.printf("%s",sList.get(i).courses.get(j));
                if(j<sList.get(i).courses.size()-1)
                    System.out.printf(", ");
                else
                    System.out.printf("\n");
            }
        }
    }
    
    public Student getStudent(int x) {
    	return sList.get(x);
    }
    
    public String getCourse(int x, int y) {
    	return sList.get(x).courses.get(y);
    }
    
    public int studentSize() {
    	return sList.size();
    }
    
    public int courseSize(int x) {
    	return sList.get(x).courses.size();
    }
}
