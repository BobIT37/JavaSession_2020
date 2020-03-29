package week_7;



public class BasketballPlayer extends Athlete{
	
	boolean isPlayer;
	String team; 
	
	public BasketballPlayer(String name, int age, String team, boolean isPlayer) {
		super(name, age);
		this.isPlayer = isPlayer;
		this.team = team;
		
		
		System.out.println("Name: "+ name+ "\nAge: "+ age+ "\nTeam: "+ team);
	}
	
	public void game() {
		if(isPlayer) {
			System.out.println("BasketPlayer is offensive");
		}
		else {
			System.out.println("Basket player is defensive");
		}
	}

}
