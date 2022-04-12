/*

Program: Stats1.java          Last Date of this Revision: April 12, 2022

Purpose: Create a stats application that reads names and scores from a data file named test1.dat, supplied with this text. The file contains a students name on one line followed by the student's
test score on the next line. The Stats application should read and display each name and score. After all the scores have been displayed, the lowest score, highest score, and average score should be displayed.

Author: Carter Sarney
School: CHHS
Course: Computer Programming 30
 

*/

package statistics;

import java.util.Scanner;
import java.io.*;
import java.text.NumberFormat;

public class Stats1 {

	public static void main(String[] args) {
		
		File answers;
		Scanner input = new Scanner(System.in);
		FileReader in;
		BufferedReader readFile;
		NumberFormat percent = NumberFormat.getPercentInstance();
		String score;
		double avgScore;
		String masterAnswers,stuAnswers, stuName;
		int numCorrect;
		double totalScores = 0;
		double percentCorrect;
		int numScores = 0;
		
		answers = new File("../Chapter11/src/statistics/test1.txt");
		try {
			in = new FileReader(answers);
			readFile = new BufferedReader(in);
			masterAnswers = (String)readFile.readLine();
    		while ((stuName = readFile.readLine()) != null) {
    			stuAnswers = readFile.readLine();
    			numCorrect = 0;
    			for (int grade = 0; grade < masterAnswers.length(); grade++) {
    				if (stuAnswers.charAt(grade) == masterAnswers.charAt(grade)) {
    					numCorrect += 1;
    				}
    			}
    			percentCorrect = (double)numCorrect/masterAnswers.length();
    			System.out.println(stuName + "\t" + percent.format(percentCorrect));
			}
			readFile.close();
    		in.close();
    	} catch (FileNotFoundException e) {
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Problem reading file.");
    		System.err.println("IOException: " + e.getMessage());
    	}
	
		/*
		
		try {
			in = new FileReader(answers);
			readFile = new BufferedReader(in);
			masterAnswers = (String)readFile.readLine();
			while((score = readFile.readLine()) != null) {
				numScores += 1;
				System.out.println(score);
				totalScores += Double.parseDouble(score);
				
			}
			avgScore = totalScores / numScores;
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

*/
		
	}

}
