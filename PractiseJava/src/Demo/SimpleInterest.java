package Demo;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter principle");
		int prin=obj.nextInt();
		System.out.println("Enter no Rate");
		double rate=obj.nextDouble();
		System.out.println("Enter no time in years");
		int time=obj.nextInt();
		double si=(rate*time)/100;
		double amount=si+prin;
		
		System.out.println("SI = "+si);
		System.out.println("Amount = "+amount);
	
	}
	
}
