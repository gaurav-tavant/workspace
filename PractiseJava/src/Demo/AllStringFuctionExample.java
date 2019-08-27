package Day5;
//Program to understand the String functions
//Created by: Pallavi

public class AllStringFuctionExample {
	public static void main(String[] args) {
		
		String str = "Hello";
		
		// Find length of the given string
		System.out.println("Length of the given string ==>" + str.length());
				
		// convert string into Lower case
		String Lowercase = str.toLowerCase();
		System.out.println("Lower case String ==> " + Lowercase);
		
		// convert string into upper case
		String Uppercase = str.toUpperCase();
		System.out.println("Upper case String ==> " + Uppercase);
		
			
		// Concatenate strings
		System.out.println("String after concatenating => " +str.concat(" how are you!"));
		
		
		// Trim the given string i.e. remove all first and last the spaces from the string
		String tempstr = "       String trimming example     ";
		System.out.println("String before trimming ==> " + tempstr);
		System.out.println("String after trimming ==> " + tempstr.trim());
	
		// Find the character at the given index from the  string
		System.out.println("Character at the index 2 is ==> " + str.charAt(2));
			
		// find the substring between two index range
		System.out.println("String between index 1 to 4 is ==> "+ str.substring(1, 4));
	
	
		// replace the character with another character
		System.out.println("String after replacement ==> "+ str.replace('l', 'Y'));
		
		// replace the substring with another substring
		System.out.println("String after replacement ==> "+ str.replace("ell", "html"));
		
		//using indexOf function of the string, returns a +ve number is substring is available>=0
		System.out.println("The index of the substring is ==> " + str.indexOf("el"));
		System.out.println("The index of the substring is ==> " + str.indexOf("aazzss"));

		//Comparing Strings
		String a="Selenium";
		String b = "elenium";
		
		if (a.equals(b)){  
		    System.out.printf("Strings %s and %s are equal!", a ,b);
		  } else {
			  System.out.printf("Strings %s is not equal to %s !", a ,b);
		  }
	}
		
}
