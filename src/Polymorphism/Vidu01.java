package Polymorphism;

class Animal {
	void eat() {
		System.out.println("Animal is eating ....");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("Dog is eating ....");
	}
}

class Cat extends Animal {
	void eat() {
		System.out.println("Cat is eating ....");
	}
}

class BabyCat extends Cat {
	void eat() {
		System.out.println("BabyCat is eating ....");
	}
}

public class Vidu01 {
	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.eat();

		Animal babyCat = new BabyCat();
		babyCat.eat();
	}
}
