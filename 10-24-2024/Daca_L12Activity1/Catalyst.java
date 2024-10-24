package Daca_L12Activity1;

public class Catalyst extends DnDCharacter {

	public static int health = 100;
	public static int damage = 15;
	
	public Catalyst(String characterName) {
		super(characterName, health, damage);
	}

	@Override
	void attack(DnDCharacter opponent) {
		opponent.receiveDamage(damage);
		attackDialogue(opponent);
		
	}
	
	@Override
	void attackDialogue(DnDCharacter opponent) {
		System.out.println(this.characterName + " tightly blind " + opponent.characterName);
	}

	@Override
	void receiveDamage(int damage) {
		super.health = super.health - damage;
	}
	
	@Override
	public String toString() {
		return "Catalyst's Profile \nName = " + characterName + ", Health = " + health + ", Damage = " + damage;
	}
}