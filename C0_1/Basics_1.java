package C0_1;
import java.util.Scanner;
class Teacher{
	String name;
	private static int IDCounter=100;
	int TeacherID;
	String subject;
	void setter(String name,String subject)
	{
		this.name=name;
		this.TeacherID=++IDCounter;
		this.subject=subject;
	}
	void getter()
	{
		System.out.println("Name: "+name);
		System.out.println("ID: "+TeacherID);
		System.out.println("Subject: "+subject);
		
	}
}
public class Basics_1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the number of Teachers");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter the Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter the Course: ");
		String course = sc.nextLine();
        
		Teacher t = new Teacher();
		t.setter(name, course);
		t.getter();
		}
		sc.close();
	}

}
