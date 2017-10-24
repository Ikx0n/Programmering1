package janken;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Users scanner input
		Scanner usersGuess = new Scanner(System.in);
		System.out.println("Select Heads or Tails: ");
		String usersPick = usersGuess.nextLine().toLowerCase();
		
	//	System.out.println(usersPick);
		
		
		// Computers random selector.
		Random randomGenerator = new Random();
		int jankenValue = randomGenerator.nextInt(3);
		
		
	//	System.out.println(coinFlippValue);
		
		
		if (jankenValue == true) {
			System.out.println("Computer - Rock");
		} else {
			System.out.println("Computer - Paper");
		} else {
			System.out.println("Computer - Scissors");
		}
		
		
		if (jankenValue == true && usersPick.equals("Rock") || jankenValue == false && usersPick.equals("tails")) {
			System.out.println("You won!");
		}  else {
			System.out.println("You lost!!!!");
		}
		
		
		
	}
}
