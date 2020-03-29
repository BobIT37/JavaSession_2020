package week_1;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class DataTypes {

	public static void main(String[] args) {
		
		//Primitive data types
		
		//int == numeric value 4 bytes //2147483647
		
		int i = 10;
		
		//int data type
		// i variable name
		// = assign operator
		// 10 is value
		//Integer class wrap to int === wrapper class in java
		
		i = 20;
		i = 30;
		System.out.println(i);
		int largestInt = Integer.MAX_VALUE;
		System.out.println(largestInt);
		
		//byte -128 - 127
		byte b1 = 10;
		byte age = 21;
		byte numbers = 127;
		
		byte largestValue = Byte.MAX_VALUE;
		System.out.println(largestValue);
		
		
		//Short is 2 bytes
		short s1 = 1299;
		short largestShort = Short.MAX_VALUE;
		System.out.println(largestShort);
		
		//Long 8 byte
		long l1 = 1000000;
		long minLong = Long.MIN_VALUE;
		System.out.println(minLong);
		
		//Float 4 bytes
		float f1 = (float) 10.55;
		float f2 = 10.55f;
		
		//Double 8 bytes
		double d1 = 12.455555;
		
		//char 2 bytes returns single digit
		char c1 = 'a';
		System.out.println(c1);
		char c2 = '@';
		char c3 = '1';
		
		//boolean around 1 byte returns true or false
		boolean b11 = true;
		boolean b6 = false;
		
		//String
	    // String is  not a data type is an object
		String string = "Hello world";
		System.out.println(string);
		
		
		

	}

}
