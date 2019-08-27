package Demo;

public class Employee {
	
	String ename;
	String designation;
	double salary;
	
	double appraisal(int appercent) {
		
		salary=salary+((salary*appercent)/100);		
		return salary;		
	}	
	
	/*public Employee(String name, String desig, double sal) {
		
		ename=name;
		designation=desig;
		salary=sal;
	}
	*/
	void printinfo() {
		
		System.out.println(ename);
		System.out.println(designation);
		System.out.println(salary);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee obj=new Employee();
		obj.salary=1000;
		obj.appraisal(20);
		obj.printinfo();
	}
}
