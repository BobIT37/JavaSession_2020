package week_4;

public class StoreDifferentValueInArray {

	public static void main(String[] args) {
		
		//Object main class 
		
		Object empData[] = new Object[5];
		empData[0] = "Tom"; //String
		empData[1] = 25; //int
		empData[2] = 'M'; //char
		empData[3] = 2500.45; // double
		empData[4] = true; //boolean
		
		for(int i = 0; i < empData.length; i++){
			System.out.println(empData[i]);
		}

	}

}
