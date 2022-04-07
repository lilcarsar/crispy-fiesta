/*

Program: Hockey.java          Last Date of this Revision: March 16, 2022

Purpose: Application test for Puck.java

Author: Carter Sarney 
School: CHHS
Course: Computer Programming 30
 

*/
package disk; //declares package
import java.util.Scanner; //Imports a scanner to allow typing in system


public class Hockey extends Puck{ //creates a public class that inherits Puck

	public Hockey(double g) { //Constructor variable with double declared
		super(g); //Allows inheritance
	}
	
	
	public static void main(String[] args) {
		Scanner puck1 = new Scanner(System.in); //Brings the scanner into the code
		System.out.println("Please enter a weight for puck one between 4 ounces and 5.5 ounces: "); //Output text asking for a first weight
		double ans1 = puck1.nextDouble(); //Stores given answer in ans1
		
		Scanner puck2 = new Scanner(System.in);//Brings the scanner into the code a second time
		System.out.println("Please enter a weight for puck two between 4 ounces and 5.5 ounces: ");//Output text asking for a second weight
		double ans2 = puck2.nextDouble(); //Stores given answer in ans 2
		
		Puck cir1 = new Puck(ans1);  //Creates object called cir1
		Puck cir2 = new Puck(ans2);  //Creates object called cir2
		
		
		
		if(cir1.equals(cir2) == true) //If the two objects are equal then the below code will follow
		{
			System.out.println(cir1.toString()); //Displays the division and weight of puck 1
			System.out.println(cir2.toString()); //Displays the division and weight of puck 2
			System.out.println("The puck weights are the same :)"); //Displays that the pucks weigh the same
		}
		else {
			System.out.println(cir1.toString()); //Displays the division and weight of puck 1
			System.out.println(cir2.toString()); //Displays the division and weight of puck 2
			System.out.println("The puck weights are not the same :( "); //Displays that the pucks don't weigh the same
		}
		
		
		
		Scanner puck3 = new Scanner(System.in); //Brings in a new scanner
		System.out.println("Please enter a weight for spot one between 4 ounces and 5.5 ounces: "); //Output text asking for a first weight
		double ans3 = puck3.nextDouble(); //Stores given answer in ans3
		
		Scanner puck4 = new Scanner(System.in); //Brings in a new scanner
		System.out.println("Please enter a weight for spot two between 4 ounces and 5.5 ounces: ");//Output text asking for a second weight
		double ans4 = puck4.nextDouble(); //Stores given answer in ans4
		
		Puck spot1 = new Puck(ans3);  //Creates object called spot1
		Puck spot2 = new Puck(ans4);  //Creates object called spot2
		
		if (spot1.compareTo(spot2)==0) //Uses the compareTo method in an if statement to test if spot1 and spot2 are equal to 0
		{
			System.out.println(spot1.toString()); //Displays the division and weight of puck 1
			System.out.println(spot2.toString()); //Displays the division and weight of puck 2
			System.out.println("Both spots are equal"); //Displays that the pucks are equal in weight
		}
		else if (spot1.compareTo(spot2)<0)  //Uses the compareTo method in an if statement to test if spot1 and spot2 are less than 0
		{
			System.out.println(spot1.toString()); //Displays the division and weight of puck 1
			System.out.println(spot2.toString()); //Displays the division and weight of puck 2
			System.out.println("Spot one is less than spot two"); //Displays that spot1 is less than spot2
		}
		else //else statement showing any other outcoming not listed above
		{
			System.out.println(spot1.toString()); //Displays the division and weight of puck 1
			System.out.println(spot2.toString()); //Displays the division and weight of puck 2
			System.out.println("Spot one is greater than spot two"); //Displays that spot1 is greater than spot2
		}
	}

}


/* Screen Dump

Paste the output of your code here

Please enter a weight for puck one between 4 ounces and 5.5 ounces: 
4
Please enter a weight for puck two between 4 ounces and 5.5 ounces: 
5
The puck has a weight of 4.0 ounces, the type of puck is a youth puck
The puck has a weight of 5.0 ounces, the type of puck is a standard puck
The puck weights are not the same :( 
Please enter a weight for spot one between 4 ounces and 5.5 ounces: 
4.5
Please enter a weight for spot two between 4 ounces and 5.5 ounces: 
5.3
The puck has a weight of 4.5 ounces, the type of puck is a youth puck
The puck has a weight of 5.3 ounces, the type of puck is a standard puck
Spot one is less than spot two




Please enter a weight for puck one between 4 ounces and 5.5 ounces: 
4.5
Please enter a weight for puck two between 4 ounces and 5.5 ounces: 
4.5
The puck has a weight of 4.5 ounces, the type of puck is a youth puck
The puck has a weight of 4.5 ounces, the type of puck is a youth puck
The puck weights are the same :)
Please enter a weight for spot one between 4 ounces and 5.5 ounces: 
4.4
Please enter a weight for spot two between 4 ounces and 5.5 ounces: 
4.4
The puck has a weight of 4.4 ounces, the type of puck is a youth puck
The puck has a weight of 4.4 ounces, the type of puck is a youth puck
Both spots are equal




Please enter a weight for puck one between 4 ounces and 5.5 ounces: 
5
Please enter a weight for puck two between 4 ounces and 5.5 ounces: 
5
The puck has a weight of 5.0 ounces, the type of puck is a standard puck
The puck has a weight of 5.0 ounces, the type of puck is a standard puck
The puck weights are the same :)
Please enter a weight for spot one between 4 ounces and 5.5 ounces: 
5
Please enter a weight for spot two between 4 ounces and 5.5 ounces: 
4
The puck has a weight of 5.0 ounces, the type of puck is a standard puck
The puck has a weight of 4.0 ounces, the type of puck is a youth puck
Spot one is greater than spot two

 
 */