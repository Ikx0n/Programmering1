package lektion6;

public class Application {

	public static void main(String[] args) {
		System.out.println("What up bitch");
		// vi har skapat ett object av klassen Person
		Person sammePerson = new Person("Samme");
        sammePerson.writeName();
       
        sammePerson.setName("Samuel");
        sammePerson.writeName();
        
	}

}
