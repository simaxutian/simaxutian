package Lesson3;

import java.util.*;

class PairOfDice {
	public int die1; // Number showing on the first die.
	public int die2; // Number showing on the second die.

	public PairOfDice() {
		// Constructor. Rolls the dice, so that they initially
		// show some random values. Call the roll() method to roll the dice.
		roll();
	}

	public PairOfDice(int val1, int val2) {
		// Constructor. Creates a pair of dice that
		// are initially showing the values val1 and val2.
		roll();
	}

	public void roll() {
		// Roll the dice by setting each of the dice (die1, die2) to be
		// a random number between 1 and 6.
		Random r = new Random();
		die1 = r.nextInt(6)+1;
		die2 = r.nextInt(6)+1;
		
	}

	public static void main(String[] args) {
		// Create two object for the PairOfDice
		 
                       // Roll the two pairs of dice for both objects until the totals are same.
	 
                      // Display how many times needed to get the same total
		PairOfDice first = new PairOfDice();
		PairOfDice second = new PairOfDice();
		int Rollnum=0;
		int sum1,sum2;
		do{
			first.roll();
			sum1=first.die1+first.die2;
			System.out.println("First pair comes up "+sum1);
			second.roll();
			sum2=second.die1+second.die2;
			System.out.println("Second pair comes up "+sum2);
			Rollnum++;
		}while(sum1!=sum2);
		System.out.println("It took "+Rollnum+" times to roll the same sum");
	}
}
