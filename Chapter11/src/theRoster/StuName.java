/*

Program: StuName.java          Last Date of this Revision: April 26, 2022

Purpose: Extended part of the roster application, it shows the code that prints the student list in the end

Author: Carter Sarney
School: CHHS
Course: Computer Programming 30
 

*/

package theRoster;

import java.io.*;

public class StuName implements Serializable{
	
	private String first, last; //Creates 2 private Strings called first and last

	/*
	 Public class that creates 2 more Strings called f and l and f is assigned to first and l is assigned to last
	 */
	public StuName(String f, String l) {
		first = f;
		last = l;
	}
	
	//Creates a return toString that allows the work in this project to be in the Roster application
	public String toString() {
		return("Student name: " + first + " " + last);
	}
}
