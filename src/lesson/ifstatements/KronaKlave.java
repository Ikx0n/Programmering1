package lesson.ifstatements;

import java.util.Random;
import java.util.Scanner;

public class KronaKlave {

	public static void main(String[] args) {
		// Users scanner input
		Scanner usersGuess = new Scanner(System.in);
		System.out.println("Select Heads or Tails: ");
		String usersPick = usersGuess.nextLine().toLowerCase();
		
	//	System.out.println(usersPick);
		
		
		// Computers random selector.
		Random randomGenerator = new Random();
		int coinFlipValue = randomGenerator.nextInt(3);
		
		
	//	System.out.println(coinFlipValue);
		
		
		if (coinFlipValue == true) {
			System.out.println("Computer - Heads");
		} else {
			System.out.println("Computer - Tails");
		}
		
		
		if (coinFlipValue == true && usersPick.equals("heads") || coinFlipValue == false && usersPick.equals("tails")) {
			System.out.println("You won!");
		}  else {
			System.out.println("You lost!!!!");
		}
		
		
		
	}
}
