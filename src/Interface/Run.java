package Interface;

class Car implements Vehicle {
	public void start() {
		System.out.println("Car is starting.");
	}
}

class Bike implements Vehicle {
	public void start() {
		System.out.println("Bike is starting.");
	}

	public void stop() {
		System.out.println("Bike is stopping manually.");
	}
}

public class Run {
	public static void main(String[] args) {
		Vehicle car = new Car();
		car.start();
		car.stop();

		Vehicle bike = new Bike();
		bike.start();
		bike.stop();
	}
}
