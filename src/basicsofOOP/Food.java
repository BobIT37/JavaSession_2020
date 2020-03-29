package basicsofOOP;

public class Food {
	
	public void turkishKebab(String meat, String vegatable){
		
		String sishkebab = meat + vegatable;
		System.out.println("Turkish kebab is made using "+ meat +" and "+ vegatable);
	}
	
	public void sushi(String fish, String food){
		
		String sushi = fish + food;
		System.out.println("Sushi is made using "+ fish +" and "+ food);
	}

	public static void main(String[] args) {
		
		Food sishKebab = new Food();
		sishKebab.turkishKebab("lamb", "green peper");
		
		Food sushi = new Food();
		sushi.sushi("salmon", "rice");

	}

}
