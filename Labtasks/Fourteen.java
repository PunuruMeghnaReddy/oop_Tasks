package Labtasks;
class BankAccount {
    static double interestRate; 
    int accountNumber;
    String accountHolder;
    double balance;

    static {
        interestRate = 5.0; 
    }

    void setter(int accNo, String holder, double bal) {
        this.accountNumber = accNo;
        this.accountHolder = holder;
        this.balance = bal;
    }

    static void setInterestRate(double rate) {
        interestRate = rate;
    }

    // Instance method to display details
    void getter() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("----------------------------");
    }
}
public class Fourteen {

	public static void main(String[] args) {
		  BankAccount acc1 = new BankAccount();
		  BankAccount acc2 = new BankAccount();
		  acc1.setter(101,"Meghna",50000);
		  acc2.setter(102, "Aarav",30000);
		  acc1.getter();
		  acc2.getter();
		  
	}

}
