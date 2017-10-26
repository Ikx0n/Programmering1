package ifStatements;

import java.util.Random;

public class Ifstatements {

	public static void main(String[] args) {
		Random randomGenerator = new Random();
		int computer = 0;
		int player1 = 0;
		int player2 = 0;

		for (int i = 0; i < 10; i++) {
			int playerPick = randomGenerator.nextInt(13);
			int player2Pick = randomGenerator.nextInt(13);
			int computerPick = randomGenerator.nextInt(13);

			if (playerPick == computerPick && player2Pick == computer) {
				System.out.println("Draw!");
			} else if (playerPick > computerPick && playerPick > player2Pick) {
				System.out.println("Player 1 wins!");
				player1 = player1 + 2;
			} else if (player2Pick > computerPick && player2Pick > playerPick) {
				System.out.println("Player 2 wins!");
				player2 = player2 + 2;
			} else if (computerPick > playerPick && computerPick > player2Pick) {
				System.out.println("Computer wins!");
				computer = computer + 2;
			} else if (computerPick == playerPick && computerPick > player2Pick) {
				computer++;
				player1++;
			} else if (computerPick == player2Pick && computerPick > playerPick) {
				computer++;
				player2++;
			} else if (playerPick == player2Pick && computerPick < playerPick) {
				player1++;
				player2++;
			} else {
				System.out.println("WTF JUST HAPPENED");
			}
			System.out.println();

			System.out.println();
			if (computer > player1 && computer > player2) {
				System.out.println("Computer = " + computer);
				if (player1 > player2) {
					System.out.println("User1 = " + player1);
					System.out.println("User2 = " + player2);		
				} else {
					System.out.println("User2 = " + player2);
					System.out.println("User1 = " + player1);
				}
			} else if (player1 > computer && player1 > player2) {
				System.out.println("User1 = " + player1);
				if(computer > player2) {
					System.out.println("Computer = " + computer);
					System.out.println("User2 = " + player2);		
				} else {
					System.out.println("User2 = " + player2);		
					System.out.println("Computer = " + computer);
				}
			} else if (player2 > computer && player2 > player1) {
				System.out.println("User2 = " + player2);
				if (computer > player1) {
					System.out.println("Computer = " + computer);
					System.out.println("User1 = " + player1);				
				} else {
					System.out.println("User1 = " + player1);
					System.out.println("Computer = " + computer);
				
			
			}
		}
	}
}
