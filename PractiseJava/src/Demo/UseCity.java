package Day3;

import java.util.Scanner;

public class UseCity {

	public static void main(String[] args) {
		
		Scanner obj1 = new Scanner(System.in);
		Scanner obj2 = new Scanner(System.in);
		double lat=0;
		double lon=0;
		String name = null;
		
		City[] cityName=new City[3];
		for(int i=0;i<3;i++){
			
			String nm=obj1.next();
			lat=obj1.nextDouble();
			lon=obj1.nextDouble();
			//cityName[i]=;
			System.out.println(nm+lat+lon);
		}
		
	}
}
