package Day6;
/*Program showing usage of Regular Expressions in Java
Created by: Pallavi
 Course on Selenium and Java
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UseRegularExpression {

	public static void main(String[] args) {
		  String line = "This order was placed for Q48494T ! OK ! E23492R  do it now! Fine.";
		//String line ="hello how are you";
	      String patternStr = "\\d+";  //find out if a number exists in the string or not?
	      //to ensure \d is read as \d, we use '\' which is called as an escape character. 
	      // Create a Pattern object
	      Pattern pat = Pattern.compile(patternStr);
	      // Now create matcher object, and replace
	      Matcher m = pat.matcher(line);  // run the pattern on the given string to find any match or not.
	      String line2="";
	      if (m.find()) { // if it returns true then it means match is found. else not found
	    	  System.out.println("Match Found!");
	    	  line2=m.replaceFirst("*"); //replace the first occurrence
	    	  System.out.printf("String after replacing First is- %s",line2);
	    	  System.out.println();
	    	  line2= m.replaceAll("%"); // replace all occurrence 
	    	  System.out.printf("\nString after replacing all is- %s",line2);
		      System.out.println("");
	       } 
	    	  else {
	         System.out.println("Match Not Found");
	      }
	   }
	}
