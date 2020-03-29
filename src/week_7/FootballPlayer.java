package week_7;

public class FootballPlayer extends Athlete{
	
	String team;
	
	public FootballPlayer(String name, int age, String team) {
		super(name, age);
		this.team = team;
		System.out.println("Name: "+ name+ "\nAge: "+age + "\nTeam: "+ team);
	}
	
	@Override
	public void game() {
		System.out.println("Football player is playing football...");
	}
	
	public void run() {
		System.out.println("Football player is running...");
	}

}
