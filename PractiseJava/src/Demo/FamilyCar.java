package Day7;

public class FamilyCar implements CarInterface {

	public void mileage() {
		// TODO Auto-generated method stub
		System.out.println(12);
	}

	public void typeOfCar() {
		// TODO Auto-generated method stub
		System.out.println("family");
	}

	public void fuelengine() {
		// TODO Auto-generated method stub
		
		System.out.println("petrol");
	}

	public void color() {
		// TODO Auto-generated method stub
		System.out.println("white");
	}
	

	
	public static void main(String[] args){
		
		FamilyCar fc= new FamilyCar();
		fc.color();
	}

}
