package week_7;

import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;

public class HumanBeingTester {

	public static void main(String[] args) {
		
		HumanBeing h1 = new HumanBeing();
		h1.setHeight(1.68f);
		h1.setWeight(75);;
		h1.setBmi(calculateBmi(h1));
		
		System.out.println("Person has "+ h1.getWeight()
		                    + " kg and is "+ h1.getHeight()
		                    + " meters in height, which result in BMI of "
		                    + h1.getBmi());

	}
	
	public static float calculateBmi(HumanBeing h1) {
		return h1.getWeight()/ (h1.getHeight()*h1.getHeight());
	}

}
