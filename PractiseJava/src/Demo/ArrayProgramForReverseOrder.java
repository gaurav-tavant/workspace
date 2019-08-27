package Day5;
//Program to understand the Arrays
//Created by: Pallavi

import java.util.Scanner;

public class ArrayProgramForReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int[] numbers = new int[5];  //declaring the array - integer array, size = 5
		
		System.out.println ("The size of the array: " + numbers.length);
		for(int index = 0; index < numbers.length; index++)   {
			System.out.print ("Enter number" + "[" + index + "]: ");
			numbers[index] = scan.nextInt();// the value entered by the end user is stored in the array for the given index value
		}
		
		//printing the same array but in the reverse order.
		      
		System.out.println ("The numbers in reverse order:");

		for (int index = numbers.length-1; index >= 0; index--){
		     System.out.print(numbers[index] + "  ");
		}

		scan.close();
	
	}

}
