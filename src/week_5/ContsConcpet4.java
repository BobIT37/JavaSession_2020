package week_5;

public class ContsConcpet4 {
	
	//public variable
	int modelYear;
	String modelName;
	
	public ContsConcpet4(int modelYear, String modelName){
		
		this.modelYear = modelYear;
		this.modelName = modelName;
	}

	public static void main(String[] args) {
		
		ContsConcpet4 cc = new ContsConcpet4(1969, "Mustang");
		
		System.out.println(cc.modelYear+ " "+ cc.modelName);

	}

}
