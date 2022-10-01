package code;

import monsters.Animal;

public class ConjureAnimals {
	
	private String animalName;
	private final Animal ani;

	private int toHit;
	private int damageBonus;
	private String attack1Dice;
	private String attack2Dice;
	private String damageType1;
	private String damageType2;

	private int numberOfAnimals;
	
	public ConjureAnimals(String animalName, int level) {
		this.animalName = animalName;
		ani = AnimalHelper.getAnimalDetails(animalName);
		
		this.toHit = ani.toHit;
		this.damageBonus = ani.damageBonus;
		this.attack1Dice = ani.attack1Dice;
		this.attack2Dice = ani.attack2Dice;
		this.damageType1 = ani.damageType1;
		this.damageType2 = ani.damageType2;
		
		numberOfAnimals = ani.numberOfAnimals * (level-1)/2;
	}
	

	//used to kill off animals without having to make a new object
	public void setAnimals(int newAnimals) {
		numberOfAnimals = newAnimals;
	}
	
	public String runDamage(int ac) {
		
		//TODO: make this code human readable
		
		int damage1 = 0;
		int damage2 = 0;
		int hits = 0;
		int crits = 0;
		
		for (int i = 0; i < numberOfAnimals; i++) {
			
			//first set of damage if it exists
			if (!attack1Dice.equals("")) {
				int curToHit = Dice.roll(20) + toHit;
				if (curToHit == 20 + toHit) {
					crits++;
					damage1 += 2*( Dice.roll(attack1Dice) + damageBonus );
				} else if (curToHit >= ac) {
					hits++;
					damage1 += Dice.roll(attack1Dice) + damageBonus;
				} else {
					//TODO: count data from miss
				}
			}
			
			
			//second set of attacks if any
			if (!attack2Dice.equals("")) {
				int curToHit = Dice.roll(20) + toHit;
				if (curToHit == 20 + toHit) {
					crits++;
					damage2 += 2*( Dice.roll(attack2Dice) + damageBonus );
				} else if (curToHit >= ac) {
					hits++;
					damage2 += Dice.roll(attack1Dice) + damageBonus;
				} else {
					//TODO: count data from miss
				}
			}
		}
		
		if (damageType1.equals(damageType2)) {
			return numberOfAnimals + " " + animalName +
					" hit " + hits + " time(s) and crit " + crits +
					" time(s) for a total of " + (damage1+damage2) + " " + damageType1 + " damage";
		} else {
			return "Against an AC of " + ac + ", " + numberOfAnimals + " " + animalName +
					"(s) hit " + hits + " time(s) and crit " + crits +
					" time(s) for a total of " + damage1 + " " + damageType1 + " and " +
					damage2 + " " + damageType2 + " damage";
		}
	}
}
