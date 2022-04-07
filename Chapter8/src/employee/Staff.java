/*

Program: ????.java          Last Date of this Revision: April 6, 2022

Purpose: An application for the staff of the university

Author: Carter Sarney
School: CHHS
Course: Computer Programming 30
 

*/

package employee;

public class Staff extends UEmployee {
	
	private String employee; //Creates a private variable called employee
	
	
	/*
	 Allows the extension of UEmployee
	 */
	public Staff(String fn, String ln, double sal, String k) {
		super(fn, ln, sal);
		employee = k;

	}

	/*
	 Creates a method to store and return the job title
	 */
	String theJobTitle() {
		return(employee);
	}
	
	/*
	 Creates a toString to show this part of the code that can be referenced through the UEmployee class
	 */
	public String toString()
	{
		return(super.toString() + ", You are a Staff member \njob title: " + theJobTitle());
	}

}
