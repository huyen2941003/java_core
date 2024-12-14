package java_core;

import java.util.Scanner;

public class Vidu02 {
	public static void Phuongtrinhbacnhat(int a, int b) {
		System.out.printf("Giai phuong trinh bac nhat %dx + %d = 0", a, b);
		System.out.printf("\n");
		if ((a == 0 && b == 0))
			System.out.println("Phuong trinh co vo so nghiem");
		else if (a == 0 && b != 0)
			System.out.println("Phuong trinh vo nghiem");
		else
			System.out.println("Nghiem cua phuong trinh la: " + (float) -b / a);
	}

	public static void Phuongtrinhbachai(int aa, int bb, int cc) {
		System.out.printf("Giai phuong trinh bac hai %dx^2 + %dx + %d = 0\n", aa, bb, cc);
		if (aa == 0 && bb == 0 && cc == 0)
			System.out.println("Phuong trinh vo so nghiem");
		else if (aa == 0 && bb == 0 && cc != 0)
			System.out.println("Phuong trinh vo nghiem");
		else if (aa == 0 && bb != 0 && cc != 0)
			System.out.println("Phuong trinh co nghiem x = " + (float) -cc / bb);
		else if (aa != 0 && bb != 0 && cc != 0) {
			double delta = bb * bb - 4 * aa * cc;
			if (delta < 0)
				System.out.println("Phuong trinh khong co nghiem nao!!!");
			else if (delta == 0)
				System.out.println("Phuong trinh co hai nghiem kep x = " + (float) -bb / (2 * aa));
			else if (delta > 0) {
				System.out
						.println("Phuong trinh co nghiem thu nhat x1 = " + (float) (-bb + Math.sqrt(delta)) / (2 * aa));
				System.out
						.println("Phuong trinh co nghiem thu nhat x2 = " + (float) (-bb - Math.sqrt(delta)) / (2 * aa));
			}
		}
	}

	public static void Tiendien(int number) {
		if (number > 0 && number <= 100)
			System.out.println("So tien dien phai tra la: " + number * 1000);
		else if (number > 100)
			System.out.println("So tien dien phai tra la: " + (100 * 1000 + (number - 100) * 1500));
	}

	public static void main(String[] args) {

		// qua mon
		int score = 5;
		if (score > 5)
			System.out.println("Du diem qua mon");
		else
			System.out.println("Khong du diem qua mon");

		// tinh % thue
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so tien thue (don vi trieu dong) la: ");
		float scot = scanner.nextFloat();
		if (scot < 10)
			System.out.println("Khong dong thue");
		else if (scot >= 10 && scot <= 15)
			System.out.println("Thue 10%");
		else if (scot > 15 && scot <= 30)
			System.out.println("Thue 20%");
		else
			System.out.println("Thue 50%");

		// switch case ngay
		int day = 4;
		switch (day) {
		case 1:
			System.out.println("Monday!!!");
			break;
		case 2:
			System.out.println("Tuesday!!!");
			break;
		case 3:
			System.out.println("Wednesday!!!");
			break;
		case 4:
			System.out.println("Thursday!!!");
			break;
		case 5:
			System.out.println("Friday!!!");
			break;
		case 6:
			System.out.println("Saturday!!!");
			break;
		case 7:
			System.out.println("Sunday!!!");
			break;
		default:
			System.out.println("Dont known");
		}

		// Lua chon
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ------------------ ++");
		System.out.println("| 1. Cộng              |");
		System.out.println("| 2. Trừ               |");
		System.out.println("| 3. Kết thúc          |");
		System.out.println("++ ------------------ ++");

		System.out.println("Nhập lựa chọn của bạn: ");
		int choice = scanner.nextInt();
		System.out.println("Lựa chọn của bạn là : ");
		switch (choice) {
		case 1:
			System.out.println("Phép cộng");
			break;
		case 2:
			System.out.println("Phép trừ");
			break;
		case 3:
			System.out.println("Kết thúc");
			System.exit(0);
		default:
			System.out.println("Không có");
		}

		//
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất               |");
		System.out.println("| 2. Giải phương trình bậc hai                |");
		System.out.println("| 3. Tính số tiền điện                        |");
		System.out.println("| 4. Kết thúc                                 |");
		System.out.println("++ ------------------ ++");
		System.out.println("Lua chon cua ban: ");
		int value = scanner.nextInt();

		switch (value) {
		case 1:
			System.out.println("Ban vua lua chon giai phuong trinh bac nhat");
			System.out.println("Nhap vao a: ");
			int a = scanner.nextInt();
			System.out.println("Nhap vap b: ");
			int b = scanner.nextInt();
			Phuongtrinhbacnhat(a, b);
			break;
		case 2:
			System.out.println("Ban vua lua chon giai phuong trinh bac 2");
			System.out.println("Nhap vao a: ");
			int aa = scanner.nextInt();
			System.out.println("Nhap vap b: ");
			int bb = scanner.nextInt();
			System.out.println("Nhap vap c: ");
			int cc = scanner.nextInt();
			Phuongtrinhbachai(aa, bb, cc);
			break;
		case 3:
			System.out.println("Ban vua lua chon tinh tien dien");
			System.out.println("Nhap so dien la: ");
			int number = scanner.nextInt();
			Tiendien(number);
			break;
		case 4:
			System.out.println("Chuong trinh da ket thuc");
			System.exit(0);
		default:
			System.out.println("Khong tim thay");
			System.exit(0);
		}
		scanner.close();
	}

}
