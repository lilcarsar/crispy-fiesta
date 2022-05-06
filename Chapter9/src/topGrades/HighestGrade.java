package topGrades;


import java.util.*;
import java.io.*;
import java.text.NumberFormat;



public class HighestGrade {

	public static void main(String[] args) {
		
		
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
		
		
		
		for(int i = 0; i < 5; i++) {
			System.out.println("enter students name: ");
			name = input.next();	
			
			System.out.println("Enter test score");
			score = input.nextDouble();
		}

	}

}
