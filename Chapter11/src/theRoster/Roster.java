/*

Program: Roster.java          Last Date of this Revision: April 26, 2022

Purpose: Create a roster application that prompts the user for the name of a file to store student names and then prompts the user for the number of students in a class.
The application should then prompt the user for the first and last name of each student and write this data to a file. After all the data is written to a file, the application display the class
roster with one name after the other in a list

Author: Carter Sarney
School: CHHS
Course: Computer Programming 30
 

*/

package theRoster;


import java.io.*; 
import java.util.Scanner;

public class Roster {

	public static void main(String[] args) {
		
		//Imports a scanner
		Scanner input = new Scanner(System.in);
		
		//Imports variables
		File Names;
		String fileName; 
		int numb;
		String first;
		String last;
		
		System.out.print("Enter the name of the test file: ");
		fileName = input.nextLine();
		Names = new File(fileName);
		
		System.out.println("How many students do you have? ");
		numb = input.nextInt();
		
		try { 
			FileOutputStream out = new FileOutputStream(fileName);
			ObjectOutputStream StuName = new ObjectOutputStream(out);
		
		for(int i = 0; i < numb; i++) {
			System.out.println("What is the student's first name? ");
			first = input.next();
			
			System.out.println("What is the student's last name? ");
			last = input.next();
			
			StuName.writeObject(new StuName(first, last));
		}
		StuName.close();
		
		
		FileInputStream in = new FileInputStream(fileName);
		ObjectInputStream reading = new ObjectInputStream(in);
		
		for(int i = 0; i < numb; i++) {
			
			System.out.println((StuName)reading.readObject());
		}
		}
		catch (FileNotFoundException e) {
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Problem reading file.");
    		System.err.println("IOException: " + e.getMessage());
    	} catch (ClassNotFoundException e) {
    		System.out.println("Class could not be used to cast object");
    		System.err.println("ClassNotFoundException: " + e.getMessage());
    	}
	}

}
/* Screen dump
 
Enter the name of the test file: student List
How many students do you have? 
4
What is the student's first name? 
Carter
What is the student's last name? 
Sarney
What is the student's first name? 
Ali
What is the student's last name? 
Akbari
What is the student's first name? 
Masen
What is the student's last name? 
Boyce
What is the student's first name? 
Marcus
What is the student's last name? 
Vuorinen
Student name: Carter Sarney
Student name: Ali Akbari
Student name: Masen Boyce
Student name: Marcus Vuorinen
 */
