package janken;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Users scanner input
		
		Scanner usersScanner = new Scanner(System.in);
		System.out.println("Select Rock, Paper and Scissors: ");
		
		String usersPick = usersScanner.nextLine().toLowerCase();
		
	//	System.out.println(usersPick);
		
		
		// Computers random selector.
		Random randomGenerator = new Random();
		int jankenValue = randomGenerator.nextInt(3);
		
		
	//	System.out.println(coinFlippValue);
		
		
		if (jankenValue == 0) {
			System.out.println("Computer - Rock");
		} else if (jankenValue == 1) {
			System.out.println("Computer - Paper");
		} else {
			System.out.println("Computer - Scissors");
		}
		
		
		if (jankenValue == 0 && usersPick.equals("paper") || 
			jankenValue == 1 && usersPick.equals("scissors") || 
			jankenValue == 2 && usersPick.equals("rock")) {
			System.out.println("You won!");
		}  else if (jankenValue == 0 && usersPick.equals("rock") || 
				    jankenValue == 1 && usersPick.equals("paper") || 
				    jankenValue == 2 && usersPick.equals("scissor")) {
			System.out.println("Draw.");
		} else {
			System.out.println("You lost!!!!");
		}
		
		
		
	}
}
