package DemoBatchPack1;

public class ChildClassHelloWorld extends HelloWorld {
	public static void main(String args[]){
		HelloWorld hwObj= new HelloWorld();
		
		//The subclass in the same package doesn't allow private variable access/
		
		
		hwObj.protectVar="abbc";
		hwObj.publicVar ="sdd";
		hwObj.Hello();
		
		
		ChildClassHelloWorld child = new ChildClassHelloWorld();
		
		
		
		
		
	}
}
