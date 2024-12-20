package String;

import java.util.Scanner;

public class Vidu01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap username: ");
		String username = scanner.nextLine();
		System.out.println("Nhap password: ");
		String password = scanner.nextLine();
		if (username.equals("thuhuyen") && password.length() > 6) {
			System.out.println("Hop le");
		} else {
			System.out.println("Khong hop le");
		}
	}
}
