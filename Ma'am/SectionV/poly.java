// One-to-Many Association
// Polymorphism and Association

class Account {
    private int Acc;         // Account number
    private String Accn;     // Account holder's name
    private double Balance;  // Account balance

    public void setAcc(int a) {
        this.Acc = a;
    }

    public int getAcc() {
        return this.Acc;
    }

    public void setAccn(String n) {
        this.Accn = n;
    }

    public String getAccn() {
        return this.Accn;
    }

    public void setBa(double b) {
        this.Balance = b;
    }

    public double getBa() {
        return this.Balance;
    }

    public void show() {
        System.out.println("Account Holder Name: " + getAccn());
        System.out.println("Account Number: " + getAcc());
        System.out.println("Account Balance: " + getBa());
    }
}

// Array of Objects - Customer class
class Customer {
    private String phn;              // Customer's phone number
    Account A[] = new Account[2];    // An array of account objects inside Customer class

    public Customer() {}

    public Customer(String p) {
        this.phn = p;
    }

    public void setPhn(String p) {
        this.phn = p;
    }

    public String getPhn() {
        return this.phn;
    }
	public void show(){
		System.out.println("Phone:"+getPhn());
		for(int i=0;i<A.length;i++){
			if(A[i]!=null){ A[i].show();}
			
		}
		
	}
	public void add(Account a) {
        int flag = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == null) { // Add the new account if space is available
                A[i] = a;
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Account added successfully.");
        } else {
            System.out.println("Not able to add account. Array is full.");
        }
    }

    public void remove(Account a) {
        int flag = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == a) { // Remove the account if it exists
                A[i] = null;
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Account removed successfully.");
        } else {
	System.out.println("Not able to add account.");}}
	// searching whether an account exists or not
public Account getAccount(int acn){
	Account a=null; // starting with a null objects
	for(int i=0;i<A.length;i++){
		if(A[i]!=null && A[i].getAccn()==acn)
		{a=A[i];
break;}} return a;}}
class savings extends Account{
	private double rate;
	
