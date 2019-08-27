package Demo;

public class Scope {
	
	public int a;
	private int b;
	protected int c;
	int d;
	
	public void m1() {
		System.out.println("public method");
	}
	
	private void m2(){
		System.out.println("private method");
	}
	
	protected void m3() {
		System.out.println("protected method");
	}
	
	void m4() {
		System.out.println("default method");
	}
	
	public static void main(String[] args) {
		
		//Scope obj=new Scope();
	}
}