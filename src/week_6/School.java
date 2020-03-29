package week_6;

public class School {
	
	private String schoolName;
	private int numOfTeachers;
	private int numOfStudents;
	
	public School(String schoolName, int numOfTeachers, int numOfStudents) {
		super();
		this.schoolName = schoolName;
		this.numOfTeachers = numOfTeachers;
		this.numOfStudents = numOfStudents;
		
		System.out.println("School Name: "+ schoolName+ "\nNum Teachers: "+ 
		                   numOfTeachers+ "\nNum Students: "+ numOfStudents);
	}
	

}
