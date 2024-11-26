// Class to represent the Bank Account
public class BankAccount {
    
    // Attributes (Fields)
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Default Constructor
    public BankAccount() {
        System.out.println("Empty Account");
    }

    // Parameterized Constructor
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
		System.out.println("\n Demo Account");
    }

    // Setters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Method to transfer money from one account to another
    public void sendMoney(BankAccount account, double amount) {
        if (this.balance >= amount) {
            this.balance = balance - amount;          // Deduct from sender's account
			
            account.balance = account.balance + amount;       // Add to recipient's account
			
            System.out.println("Money transferred: " + amount);
        } 
		else {
            System.out.println("Insufficient balance to transfer money.");
        }
    }

    // Method to display account details
    public void showDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

}
