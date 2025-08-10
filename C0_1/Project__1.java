package C0_1;
import java.util.Scanner;

class Patient {
    private int patientId;
    private String name;
    private String[] visits;
    static int counter;

    // Constructor
    Patient(int patientId, String name, int numberOfVisits) {
        this.patientId = patientId;
        this.name = name;
        visits = new String[numberOfVisits];
        counter++;
    }

    // Method to input visit details
    public void inputVisits() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < visits.length; i++) {
            System.out.print("Enter visit " + (i + 1) + ": ");
            visits[i] = sc.nextLine(); // stores string into array
        }
    }

    // Display visits using enhanced for loop
    public void displayVisits() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Visits:");
        for (String visit : visits) {
            System.out.println(visit);
        }
    }
}

public class Project__1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a patient
        System.out.print("Enter patient ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter patient name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of visits: ");
        int numVisits = sc.nextInt();
        sc.nextLine(); // consume newline

        Patient p = new Patient(id, name, numVisits);

        // Input visits
        p.inputVisits();

        // Display patient data
        p.displayVisits();

        System.out.println("Total patients so far: " + Patient.counter);
    }
}
