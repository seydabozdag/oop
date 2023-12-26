import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;

class BankAccount implements Comparable<BankAccount> {
    private int accountNo;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(int accountNo, String holderName, double balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Method to reduce balance by given amount
    public void balanceChange(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid amount or insufficient balance");
        }
    }

    // Getter methods (optional)
    public int getAccountNo() {
        return accountNo;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Implementing Comparable interface to sort by holderName
    @Override
    public int compareTo(BankAccount other) {
        return this.holderName.compareTo(other.holderName);
    }
}

class Main {
    public static void main(String[] args) {
        // Create objects and add them to ArrayList
        BankAccount a1 = new BankAccount(1, "Ali Besler", 1000.0);
        BankAccount a2 = new BankAccount(2, "Behcet Ozcan", 2000.0);
        BankAccount a3 = new BankAccount(3, "Mustafa Hergun", 1500.0);
        BankAccount a4 = new BankAccount(4, "Semiha Akca", 2500.0);

        List<BankAccount> myAccounts = new ArrayList<>();
        myAccounts.add(a1);
        myAccounts.add(a2);
        myAccounts.add(a3);
        myAccounts.add(a4);

        // Sort by holderName
        Collections.sort(myAccounts);

        // Reduce balances by 500 for all accounts
        for (BankAccount account : myAccounts) {
            account.balanceChange(500.0);
        }

        // Print sorted objects in the list
        System.out.println("Sorted Bank Accounts after balance reduction:");
        for (BankAccount account : myAccounts) {
            System.out.println("Account No: " + account.getAccountNo() +
                    ", Holder Name: " + account.getHolderName() +
                    ", Balance: " + account.getBalance());
        }
    }
}
