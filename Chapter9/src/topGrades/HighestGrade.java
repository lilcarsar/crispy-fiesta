package topGrades;


import java.util.*;
import java.io.*;
import java.text.NumberFormat;



public class HighestGrade {

	public static void main(String[] args) {
		
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		Scanner input = new Scanner(System.in);

		double high = 0;

		int[] grades = new int[5];
		
		
		
		for(int i = 0; i < 5; i++) {
				
			
			System.out.println("Enter grade: ");
			grades[i] = input.nextInt();
		
		
		if(grades[i] > high) {
			high = grades[i];
		}
		}

		System.out.println("The highest grade is " + percent.format(high/100));
	}

}
/* Screen Dump
Enter grade: 
96
Enter grade: 
56
Enter grade: 
19
Enter grade: 
75
Enter grade: 
84
The highest grade is 96%
 */
