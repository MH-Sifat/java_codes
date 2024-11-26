public class Account{
	int accountNumber;
	String accountHolderName;
	double balance;
	//set methods
	public void setAccountNumber(int an){
		this.accountNumber = an;
	}
	public void setAccountHolderName(String ahn){
		this.accountHolderName = ahn;
	}
	public void setBalance(double b){
		this.balance = b;
	}
	//get methods
	public int getAccountNumber(){
		return accountNumber;
	}
	public String getAccountHolderName(){
		return accountHolderName;
	}
	public double getBalance(){
		return balance;
	}
	
	void displayDetails(){
		System.out.println("Account Number:" + accountNumber);
		System.out.println("Account Holder Name:" + accountHolderName);
		System.out.println("Balance:" + balance);
	}
	public static void main(String[] args){
		Account a = new Account();
		a.setAccountNumber(1124);
		a.setAccountHolderName("Sifat");
		a.setBalance(55555.0);
		a.displayDetails();
	}
}
