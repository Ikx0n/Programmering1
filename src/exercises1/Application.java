package exercises1;

public class Application {

	public static void main(String[] args) {
		// skriver Dankus Memus som en introduktion till n�sta del
		System.out.println("Dankus Memus");

		// S�tter namnet p� person till Samme. �r egentligen John Doe i classen.
		Person myPerson = new Person("Samme");
		// S�ger "my name is" sedan s� h�mtar den namnen ovan och l�gger till det.
		System.out.println("my name is " + myPerson.getName());
	}

}
