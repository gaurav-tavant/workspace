// To find the factorial using the while loop for the number entered by the end user. 

package Day4;

import java.util.Scanner;

public class CalculateFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int number =0;
		int val =0;
		int fact=1;
		System.out.print("Enter the number for factorial calculation: ");
		number =scan.nextInt();
		val=number;
		
		while(number >0){
			fact=fact*number;
			number=number-1;
		}
		System.out.println("The factorial for the number: " +val+ " is equal to =" +fact);
	}

}
