public class BankAccount{
	String ownersName;
	int accountNumber;
	float balance;
    BankAccount(){
		System.out.println("Default");
	}
	 BankAccount(int anAccountNumber){
		accountNumber = anAccountNumber;
	}
    BankAccount(int anAccountNumber, String aName){
		accountNumber = anAccountNumber;
		ownersName = aName;
	}
	void display(){
	System.out.println("Name: "+ownersName);
	System.out.println("Account no "+accountNumber);
    System.out.println("Balance: "+balance);
	}
    public static void main(String[] args){
	BankAccount anAccount = new BankAccount();
    anAccount.display();
	BankAccount anotherAccount = new BankAccount(12345);
	anotherAccount.display();
	BankAccount myAccount = new BankAccount(33423, "Suuuu");
	myAccount.display();

    }
}



