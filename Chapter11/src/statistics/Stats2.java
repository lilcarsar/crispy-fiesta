/*

Program: Stats1.java          Last Date of this Revision: April 13, 2022

Purpose: Modify the Stats application to allow the user to enter the names and grades of the students. The user should be prompted for the name of the file 
to create and for the number of student grades that will be entered. After the data has been entered and the written to a file, the file should be read and 
the lowest, highest, and average score displayed.
Author: Carter Sarney
School: CHHS
Course: Computer Programming 30
 

*/

package statistics;
import java.util.*;
import java.io.*;
import java.text.NumberFormat;


public class Stats2 {

	public static void main(String[] args) {
		
		File dataFile = new File("stuScore.txt");
		FileWriter out;
		FileReader in;
		BufferedWriter writeFile;
		BufferedReader readFile;
		Scanner input = new Scanner(System.in);
		double score;
		String name;
		double avgScore;
		String line;
		double totalScores = 0;
		int numScores = 0;
		double low = 100;
		double high = 0;
		double skill = 0;
		
		
		ArrayList<String> stuName = new ArrayList<String>();
		ArrayList<String> stuGrades = new ArrayList<String>();
		
		try {
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);
			for(int i = 0; i < 5; i++) {
				System.out.println("enter students name: ");
				name = input.next();
				System.out.println("Enter test score");
				score = input.nextDouble();
				writeFile.write(name);
				writeFile.newLine();
				writeFile.write(String.valueOf(score));
				writeFile.newLine();
			}
			
			
			
			
			
while((line = dataFile.readLine()) != null) {
				
				stuName.add(line);
				System.out.println(line);
				
				
				line = dataFile.readLine();
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
			writeFile.close();
			
			System.out.println("Data written to file.");
			
			
			
			
		}catch (IOException e) {
			System.out.println("Problem writing to file. ");
			System.err.println("IOException: " + e.getMessage());
		}
	}

}
