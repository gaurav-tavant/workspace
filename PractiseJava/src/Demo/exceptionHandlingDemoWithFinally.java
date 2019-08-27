package Day6;
import java.util.Scanner;

//To showcase usage of the throw keyword
/*
 * so we calculate area of circle, only if radius is value > 0. else we throw an illegal argument exception
 */
public class exceptionHandlingDemoWithFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the radius: ");
			double newRadius= scan.nextDouble();
			double area=0.0;
			if(newRadius<=0){
				throw new IllegalArgumentException("Radius cannot be negative");
			}else{
				area=3.14*newRadius*newRadius;
				System.out.println(area);
			}
			scan.close();
		}
		catch(Exception ex){
			System.out.printf("Exception in catch block: %s", ex.toString());
			System.out.println();
		}
		finally{
			System.out.println("The area of a circle is calculated using formula pi*r*r");
		}
		
			
		 
		 
	}

}
