/*

Program: MyFile.java          Last Date of this Revision: April 7, 2022

Purpose: Create a MyFile application that prompts the user for the name of a file 
and then displays a message that indicates whether the file exists or not

Author: Carter Sarney
School: CHHS
Course: Computer Programming 30
 

*/

package theFiles; //Defines the package
import java.util.Scanner; //Allows scanner
import java.io.*; //Imports io
public class MyFile {

	public static void main(String[] args) {
		
		Scanner file = new Scanner(System.in); //Creates a scanner
		System.out.println("What is the name of your file? "); //Prompts user for the file name
		String ans = file.nextLine(); //Stores users input as a nextLine()
		
		File textFile = new File(ans); //Creates a file called textFile which is a new file that is the users input
		
		if (textFile.exists()) { //If the textFile exists then it will do the below
			System.out.println("The file already exists"); //Prints to the user "the file already exists"
		}
		else {
			System.out.println("The file does not exist"); //Prints to the user "The file already exists"
		}
	}

}


/*
 Screen dump
 
 
What is the name of your file? 
../Chapter11/src/testdoc.txt
The file already exists

 
What is the name of your file? 
ali.txt
The file does not exist

 */
