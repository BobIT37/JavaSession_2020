package week_9_2;

public abstract class File {
	
	private String name;
	public static int count;
	
	//Constructor
	public File() {
		System.out.println("File class constructor");
		name = "unkown";
		count++;
	}
	
	public File (String name) {
		System.out.println("File class 1-arg constructor");
		this.name = name;
		count++;
	}
	
	//Getter setter
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract void open();
	
	public void close() {
		System.out.println("Closing the file");
	}
	
		

}
