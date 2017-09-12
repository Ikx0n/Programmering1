package lektion4.oop;

public class Car {
      private int numberOfDoors = 5;
      private int numberOfWheels = 4;
      private String color = "blue";
      private int antaletRattar = 2;
      private String carBrand = "Porche";
      private int speed = 0;
      
      
      
      public void setSpeed(int newSpeed) {
           speed = newSpeed;
      }
     public int getSpeed() {
    	 return speed;
     }
}