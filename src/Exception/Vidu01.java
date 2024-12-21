package Exception;

import java.util.Scanner;

public class Vidu01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("Nhap x = ");
				int x = scanner.nextInt();
				try {
					System.out.println("a = " + 10 / x);
					break;
				} catch (Exception ex) {
					System.out.println("Error");
					continue;
				}
			} catch (Exception ex) {
				scanner.next();
				System.out.println("Error");
			}
		}
	}
}
