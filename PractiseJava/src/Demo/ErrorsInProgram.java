package Day6;

public class ErrorsInProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int i = 10;
		int j = 1;
		int k= i/j;
		System.out.println(k);
		
		
		
		int[] marks= new int[3];
		marks[0]=10;
		marks[1]=20;
		marks[2]=30;
		//marks[3]=40; //generate a runtime error
		
		
		//logical error
		int a=40;
		int b =90;
		if(a>b){ //should have used < than symbol
			System.out.println("b is greater");
		}else{
			System.out.println("a is greater");
		}
		
		
	}

}
