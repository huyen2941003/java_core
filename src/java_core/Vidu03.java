package java_core;

import java.util.Arrays;
import java.util.Scanner;

public class Vidu03 {
	public static void Vonglap() {
		for (int i = 0; i < 4; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(i);
		}

		for (int i = 0; i < 6; i++) {
			if (i == 4) {
				continue;
			}
			System.out.println(i);
		}

		int i = 1;
		while (i < 5) {
			System.out.println(i);
			i++;
		}

		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while (j < 3);
	}

	public static void Arrays() {
		String[] clubs = { "GenG", "HLE", "T1", "DK" };
		System.out.println("Mang: " + Arrays.toString(clubs));
		clubs[0] = "ChenChi";
		System.out.println("So luong: " + clubs.length);
		System.out.println("Mang sau khi thay doi: " + Arrays.toString(clubs));

		String[] a = new String[5];
		a[0] = "GenG";
		a[1] = "T1";
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);

		// foreach
		for (String element : a) {
			System.out.println(element);
		}

		int[] number = { 1, 2, 6, 2, 7, 3, 0 };
		System.out.println(Arrays.toString(number));
		Arrays.sort(number);
		System.out.println(Arrays.toString(number));
	}

	public static void Sapxep() {
		int[] number = { 1, 2, 6, 2, 7, 3, 0 };
		System.out.println(Arrays.toString(number));
		for (int i = 0; i < number.length - 1; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if (number[i] < number[j]) {
					int temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
		System.out.println("Mang moi: " + Arrays.toString(number));
	}

	public static void SNT() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao 1 so: ");
		int a = scanner.nextInt();
		scanner.close();

		if (a <= 1) {
			System.out.println("So vua nhap khong phai so nguyen to");
			return;
		}

		boolean isPrime = true;
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println("So vua nhap la so nguyen to");
		} else {
			System.out.println("So vua nhap khong phai so nguyen to");
		}

	}

	public static void BangCuuChuong() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao 1 so: ");
		int a = scanner.nextInt();
		System.out.println("Bang cuu chuong: ");

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d \n", a, i, a * i);
		}
		scanner.close();
	}

	public static void NhapMang() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao so luong mang: ");
		int number = scanner.nextInt();
		int[] arrays = new int[number];
		for (int i = 0; i < number; i++) {
			System.out.printf("Nhap mang array[%d] = ", i);
			arrays[i] = scanner.nextInt();
		}
		System.out.println("Mang: " + Arrays.toString(arrays));
		Arrays.sort(arrays);
		System.out.println("Mang sau khi sap xep: " + Arrays.toString(arrays));

		int max = arrays[0];
		for (int i = 0; i < arrays.length; i++) {
			if (arrays[i] > max) {
				max = arrays[i];
			}
		}
		System.out.println("Mang lon nhat: " + max);

		int min = arrays[0];
		int min2 = arrays[0];
		for (int i = 0; i < arrays.length; i++) {
			if (arrays[i] < min) {
				min = arrays[i];
			}
		}
		for (int i = 0; i < arrays.length; i++) {
			min2 = Math.min(min2, arrays[i]);
		}
		System.out.println("Mang nho nhat: " + min);
		System.out.println("Mang nho nhat2: " + min2);

		scanner.close();

	}

	public static void main(String[] args) {
		NhapMang();
	}
}
