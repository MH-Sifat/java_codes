/*
Problem 1: Classes and Objects
Define a class `Book` with the following attributes:
- `title`: a String representing the title of the book
- `author`: a String representing the author of the book
- `price`: a double representing the price of the book
Create a few `Book` objects with different values and print their details in the console.
Example:
Book 1:
Title: The Great Gatsby
Author: F. Scott Fitzgerald
Price: $10.99
Book 2:
Title: To Kill a Mockingbird
Author: Harper Lee
Price: $12.99
*/

public class Book{
	String title,author;
	double price;
	public static void main(String[] args){
		Book b1 = new Book();
		b1.title = "The Great Gatsby";
		b1.author = "F. Scott Fitzgerald";
		b1.price = 10.99;
		System.out.println("Book 1:");
		System.out.println("Title: " + b1.title);
		System.out.println("Author: " + b1.author);
		System.out.println("Price: $" + b1.price);
		
		//System.out.println("");

        Book b2 = new Book();
		b2.title = "To Kill a Mockingbird";
		b2.author = "Harper Lee";
		b2.price = 12.99;
		System.out.println("\nBook 2:");
		System.out.println("Title: " + b2.title);
		System.out.println("Author: " + b2.author);
		System.out.println("Price: $" + b2.price);
	}
}
