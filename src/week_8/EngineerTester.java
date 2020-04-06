package week_8;

public class EngineerTester {

	public static void main(String[] args) {
		
		//ComputerEngineer computerEngineer = new ComputerEngineer(false, false);
		IEngineer computerEngineer = new ComputerEngineer(false, false);
		computerEngineer.backgroundCheck();
		System.out.println(computerEngineer.GPA(3.75));
		computerEngineer.references();
		String [] experineces = {"Verizon", "SiliconeLabs", "Old Navy"};
		computerEngineer.experience(experineces);
		computerEngineer.projects();  //default
		
		System.out.println("======================================================");
		
		QAEngineer qaEngineer = new QAEngineer(true, false);
		//IEngineer qaIEngineer = new QAEngineer(true, false);
		
		String[] workExperience = {};
		String[] references = {"Bill Gates", "Elan Musk", "Arvind Krishna"};
		
		qaEngineer.backgroundCheck();
		System.out.println(qaEngineer.GPA(3.90));
		qaEngineer.references();
		qaEngineer.experience(experineces);
		qaEngineer.listOfReferences(references);
		qaEngineer.work();
		//==============================================
		qaEngineer.projects(); //default in interface
		IWorking.introStatic(); //Static method in interface
		qaEngineer.introStatic(); //Static method in regular
		qaEngineer.sameDef();
		
	}

}
