package monsters;

public class Animal {

	public final int toHit; 
	public final int damage;
	public final String attack1Dice;
	public final String attack2Dice;
	public final String damageType1;
	public final String damageType2;
	public final int numberOfAnimals;
	
	/*
	public boolean choosesAttack;
	public int savingThrow;
	public boolean requestAdvantage;
	*/
	
	
	public Animal (int toHit, int damage, String attack1Dice, String attack2Dice, String damageType1, String damageType2, int numberOfAnimals) {
		this.toHit = toHit; 
		this.damage = damage;
		this.attack1Dice = attack1Dice;
		this.attack2Dice = attack2Dice;
		this.damageType1 = damageType1;
		this.damageType2 = damageType2;
		this.numberOfAnimals = numberOfAnimals;
	}
	
}
