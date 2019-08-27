package Day6;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class validSSN {

	public static void main(String[] args) {
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Enter valid ssn number: ");
		  String ssnNumber = scan.next();
	      String patternStr = "\\d{3}-\\d{2}-\\d{4}";  //find out if a number exists in the string or not?
	      Pattern pat = Pattern.compile(patternStr);
	      Matcher m = pat.matcher(ssnNumber);  // run the pattern on the given string to find any match or not.
	      if (m.find()) { // if it returns true then it means match is found. else not found
	    	  System.out.println("Valid SSN");
	    	} 
	    	  else {
	         System.out.println("Junk Value");
	      }
	}
}