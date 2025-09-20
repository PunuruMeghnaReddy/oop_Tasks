package tasks;
import java.util.ArrayList;
import java.util.Scanner;

class LoginSystem {
    ArrayList<String> str = new ArrayList<>();
    
    LoginSystem() {
        str.add("Meghna");
        str.add("Dhatri");
        str.add("Usha");
        str.add("Bahrgavi");
        str.add("Shalini");
    }
    
    void checklogin(String Username) {
        if (str.contains(Username)) {
            System.out.println("User found");
        } else {
            System.out.println("Invalid User");
            Scanner n = new Scanner(System.in);
            System.out.println("Do you want to update the data (Yes/No):");
            String opinion = n.nextLine();
            
            if (opinion.equalsIgnoreCase("Yes")) {
                System.out.println("Enter new username: ");
                String newuser = n.nextLine();
                str.add(newuser);
                System.out.println("New username '" + newuser + "' added.");
            }
        }
    }
}

public class Basics_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        LoginSystem t = new LoginSystem();
        t.checklogin(name);

        sc.close();
    }
}
