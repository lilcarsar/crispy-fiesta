/*

Program: Purchasing.java          Last Date of this Revision: April 5, 2022

Purpose: A client code to run the code from Car, Minivan, Truck, and Vehicle

Author: Carter Sarney
School: CHHS
Course: Computer Programming 30
 

*/

package dealership;
import java.util.Scanner;

public class Purchasing {

	public static void main(String[] args) {
		
		
		int ans; //Creates an int called ans
		
		/*
		 Creates a Scanner to ask what vehicle they would like to check
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("What would you like to check? 1 for car, 2 for minivan, 3 for truck: ");
		ans = input.nextInt();
		
		
		
		//if statement for when certain criteria is reached it will run the if statement
		if (ans == 1) {
			
			Car zoom = new Car (23, 21, 5, 15.1); //Creates an object with the fuel effiency for highway and city roads, seating, and cargo space
			
			System.out.println(zoom.toString()); //Prints a toString for the car
		}
		
		
		//if statement for when certain criteria is reached it will run the if statement
		if (ans == 2) {
			
			Minivan zroom = new Minivan (19, 16, 5, 30.7); //Creates an object with the fuel effiency for highway and city roads, seating, and cargo space
			
			System.out.println(zroom.toString()); //Prints a toString for the minivan
		}
		
		
		//if statement for when certain criteria is reached it will run the if statement
		if (ans == 3) {
			Truck broom = new Truck ( 18, 14, 5, 33.3); //Creates an object with the fuel effiency for highway and city roads, seating, and cargo space
			
			System.out.println(broom.toString()); //Prints a toString for the truck
		}


		
		}
	

}

/*  Screen Dump
What would you like to check? 1 for car, 2 for minivan, 3 for truck, 4 to quit: 
1
The fuel effiency in the city is 23 kilometers per litre 
The fuel effiency on the highway is 21 kilometers per litre 
The car has 5 seats
Cargo Volume of the car is: 15.1 Cubic Feetcars have fewer seats in their vehicle, max usually being 5 seats 
Cars also have good fuel effiency due to their size and power 
These cars have little to no storage space due to their cargo size 



What would you like to check? 1 for car, 2 for minivan, 3 for truck: 
2
The fuel effiency in the city is 19 kilometers per litre 
The fuel effiency on the highway is 16 kilometers per litre 
The minivan has 5 seats
Cargo Volume of the minivan is: 30.7 Cubic FeetMinivan have lots of seats in their vehicle 
Minivans also have decent fuel effiency due to their size and power 
These minivans have large storage space due to their large cargo space 




What would you like to check? 1 for car, 2 for minivan, 3 for truck: 
3
The fuel effiency in the city is 18 kilometers per litre 
The fuel effiency on the highway is 14 kilometers per litre 
The truck has 5 seats
Cargo Volume of the truck is: 33.3 Cubic FeetTrucks tend to be better at offroading 
Trucks also have bad fuel effiency due to their size and power 
These trucks have large storage space due to their large cargo space 



 */
