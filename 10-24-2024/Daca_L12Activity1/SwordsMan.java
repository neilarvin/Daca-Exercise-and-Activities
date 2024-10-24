package Daca_L12Activity1;

public class SwordsMan extends DnDCharacter {

	public static int health = 100;
	public static int damage = 25;
	
	public SwordsMan(String characterName) {
		super(characterName, health, damage);
	}

	@Override
	void attack(DnDCharacter opponent) {
		opponent.receiveDamage(damage);
		attackDialogue(opponent);
		
	}
	
	@Override
	void attackDialogue(DnDCharacter opponent) {
		System.out.println(this.characterName + " slash " + opponent.characterName);
	}

	@Override
	void receiveDamage(int damage) {
		health = health - damage;
	}
	
	@Override
	public String toString() {
		return "Swordsman's Profile \nName = " + characterName + ", Health = " + health + ", Damage = " + damage;
	}

}
