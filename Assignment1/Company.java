package Assignment1;
import java.util.Scanner;
class Employee {
	String name;
	private static int id=8036;
	static int count=0;
	Employee(String name)
	{
		this.name=name;
	}
	void getter()
	{
		System.out.println("Name: "+name);
		System.out.println("ID: "+(++id));
		System.out.println("No.of Employees are heired so far : "+(++count));
	}
}
public class Company {

	public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
	  Employee[] employees = new Employee[2];

      for (int i = 0; i < 2; i++) {
          System.out.print("Name of the employee: ");
          String name = sc.nextLine();
          employees[i] = new Employee(name);
      }

      System.out.println("\n--- Employee Details ---");
      for (Employee e : employees) {
          e.getter();
      }
      sc.close();
	  
	}

}
