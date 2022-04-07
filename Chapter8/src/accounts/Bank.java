/*

Program: Bank.java          Last Date of this Revision: March 31, 2022

Purpose: A program to ask a user what account type they have and to store account information regards the customer.

Author: Carter Sarney 
School: CHHS
Course: Computer Programming 30
 

*/

package accounts; //Declares the package that Bank is in
import java.util.Scanner;

public class Bank extends Account { //area for code with PersonalAcct which also calls on code from Account

	public Bank(double bal, String fName, String lName, String str, String city, String st, String zip) {//Constructor method to allow the extension
		super(bal, fName, lName, str, city, st, zip);//Allows the variables to join Bank
		
	}

	public static void main(String[] args) {
		
		/*
		 Creates a scanner and asks which account type they have then stores that input in a double
		 */
		
		Scanner acc = new Scanner(System.in);
		System.out.println("Choose your account type. 1 for personal, 2 for business: ");
		double type = acc.nextDouble();
		
		if (type == 1) { //Creates an if statement for when conditions equal to 1
			
			/*
			 Creates a scanner and asks for the users first name and stores that input as a String 
			 */
			Scanner fName = new Scanner(System.in);
			System.out.println("What is your first name? ");
			String first = fName.nextLine();
			
			
			/*
			 Creates a scanner and asks for the users last name and stores that input as a String 
			 */
			Scanner lName = new Scanner(System.in);
			System.out.println("What is your last name? ");
			String last = lName.nextLine();
			
			
			/*
			 Creates a scanner and asks for the users street name and stores that input as a String 
			 */
			Scanner str = new Scanner(System.in);
			System.out.println("What is your street name? ");
			String street = str.nextLine();
			
			
			/*
			 Creates a scanner and asks for the users city and stores that input as a String 
			 */
			Scanner city = new Scanner(System.in);
			System.out.println("What is your city? ");
			String town = city.nextLine();
			
			
			/*
			 Creates a scanner and asks for the users state and stores that input as a String 
			 */
			Scanner st = new Scanner(System.in);
			System.out.println("What is your state? ");
			String state = st.nextLine();
			
			
			/*
			 Creates a scanner and asks for the users zipcode and stores that input as a String 
			 */
			Scanner zip = new Scanner(System.in);
			System.out.println("What is your zip code? ");
			String zipcode = zip.nextLine();
			
			
			/*
			 Creates a scanner and asks for the users bank balance and stores that input as a double
			 */
			Scanner bal = new Scanner(System.in);
			System.out.println("What is your account balance? ");
			double balance = bal.nextDouble();
			
			Account person = new PersonalAcct(balance, first, last, street, town, state, zipcode); //Creates an account storing this information that was given
			
			
			/*
			 * if statement only for when the balance is under $100, if it is then $2 will be taken from the account
			 */
			if(balance<100) { 
				balance = balance -2;
				System.out.println("Due to the balance of your personal account being below $100, a charge of $2 will be added to your account");
			}
			//Prints the final output with all the personal information given
			System.out.println("Your personal account information: " + first +" "+ last + ", you reside at: "
					+ street + ", "+ town +  ", "+state + ", "+ zipcode + ". Your bank balance is: " + balance);
			
			
			
			
		}
		if (type == 2) { //Creates an if statement for when conditions equal to 1
			
			
			/*
			 Creates a scanner and asks for the users business name and stores that input as a String 
			 */
			Scanner business = new Scanner(System.in);
			System.out.println("What is your business name? ");
			String businessname = business.nextLine();
			
			
			/*
			 Creates a scanner and asks for the users first name and stores that input as a String 
			 */
			Scanner fName = new Scanner(System.in);
			System.out.println("What is your first name? ");
			String first = fName.nextLine();
			
			
			/*
			 Creates a scanner and asks for the users last name and stores that input as a String 
			 */
			Scanner lName = new Scanner(System.in);
			System.out.println("What is your last name? ");
			String last = lName.nextLine();
			
			
			/*
			 Creates a scanner and asks for the users street name and stores that input as a String 
			 */
			Scanner str = new Scanner(System.in);
			System.out.println("What is your street name? ");
			String street = str.nextLine();
			
			
			/*
			 Creates a scanner and asks for the users city and stores that input as a String 
			 */
			Scanner city = new Scanner(System.in);
			System.out.println("What is your city? ");
			String town = city.nextLine();
			
			
			/*
			 Creates a scanner and asks for the users state and stores that input as a String 
			 */
			Scanner st = new Scanner(System.in);
			System.out.println("What is your state? ");
			String state = st.nextLine();
			
			
			/*
			 Creates a scanner and asks for the users zip code and stores that input as a String 
			 */
			Scanner zip = new Scanner(System.in);
			System.out.println("What is your zip code? ");
			String zipcode = zip.nextLine();
			
			
			/*
			 Creates a scanner and asks for the users bank balance and stores that input as a double 
			 */
			Scanner bal = new Scanner(System.in);
			System.out.println("What is your account balance? ");
			double balance = bal.nextDouble();
			
			
			Account work = new BusinessAcct(balance, first, last, street, town, state, zipcode, businessname); //Creates an account storing this information that was given
			
			
			/*
			 Creates an if statement for when the balance is less than $500 then it will withdraw $10 from the balance 
			 */
			if(balance<500) {
				balance = balance -10;
				System.out.println("Due to the balance of your business account being below $500, a charge of $10 will be added to your account");
			}
			
			//Prints the final output with all the business information given
			System.out.println("Your business account information: " + first +" "+ last +", Your business is called: "+ businessname + ", You reside at: "
					+ street + ", "+ town +  ", "+state + ", "+ zipcode + ". Your bank balance is: " + balance);
		}

	}

}


/*
 Screen dump
 
 Choose your account type. 1 for personal, 2 for business: 
1
What is your first name? 
carter
What is your last name? 
sarney
What is your street name? 
lilcarsar
What is your city? 
calgary
What is your state? 
berta
What is your zip code? 
t3k4l5
What is your account balance? 
2100
Your personal account information: carter sarney, you reside at: lilcarsar, calgary, berta, t3k4l5. Your bank balance is: 2100.0



Choose your account type. 1 for personal, 2 for business: 
1
What is your first name? 
carter
What is your last name? 
sarney
What is your street name? 
lilcarsar
What is your city? 
calgary
What is your state? 
berta
What is your zip code? 
t3k4l5
What is your account balance? 
9
Due to the balance of your personal account being below $100, a charge of $2 will be added to your account
Your personal account information: carter sarney, you reside at: lilcarsar, calgary, berta, t3k4l5. Your bank balance is: 7.0


Choose your account type. 1 for personal, 2 for business: 
2
What is your business name? 
carter inc
What is your first name? 
carter
What is your last name? 
sarney
What is your street name? 
lilcarsar
What is your city? 
calgary
What is your state? 
berta
What is your zip code? 
t3k4l5
What is your account balance? 
100000
Your business account information: carter sarney, Your business is called: carter inc, You reside at: lilcarsar, calgary, berta, t3k4l5. Your bank balance is: 100000.0


Choose your account type. 1 for personal, 2 for business: 
2
What is your business name? 
carter inc
What is your first name? 
carter
What is your last name? 
sarney
What is your street name? 
lilcarsar
What is your city? 
calgary
What is your state? 
berta
What is your zip code? 
t3k4l5
What is your account balance? 
400
Due to the balance of your business account being below $500, a charge of $10 will be added to your account
Your business account information: carter sarney, Your business is called: carter inc, You reside at: lilcarsar, calgary, berta, t3k4l5. Your bank balance is: 390.0
 */


