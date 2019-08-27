package Day6;
//Program to read a file using Java
//Created by: Pallavi

import java.io.*;

public class readFile {

	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub
		
		FileReader readerObj = new FileReader("d:\\newfile.txt"); //stream object
		BufferedReader bufReader = new BufferedReader(readerObj); //input stream
		
		int count=0;
		String line=bufReader.readLine(); // is to read file line by line
				
		while(line != null)  //Read till End of File. 
		{
			count++; //print the count of line read
			System.out.println(line); // print the line read
			line=bufReader.readLine(); //print the next line 
		}
		System.out.println("\n\nThe file contains line: "+ count);
		bufReader.close();
		readerObj.close();
	}

}
