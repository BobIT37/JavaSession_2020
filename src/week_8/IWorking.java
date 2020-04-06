package week_8;

public interface IWorking {
	
	void work();
	
	
	//===================================
	static void introStatic() {
		System.out.println("This is static method");
	}
	
	default void sameDef() {
		System.out.println("This is in IWorking");
	}

}
