package exercises1;

public class Person {
	// sätter namnet på person
	private String name = "John";
    private String lastName = "Doe";
	// gör person public
// Gör så att namn och efternamn är public och hämtar namnet ifrån application för att sedan byta ut John Doe till Samme Khan
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