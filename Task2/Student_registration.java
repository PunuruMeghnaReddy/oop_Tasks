package Task2;
import java.util.*;
class Course{
	String[] coursename;
	String studentID;
	String name;
	void setter(String[] coursename, String studentID, String name) {
        this.coursename = coursename;
        this.studentID = studentID;
        this.name = name;
    }
    void getter() {
    	System.out.println("Name of the student: "+name);
    	System.out.println("Student ID "+ studentID);
    	System.out.println("Enrolled Courses: ");
    	for (int i=0;i<2;i++)
    	{
    		System.out.println(coursename[i]+ " ");
    	}
    }
}
public class Student_registration {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name: ");
		String name =sc.nextLine();
		
		System.out.print("Enter the Student ID: ");
		String studentID =sc.nextLine();
		//int count = 0;
		String[] coursename = new String[2];
		for(int j=0;j<2;j++)
		{
			System.out.print("Enter the courses to be enrolled "+(j+1)+ ":");
		    coursename[j] =sc.nextLine().trim();
		}
		Course c = new Course();
		c.setter(coursename,studentID,name);
		//System.out.println();
		c.getter();
		sc.close();
		    
	}

}
