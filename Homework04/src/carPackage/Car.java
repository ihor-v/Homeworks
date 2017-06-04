package carPackage;

public class Car {
	String color;
	String model;
	int rozhid;
	int objem;
	int probih;
	Car() {

	}
	void drive(int km) {
		if (objem / rozhid > km) {
			System.out.println("Test one");
		}
	}

	void reVuel(int fuelVolume) {

	}

	void distance() {

	}
}
