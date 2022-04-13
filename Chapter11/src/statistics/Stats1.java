/*

Program: Stats1.java          Last Date of this Revision: April 13, 2022

Purpose: Create a stats application that reads names and scores from a data file named test1.dat, supplied with this text. The file contains a students name on one line followed by the student's
test score on the next line. The Stats application should read and display each name and score. After all the scores have been displayed, the lowest score, highest score, and average score should be displayed.

Author: Carter Sarney
School: CHHS
Course: Computer Programming 30
 

*/

package statistics;

import java.util.*;
import java.io.*;
import java.text.NumberFormat;

public class Stats1 {

	public static void main(String[] args) {
		
		File answers;
		FileReader in;
		BufferedReader readFile;
		String score;
		double avgScore;
		String line;
		double totalScores = 0;
		int numScores = 0;
		double low = 100;
		double high = 0;
		double skill = 0;

		
		ArrayList<String> stuName = new ArrayList<String>();
		ArrayList<String> stuGrades = new ArrayList<String>();
		
		answers = new File("../Chapter11/src/statistics/test1.txt");
		
		
		try {
			in = new FileReader(answers);
			readFile = new BufferedReader(in);

			while((line = readFile.readLine()) != null) {
				
				stuName.add(line);
				System.out.println(line);
				
				
				line = readFile.readLine();
				System.out.println(line);
				stuGrades.add(line);
				
				skill = Double.parseDouble(line);
				totalScores += Double.parseDouble(line);
				
				numScores += 1;
				
				
				if(skill > high) {
					high = skill;
				}
				if(skill < low) {
					low = skill;
				}
			}
			avgScore = totalScores / numScores;
			System.out.println("Lowest grade = " + low );
			System.out.println("highest grade = " + high);
			System.out.println("Average = " + avgScore);
			
			readFile.close();
			in.close();
			
			
			
		}catch (FileNotFoundException e) {
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Problem reading file.");
    		System.err.println("IOException: " + e.getMessage());
    	}


		
	}

}

/*  SCREEN DUMP

 
Carter Sarney
96
Ali Akbari
100
Masen Boyce
85
Marcus Vuorinen
78
Eli Baerg
64
Lowest grade = 64.0
highest grade = 100.0
Average = 84.6


*/
