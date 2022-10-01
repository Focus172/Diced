package code;

public interface Dice  {

	public static int roll(String die) {
		
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
	
	//simpler meathod for rolling when nessisary
	public static int roll(int die) {
		return (int)(Math.random()*die)+1;
	}
}
