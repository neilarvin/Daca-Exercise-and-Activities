package Daca_L12Activity1;

public abstract class DnDCharacter {
	
	public String characterName;
	public int health;
	public int damage;
	
	public DnDCharacter(String characterName, int health, int damage) {
		this.characterName = characterName;
		this.health = health;
		this.damage = damage;
	}
	
	abstract void attack(DnDCharacter opponent);
	abstract void attackDialogue(DnDCharacter opponent);
	abstract void receiveDamage(int damage);

	public boolean isAlive() {
		
		return health > 0 ? true : false;
		
	}
	
	@Override
	public String toString() {
		return "DnDCharacter \nName= " + characterName + ", Health= " + health + ", Damage= " + damage;
	}
	
}
