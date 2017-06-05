package carPackage;

public class Main {

	public static void main(String[] args) {
		Car volvo = new Car("Volvo");
		volvo.carInfo();
		volvo.drive(25);
		Car bmw = new Car("BMW", 25, 25);
		bmw.carInfo();
		bmw.drive(100);
		bmw.fillTank(50);
		bmw.drive(50);
		bmw.distance();
	}

}
