package week_5;

public class OverlaodingConcept2 {

	public static void main(String[] args) {
		
		main(3);
		main("ilhan");

	}
	
	public static void main(int i){
		System.out.println(i);
	}
	
	public static void main(String name){
		System.out.println(name);
	}

}
