package game;

public class GameCharacter {

	private int health;

	public GameCharacter() {
		this.health = 100;
	}

	public void takeDamage(int amount) {
		System.out.print(this.getClass().getSimpleName() + " takes " + amount + " damage. ");
		this.health -= amount;
		System.out.println("New health: " + this.health);
	}
}
