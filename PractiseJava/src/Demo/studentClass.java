package Day7;

public class studentClass {
	//Declaration of some attributes
	String name ="";
	int age=0;
	double marks=0.0;
	//Declaration of some methods 
	public void printDetails(){
		System.out.println("Student with the name "+ name +" has got marks as "+ marks);
	}
	
	public int birthday(int agee){
		int ageofstud=agee+1;
		return ageofstud;
	}
	
	public static void main(String args[]){
		
		studentClass stud= new studentClass(); //new keyword helps instantiate the object
	
		stud.name="john";
		stud.age=12;
		stud.marks=90;
		stud.printDetails();
		System.out.println("John age after birthday will be: "+ stud.birthday(stud.age));
		
		studentClass stud1=new studentClass();
		stud1.name="julia";
		stud1.age=14;
		stud1.marks=100;
		stud1.printDetails();
		
	}
	
}
