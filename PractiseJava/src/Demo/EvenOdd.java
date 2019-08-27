package Demo;

import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter No.");
		int firstno=obj.nextInt();
		//int result=firstno%2;
		
		if(firstno%2==0){
			System.out.println("Enter No is Even");
		}
		else
		{
			System.out.println("Enter No is Odd");
		}
		
	}

}
