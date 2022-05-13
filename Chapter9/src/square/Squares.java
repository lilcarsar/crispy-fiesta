/*

Program: Squares.java          Last Date of this Revision: May 5, 2022

Purpose: Create a Squares application that stores the square of an element's index in an integer array of 5 elements.

Author: Carter Sarney
School: CHHS
Course: Computer Programming 30
 

*/

package square;

public class Squares {

	public static void main(String[] args) {
		//Creates an array with numbers 0-4
		int[] num = {0,1,2,3,4};
		

		
		int numElements = num.length;
		
		//Creates a for loop that repeats five times since thats how many numbers are in the array
		for( int i = 0; i < num.length; i++) {
			//Multiplies the numbers by themselves
			num[i] = num[i] * num[i];
		}
		//Prints out the square of all the numbers
		System.out.println(num[0] + " " + num[1] + " "+ num[2] + " " + num[3] + " " + num[4]);
	}

}
/*
 Screen dump
 
 
 0 1 4 9 16 

 */
