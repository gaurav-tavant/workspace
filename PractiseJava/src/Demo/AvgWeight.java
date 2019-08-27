package Demo;

import java.io.*;

public class AvgWeight {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fReader=new FileReader("D:\\gaurav\\freshman.csv");
		BufferedReader bReader=new BufferedReader(fReader);
		
		int weight=0;
		double avg=0;
		String rdData=bReader.readLine();
		for(int i=1;i<=rdData.length();i++){
			//System.out.println(rdData);
			rdData=bReader.readLine();
			
			if(rdData.contains("M")) {
				String s[]=rdData.split(",");
				String s1=s[1].trim();
				weight=weight + Integer.parseInt(s1);
				//System.out.println(weight);
				avg=weight/i;
				System.out.println(avg);
			}			
		}
	}
}
