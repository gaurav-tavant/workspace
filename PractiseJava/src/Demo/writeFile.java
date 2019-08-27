package Day6;
//Program to write a file using Java
//Created by: Pallavi

import java.io.*;

public class writeFile {

	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub
	
		FileOutputStream fos = new FileOutputStream("d:\\newfile.txt"); //create stream object
		PrintWriter pwriter = new PrintWriter(fos);
		//this is going to write the content in the file. 
		pwriter.println("This is my first Java File");
		pwriter.println("Feeling happy to create it!");
		pwriter.println("Hope you are liking it");
		
		pwriter.close(); // important to close so as to avoid, data loss, or file being corrupt.
		fos.close();
		
	}
		   

}


