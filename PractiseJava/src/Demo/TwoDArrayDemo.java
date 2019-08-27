package Day5;
import java.util.Scanner;
public class TwoDArrayDemo {

	public static void main(String[] args) {
		int[][] arr= new int[2][3]; // 3 rows and 3 cols
		Scanner scan=new Scanner(System.in);
		int val=0;
		//populate the data in the array
		for(int i=0;i<arr.length;i++){  //rows outer for loop
			for(int j=0;j<arr[i].length;j++){//cols 00, 01, 02, 10, 11, 12, 20, 21 ,22
				System.out.printf("Enter value for [%d %d]", i,j);
				val=scan.nextInt();
				arr[i][j]=(int)val ; //value to be stored at ith row and jth column.
			}
		}
	//printing the two d array
		for(int i=0;i<arr.length;i++){  //rows
			for(int j=0;j<arr[i].length;j++){//cols
				System.out.print(arr[i][j]); //00, 01, 02, 10, 11, 12, 20, 21 22
				System.out.print("\t"); // used for giving a tab space between two columns
				
			}
			System.out.println(); // used for giving a new line between two rows
		}

	}

}
