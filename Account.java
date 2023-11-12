import java.util.Scanner;

public class Account {
    private double balance;
    private final String password;
    private int withdrawalAttempts;

    public Account(double balance, String password) {
        this.balance = balance;
        this.password = password;
        this.withdrawalAttempts = 0;
    }

    public void withdraw(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the 4-digit pass: ");
        String enteredPassword = scanner.nextLine();

        if (enteredPassword.equals(password)) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: $" + balance);
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            withdrawalAttempts++;
            if (withdrawalAttempts < 3) {
                System.out.println("Incorrect password. Please try again.");
                withdraw(amount);
            } else {
                System.out.println("Your account has been blocked. Please try again later.");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Account myAccount = new Account(1000.0, "1234");

        myAccount.withdraw(200.0);
    }
}
