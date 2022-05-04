package square;

public class Squares {

	public static void main(String[] args) {
		//Creates an array with numbers 0-4
		int[] num = {0,1,2,3,4};
		

		
		int numElements = num.length;
		
		for( int i = 0; i < num.length; i++) {
			num[i] = num[i] * num[i];
		}
		
		System.out.println(num[0] + " " + num[1] + " "+ num[2] + " " + num[3] + " " + num[4]);
	}

}
/*
 Screen dump
 
 
 0 1 4 9 16

 */
