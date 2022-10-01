package monsters;

public interface AnimalHelper {

	//access file system to get animals
	
	public static Animal getAnimalDetails(String animalName) {
		

		String details = MonsterReference.getDetails(animalName);
		
		//getting animals can be from file explorer
		//you take the animal name and hash it and go to where that file is held
		//there also has to be some manager for adding new animals to hashMap like file system
		//also needs to able to verify integrity over systems that it works
		
		
		//animals are listed as following
		//toHit, damage, attack1Dice, attack2Dice, type1, type2, numberPerSpell

		
		//this meathod is now responsible for parsing data into animal object
		
		return new Animal(); //currently just a black bear
	}
	
	

	/*

		//acts as a wrapper class for info used in hashMap
		
		//toHit, damage, attack1 dice, attack2 dice, numberPerspell
		 * 
		public String name;
		public int toHit;
		public int damage;
		public String dice1;
		public String dice2;
		public int numberOf;
		
		public Animal (String name, int toHit, int damage, String dice1, String dice2, int numberOf) {
			this.name = name;
			this.toHit = toHit;
			this.damage = damage;
			this.dice1 = dice1;
			this.dice2 = dice2;
			this.numberOf = numberOf;
	}
	*/

	
}
