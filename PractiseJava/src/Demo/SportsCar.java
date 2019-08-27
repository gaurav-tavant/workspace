package Day7;

public class SportsCar implements CarInterface {

	public void mileage() {
		// TODO Auto-generated method stub
		System.out.println(20);
		}

	public void typeOfCar() {
		// TODO Auto-generated method stub
		System.out.println("Sports");
	}

	public void fuelengine() {
		// TODO Auto-generated method stub
		System.out.println("diesel");
	}

	public void color() {
		// TODO Auto-generated method stub
		System.out.println("customized");
	}
	
public static void main(String[] args){
		SportsCar sc= new SportsCar();
		sc.color();
	}
}
