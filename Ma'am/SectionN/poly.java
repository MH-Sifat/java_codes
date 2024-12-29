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

    public void show() {
        System.out.println("Customer's Phone: " + phn);
        // Traverse the array
        for (int i = 0; i < A.length; i++) {
            if (A[i] != null) {
                A[i].show(); // Reusing the show() of associated class
            }
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
            System.out.println("Not able to remove account. Account not found.");
        }
    }

    // Get methods for array of objects
    public Account getAccount(int accn) {
        Account a = null; // Start with a null object
        // Traverse the array
        for (int i = 0; i < A.length; i++) {
            if (A[i] != null && A[i].getAcc() == accn) { // Compare account numbers
                a = A[i];
                break;
            }
        }
        return a;
    }
}

// Savings class - extends Account
class Savings extends Account {
    private double rate; // Interest rate

    public void setRate(double r) {
        this.rate = r;
    }

    public double getRate() {
        return this.rate;
    }

   
    public void show() {
        super.show(); // Reuse the parent class's show() method
        System.out.println("Interest Rate: " + getRate());
    }
}

// Main class
public class poly {
    public static void main(String args[]) {
        // Create a customer
        Customer c = new Customer("+988877655544");

        // Create an Account
        Account a1 = new Account();
        a1.setAcc(1111);
        a1.setAccn("ASD");
        a1.setBa(20000.0);

        // Create a Savings Account
        Savings sa1 = new Savings();
        sa1.setAcc(1112);
        sa1.setAccn("QWE");
        sa1.setBa(21000.0);
        sa1.setRate(10.5);

        c.add(a1);
        c.add(sa1);

        
        c.show();

      
        c.remove(sa1);
        c.show();

        // Create another Savings Account
        Savings sa2 = new Savings();
        sa2.setAcc(1114);
        sa2.setAccn("PQR");
        sa2.setBa(2000.0);
        sa2.setRate(7.5);

     
        c.add(sa2);
        c.show();

        
        if (c.getAccount(1113) != null) {
            System.out.println("Account exists.");
        } else {
            System.out.println("Account does not exist.");
        }
    }
}
