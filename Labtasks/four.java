package Labtasks;
import java.util.Scanner;


public class four {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number in double format:");
	    Double num = sc.nextDouble();
	    int a = (int) num.doubleValue();
	    System.out.println("Original double value:"+num);
	    System.out.println("Converted value :"+a);
	    
sc.close();
	}

}
