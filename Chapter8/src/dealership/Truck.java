/*

Program: Truck.java          Last Date of this Revision: April 5, 2022

Purpose:  An application for the Truck object

Author: Carter Sarney
School: CHHS
Course: Computer Programming 30
 

*/


package dealership;

public  class Truck extends Vehicle{

	
	/*
	 Allows the extension of Vehicle
	 */
	public Truck(int fECity, int fEHwy, int seating, double cargo) {
		super(fECity, fEHwy, seating, cargo);
		
	}

	
	/*
	 String to return the volume of the cargo
	 */
	String cargoContainer() {
		return("\nCargo Volume of the truck is: "+ super.getCargoVolume() + " Cubic Feet");
		
	}
	

	/*
 	String to return the vehicle description
	 */
	String description() {
		return("Trucks tend to be better at offroading \n"
				+ "Trucks also have bad fuel effiency due to their size and power \n"
				+ "These trucks have large storage space due to their large cargo space \n");
		
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
	 	return("The truck has "+ super.getSeating() + " seats");
	 }

	 /*
	  String to return the fuel effiency for both the city and highway, seating, cargocontainer, and the description
	  */
	 public String toString() 
		{
			return(FuelECity() + FuelEHwy() + Seating() + cargoContainer() + description());

		}

}