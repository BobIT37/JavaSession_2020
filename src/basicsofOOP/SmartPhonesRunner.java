package basicsofOOP;

public class SmartPhonesRunner {

	public static void main(String[] args) {
		
		//Object 
		System.out.println("iPhone");
		SmartPhones iPhones = new SmartPhones();
		iPhones.version = "X Plus";
		iPhones.capacity = "64 gb";
		iPhones.ram = 4;
		iPhones.color = "Golden";
		
		System.out.println(iPhones.version);
		System.out.println(iPhones.capacity);
		System.out.println(iPhones.ram);
		System.out.println(iPhones.color);
		
		iPhones.sendingEmail();
		iPhones.takingPic();
		
		System.out.println();
		System.out.println("********************");
		System.out.println();
		
		
		System.out.println("MOTOROLA");
		SmartPhones motorola = new SmartPhones();
		motorola.version = "Z series";
		motorola.capacity = "32 gb";
		motorola.ram = 2;
		motorola.color = "black";
		
		System.out.println(motorola.version);
		System.out.println(motorola.capacity);
		System.out.println(motorola.ram);
		System.out.println(motorola.color);
		
		motorola.sendingEmail();
		motorola.takingPic();
		

	}

}
