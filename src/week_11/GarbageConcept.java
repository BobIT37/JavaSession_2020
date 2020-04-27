package week_11;

public class GarbageConcept {

	public static void main(String[] args) {
		
		/*
		 * Here we are intentionally assigning a null value to a reference so that the 
		 * object becomes non reachable
		 */
		
		GarbageConcept obj = new GarbageConcept();
		obj =null;
		GarbageConcept obj1 = new GarbageConcept();
		obj1 =null;
		
		/*
		 * Here we are intentionally assigning reference a to the another 
		 * reference b to make the object referenced by b unusable 
		 */
		
		GarbageConcept a = new GarbageConcept();
		GarbageConcept b = new GarbageConcept();
		b=a;
		
		Runtime.getRuntime().gc();
	
	}
	protected void finalize() throws Throwable{
		System.out.println("GC is performed by JVM");
		System.out.println("Object garbage collected: "+ this);
	}
	

}
