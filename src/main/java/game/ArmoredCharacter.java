package game;

public class ArmoredCharacter extends GameCharacter {

	public void takeDamage(int amount) {
		super.takeDamage((int)(amount*0.5));
	}
}
