class Book{
	String isbn;
	String bookTitle;
	String authorName;
	double price;
	int availableQuantity;
	
	Book(){}
	Book(String isbn,String bookTitle,String authorName,double price,int availableQuantity){
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.price = price;
		this.availableQuantity = availableQuantity;
	}
	
	void setIsbn(String isbn){
		this.isbn = isbn;
	}
	void setBookTitle(String bookTitle){
		this.bookTitle = bookTitle;
	}
	void setAuthorName(String authorName){
		this.authorName = authorName;
	}
	void setPrice(double price){
		this.price = price;
	}
	void setAvailableQuantity(int availableQuantity){
		this.availableQuantity = availableQuantity;
	}
	
	String getIsbn(){
		return isbn;
	}
	String getBookTitle(){
		return bookTitle;
	}
	String getAuthorName(){
		return authorName;
	}
	double getPrice(){
		return price;
	}
	int getAvailableQuantity(){
		return availableQuantity;
	}
	
	
	void addQuantity(int amount){
		if(amount > 0){
			availableQuantity = availableQuantity + amount;
		}
		else{
			System.out.println("No Change");
		}
	}
	
	void sellQuantity(int amount){
		if(amount > 0 && amount <= availableQuantity){
			availableQuantity = availableQuantity - amount;
		}
		else{
			System.out.println("Sell not possible");
		}
	}
	
	void showDetails(){
		System.out.println("Isbn:" + isbn);
		System.out.println("book Title:" + bookTitle);
		System.out.println("Author Name:" + authorName);
		System.out.println("Price:" + price);
		System.out.println("Available Quantity:" + availableQuantity);
	}
}


// ma'am er code

/*

public class Book {
    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;

    public Book() {
        this.isbn = "";
        this.bookTitle = "";
        this.authorName = "";
        this.price = 0.0;
        this.availableQuantity = 0;
    }

    public Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity) {
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }

    // Setters
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    // Getters
    public String getIsbn() {
        return isbn;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public double getPrice() {
        return price;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    // Method to add quantity
    public void addQuantity(int amount) {
        if (amount > 0) {
            this.availableQuantity += amount;
			//local variable updating
        } else {
            System.out.println("Invalid amount to add.");
        }}
    public void sellQuantity(int amount) {
        if (amount > 0 && amount <= this.availableQuantity) {
            this.availableQuantity -= amount;
			//local variable updating
        } else {
            System.out.println("Invalid amount to sell or not enough quantity.");
        }
    }
    public void showDetails() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + authorName);
        System.out.println("Price: $" + price);
        System.out.println("Available Quantity: " + availableQuantity);
    }

    public static void main(String[] args) {
		Book b= new Book();
		b.setIsbn("926-2-15-184682-9");
		b.setBookTitle("Web Development");
		b.setAuthorName("Johnny Write");
		b.setPrice(4500.78);
		b.setAvailableQuantity(4);
		
        System.out.println("ISBN: " + b.getIsbn());
        System.out.println("Title: " + b.getBookTitle());
        System.out.println("Author: " + b.getAuthorName());
        System.out.println("Price: $" + b.getPrice());
        System.out.println("Available Quantity: " + b.getAvailableQuantity());
		
        Book book1 = new Book("978-3-16-148410-0", "Java Programming", "John Doe", 39.99, 10);
		
        
		book1.showDetails();

        System.out.println("After updating first book");
		b.addQuantity(10);
		System.out.println("Available Quantity: " + b.getAvailableQuantity());
		// Adding quantity
        book1.addQuantity(5);
        System.out.println("\nAfter adding 5 more copies:");
        book1.showDetails();

        // Selling quantity
        book1.sellQuantity(4);
        System.out.println("\nAfter selling 3 copies:");
        book1.showDetails();
    }
}

*/
		
