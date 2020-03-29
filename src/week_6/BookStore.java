package week_6;

public class BookStore {
	
	private String storeName;
	private int numOfBook;
	
	public BookStore(String storeName, int numOfBook) {
		super();
		this.storeName = storeName;
		this.numOfBook = numOfBook;
		System.out.println("Store name: "+ storeName + "\nBook Numbers: "+ numOfBook);
	}
	
	public void workHours(String start, String closing) {
		System.out.println("Start: "+ start + "\nFinish: "+ closing);
	}
	
	public int numOfEmployee(int numOfEmployee) {
		return numOfEmployee;
	}
	

}
