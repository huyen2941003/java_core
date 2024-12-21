package Exception;

import java.util.Scanner;

public class Vidu02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap x =");
		try {
			int x = scanner.nextInt();
			System.out.println("Run");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Run error");
		} finally {
			// TODO: handle finally clause
			System.out.println("Run finally");
			scanner.close();
		}

		// Tu dong dong thu vien
		try (Scanner scanners = new Scanner(System.in)) {
		} catch (Exception e) {
		}
	}
}
