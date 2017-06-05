package carPackage;

import java.util.Random;

public class Car {
	String color;
	String model;
	int fuelConsumption;
	int fuelVolume;
	int distance;

	Car(String model) {
		color = randColor();
		this.model = model;
		fuelConsumption = rand(5, 25);
		fuelVolume = rand(0, 55);
		distance = rand(0, 120000);

	}

	Car(String model, int fuelConsumption, int fuelVolume) {
		if (fuelVolume < 0) {
			System.out.println(model + " can not have " + fuelVolume + "l in tha tank. Sorry!");
			return;
		}
		color = randColor();
		this.model = model;
		this.fuelConsumption = fuelConsumption;
		this.fuelVolume = fuelVolume;
		distance = rand(0, 20000);

	}

	void drive(int km) {
		reFuel(fuelVolume);
		int tmp = canTravel();
		if (tmp > km) {
			distance = distance + km;
			fuelVolume -= km * fuelConsumption / 100;
			System.out.println(model + " traveled " + km + " km and total distance is " + distance + " km.");
			System.out.println(
					"Now we have in tank - " + fuelVolume + "l. and we can still travel " + canTravel() + "km.");
		} else {
			distance = distance + tmp;
			fuelVolume = 0;
			System.out.println(model + " traveled " + tmp + " km and total distance is " + distance + " km.");
			System.out.println("We have in tank - " + fuelVolume + "l.");
		}
	}

	void reFuel(int fuelVolume) {
		if (fuelVolume == 0) {
			System.out.println("Fuel tank is empty. Please, fill the tank in the car.");
			return;
		}
	}
	void fillTank(int liters){
		this.fuelVolume += liters;
	}

	int canTravel() {
		return fuelVolume * 100 / fuelConsumption;
	}

	void distance() {
		System.out.println("Total distance - " + distance);

	}

	void carInfo() {
		System.out.println("Car info:");
		System.out.println("Car model is - " + model + ";");
		System.out.println("Color of the car is - " + color + ";");
		System.out.println("Fuel consumption for 100 km - " + fuelConsumption + " l/km.");
		System.out.println("In tank we have - " + fuelVolume + " l.");
		System.out.println("Total distance is - " + distance + " km.");
	}

	String randColor() {
		String color = "Black";
		int rndCol = rand(0, 4);
		switch (rndCol) {
		case 0: {
			color = "Green";
			return color;
		}
		case 1: {
			color = "Yellow";
			return color;
		}
		case 2: {
			color = "White";
			return color;
		}
		case 3: {
			color = "Grey";
			return color;
		}
		case 4: {
			color = "Blue";
			return color;
		}
		default:
			return color;
		}
	}

	int rand(int min, int max) {
		Random random = new Random();
		int num = min + random.nextInt(max - min + 1);
		return num;
	}
}
