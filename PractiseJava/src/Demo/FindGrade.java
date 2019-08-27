package Day4;
import java.util.Scanner;
public class FindGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj= new Scanner(System.in); 
		System.out.println("Enter the marks: ");
		int marks = obj.nextInt();
		
		if((marks <= 100) && (marks>80)){
			System.out.println("Grade A");
		}else if((marks <= 80) && (marks>60)){
			System.out.println("Grade B");
		}else if((marks <= 60)&&(marks >40)){
			System.out.println("Grade C");
		}else if((marks <= 40) && (marks >= 0)){
			System.out.println("FAIL");
		}else{
			System.out.println("Invalid Marks");
		}
		
		obj.close(); // closes the scanner object so that it doesn't get corrupted.
		
		//good practice. 
		
		
	}

}
