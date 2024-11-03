package Daca_L12Activity2;

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
		super.health -= damage;
	}

	@Override
	void restoreHealth(int restore) {
		super.health += restore; 
		restoreDialogue(restore);
	}

	@Override
	void restoreDialogue(int restore) {
		System.out.println(this.characterName + " uses health potion and restore " +  restore + " health.");
	}

	@Override
	void buffAbility(int buff) {
		super.damage += damage;
		buffDialogue(buff);
	}

	@Override
	void buffDialogue(int buff) {
		System.out.println(this.characterName + " uses buff potion and increase damage to " +  buff);
	}
	
	@Override
	public String toString() {
		return "Archer's Profile \nName = " + characterName + ", Health = " + health + ", Damage = " + damage;
	}

}
