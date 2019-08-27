package Day4;

//Show the If Else Loop.
//Created by: Pallavi
//STH Course on Selenium and Java
import java.util.Scanner;


public class IfElseControlLoop {
	public static void main(String[] args) {
		
		//Fetch the Inputs
		System.out.print("Enter radius: ");
		Scanner scanner1 = new Scanner(System.in);
		
		double radius = scanner1.nextDouble();
		double area=0;
		
		//If condition, if radius is greater than zero, then calculate the area
		if(radius > 0) {   
			area = radius * radius * 3.14159;
		 	System.out.println("The area for the circle of radius " + radius + " is " + area);
		}
		else {
			  System.out.println("Invalid radius input");
		}

		scanner1.close();
	}
}
