package theRoster;

public class StuName {
	
	private String first, last;

	public String firstName() {
		return(first);
	}

	public String lastName() {
		return(last);
	}
	
	public String toString() {
		return("First name is: " + firstName() + " and last name is: " + lastName());
	}
}
