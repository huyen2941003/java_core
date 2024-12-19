package OOP;

public class Products {
	public static void main(String[] args) {
		Product pd1 = new Product();
		pd1.nhapThongTin(pd1);
		pd1.xuatThongTin(pd1);
		System.out.println("Tien thue: " + pd1.getTaxPrice(pd1.getPrice(), pd1.getStax()));

		Product pd2 = new Product();
		pd2.nhapThongTin(pd2);
		pd2.xuatThongTin(pd2);
		System.out.println("Tien thue: " + pd2.getTaxPrice(pd2.getPrice(), pd2.getStax()));
	}
}
