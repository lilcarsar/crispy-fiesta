/*

Program: Customer.java          Last Date of this Revision: March 31, 2022

Purpose: A program used to ask and store customer information

Author: Carter Sarney 
School: CHHS
Course: Computer Programming 30
 

*/

package accounts;


public class Customer {
	private String firstName, lastName, street, city, state, zip;
		
	
	/**
	 * constructor
	 * pre: none
	 * post: A Customer object has been created. 
	 * Customer data has been initialized with parameters.
	 */
	public Customer(String fName, String lName, String str, String c, String s, String z) {
		firstName = fName;
		lastName = lName;
		street = str;
		city = c;
		state = s;
		zip = z;
	}
	

	/**
	 * Returns a String that represents the Customer object.
	 * pre: none
	 * post: A string representing the Account object has 
	 * been returned.
	 */
	 public String toString() {
		String custString;
	
		custString = firstName + " " + lastName + "\n";
		custString += street + "\n";
		custString += city + ", " + state + "  " + zip + "\n";
	 	return(custString);
	}
}