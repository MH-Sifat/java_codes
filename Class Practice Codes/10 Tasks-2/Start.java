public class Start{
	public static void main(String[] args){
		Book b1 = new Book("1114","Bangladesh History","Jibon Kumar",788.56,9);
		System.out.println("Book 1 Details:");
		b1.showDetails();
		System.out.println();

		Book b2 = new Book();
		b2.setIsbn("1544");
		b2.setBookTitle("Ghost tale");
		b2.setAuthorName("Mdic jois");
		b2.setPrice(586.23);
		b2.setAvailableQuantity(12);
		
		System.out.println("Book 2 Details:");
		System.out.println("Isbn:" + b2.getIsbn());
		System.out.println("book Title:" + b2.getBookTitle());
		System.out.println("Author Name:" + b2.getAuthorName());
		System.out.println("Price:" + b2.getPrice());
		System.out.println("Available Quantity:" + b2.getAvailableQuantity());
		System.out.println();
		
		System.out.println("After adding:");
		b1.addQuantity(9);
		System.out.println("Book 1 Details:");
		b1.showDetails();
		
		System.out.println();

		b2.sellQuantity(5);
		System.out.println("After sell:");
		
		System.out.println("Book 2 Details:");
		System.out.println("Isbn:" + b2.getIsbn());
		System.out.println("book Title:" + b2.getBookTitle());
		System.out.println("Author Name:" + b2.getAuthorName());
		System.out.println("Price:" + b2.getPrice());
		System.out.println("Available Quantity:" + b2.getAvailableQuantity());
		System.out.println();
	}
}

