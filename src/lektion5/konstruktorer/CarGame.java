package lektion5.konstruktorer;
/** 
 * 
 * @author samuel.khan
 * main method for the car game
 */
public class CarGame {

	public static void main(String[] args) {
	// creates the object car that we assign the color blue
		Car dankBil = new Car("blue");
	
       // skriver ut och hämtar bilens hastighet.
	System.out.println(dankBil.getSpeed());
	//sätter bilens hastighet
    dankBil.setSpeed(200);
	// skriver ut och hämtar bilens hastighet igen
    System.out.println(dankBil.getSpeed());	
		
    
	}

}
