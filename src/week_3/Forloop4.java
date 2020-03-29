package week_3;

public class Forloop4 {

	public static void main(String[] args) {
		
		//Reverse string... reverse array reverse numbers
		
		
		String word = "SiliconeLabs";
		//nahli
		
		// get length = 5 between 0-5
		// decrement 
		
		String reversed = "";
		
		for(int i = word.length()-1; i>=0; i--){
			reversed = reversed + word.charAt(i); //returns character at the specified index in a string
		}
		
		System.out.println(reversed);

	}

}
