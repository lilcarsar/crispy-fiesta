/*

Program: Faculty.java          Last Date of this Revision: April 6, 2022

Purpose: An application for the faculty of the university

Author: Carter Sarney
School: CHHS
Course: Computer Programming 30
 

*/
//
package employee;
 
public class Faculty extends UEmployee{
	
	
	
	private double Salary; //Creates a private variable called Salary
	private String dep; //Creates a private variable called dep
	
	
	/*
	 Allows the extension of UEmployee
	 */
	public Faculty(String fn, String ln, double sal, String l) {
	super(fn, ln, sal);
	dep = l;
	
	}

	/*
	 Creates a method for storing the department name
	 */
	public String depart()
	{
		
		return dep;
		
	}
	
	/*
	 Creates a toString to show this part of the code when running the program
	 */
	public String toString()
	{
		
	return(super.toString()+ ", Faculty member \nDepartment: " + depart());
	
	}



	

}
