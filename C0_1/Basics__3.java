package C0_1;
import java.util.Scanner;

class LoginSystem {
    String[] str = {"Meghna", "Dhatri", "Usha", "Bahrgavi", "Shalini"};
    boolean count = false;

    void checklogin(String Username) {
        for (String username : str) {
            if (username.equals(Username)) { // Compare content
                count = true;
                break; // No need to check further
            }
        }
        if (count) {
            System.out.println("User found");
        } else {
            System.out.println("Invalid User");
        }
    }
}

public class Basics__3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        LoginSystem t = new LoginSystem();
        t.checklogin(name);

        sc.close();
    }
}

