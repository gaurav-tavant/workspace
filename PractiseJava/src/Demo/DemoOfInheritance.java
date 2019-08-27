package Day7;
//Program to show case example of inheritance
//Created by: Pallavi
//Declaring Person Class - PARENT
class PersonClass {
		   String name;
		   int age;
		   int birthday (int age) {
		      age = age + 1;
		      return age;
		   }
}
//Declaring Employee Class - CHILD CLASS
class EmployeeClass extends PersonClass {
	double salary;
	double pay (double sal) {
		double appr=(sal*10)/100;
		sal=sal+appr;
		return sal;
	}
}
//CHILD CLASS OF EMPLOYEE CLASS
class ManagementClass extends EmployeeClass {
	int shares;
	int tenure;
	//this function basically prints information about the Management
	void printDetails(){
		System.out.printf("The shares are %d and the tenure is %d", shares,tenure);
		System.out.println();
	}
}

//Showing how employee object can access variables and methods of Person Class
class DemoOfInheritance{
	public static void main(String[] args){
		PersonClass p= new PersonClass();
		EmployeeClass e=new EmployeeClass();
		ManagementClass m = new ManagementClass();
		
		
		e.name="Jayanti";
		e.age=22;
		e.salary=359000.98;
		e.birthday(e.age);
		System.out.println("Age after birthday: " +e.age);
		System.out.println(e.pay(e.salary));
		
		m.name="Tom";
		m.age=55;
		m.salary=4939393203.00;
		m.birthday(m.age);
		m.shares=1000;
		m.tenure=10;
		m.printDetails();
	}
}

