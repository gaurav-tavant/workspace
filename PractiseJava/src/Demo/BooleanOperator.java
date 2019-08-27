package Day4;
import java.util.Scanner;

//Program to check if a number is divisible by 2 , 3, and both
//Created by: Pallavi

public class BooleanOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = scanner.nextInt();
		
		System.out.println("Is " + num + " divisible by 2 and 3? " + ((num % 2 == 0) && (num % 3 == 0)));
		System.out.println("Is " + num + " divisible by 2 or 3? " + ((num % 2 == 0) || (num % 3 == 0)));
		System.out.println("Is " + num + " divisible by 2 or 3, but not both? " + ((num % 2 == 0) ^ (num % 3 == 0))); 
		
		scanner.close();
	}

}
