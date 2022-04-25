package theRoster;

public class StuName{
	
	private String first, last;

	public StuName(String f, String l) {
		first = f;
		last = l;
	}
	
	public String toString() {
		return("First name is: " + first + " and last name is: " + last);
	}
}
