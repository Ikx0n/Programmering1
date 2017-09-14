package lektion5.konstruktorer;
/**
 * En bil som vi kodar i PRRPRR1
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
	/**
	 * 
	 * @param sätter hastigheter för bilen
	 */
	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}

	public int getSpeed() {
		return speed;	 
		/** 
		 * väljer färg
		 */
	}
	public void setColor(String newColor) {
		color = newColor;
	}
	public String getColor() {
		return color;

	}
}