package week_6;

public class CarTest {

	public static void main(String[] args) {
		
		
		BMW bmw = new BMW();
		bmw.start();
		bmw.stop();
		bmw.theftSafety();
		bmw.engine();
		System.out.println(bmw.personNum());
		System.out.println(bmw.refuel());
		bmw.numOfPeople();
		
		System.out.println("************************");
		
		Car car = new Car();
		car.start();
		car.stop();
		car.refuel();
		car.engine();

	}

}
