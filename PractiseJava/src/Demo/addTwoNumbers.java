package Day1;

import java.util.Scanner;

public class addTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in); //read information from the keyboard
		System.out.println("Enter number 1: ");
		int num1=scan.nextInt();
		System.out.println("Enter number 2: ");
		int num2=scan.nextInt();;
		int num3=num1+num2;
		System.out.println(num3);
		scan.close();

	}

}
