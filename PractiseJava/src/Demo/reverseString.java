package Day5;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string: ");
		Scanner scanObj=new Scanner(System.in);
		String str=scanObj.next();
		String newstr="";
		for(int i=str.length()-1;i>=0;i--){
			newstr=newstr+str.charAt(i);
		}

		System.out.println(newstr);
		scanObj.close();
	}

}
