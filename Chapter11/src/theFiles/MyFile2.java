/*

Program: MyFile2.java          Last Date of this Revision: April 7, 2022

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

				textFile.createNewFile();
				System.out.println("New file has been created");
		
			
		}
	}

}
