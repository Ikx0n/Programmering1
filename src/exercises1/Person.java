package exercises1;

public class Person {
	// s�tter namnet p� person
	private String name = "John Doe";

	// g�r person public
	public Person() {

	}

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

}
