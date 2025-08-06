package Labtasks;
import java.util.Scanner;

class Details{
	String name;
	int rollno;
	int age;
	char gender;
	float percentage;
void setter(String name,int rollno,int age,char gender,float percentage)
	{
		this.name=name;
		this.rollno=rollno;
		this.age=age;
		this.gender=gender;
		this.percentage=percentage;
	}
    void getter()
    {
    	System.out.println("Name of the Student: " + name);
		System.out.println("Rollno of the Student: " + rollno);
		System.out.println("Age of the Student:  " +age);
		System.out.println("Gender(M/F):" +gender);
		System.out.println("Percentage of the student :"+percentage);
		
    }
}    
public class Two{
	
     public static void main (String args[]){
    	 Scanner sc = new Scanner(System.in);
 		System.out.print("Enter the name: ");
 		String name =sc.nextLine();
 		
 		System.out.print("Enter the Student ID: ");
 		int Rollno =sc.nextInt();
 		
		System.out.print("Enter the Age: ");
		int age =sc.nextInt();
		
		System.out.print("Gender(F/M): ");
		char gender =sc.next().charAt(0);
		
		System.out.println("Enter the percentage:");
		float percentage=sc.nextFloat();
	    Details c=new Details();
	    c.setter(name,Rollno,age,gender, percentage);
	  c.getter();
	  sc.close();
	  
     }
	    
}

