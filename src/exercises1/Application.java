package exercises1;

public class Application {

	public static void main(String[] args) {
		// skriver Dankus Memus som en introduktion till nästa del
		System.out.println("Dankus Memus");

		// Sätter namnet på person till Samme. Är egentligen John Doe i classen.
		Person myPerson = new Person("Samme");
		// Säger "my name is" sedan så hämtar den namnen ovan och lägger till det.
		System.out.println("my name is " + myPerson.getName());
	}

}
