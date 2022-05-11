/*

Program: HighestGrade.java          Last Date of this Revision: May 11, 2022

Purpose: Create a HighestGrade application that prompts the user for five grades between 0 and 100 points and stores the grades in an ArrayList.
HighestGrade then traverses the grades to determine the highest grade and then displays the grade along with an appropriate message

Author: Carter Sarney
School: CHHS
Course: Computer Programming 30
 

*/

package topGrades;


import java.util.*;
import java.io.*;
import java.text.NumberFormat;



public class HighestGrade {

	public static void main(String[] args) {
		
		//Allows finally answer to be presented in a percent
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		//imports a scanner
		Scanner input = new Scanner(System.in);

		//Creates a double called high and it is assigned the value zero
		double high = 0;

		//Creates an array with five integers
		int[] grades = new int[5];
		
		
		//Makes a for loop that repeats five times for the five grades
		for(int i = 0; i < 5; i++) {
				
			//Use inputs grade then it is stored
			System.out.println("Enter grade: ");
			grades[i] = input.nextInt();
		
		//If the grades are greater than high high is assigned to grades
		if(grades[i] > high) {
			high = grades[i];
		}
		}
		//Prints the highest grade in a percent format
		System.out.println("The highest grade is " + percent.format(high/100));
	}

}
/* Screen Dump
Enter grade: 
96
Enter grade: 
56
Enter grade: 
19
Enter grade: 
75
Enter grade: 
84
The highest grade is 96%
 */
