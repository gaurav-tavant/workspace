package Demo;
import java.util.Scanner;
public class Addition {
	
	public static void main(String[] args) {
		
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter prin");
		int prin=obj1.nextInt();
		System.out.println("Enter rate");
		Double rate=obj1.nextDouble();
		System.out.println("Enter time");
		int time=obj1.nextInt();
		
		Double si = (prin*rate*time)/100;
		System.out.println(si);		
	}

}
