package Assignment1;
import java.util.Scanner;
public class Examcell {
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter number of students: ");
	        int n = sc.nextInt();
	        System.out.print("Enter number of subjects: ");
	        int m = sc.nextInt();
	        String[] names = new String[n];
	        int[][] marks = new int[n][m]; 
	        for (int i = 0; i < n; i++) {
	            System.out.print("\nEnter name of student " + (i + 1) + ": ");
	            names[i] = sc.next();

	            for (int j = 0; j < m; j++) {
	                System.out.print("Enter marks in subject " + (j + 1) + ": ");
	                marks[i][j] = sc.nextInt();
	            }
	        }
	        System.out.println("\nStudents who passed all subjects:");
	        boolean pass=false;
	        for(int i=0;i<n;i++)
	        {
	        	boolean allpass=true;
	        	for(int j=0;j<m;j++)
	        	{
	        		if(marks[i][j]<35)
	        		{
	        			allpass=false;
	        		   break;
	        		}
	        	}
	        	if(allpass)
	        	{
	        		System.out.println("- "+names[i]);
	        		pass=true;
	        	}
	        }
	        if (!pass) {
	            System.out.println("No student passed all subjects.");
	        }
	}

}
