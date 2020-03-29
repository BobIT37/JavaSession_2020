package week_4;

public class ArrayConcpt2 {

	public static void main(String[] args) {
		
		String studentsName [] = new String[5];
		studentsName[0] = "Sonam"; 
		studentsName[1] = "Fatih";
		studentsName[2] = "Arnold";
		studentsName[3] = "Lynda";
		studentsName[4] = "Hamza";
		
		for(int sn = 0; sn < studentsName.length; sn++){
			//System.out.println(studentsName[sn]);
			if(studentsName[sn].equals("Sonam")){
				System.out.println(studentsName[sn] + " is a doctor");
			}else if(studentsName[sn].equals("Fatih")){
				System.out.println(studentsName[sn] + " is a manager");
			}else if(studentsName[sn].equals("Arnold")){
				System.out.println(studentsName[sn] + " is a QA Engineer");
			}else if(studentsName[sn].equals("Lynda")){
				System.out.println(studentsName[sn] + " is a Scrum master");
			}else if(studentsName[sn].equals("Hamza")){
				System.out.println(studentsName[sn] + " is a BA");
			}else{
				System.out.println("No student is defined...");
			}
		}
		

	}

}
