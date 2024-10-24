package Daca_L12Activity1;

public class Archer extends DnDCharacter {

	public static int health = 100;
	public static int damage = 20;
	
	public Archer(String characterName) {
		super(characterName, health, damage);
	}

	@Override
	void attack(DnDCharacter opponent) {
		opponent.receiveDamage(damage);
		attackDialogue(opponent);
		
	}
	
	@Override
	void attackDialogue(DnDCharacter opponent) {
		System.out.println(this.characterName + " sharply shoots " + opponent.characterName);
	}

	@Override
	void receiveDamage(int damage) {
		super.health = super.health - damage;
	}
	
	@Override
	public String toString() {
		return "Archer's Profile \nName = " + characterName + ", Health = " + health + ", Damage = " + damage;
	}

}
