package main;

import java.util.Scanner;
import monsters.MonsterReference;

public class Diced {

	//main 
	
	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);

		//on first start build all the caches necessary for running
		System.out.println("---- Welcome -----");
		System.out.println("Diced: a ternimal based dice tool by Evan Stokdyk");
		System.out.print("Are you new here? ");
		String response = k.next();
		
		if (response.startsWith("y") || response.startsWith("Y"))  { MonsterReference.createCollection(); }
		else  {MonsterReference.verifyCache(); }
		
		//flush screen
		System.out.println("What will you be do you need");
		System.out.println("-> 1: Conjure Animals");
		System.out.println("-> 2: Quit");
		
		k.close();
	}
	
}
