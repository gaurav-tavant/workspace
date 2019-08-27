package Day5;
import java.util.Scanner;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int[] numbers = new int[5]; //index 0-4
		System.out.println ("The size of the array: " + numbers.length);
			for (int index = 0; index < numbers.length; index++)   {
			     System.out.print ("Enter number " + (index+1) + ": ");
			     numbers[index] = scan.nextInt();
			}
		
			System.out.println ("The numbers in reverse order:");
			for (int index = numbers.length; index >= 0; index--){
			         System.out.print (numbers[index] + "  ");
			}
			scan.close();
	}
	
}


