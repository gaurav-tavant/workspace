package Day4;
import java.util.*;
public class CalculateIncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Gender: ");
		int gender=scan.nextInt();
		
		System.out.print("Enter the Salary: ");
		int salary = scan.nextInt();
		double tax=0.0;
		
		
	if(gender==0){ //male  - MAIN Conditions
		if(salary<=100000){ //Sub conditions
			tax=(salary*10)/100;
			System.out.println("The tax for salary: " + salary + " is = " + tax);
		}else if((salary>100000) && (salary <=500000)){
			tax=(salary*15)/100;
			System.out.println("The tax for salary: " + salary + " is = " + tax);
		}else if(salary>500000){
			tax=(salary*30)/100;
			System.out.println("The tax for salary: " + salary + " is = " + tax);
		}else{
			System.out.println("Invalid Salary");
		}
	}else if(gender==1){ //female MAIN Condition 2
		if(salary<=100000){ //sub conditions
			tax=(salary*5)/100;
			System.out.println("The tax for salary: " + salary + " is = " + tax);
		}else if((salary>100000) && (salary <=500000)){
			tax=(salary*10)/100;
			System.out.println("The tax for salary: " + salary + " is = " + tax);
		}else if(salary>500000){
			tax=(salary*20)/100;
			System.out.println("The tax for salary: " + salary + " is = " + tax);
		}else{
			System.out.println("Invalid Salary");
		}
	}else{
		System.out.println("Unknown Gender");
	}
	}

}
