package week_6;

public class BarnesNoble extends BookStore{
	
	public BarnesNoble(String storeName, int numOfBook) {
		super(storeName, numOfBook);
	}
	
	@Override
	public void workHours(String start, String closing) {
		System.out.println("Start: "+ start + "\nFinish: "+ closing);
	}
	
	
	@Override
	public int numOfEmployee(int numOfEmployee) {
		return numOfEmployee;
	}

}
