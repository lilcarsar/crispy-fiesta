/*

Program: FindName.java          Last Date of this Revision: May 5, 2022

Purpose: Create a FindName application that uses the Search class. FindName should prompt the user for names to fill an array and then prompt the user for the name to find.

Author: Carter Sarney
School: CHHS
Course: Computer Programming 30
 

*/


package nameFinder;
import java.io.*;
import java.util.Scanner;


public class FindName {

	public static void main(String[] args) {
		
		
		//Creates variables 
		int numb;
		int place;
		String look;
		
		//Imports a scanner then prompts user for number of names in the array and then stores the answer
		Scanner input = new Scanner(System.in);
		System.out.println("How many names for the array? ");
		numb = input.nextInt();
		
		//Creates a String array which puts the stored number above into a String
		String[] nameNums = new String[numb];
		
		
		//Creates a for loop, which prompts the user for a name then stores it as many times as there is number of names
		for(int i = 0; i < numb; i++) {
			System.out.println("Please enter a name for the array: ");
			nameNums[i] = input.next();
		}
		
			//Asks user for the name that they are looking for in the array
			System.out.println("Please enter the name to look for: ");
			look = input.next();
		
			//Uses the linear method from Search and looks at both nameNums and look to try and find matching words
			place = Search.linear(nameNums, look);
			
			//If the place is equal to -1 the name isn't in the array but if its equal to anything else it tells you where in the console it is.
			if(place == -1){
				System.out.println("Sorry name not found in array.");
			}
			else {
				System.out.println("First occurance is element " + place);
			} 
	}

}
/*Screen dump
How many names for the array? 
4
Please enter a name for the array: 
ali
Please enter a name for the array: 
carter
Please enter a name for the array: 
masen
Please enter a name for the array: 
marcus
Please enter the name to look for: 
ali
First occurance is element 0


How many names for the array? 
4
Please enter a name for the array: 
ali
Please enter a name for the array: 
carter
Please enter a name for the array: 
masen
Please enter a name for the array: 
marcus
Please enter the name to look for: 
masen
First occurance is element 2

*/