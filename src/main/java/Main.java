import animal.Dog;
import editor.CodeEditor;
import editor.Editor;
import game.ArmoredCharacter;
import game.GameCharacter;
import shape.Circle;
import shape.Rectangle;
import vehicle.Bicycle;
import vehicle.Car;

public class Main {
	public static void main(String[] args) {

		//	Exercise 1: Basic Inheritance: The extends Keyword
//		Car myCar = new Car();
//		myCar.honk();
//		myCar.display();
//
//		Bicycle myBicycle = new Bicycle();
//		System.out.print(myBicycle.getClass().getSimpleName() + " says: "); myBicycle.honk();
//		System.out.print(myBicycle.getClass().getSimpleName() + " says: "); myBicycle.ringBell();

		//	Exercise 2: Abstract Classes: Defining a Template
//		Circle myCircle = new Circle();
//		System.out.println(myCircle.display());
//
//		Rectangle myRectangle = new Rectangle();
//		System.out.println(myRectangle.display());
//
//		Dog myDog = new Dog();
//		myDog.breathe();
//		myDog.makeSound();

		//	Exercise 3: Method Overriding: Providing a New Implementation
		Editor myEditor = new Editor();
		CodeEditor myCodeEditor = new CodeEditor();
		Editor polyEditor = new CodeEditor();

		System.out.println("--- Regular Editor ---");
		myEditor.openFile();

		System.out.println("--- Code Editor ---");
		myCodeEditor.openFile();

		System.out.println("--- Polymorphic Editor ---");
		polyEditor.openFile();

		GameCharacter myGameCharacter = new GameCharacter();
		ArmoredCharacter myArmoredCharacter = new ArmoredCharacter();
		myGameCharacter.takeDamage(100);
		myArmoredCharacter.takeDamage(100);
	}
}