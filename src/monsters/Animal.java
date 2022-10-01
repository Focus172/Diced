package monsters;

public class Animal {

	public final int toHit; 
	public final int damageBonus;
	public final String attack1Dice;
	public final String attack2Dice;
	public final String damageType1;
	public final String damageType2;
	public final int numberOfAnimals;
	
	public Animal () {
		toHit = 4; 
		damageBonus = 2;
		attack1Dice = "d6";
		attack2Dice = "2d4";
		damageType1 = "piercing";
		damageType2 = "slashing";
		numberOfAnimals = 4;
	}
	
}
