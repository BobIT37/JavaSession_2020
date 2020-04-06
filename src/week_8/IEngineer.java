package week_8;

public interface IEngineer {
	
	void references();
	void backgroundCheck();
	String GPA(double gpa);
	void experience(String [] array);
	
	//========================================
	default void projects() {
		System.out.println("This is default method and it has body in interface");
	}
	
	default void sameDef() {
		System.out.println("This is in IEngineer");
	}

}
