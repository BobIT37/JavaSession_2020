package basicsofOOP;

public class HondaTest {

	public static void main(String[] args) {
		
		//Create object
		Honda civic = new Honda();
		civic.module = "Honda Civic";
		civic.color = "red";
		civic.engineSize = 2000;
		civic.madeBy = "Japanese";
		
		System.out.println(civic.module);
		System.out.println(civic.color);
		System.out.println(civic.engineSize);
		System.out.println(civic.madeBy);
		
		civic.accelerating();
		civic.stop();

	}

}
