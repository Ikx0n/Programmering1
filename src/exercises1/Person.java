package exercises1;

public class Person {
	// s�tter namnet p� person
	private String name = "John";
    private String lastName = "Doe";
	// g�r person public
// G�r s� att namn och efternamn �r public och h�mtar namnet ifr�n application f�r att sedan byta ut John Doe till Samme Khan
	public Person(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}

	public String getName() {
		return this.name;
	}

    public String getlastName() {
		
		return this.lastName;
}
}