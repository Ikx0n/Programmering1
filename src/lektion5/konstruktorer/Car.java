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
	 * Konstruktor f�r Bil classen 
	 * S�tter f�rgen p� bilen vid skapandet
	 */

	public Car(String selectedColor) {
		color = selectedColor;
	}
	/*
	 * 
	 * s�tter hastigheter f�r bilen
	 */
	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}
  // h�mtar bilens hastighet 
	public int getSpeed() {
		return speed;	 
		
	// V�rdet som s�tter f�rgen p�  bilen
	
	}
	public void setColor(String newColor) {
		color = newColor;
	}
	public String getColor() {
		return color;

	}
}