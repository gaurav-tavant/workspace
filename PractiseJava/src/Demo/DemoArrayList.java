package Day5;
import java.util.*;  

public class DemoArrayList {
 public static void main(String args[]){  
  ArrayList<String> al=new ArrayList<String>();
  
  al.add("Apple");  //adding to an arraylist
  al.add("Guava");  
  al.add("Banana");  
  al.add("Strawberry"); 
  
   for(String str:al)  //iterating through an arraylist
	  //for each string str in the array list al, print str. 
    System.out.println(str);
  
  al.remove(2); //removing from an arraylist
  al.add(1,"Orange");
  al.add("Jackfruit");
  System.out.println("\nNew array list");
  for(String obj:al)  
	    System.out.println(obj);
 }  
 
}  