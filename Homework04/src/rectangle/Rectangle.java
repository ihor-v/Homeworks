package rectangle;

import java.util.Random;

public class Rectangle {
	int high;
	int width;

	Rectangle() {
		high = rand(1,15);
		width = rand(1, 15);
	}

	Rectangle(int high, int width) {
		this.high = high;
		this.width = width;
	}

	void area() {
		System.out.println("The area of rectangle is = " + width * high + " cm^2;");
	}

	void perimeter() {
		System.out.println("The perimeter of rectangle is = " + 2 * (width + high) + " cm.");
	}
	
	int rand(int min, int max) {
		Random random = new Random();
		int num = min + random.nextInt(max - min + 1);
		return num;
	}

}
