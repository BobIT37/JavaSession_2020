package week_7;

public class Library {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		book1.setTitle("Grit");
		book1.setAuthor("Angela");
		book1.setPages(400);
		
		System.out.println("Book Name: "+ book1.getTitle());
		System.out.println("Book writer: "+ book1.getAuthor());
		System.out.println("Book pages: "+ book1.getPages());
		
		System.out.println("********************");
		Book book2 = new Book();
		book2.setTitle("Headfirst Java");
		book2.setAuthor("Kathy Sierra");
		book2.setPages(543);
		
		System.out.println("Book Name: "+ book2.getTitle());
		System.out.println("Book writer: "+ book2.getAuthor());
		System.out.println("Book pages: "+ book2.getPages());
		
		

	}

}
