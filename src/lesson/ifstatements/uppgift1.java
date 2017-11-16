package lesson.ifstatements;

import java.util.Scanner;

public class uppgift1 {

	public static void main(String[] args) {
	Scanner userScanner = new Scanner(System.in);

	System.out.println("Input a number: ");
	
	int userNumber = userScanner.nextInt();
	
	if (userNumber > 8 && userNumber < 10 || userNumber > 33) {
		
		System.out.println("Noice.");
	} else {
		System.out.println("You suck.");
	}

}
}
