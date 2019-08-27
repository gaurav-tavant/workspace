package Demo;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int j=0,k=1,sum=0;
		
		//for (int i=1;i<=sum;i++){
		while (j<100){	
		System.out.println("j ="+j);
			sum=j+k;
			j=k;
			k=sum;
		}
	}
}
