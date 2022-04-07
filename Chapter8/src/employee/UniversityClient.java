/*

Program: ????.java          Last Date of this Revision: April 6, 2022
Purpose: An client code to test the other classes in the package

Author: Carter Sarney
School: CHHS
Course: Computer Programming 30
 

*/

package employee;
import java.util.Scanner; //Imports a scanner

public class UniversityClient  {


	public static void main(String[] args) {
		
		/*
		 Creates sets of variables to be used to store the inputs
		 */
		String first, last;
		double salary;
		int ans;
		
		/*
		 Creates a Scanner then prompts the user for their first name and stores it
		 */
		Scanner fn = new Scanner(System.in);
		System.out.println("What is your first name? ");
		first = fn.nextLine();
		
		
		/*
		 Creates a Scanner then prompts the user for their last name and stores it
		 */
		Scanner ln = new Scanner(System.in);
		System.out.println("What is your last name? ");
		last = ln.nextLine();
		
		
		/*
		 Creates a Scanner then prompts the user for their salary and stores it
		 */
		Scanner sal = new Scanner(System.in);
		System.out.println("What is your salary? ");
		salary = sal.nextDouble();
		

		
		/*
		 Creates a Scanner then prompts the user if they are a faculty or staff member and stores it
		 */
		Scanner reply = new Scanner(System.in);
		System.out.println("What type of employee are you? 1 for faculty, 2 for Staff member");
		ans = reply.nextInt();
		
		//if statement for when certain criteria is reached it will run the if statement
		if(ans == 1) {
			
			/*
			 Creates a Scanner then prompts the user for their department and stores it
			 */
			Scanner fac = new Scanner(System.in);
			System.out.println("What department do you work in? ");
			String depart = fac.nextLine();
			
			
			//Creates an object called school which contains the first name, last name, salary, and their department
			Faculty school = new Faculty(first, last, salary,depart);
			
			
			System.out.println(school.toString()); //Prints out a toString
			
		}
		
		//if statement for when certain criteria is reached it will run the if statement
		if(ans == 2) {
			
			/*
			 Creates a Scanner then prompts the user for their department and stores it
			 */
			Scanner sta = new Scanner(System.in);
			System.out.println("What is your job? ");
			String job = sta.nextLine();
			
			
			//Creates an object called school which contains the first name, last name, salary, and their job
			Staff school = new Staff(first, last, salary,job);
			
			System.out.println(school.toString()); //Prints out a toString
		}
		
	}

}


/* Screen Dump
 What is your first name? 
Carter
What is your last name? 
Sarney
What is your salary? 
30000
What type of employee are you? 1 for faculty, 2 for Staff member
1
What department do you work in? 
Math
Employee name: Carter Sarney
and your salary is: 30000.0, Faculty member 
Department: Math


What is your first name? 
Carter
What is your last name? 
Sarney
What is your salary? 
3000000
What type of employee are you? 1 for faculty, 2 for Staff member
2
What is your job? 
Janitor
Employee name: Carter Sarney
and your salary is: 3000000.0, You are a Staff member 
job title: Janitor


 */
