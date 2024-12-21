package Interface;

public class Main {
	public static void main(String[] args) {
		IAnimal pig = new Pig();
		pig.animalSound();
		pig.run();
	}
}
