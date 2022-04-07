/*

Program: ????.java          Last Date of this Revision: April 6, 2022

Purpose: An application for the UEmployee of the university
Author: Carter Sarney
School: CHHS
Course: Computer Programming 30
 

*/

package employee;

public abstract class UEmployee {
private String first, last; //Creates 2 variables called first and last

private double Salary; //Creates a variable called Salary


/*
 Creates a constructor method that defines variables
 */
public UEmployee(String fn, String ln, double sal) {
	
	first = fn;
	last = ln;
	Salary = sal;
}

/*
 Creates a toString to be referenced in the client code
 */
public String toString() 
{
	return("Employee name: " + first + " " + last + "\nand your salary is: "+ Salary);
}
	
	
}
