package Day7;

class ParentClass{
	void sayHello(){
		System.out.println("Hello");
	}
	void sayBye(){
		System.out.println("Bye");
	}
}
class ChildClass extends ParentClass{
	//MethodOverloading
	void sayHello(String name){
		String greet = "Hello " +name;
		System.out.println(greet);
	}
	//Method Override
	void sayBye(){
		System.out.println("Sayonara!");
	}
}
public class MethodOverLoadingOverRidding {
	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		
		cc.sayHello(); //parent class
		cc.sayHello("Sujhata"); //child class
		cc.sayBye();
		
	}

}











