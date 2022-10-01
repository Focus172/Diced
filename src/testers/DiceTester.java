package testers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import programs.ConjureAnimals;
import programs.Dice;

class DiceTester {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void test() {
		
		//for (int i = 0; i < 20; i++) { System.out.println(Dice.roll("3d6")); }
		
		//assertTrue(Dice.roll("d4")%1.0 == 0.0);
		//assertTrue(Dice.roll(6)%1.0 == 0.0);
		//assertTrue(Dice.roll("aoufbaou") == -1);
		
		/*
		ConjureAnimals blackBear = new ConjureAnimals("black bear", 3);
		for (int i = 1; i < 25; i++) {
			System.out.println(blackBear.runDamage(i));
		}
		*/
		
		
	}

}
