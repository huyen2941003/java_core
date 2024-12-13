package java_core;

import java.util.Scanner;

public class Vidu01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten cua ban: ");
		String name = scanner.nextLine();
		System.out.println("Nhap diem cua ban: ");
		float score = scanner.nextFloat();
		System.out.println(name + " co diem = " + score);

		System.out.println("Nhap chieu dai cua hinh chu nhat: ");
		float length = scanner.nextFloat();
		System.out.println("Nhap chieu rong cua hinh chu nhat: ");
		float width = scanner.nextFloat();
		System.out.println("Chu vi hinh chu nhat = " + (length + width) * 2);
		System.out.println("Dien tich hinh chu nhat = " + (length * width));
		System.out.println("Canh nho nhat = " + Math.min(length, width));

		System.out.println("Nhap canh cua khoi lap phuong: ");
		float side = scanner.nextFloat();
		System.out.println("The tich khoi lap phuong = " + Math.pow(side, 3));

		scanner.close();
	}
}
