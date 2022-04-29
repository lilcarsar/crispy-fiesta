/*

Program: FindAndReplace.java          Last Date of this Revision: April 28, 2022

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
		
		
		String fileName; 
		String find;
		String replace;

		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter the name of the test file: ");
		fileName = input.nextLine();
		File name = new File(fileName);
		
		System.out.println("What phrase or search word are you looking for? ");
		find = input.nextLine();
		
		System.out.println("What replacement search word or phrase do you want? ");
		replace = input.nextLine();
		
		
		/*
		try {
			
			
		}catch (FileNotFoundException e) {
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
		}
		*/
		
	}

}
