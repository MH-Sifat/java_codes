public class Main{

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        // Creating two bank accounts using parameterized constructor and SetGet Method
		// Account 1 
        BankAccount a1 = new BankAccount();
		
		a1.setAccountNumber(101);
		a1.setAccountHolderName("Mehedi");
		a1.setBalance(5000.0);
		
		// Displaying account details before transfer
        System.out.println("Account 1 Details Before Transfer:");
		System.out.println("Account Number: " + a1.getAccountNumber());
        System.out.println("Account Holder Name: " + a1.getAccountHolderName());
        System.out.println("Balance: " + a1.getBalance());
		
		// Account 2
        BankAccount a2 = new BankAccount(102, "Sifat", 3000.0);

        System.out.println("\nAccount 2 Details Before Transfer:");   // \n eta use korle er ager line e ekta line break hoy
        a2.showDetails();
        
		System.out.println(" ");
        // Transfer money from account1 to account2
        a1.sendMoney(a2, 1500.0);

        // Displaying account details after transfer
        System.out.println("\nA ccount 1 Details After Transfer:");
		System.out.println("Account Number: " + a1.getAccountNumber());
        System.out.println("Account Holder Name: " + a1.getAccountHolderName());
        System.out.println("Balance: " + a1.getBalance());

        System.out.println("\nAccount 2 Details After Transfer:");
        a2.showDetails();
    }
}