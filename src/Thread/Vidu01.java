package Thread;

public class Vidu01 extends Thread {
	public void run() {
		System.out.println("start thread");
		long sum = 0L;
		for (int i = 0; i < 1000000000L; i++) {
			sum += 1;
		}
		System.out.println("end thread");
	}

	public static void main(String[] args) {
		int MAX = 10;
		for (int i = 0; i < MAX; i++) {
			(new Vidu01()).start();
		}
		System.out.println("Finish");
	}
}
