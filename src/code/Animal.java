package code;

public class Animal {

	//acts as a wrapper class for info used in hashMap
	
	//prof bonus, attacking stat, attack1 dice, attack2 dice, numberPerspell
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
}
