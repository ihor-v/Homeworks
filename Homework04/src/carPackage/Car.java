package carPackage;

public class Car {
	String color;
	String model;
	int rozhid;
	int objem;
	int probih;
	boolean isEmpty;

	Car(String model) {
		color = "Green";
		this.model = model;
		rozhid = 6;
		objem = 25;
		isEmpty = false;
		probih = 130256;

	}

	void drive(int km) {
		if (isEmpty) {
			System.out.println("Empty Fuel Tank");
		} else if (objem / rozhid * 100 > km) {
			this.probih = this.probih + km;
			System.out.println(model + " has ride " + km + " and total is " + this.probih);
		} else {
			this.probih = this.probih + (objem / probih * 100);
			System.out.println(model + " rided " + (objem / probih * 100) + " and total km is " + this.probih);
			isEmpty = true;
		}
	}

	void reVuel(int fuelVolume) {

	}

	void distance() {

	}
}
