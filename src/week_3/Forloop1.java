package week_3;

public class Forloop1 {

	public static void main(String[] args) {
		
		//Print 5 times same string
		// Happy birthday to you!
		
		for(int i = 1; i < 6; i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(i);
		}

	}

}
