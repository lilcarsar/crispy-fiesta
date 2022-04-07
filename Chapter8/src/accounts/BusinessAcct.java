/*

Program: BusinessAcct.java          Last Date of this Revision: March 31, 2022

Purpose: An extension of account for use of the program.

Author: Carter Sarney 
School: CHHS
Course: Computer Programming 30
 

*/

package accounts; //Declares the package that BusinessAcct is in

public class BusinessAcct extends Account {//area for code with PersonalAcct which also calls on code from Account

	public BusinessAcct(double bal, String fName, String lName, String str, String city, String st, String zip, String businessname) {//Constructor method to allow the extension as well as an additional string for the business name
		super(bal, fName, lName, str, city, st, zip); //Allows the variables to join BusinessAcct
		
	}

	

}
