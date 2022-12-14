package programs;

public interface Dice  {

	public static int roll(String die) {
		
		//takes input such as "4d6" or "d11" and computes result
		//TODO: doesn't get truly random results and needs additional functionality such as "2d20k1"
		
		//parsing number of dice used
		int numberOfDice = 0;
		int dLoc = die.indexOf('d');
		if (dLoc == 0) { numberOfDice = 1; }
		else { numberOfDice = Integer.parseInt(die.substring(0, dLoc)); }
		
		//gets the dice size
		int dieSize = Integer.parseInt(die.substring(dLoc+1));
		
		//rolls the dice to get the result
		int result = 0;
		for (int i = 0; i < numberOfDice; i++) { result += (int)(Math.random()*dieSize)+1; }
		return result;
	}
	
	/*
	public static int rollAdv (String die) {
		//only takes simple dice
		//trims input to be nice currently
		return Math.max(Dice.roll(die.substring(die.indexOf("d"))), Dice.roll(die.substring(die.indexOf("d"))));
	}
	*/
	
	//simpler meathod for rolling when nessisary
	public static int roll(int die) {
		return (int)(Math.random()*die)+1;
	}
	
	public static int rollAdv (int die) {
		return Math.max(roll(die), roll(die));
	}
}
