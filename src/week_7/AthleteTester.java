package week_7;

public class AthleteTester {

	public static void main(String[] args) {
		
		Athlete athlete = new Athlete();
		
		System.out.println("*********************");
		FootballPlayer footballPlayer = new FootballPlayer("Ronaldo", 34, "Juventus");
		System.out.println("football player:");
		footballPlayer.game();
		footballPlayer.run();
		
		System.out.println("*******************");
		System.out.println("basket player:");
		BasketballPlayer basketballPlayer = new BasketballPlayer("LeBron", 31, "LA Lakers", true);
		basketballPlayer.game();
		basketballPlayer.run();

	}

}
