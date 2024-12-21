package Inheritance;

import java.util.Scanner;

public class SinhVienIT extends SinhVien {
	protected String language;

	public SinhVienIT() {
	}

	public void getPriceTax() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Price = ");
		super.setPrice(scanner.nextDouble());
		System.out.println("Tax = ");
		super.setTax(scanner.nextDouble());
		System.out.println("Price * Tax = " + super.getPriceTax(super.getPrice(), super.getTax()));
	}

	public static void main(String[] args) {
		SinhVienIT sv = new SinhVienIT();
		sv.getPriceTax();
	}

	@Override
	void tinhDiem() {
		// TODO Auto-generated method stub

	}
}
