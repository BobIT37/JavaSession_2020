package basicsofOOP;

public class MethodPara {
	
	//void with parameterized
	public void add(int num1, int num2){
		
		int sum = num1 + num2;
		System.out.println("Sum of values: "+ sum);
	}
	
	//non void with parameterized
	public int multiply(int num1, int num2){
		
		int multiplyNum = num1 * num2;
		return multiplyNum;
	}
	//Non void
	public String fullName(String firstName, String lastName){
		return "Your name is: "+ (firstName + " "+ lastName);
	}
	

	public static void main(String[] args) {
		
		//create object
		MethodPara obj = new MethodPara();
		obj.add(5, 2);
		
		System.out.println("Multiply: "+ obj.multiply(3, 5));
		System.out.println(obj.fullName("Ilhan", "Turkmen"));

	}

}
