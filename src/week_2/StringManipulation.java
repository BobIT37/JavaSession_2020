package week_2;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str = "I love Java but I do not like to JavaScript and JQuery";
		String str2 = "ilhan Turkmen";
		// index     == 0 , 
		
		//length == to find length
		//System.out.println(str2.length()); //54
		
		// index number
		
		//charAt() == to find particular index in string
		//System.out.println(str.charAt(3));
		//System.out.println(str.charAt(30));
		
		//indexOf() to find character index
		//System.out.println(str.indexOf("like"));
		//To find J second J
		//System.out.println(str.indexOf("J", 8));
		System.out.println(str.indexOf("J", str.indexOf("J")+1));
		System.out.println(str.lastIndexOf("J"));
		
		//Trim is used to remove space form string
		String str3 = "    hello world   ";
		System.out.println(str3);
		System.out.println(str3.trim());
		
		//Substring is used to get specific string from current string
		String s2 = "Your total amount is 1500 USD";
		//System.out.println(s2.substring(19, 25));
		System.out.println(s2.substring(21, s2.indexOf("USD")));
		
		//Interview question
		String total = s2.substring(21, s2.indexOf("USD")-1);
		int totalValue = Integer.parseInt(total);
		System.out.println(totalValue+100);
		
		//Split
		String language = "Java-Python-Ruby-Groovy"; //JavaPythonRubyGroovy
		//System.out.println(language);
		String lang[] = language.split("-");
		//System.out.println(lang[0]);
		
		//for loop
		for (int i = 0; i<lang.length; i++){
			System.out.println(lang[i]);
		}
		
		String pop = "textxXseleniumxXjavaxXPython"; //textseleniumjavaPython
		String pop1[] = pop.split("xX");
		//System.out.println(pop1[0]);
		
		for (int i = 0; i<pop1.length; i++){
			System.out.println(pop1[i]);
		}
				
//		//equals --> for string dont use for string ==
//		String emp1 = "hey this is ilhan here";
         //String emp2 = "hey This is ilhan here";
//		
//		if (emp1.equals(emp2)){
//			System.out.println("correct");
//		}else{
//			System.out.println("incorrect");
//		}
		
		//replace
		String date = "01-01-1975";
		System.out.println(date.replace("-", "/"));
		
		//upper and lower case
		String name1 = "my name is ILHAN";
		System.out.println(name1.toLowerCase());
		System.out.println(name1.toUpperCase());
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
