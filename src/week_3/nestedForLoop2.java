package week_3;

public class nestedForLoop2 {

	public static void main(String[] args) {
		
		// 1 2 3 4 5 6 7 8 9 10
		// 1 2 3 4 5 6 7 8 9 10
		// 1 2 3 4 5 6 7 8 9 10
		// 1 2 3 4 5 6 7 8 9 10
		
		for(int j = 1; j <=10; j++){
			for(int i = 1; i <=10; i++){
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("Outside");
		
		
	}

}
