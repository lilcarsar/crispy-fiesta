/*

Program: Puck.java          Last Date of this Revision: March 16, 2022

Purpose:Create a class that asks for weights of 2 pucks to test the weights against each other using getWeight(),getDivision(), equals(),
and toString().

Author: Carter Sarney 
School: CHHS
Course: Computer Programming 30
 

*/
package disk;

public class Puck implements Comparable {  //creates public class called puck and allows it to use the compare method
	
	
/*
 creates three variables called weight standard and youth
 */
		

	private double weight;
	private boolean standard;
	private boolean youth;
	
	public Puck(double g) {  //creates main constructor, with an argument 
		
	weight = g; // weight variable is equal to g
		if(weight >= 5.0 && weight <= 5.5) 
			/*creates an if statement for when the weight is greater than or equal to 5 and less than 
			or equal to 5.5*/
			
		{
			standard = true; //When above criteria is met standard is true
			youth = false;  //When above criteria is met youth is false
			}
	
	if(weight >= 4.0 && weight <= 4.5) 
		/*
		 creates an if statement for when weight is greater than or equal to 4 and less than 
			or equal to 4.5
			*/
	{
			youth = true; //When above criteria is met youth is true
			standard =  false; //When above criteria is met standard is false
	
	}
	if (weight > 5.5 && weight< 4.0) 
	/*
	 Creates an if statement for when the weight is greater than 5.5 or less than 4
	 */
	{
		standard = false; //When above criteria is met standard is false
		youth = false; //When above criteria is met youth is false
	}
	}

	

	public double getWeight() { //Creates a public double called getWeight
		
		return(weight); //The public double returns weight
	}

	
	public String getDivision() { //Creates a public String called getDivision
		String division; //Creates a String called division
		
		if(standard) //If statement for when the weight is standard
			{ 
			division = "a standard puck"; //Division is equal to a statement
		}
		else if(youth)//else if statement for when the weight is youth
			{
			division = "a youth puck";//Division is equal to a statement
		}
		else //else statement for when it's not a standard or youth
		{
			division = "not a standard puck or a youth puck"; //Division is equal to a statement
		}
			return division; //Returns the variable division
	}
	
	public String toString() { //Creates a public String called toString
		String ans; //Creates a String called ans
		
		//Creates a statement including getWeight() and getDivision()
		ans = "The puck has a weight of "+ getWeight()+ " ounces, the type of puck is "+ getDivision(); 
		
		return ans; //return the ans String
	}
	
	public boolean equals(Object d) //creates a public boolean called equals and it initializes an Object called d
	
	{
		Puck disk = (Puck)d; //Creates disk as a object with d
		
		if (disk.getDivision() == getDivision()) //if statement shows that if disk.getDivision() is equal to getDivision() it will do what it says below 
		{ 
			return(true); //returns true if they are equal
		}
		else {
			return(false); //If they aren't equal it returns false
		}
	}
	
	public int compareTo(Object s) { //Creates a public int called compareTo with an object called s
		Puck obj = (Puck)s; //Creates obj as a object with s
		
		if (weight < obj.getWeight()) //If the weight if less than the obj.getWeight then it will run below code
		{
			return(-1); //Returns -1
		}
		else if (weight == obj.getWeight())  //If the weight if equal to the obj.getWeight then it will run below code
		{
			return(0); //returns 0
		}
		else //New argument if neither of above ones work 
		{
			return(1); //returns 1
		}
	}
		
	}


