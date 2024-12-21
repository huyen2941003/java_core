package Inheritance;

public abstract class SinhVien {
	protected String id;
	protected String name;
	protected double price;
	protected double tax;

	abstract void tinhDiem();

	public SinhVien() {
	}

	@Override
	public String toString() {
		return "SinhVien [id=" + id + ", name=" + name + ", price=" + price + ", tax=" + tax + "]";
	}

	public SinhVien(String id, String name, double price, double tax) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getPriceTax(double price, double tax) {
		return this.price * this.tax;
	}
}
