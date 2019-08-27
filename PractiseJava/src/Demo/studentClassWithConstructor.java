package Day7;

public class studentClassWithConstructor {
	String name ="";
	int age=0;
	double marks=0.0;
	//constructor 
	public studentClassWithConstructor(String sname, int sage, double smarks){
			name=sname;
			age=sage;
			marks=smarks;
	}
	//Declaration of some methods 
	public void printDetails(){
		System.out.println("Student with the name "+ name +" has got marks as "+ marks);
	}
	
	
	public static void main(String args[]){
		studentClassWithConstructor stud= new studentClassWithConstructor("Tom",12,98.4);
		stud.printDetails();
				
		studentClassWithConstructor stud1=new studentClassWithConstructor("Rhea",11,98);
		stud1.printDetails();
		
	}
	
}
