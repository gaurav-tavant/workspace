package testJava;

import java.util.Scanner;

public class Practise {
	
	public static void main(String[] args) {
		
	Scanner obj=new Scanner(System.in);
	
	System.out.println("Enter no 1");
	int opr1=obj.nextInt();
	System.out.println("Enter no 2");
	float opr2=obj.nextFloat();
	
	
	System.out.println("Sum: " + (opr1+opr2));
	System.out.println("Sub: " + (opr1-opr2));
	System.out.println("Mul: " + (opr1*opr2));
	System.out.println("Div: " + (opr1/opr2));
	System.out.println("Mod: " + (opr1%opr2));

	}
}
