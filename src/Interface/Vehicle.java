package Interface;

public interface Vehicle {
	void start();

	default void stop() {
		System.out.println("Vehicle is stopping.");
	}
}
