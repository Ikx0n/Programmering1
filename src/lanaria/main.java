package lanaria;

import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args) {
		printBoard();
	}

	private static void printBoard() {
		JOptionPane.showMessageDialog(null, "Lanaria", "Board", -1);
		String name = JOptionPane.showInputDialog("Reveal your name hero! :");
		JOptionPane.showMessageDialog(null, "You shall henceforth be referred to as " + name);
		JOptionPane.showInputDialog("What do you fight for? ", "I fight for honor.");

		JOptionPane.showInputDialog("Now you must hurry and save Lanaria from the evil curse!",
				"I shall do so my king.");
		JOptionPane.showMessageDialog(null, "As you walk from the castle into the woods, the road splits into two. Which one do you pick? ");
		String path = JOptionPane.showInputDialog("Left *0* or Right *1*? :");
		if (path == "true") 
			JOptionPane.showMessageDialog(null, "As you walk down the the path a small green goblin attacks, what do you do?");
		String Combat1 = JOptionPane.showInputDialog("*Attack*(0) *Defend*(1)  :");
	if (path == "right")
		JOptionPane.showMessageDialog(null, "As you walk up the path it leads to the base of a mountain");
		String cold = JOptionPane.showInputDialog ("You traverse up halfway until you start freezing. Do you press on or turn back?");
		if (cold == "press on");
		
	}
	
}
