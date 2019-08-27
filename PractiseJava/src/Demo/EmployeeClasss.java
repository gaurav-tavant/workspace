package Day7;

public class EmployeeClasss {
	String ename;
	String edesignation;
	double salary;
	
	void printEmpInformation() {
		System.out.println("Employee with name: "+ ename+" with designation "+ edesignation+ " has salary " + salary);
	}
	double appraisal(int per) {
		salary=salary+(salary*per/100);
		return salary;
	}
		
	public EmployeeClasss(String name, String desig, double sal)
	{
		ename=name;
		edesignation=desig;
		salary=sal;
	}
	
	public static void main(String[] args) {
		EmployeeClasss emp= new EmployeeClasss("Tom","CEO",3400);
		/*emp.ename="Tom";
		emp.edesignation="CEO";
		emp.salary=3400;*/
		emp.appraisal(3);
		emp.printEmpInformation();
	}
}
