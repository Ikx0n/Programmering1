package lanaria;

import javax.swing.JOptionPane;

// String[] * = new String[] { "", "" };
// 	int response* = JOptionPane.showOptionDialog(null,"", null, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,* ,* );
// if (response* == 0) {
public class main {
	
	
private static String name;
	
	public static void main(String[] args) {
		printBoard();
	}

	private static void printBoard() {

		JOptionPane.showMessageDialog(null, "Lanaria", "Board", -1);
		name = JOptionPane.showInputDialog("Reveal your name hero! :");
		JOptionPane.showMessageDialog(null, "You shall henceforth be referred to as " + name);
		JOptionPane.showInputDialog("What do you fight for? ", "I fight for honor.");

		JOptionPane.showInputDialog("Now you must hurry and save Lanaria from the evil curse!",
				"I shall do so my king.");
		String[] path = new String[] { "Left", "Right" };
		int response = JOptionPane.showOptionDialog(null,
				"As you walk from the castle into the woods, the road splits into two. Which one do you pick? ", null,
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, path, path);
		if (response == 0) {
			LeftPath();
		} else if (response == 1) {
			RightPath();
		}

	}

	private static void RightPath() {
		JOptionPane.showMessageDialog(null, "As you walk up the path it leads to the base of a mountain");
		String[] Cold = new String[] { "Press on", "Turn Back" };
		int response2 = JOptionPane.showOptionDialog(null,
				"You traverse up halfway until you start freezing. Do you press on or turn back?", null,
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, Cold, Cold);

		if (response2 == 0) {
			PressOn();
		} else if (response2 == 1) {
			TurnBack();
		}
	}

	private static void LeftPath() {
		String[] Combat = new String[] { "Attack", "Defend", "Run" };
		JOptionPane.showMessageDialog(null,
				"As you walk down the the path a small green goblin attacks, what do you do?");
		int Combat1 = JOptionPane.showOptionDialog(null, "", null, JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, Combat, Combat);
		if (Combat1 == 0) {

		} else if (Combat1 == 1) {

		} else if (Combat1 == 2)

			;

	}

	private static void PressOn() {
		JOptionPane.showMessageDialog(null,
				"The blistering cold gnaws at you but you press on, only to find yourself tripping on some ice and cutting your leg open on a sharp glacier");
		JOptionPane.showMessageDialog(null, "* You have started bleeding!");
		String[] coldp2 = new String[] { "Continue", "Find Shelter" };
		int cold2 = JOptionPane.showOptionDialog(null, "You are feeling nauseous do you continue or find shelter?",
				null, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, coldp2, coldp2);

		if (cold2 == 0) {
			cold2Continue();
		} else if (cold2 == 1) {
			cold2Shelter();
		}

	}

	private static void cold2Continue() {
		JOptionPane.showMessageDialog(null,
				"You press on with your leg and collapse just as you see the outskirts of a small village");
		JOptionPane.showMessageDialog(null, "You wake in a bed, a small girl sitting on a small chair beside");
		JOptionPane.showMessageDialog(null, "MOOOOM HES AWAKE");
		JOptionPane.showMessageDialog(null, "*The door to the room opens and a beautiful woman walks in*");
		JOptionPane.showMessageDialog(null,
				"So you finally wake up, i was afraid you were too far gone, you had lost alot of blood and had frostbite on your leg.");
		JOptionPane.showMessageDialog(null, "Im Charzi, my son Cain here found you in the snow.");
		JOptionPane.showMessageDialog(null, "*You look down only to see a stump where your leg used to be*");
		JOptionPane.showMessageDialog(null,
				"*The woman sees the terror in your eyes so she puts a hand on your chest*");
		String[] rest = new String[] { "Rest", "Leave" };
		int rest1 = JOptionPane.showOptionDialog(null,
				"Dont move, you need to rest. We have a prosthetic technician in our village, he will fix you right up. Ofcourse you are free to go if thats what you wish, there are crutches over there if you do.",
				null, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, rest, rest);
		if (rest1 == 0) {
			RestContinue();
		} else if (rest1 == 1) {
			Village();
		}
	}

	private static void cold2Shelter() {
		JOptionPane.showMessageDialog(null,
				"You find a cave where you settle. You tear a piece of your shirt off to make a makeshift bandage for your leg. ");
		JOptionPane.showMessageDialog(null,
				"You look around to see that someone has been here recently as there is a fire pit still glowing deep inside the cave. ");

	}

	private static void TurnBack() {
		JOptionPane.showMessageDialog(null, "The cold proved too much for you so you turn back");
	}

	private static void RestContinue() {
	}

	private static void Village() {
		String[] Villagechoice = new String[] { "Prosthetics", "Inn", "Charzi", "Wishing Well" };
		int VillageC = JOptionPane.showOptionDialog(null,"Where do you wish to go?", null, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,Villagechoice ,Villagechoice );
		
		if (VillageC == 0) {
		ProstheticsGuy();
		} else if (VillageC == 1) {
		InnLobby();
		} else if (VillageC == 2) {
			CharziHouse();
		} else if (VillageC == 3) {
			WishingWell1();
		}
	}
		

	private static void ProstheticsGuy() {
	}

	private static void InnLobby() {

	}

	private static void CharziHouse() {
		String[] Charzidialog1 = new String[] {  name, "Id rather not say" };
		int CharziHouse1 = JOptionPane.showOptionDialog(null,"By the way i didnt catch your name!", null, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,Charzidialog1 ,Charzidialog1 );
	}

	private static void WishingWell1() {

	}
}
