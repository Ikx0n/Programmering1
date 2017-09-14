package lektion5.konstruktorer;
/**
 * Bil utseende
 */
public class Car {
	private int numberOfDoors = 5;
	private int numberOfWheels = 4;
	private String color = "blue";
	private int antaletRattar = 2;
	private String carBrand = "Tesla";
	private int speed = 0;

	/**
	 * Konstruktor för Bil classen 
	 * Sätter färgen på bilen vid skapandet
	 */

	public Car(String selectedColor) {
		color = selectedColor;
	}

	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setColor(String newColor) {
		color = newColor;
	}

	public String getColor() {
		return color;

	}
}