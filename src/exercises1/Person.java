package exercises1;

public class Person {
	// sätter namnet på person
	private String name = "John Doe";

	// gör person public
	public Person() {

	}

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

}
