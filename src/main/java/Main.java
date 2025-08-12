import vehicle.Bicycle;
import vehicle.Car;

public class Main {
	public static void main(String[] args) {

		//	Exercise 1: Basic Inheritance: The extends Keyword
		Car myCar = new Car();
		myCar.honk();
		myCar.display();

		Bicycle myBicycle = new Bicycle();
		System.out.print(myBicycle.getClass().getSimpleName() + " says: "); myBicycle.honk();
		System.out.print(myBicycle.getClass().getSimpleName() + " says: "); myBicycle.ringBell();
	}
}