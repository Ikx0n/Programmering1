package oopemployee;

public class Employee {
	private String name = "John";
	private String lastName = "Doe";
	private String ID = "123";
	private int salary = 0;

	public Employee(String name, String lastName, String ID, int salary) {
		this.name = name;
		this.lastName = lastName;
		this.ID = ID;
		this.salary = salary;
	}

	public String getName() {
		return this.name;
	}
	public String getID() {
		return this.ID;
	}


	public String getLastName() {

		return this.lastName;
	}

	public int getSalary() {
		return this.salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAnnualSalary() {
		return this.salary * 12;
	}
}