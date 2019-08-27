package Day5;

public class ArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a fruit array
		String[] fruits = new String[6];
		fruits[0]="Mango";
		fruits[1]="Banana";
		fruits[2]="Grapges";
		fruits[3]="Melon";
		fruits[4]="kiwi";
		fruits[5]="Mosambi";
		
		//iterate through the array and split each name, find which fruit name starts with M, print it only. 
		for(int i=0;i<fruits.length;i++){
			String[] namef =fruits[i].split("");
			if(namef[0].equals("M")){
				System.out.println(fruits[i]);
			}
		}
	}

}


