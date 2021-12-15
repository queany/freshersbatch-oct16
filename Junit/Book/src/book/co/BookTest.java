package book.co;

public class BookTest {

	public static void main(String[] args) {
		Author author = new Author("Queany", "queanycarol@gmail.com", 'F');
		Book book1 = new Book("Java", author, 19.95, 1000);
		book1.setPrice(19.95);
		book1.setQty(1000);
		System.out.println("Name is:"+book1.getName());
		System.out.println("Price is:"+book1.getPrice());
		System.out.println("Qty is:"+book1.getQty());
		System.out.println("Author is:"+book1.getAuthor());
		System.out.println("Author's Name is:"+book1.getAuthor().getName());
		System.out.println("Author's email is:"+book1.getAuthor().getEmail());
	}

}
