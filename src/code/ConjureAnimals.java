package code;

public class ConjureAnimals {
	
	private final String animalName;
	private final int toHit;
	private final int damageBonus;
	private final String attack1Dice;
	private final String attack2Dice;
	private final String damageType1;
	private final String damageType2;

	private int numberOfAnimals;
	
	
	//animals are listed as following
	//prof bonus, attacking stat, attack1 dice, attack2 dice, numberPerspell
	
	
	//getting animals can be from file explorer
	//you take the animal name and hash it and go to where that file is held
	//there also has to be some manager for adding new animals to hashMap like file system
	//also needs to able to verify intgrety over systems that it works
	
	
	public ConjureAnimals(String animalName, int level) {
		this.animalName = animalName;
		String aniStats = AnimalHelper.getAnimalDetails(animalName);
		
		
		//this should be parsed from animalStats but just using black bear to test
		toHit = 4; 
		damageBonus = 2;
		attack1Dice = "d6";
		attack2Dice = "2d4";
		damageType1 = "piercing";
		damageType2 = "slashing";
		
		numberOfAnimals = 4 * ((level-1)/2);
	}
	
	public void setAnimals(int newAnimals) {
		numberOfAnimals = newAnimals;
	}
	/*
	
	public String turn(int ac) {
		return numberOfAnimals + 
				" " + animalName +
				" hit 4 times and crit 1 time for a total of " + runDamage(ac) + " bludgeoning damage";
	}
	*/
	
	public String runDamage(int ac) {
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
					//still count data from miss
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
					//still count data from miss
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
