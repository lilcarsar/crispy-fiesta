/*

Program: Search.java          Last Date of this Revision: May 5, 2022

Purpose: Creates a linear search to look through an array for a specific series of letters

Author: Carter Sarney
School: CHHS
Course: Computer Programming 30
 

*/


package nameFinder;

public class Search {
	
	/**
	 * Returns the index of the element nameToFind
	 * pre: none
	 * post: index of nameToFind has been returned. -1 has been returned if element not found
	 */

	public static int linear(String[] array, String nameToFind) {
		int index = 0;
		
		
		while((!array[index].equals(nameToFind)) && (index < array.length -1))
		{
			index += 1;
		}
		
		if(array[index] != nameToFind) {
			return(index);
			
		}
		else {
			return(-1);
		}

	}

}
