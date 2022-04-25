package theRoster;


import java.io.*;
import java.util.Scanner;

public class Roster {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
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
		
		for(int i = 0, i < numb, i++) {
			System.out.println("What is the student's first name? ");
			first = input.next();
			
			System.out.println("What is the student's last name? ");
			last = input.next();
			
			writeFile.writeObject(new StuName(first, last));
		}
		
	}

}
