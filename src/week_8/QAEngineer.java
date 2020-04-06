package week_8;

public class QAEngineer implements IEngineer, IWorking{
	
	private boolean reference;
	private boolean backgroundCheck;
	
	//Constructor
	public QAEngineer(boolean reference, boolean backgroundCheck) {
		super();
		this.reference = reference;
		this.backgroundCheck = backgroundCheck;
	}
	
	@Override
	public void work() {
		
		System.out.println("QA Engineer is working...");
		
	}
	@Override
	public void references() {
		
		if(reference) {
			System.out.println("His / her references were received");
		}else {
			System.out.println("His / her references were not received");
		}
		
	}
	@Override
	public void backgroundCheck() {
		
		if(backgroundCheck) {
			System.out.println("He / she has a criminal record");
		}else {
			System.out.println("He / she does not have a criminal record");
		}
		
	}
	@Override
	public String GPA(double gpa) {
		
		return "GPA Score: "+ gpa;
	}
	@Override
	public void experience(String[] array) {
		
		if(array.length == 0) {
			System.out.println("Candidate does not have any experineces");
		}else {
			System.out.println("As a QA engineer I worked those companies: ");
			for(int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		}
		
	}
	
	public void listOfReferences(String[] array) {
		
		if(array.length == 0) {
			System.out.println("Candidate did not give any reference");
		}else {
			System.out.println("Candidate reference list: ");
			for(int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		}
	}
	
	//============================================
	
	//Static method call
	public void introStatic() {
		System.out.println("This is intro static in QAEngineer");
	}
	
	//Default method multiple inheritance
	@Override
	public void sameDef() {
		
		IEngineer.super.sameDef();
		IWorking.super.sameDef();
	}
	
	

}
