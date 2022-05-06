/*

Program: Stats1.java          Last Date of this Revision: April 27, 2022

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
		
		
		/*
		 Creates all file related variables allowing them to be used
		 */
		File dataFile = new File("stuScore.txt");
		FileWriter out;
		FileReader in;
		BufferedWriter writeFile;
		BufferedReader readFile;
		
		/*
		 Creates all the strings, integers, and doubles
		 */
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
		int stuNum;
		
		/*
		 Creates two arraylists one for student names and the other for student grades
		 */
		ArrayList<String> stuName = new ArrayList<String>();
		ArrayList<String> stuGrades = new ArrayList<String>();
		
		
		
		/*
		 Prompts user for the amount of students they have and then it is stored
		 */
		System.out.println("How many students do you have? ");
		stuNum = input.nextInt();
		
		
		
		try {
			
			/*
			 Allows file to be written
			 */
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);
			
			
			for(int i = 0; i < stuNum; i++) {
				
				/*
				 Prompts user for the student name and saves it to the file and for the grade and saves it to the file
				 */
				System.out.println("enter students name: ");
				name = input.next();		
				writeFile.write(name);
				writeFile.newLine();
				System.out.println("Enter test score");
				score = input.nextDouble();
				writeFile.write(String.valueOf(score));
				writeFile.newLine();
			}
			//Stops writing the file
			writeFile.close();
			out.close();
			
			//Allows file to be read
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			
			/*
			 While the line has text on it, it adds the first line to the student name array and the second line to the second array and it's stores in "line"
			 */
			while((line = readFile.readLine()) != null) {
				
				stuName.add(line);
				System.out.println(line);
				line = readFile.readLine();
				System.out.println(line);
				stuGrades.add(line);
				
				
				
				/*
				 the students grade is stored in skill
				 */
				skill = Double.parseDouble(line);
				totalScores += Double.parseDouble(line);
				numScores += 1;
				
				
				/*
				 When the skill is greater than high, high is assigned to skill
				 */
				if(skill > high) {
					high = skill;
				}
				
				/*
				 When the skill is less than low, low is assigned to skill
				 */
				if(skill < low) {
					low = skill;
				}
			}
			//Averages the scores by taking all the scores together and divides the total points by the total number of tests multiplied by 100
			avgScore = totalScores / numScores;
			
			/*
			 Prints the lowest, highest, and the average grades of the class
			 */
			System.out.println("Lowest grade = " + low );
			System.out.println("highest grade = " + high);
			System.out.println("Average grade = " + avgScore);
			
			//Stops reading the file
			readFile.close(); 		
			in.close();
			
			System.out.println("Data written to file.");
			
			
			
			/*
			 Allows errors to be in the code and gives you error messages
			 */
		}catch (IOException e) {
			System.out.println("Problem writing to file. ");
			System.err.println("IOException: " + e.getMessage());
		}
	}

}
/*
 Screen dump
 
 
How many students do you have? 
4
enter students name: 
carter
Enter test score
96
enter students name: 
ali
Enter test score
100
enter students name: 
masen
Enter test score
87
enter students name: 
marcus
Enter test score
54
carter
96.0
ali
100.0
masen
87.0
marcus
54.0
Lowest grade = 54.0
highest grade = 100.0
Average = 84.25
Data written to file.
 */
