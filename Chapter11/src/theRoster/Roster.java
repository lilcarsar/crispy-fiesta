package theRoster;


import java.io.*;
import java.util.Scanner;

public class Roster {

	public static void main(String[] args) {
		
		File dataFile = new File("StuRoster.txt");
		
		FileWriter out;
		BufferedWriter writeFile;
		Scanner input = new Scanner(System.in);
		String Names;
		
		try {
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);
		}

	}

}
