/*

Program: FindAndReplace.java          Last Date of this Revision: May 3, 2022

Purpose: Create a FindAndReplace application that prompts the user for a file name, a search word or phrase, FindAndReplace finds all occurrences
of the search word or phrase in a file and replaces them with the specified replacement word or phrase

Author: Carter Sarney
School: CHHS
Course: Computer Programming 30
 

*/

package replaceAndFind;

import java.io.*;
import java.util.*;

public class FindAndReplace {

	public static void main(String[] args) {
		
		/*
		 Imports all needed variables
		 */
		String old = " ";
		String new1 = " ";
		String fileName; 
		String find;
		String replace;
		FileWriter out;
		BufferedReader reader;
        BufferedWriter writer = null;
		
        //Imports a scanner
		Scanner input = new Scanner(System.in);
		
		//Prompts user for test file name and stores it as a file
		System.out.print("Enter the name of the test file: ");
		fileName = input.nextLine();
		File name = new File(fileName);
		
		//Prompts user for a phrase to change and stores it 
		System.out.println("What phrase or search word are you looking for? ");
		find = input.nextLine();
		
		
		//Prompts user for a phrase or word to replace the previously asked word with and stores it
		System.out.println("What replacement search word or phrase do you want to replace " + find+ " with? ");
		replace = input.nextLine();
		
		
		
		
		
		try {

			//Replaces all verisons of find with replace
			String system = old.replaceAll(find, replace);
			
			//Allows file to be written on
			writer = new BufferedWriter(new FileWriter(name));
			
			//Writes to file
			writer.write(new1);
			
			//Tells the user the data was written to the file
			System.out.println("Data written to file");
			
			//Stops writing
			writer.close();
			
		}
		
		catch (IOException e) {
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
		}
		
		
	}

}

/* Screen dump
 Enter the name of the test file: ali
What phrase or search word are you looking for? 
ali sucks
What replacement search word or phrase do you want? 
ali is the best
Data written to file

 */ 
