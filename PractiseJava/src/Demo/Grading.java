package Demo;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Marks");
		int marks=obj.nextInt();
		//int result=firstno%2;
		
		if(marks>=81 && marks<=100){
			System.out.println("Your grade is A");
		}
		else if(marks>=61 && marks<=80){
			System.out.println("Your grade is B");
		}
		else if(marks>=41 && marks<=60){
			System.out.println("Your grade is C");
		}
		else if(marks>=0 && marks<=40){
			System.out.println("Sorry, you wont be promoted to next class");
		}
		else{
			System.out.println("Please enter valid marks");
		}
		obj.close();
	}

}
