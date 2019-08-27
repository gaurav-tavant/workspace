package Day4;

//find all numbers between 1 - 10 which are divisible by 2 find all even numbers
public class WhileLoop {
	
	public static void main(String[] args) {
		int i =1;
		System.out.println("Print even numbers");
		while(i<=10){ //loop until i is < = 100
			if(i%2==0){  //means number is divisible by 2
				System.out.println(i);
			}
			i=i+1;  //increase the value of i by 1 and loop
		}
		
		System.out.println("Print odd numbers");
		//print odd numbers
		int j =10;
		while(j>=1){ //loop until i is < = 100
			if(j%2!=0){  //means number is divisible by 2
				System.out.println(j);
			}
			j=j-1;  //decrease the value of j by 1 and loop
		}
		
	}

}
