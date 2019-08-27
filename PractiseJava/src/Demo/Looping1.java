package Demo;
import java.util.Scanner;
public class Looping1 {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter No.");
		int no=obj.nextInt();

		while(true){
			
			if(no<0){
				System.out.println("Invalid no");
				break;
			}
			System.out.println("Entered no is " + no);
			//Scanner obj1 = new Scanner(System.in);
			//System.out.println("Enter No.");
			no=obj.nextInt();
		}
	}
}
