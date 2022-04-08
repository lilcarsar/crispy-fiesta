/*

Program: MyFile2.java          Last Date of this Revision: April 8, 2022

Purpose: Create a MyFile application that creates a file named zzz.txt and then displays a message indicating that the file has been created. The application should 
prompt the the user to either keep or delete the file. If the file is deleted, a message should notify the user when the file has been successfully deleted

Author: Carter Sarney
School: CHHS
Course: Computer Programming 30
 

*/

package theFiles;
import java.util.Scanner;
import java.io.*;

public class MyFile2 {

	public static void main(String[] args) {
		
		File textFile = new File("zzz.txt");
		
		if(textFile.exists()) {
			System.out.println("The file already exists");
		}
		else {

			try{
				textFile.createNewFile();
				System.out.println("New file has been created");
				
				Scanner ask = new Scanner(System.in);
				System.out.println("Would you like to keep or delete your file? 1 for keep, 2 for delete");
				int ans = ask.nextInt();
				
				if(ans ==1) {
					System.out.println("The file was saved");
				}
				if(ans == 2) {
					textFile.delete();
					System.out.println("The file has been deleted");
				}
			}
			catch (FileNotFoundException e) {
				System.out.println("File does not exist or could not be found.");
				System.err.println("FileNotFoundException: " + e.getMessage());
			} catch (IOException e) {
				System.out.println("Problem reading file.");
	    		System.err.println("IOException: " + e.getMessage());
	    	}
				
			}
			
			
		}
	}

/*
 Screen dump
 
The file already exists


New file has been created
Would you like to keep or delete your file? 1 for keep, 2 for delete
2
The file has been deleted

 New file has been created
Would you like to keep or delete your file? 1 for keep, 2 for delete
1
The file was saved

 */

