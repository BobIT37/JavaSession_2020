package week_4;

import javax.swing.text.AbstractDocument.LeafElement;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//Array: Create a single variable, store multiple values
		// Limitations
		// 1. static array: size is fixed: to solve this issue we use dynamic array or arrayList
		// 2. cannot store different data types: Dynamic Array
		
		int a [] = new int[4]; // this is size(length)
		a[0] = 10;  //lowest index
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;  //highest 
		
		//to find length
		//System.out.println(a.length);
		
		//how to print out specific value from array
//		System.out.println(a[0]);
//		System.out.println(a[2]);
		//System.out.println(a[4]);  //ArrayIndexOutOfBoundsException: 4
		
		//regular for loop
//		for(int i = 0; i < a.length; i++){
//			System.out.println(a[i]);
//		}
		
		//for each loop
		for(int numy : a){
			System.out.println(numy);
		}
		
		double d [] = new double[2];
		d[0] = 12.33;
		d[1] = 10.55;
		
		double tr [] = {12.33, 10.55};
		
		//String Array
		String s [] = new String[4];
		s[0] = "Java";
		s[1] = "Python";
		s[2] = "Groovy";
		s[3] = "Ruby";
		
		for(int i = 0; i < s.length; i++){
			//System.out.println(s[i]);
			if(s[i].equals("Groovy")){
				System.out.println("I hate "+ s[i]);
			}else {
				System.out.println("I love "+ s[i]);
			}
		}
		
		
		

	}

}
