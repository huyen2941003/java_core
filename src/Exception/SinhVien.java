package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SinhVien {
	private String id;
	private String hoTen;
	private double diem;
	private int age;

	@Override
	public String toString() {
		return "SinhVien [id=" + id + ", hoTen=" + hoTen + ", diem=" + diem + ", age=" + age + "]";
	}

	public SinhVien() {

	}

	public SinhVien(String id, String hoTen, double diem, int age) {
		super();
		this.id = id;
		this.hoTen = hoTen;
		this.diem = diem;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void Nhap(SinhVien sv) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap id = ");
		sv.setId(scanner.nextLine());
		System.out.println("Nhap ho ten = ");
		sv.setHoTen(scanner.nextLine());
		while (true) {
			try {
				System.out.println("Nhap diem = ");
				sv.setDiem(scanner.nextDouble());
				if (sv.getDiem() >= 0 && sv.getDiem() <= 10) {
					break;
				} else {
					continue;
				}
			} catch (Exception e) {
				// TODO: handle exception
				continue;
			}
		}
		while (true) {
			try {
				System.out.println("Nhap tuoi = ");
				sv.setAge(scanner.nextInt());
				if (sv.getAge() >= 18 && sv.getAge() <= 100) {
					break;
				} else {
					continue;
				}
			} catch (Exception e) {
				// TODO: handle exception
				continue;
			}
		}
	}

	public void Nhap2(SinhVien sv) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Nhap id = ");
			sv.setId(scanner.nextLine());
			System.out.println("Nhap ho ten = ");
			sv.setHoTen(scanner.nextLine());
			while (true) {
				try {
					System.out.println("Nhap diem = ");
					sv.setDiem(scanner.nextDouble());
					if (sv.getDiem() >= 0 && sv.getDiem() <= 10) {
						break;
					} else {
						scanner.nextLine();
						continue;
					}
				} catch (Exception e) {
					// TODO: handle exception
					scanner.nextLine();
					continue;
				}
			}
			while (true) {
				try {
					System.out.println("Nhap tuoi = ");
					sv.setAge(scanner.nextInt());
					if (sv.getAge() >= 18 && sv.getAge() <= 100) {
						break;
					} else {
						continue;
					}
				} catch (Exception e) {
					// TODO: handle exception
					continue;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error");
		}
	}

	public void Nhap3(SinhVien sv) throws InputMismatchException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap id = ");
		sv.setId(scanner.nextLine());
		System.out.println("Nhap ho ten = ");
		sv.setHoTen(scanner.nextLine());
		System.out.println("Nhap diem = ");
		double diem = scanner.nextDouble();

		if (diem < 0 || diem > 10) {
			throw new InputMismatchException("Loi nhap");
		}
		sv.setDiem(diem);

		System.out.println("Nhap tuoi = ");
		int age = scanner.nextInt();
		if (age < 18 || age > 100) {
			throw new InputMismatchException("Loi nhap");
		}
		sv.setAge(age);

	}

	public static void main(String[] args) {
		SinhVien sv = new SinhVien();
		sv.Nhap(sv);
		System.out.println(sv.toString());
		sv.Nhap2(sv);
		System.out.println(sv.toString());
//		sv.Nhap3(sv);
//		System.out.println(sv.toString());
	}
}
