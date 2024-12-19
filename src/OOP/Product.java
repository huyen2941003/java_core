package OOP;

import java.util.Scanner;

public class Product {
	private String name;
	private float price;
	private float stax;

	public Product() {
	}

	public Product(String name, float price, float stax) {
		this.name = name;
		this.price = price;
		this.stax = stax;
	}

	public String getName() {
		return this.name;
	}

	public float getPrice() {
		return this.price;
	}

	public float getStax() {
		return this.stax;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setStax(float stax) {
		this.stax = stax;

	}

	public void nhapThongTin(Product pd) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên sản phẩm: ");
		pd.setName(scanner.nextLine());
		System.out.println("Nhập giá sản phẩm: ");
		pd.setPrice(scanner.nextFloat());
		System.out.println("Nhập % thuế sản phẩm: ");
		pd.setStax(scanner.nextFloat());
	}

	public void xuatThongTin(Product pd) {
		System.out.println(
				"Hang vua nhap la: Name = " + pd.getName() + " Price = " + pd.getPrice() + " Stax = " + pd.getStax());
	}

	public double getTaxPrice(float price, float stax) {
		return price * stax;
	}
}
