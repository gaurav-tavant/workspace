package Day4;
import java.util.Scanner;
public class FindNumberEvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//If LOOP Example
		System.out.println("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int result =0;
		result = number%2;
		if(result == 0){
			System.out.println("It is an even number");
		}else{
			System.out.println("It is an Odd number");
			}
	/*	
		//Use While Loop to find all number which are even or odd between 1- 100. 
		int count = 0;
		while (count < 100) {
			int resultw = count%2;
			if(resultw == 0){
				System.out.println("It is an even number" + count);
			}else{
				System.out.println("It is an Odd number" + count);
				}
		  count++;
		}
*/
	}
}
