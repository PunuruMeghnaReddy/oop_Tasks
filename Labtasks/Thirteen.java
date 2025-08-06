package Labtasks;
import java.util.Scanner;
class Student{
	static String college_name;
	int student_ID;
	String student_name;
	static {
		college_name="KLH University";
	}
	 static void changecollege_name(String newName) {
	        college_name = newName;
	    }
	void setter(int student_ID,String Student_name) {
		this.student_ID = student_ID;
        this.student_name =Student_name;
	}
	void display()
	{
		System.out.println("ID: " + student_ID + ", Name: " + student_name + ", College: " + college_name);
	}
}

public class Thirteen {

	public static void main(String[] args) {
		 Student s1 = new Student();
	     Student s2 = new Student();
	         s1.setter(1, "Meghna");
              s2.setter(2, "Manswini");
	        s1.display();
	        s2.display();

	        // Changing college name using static method
	        Student.changecollege_name("XYZ University");
	}

}
