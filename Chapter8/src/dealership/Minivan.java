/*

Program: Minivan.java          Last Date of this Revision: April 5, 2022

Purpose: An application for the Minivan object

Author: Carter Sarney
School: CHHS
Course: Computer Programming 30
 

*/


package dealership;

public  class Minivan extends Vehicle {

	/*
	 Allows the extension of Vehicle
	 */
	public Minivan(int fECity, int fEHwy, int seating, double cargo) {
		super(fECity, fEHwy, seating, cargo);
		
	}
	
	
	/*
	 String to return the volume of the cargo
	 */
	String cargoContainer() {
		return("\nCargo Volume of the minivan is: "+ super.getCargoVolume() + " Cubic Feet");
		
	}
	
	/*
 	String to return the vehicle description
	 */
	String description() {
		return("Minivan have lots of seats in their vehicle \n"
				+ "Minivans also have decent fuel effiency due to their size and power \n"
				+ "These minivans have large storage space due to their large cargo space \n");
		
	}
	
	/*
	 String to return the fuel effiency on the highway
	 */
	String FuelEHwy() {
	 	return("The fuel effiency on the highway is " + super.getFEHwy() + " kilometers per litre \n");
	 }




	/*
	 String to return the fuel effiency on city roads
	 */
	 String FuelECity() {
	 	return("The fuel effiency in the city is " + super.getFECity() + " kilometers per litre \n");
	 }


	 /*
	 String to return the seating of the vehicle
	 */
	 String Seating() {
	 	return("The minivan has "+ super.getSeating() + " seats");
	 }

	 
	 /*
	  String to return the fuel effiency for both the city and highway, seating, cargocontainer, and the description
	  */
	 public String toString() 
		{
			return(FuelECity() + FuelEHwy() + Seating() + cargoContainer() + description());

		}
}
