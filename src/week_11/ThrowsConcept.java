package week_11;

public class ThrowsConcept {

	public static void main(String[] args) throws InterruptedException  {
		
		
		for(int i = 5; i < 100; i+=10) {
			
			Thread.sleep(2000);
			
			System.out.println("You are done: "+ i);
		}

	}

}
