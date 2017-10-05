package oopemployee;

public class MainEmploye {
	public static void main(String[] args) {
		Employee newGuy = new Employee("Nisse", "Larson","1337", 778);
		
		System.out.println("Employee ID: " + newGuy.getID() + "\nFirst name: " + newGuy.getName() + "\nLast name: " + newGuy.getLastName());
		
		newGuy.setSalary(25000);
		System.out.println("\nAnnual Salary; " + newGuy.getAnnualSalary());
	}
}
