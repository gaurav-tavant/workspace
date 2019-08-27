package Demo;

import java.util.HashMap;

public class HashEg {
	
	public static void main(String[] args) {

		HashMap<String, String> hashobj=new HashMap<String, String>();
		
		hashobj.put("Emp01", "Tom:CEO:London");
		hashobj.put("Emp02", "Rhea:CTO:Poland");
		hashobj.put("Emp03", "Fiona:VPHR:France");
		hashobj.put("Emp04", "Paul:CFO:Romania");
		hashobj.put("Emp05", "Diana:COO:Washinton");
		
		System.out.println(hashobj.get("Emp01"));
		
		Object[] obj=hashobj.keySet().toArray();
			
		for(int i=0;i<=obj.length;i++) {
		String strobj=hashobj.get(obj[i]);
		System.out.println(obj[i]);
		
		}
	}	
}
