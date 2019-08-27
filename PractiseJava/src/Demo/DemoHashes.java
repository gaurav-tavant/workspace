package Day5;
import java.util.*;
public class DemoHashes {
	public static void main(String[] args){
		
		HashMap<String,String> studentData = new HashMap<String,String>();
		//key is a string, and value is also a string. 
		
		//adding data in hash. key, value. each key value pair in hash map is unique. and keys are always unique
		studentData.put("ID001", "Bob");
		studentData.put("ID002", "Prithvi");
		studentData.put("ID003", "Uma");
		studentData.put("ID004", "Rajeev");
		studentData.put("ID005", "Bob");
		studentData.put("ID006", "Kiran");
			
		System.out.println(studentData.containsKey("ID001")); //returns true if key is available else false
		System.out.println(studentData.containsValue("Bob")); //return true if value available else false
		System.out.println(studentData.containsValue("FER")); //return true if value available else false
		
		
		System.out.println(studentData.get("ID002"));//returns the value associated with the key
		
		studentData.remove("ID004"); //remove the key value pair.
		
		Object[] keyArray=studentData.keySet().toArray();//will return an array of keys
		
		for(int i =0;i<keyArray.length;i++){
			System.out.print(keyArray[i]); //print the keys inside the array
			System.out.println(" => "+studentData.get(keyArray[i]));
			
		}
				
	}

}
