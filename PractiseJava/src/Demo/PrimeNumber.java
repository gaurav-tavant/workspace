package Demo;

public class PrimeNumber {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++){
			int a=i%2;
			if(a!=0){
				int b=i%3;
				if(b!=0){
					int c=i%5;
					if(c!=0){
						System.out.println(i);
					}
 				}
			//if(a!=0||b!=0||c!=0){
				//int arr[]=new int[50];
				//arr[i];
			}
		}	
	}
}
