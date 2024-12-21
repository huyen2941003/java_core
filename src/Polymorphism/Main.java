package Polymorphism;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap diem Java: ");
		Double scoreJava = scanner.nextDouble();
		System.out.println("Nhap diem Html: ");
		Double scoreHtml = scanner.nextDouble();
		SinhVien svit = new SinhVienIt(scoreJava, scoreHtml);
		System.out.println("Diem sinh vien it = " + svit.getDiem());

		System.out.println("Nhap diem CNC: ");
		Double scoreCNC = scanner.nextDouble();
		System.out.println("Nhap diem PLC: ");
		Double scorePLC = scanner.nextDouble();
		SinhVien svck = new SinhVienCoKhi(scoreCNC, scorePLC);
		System.out.println("Diem sinh vien co khi = " + svck.getDiem());
	}
}
