package java_core;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!!!");

		int a = 5;
		int b = 6;
		int c = a + b;
		System.out.println("Sum: " + c);

		int test = 5 + 9 * 3 - 10 / 2;
		System.out.println("Test = " + test);

		System.out.println("Hello!!!");
		System.out.printf("Co %f dang chao", +30.55);
		System.out.printf("\n");
		System.out.printf("Co %.0f dang chao", +30.55);
		System.out.printf("\n");

		int age = 21;
		String name = "Huyen";
		System.out.println("My age is: " + age + " and my name is: " + name);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten cua ban: ");
		String your_name = scanner.nextLine();
		System.out.println("Nhap tuoi cua ban: ");
		int your_age = scanner.nextInt();
		System.out.println("My age is: " + your_age + " and my name is: " + your_name);

		// Min_max
		System.out.println("Nhap vao so thu nhat: ");
		int first_number = scanner.nextInt();
		System.out.println("Nhap vao so thu hai: ");
		int second_number = scanner.nextInt();
		System.out.println("Nhap vao so thu ba: ");
		int third_number = scanner.nextInt();

		System.out.println("So lon nhat giua a va b: " + Math.max(first_number, second_number));
		System.out.println("So be nhat giua a va b: " + Math.min(first_number, second_number));
		System.out.println("So nho nhat trong 3 so: " + Math.min(Math.min(first_number, second_number), third_number));

		// Power
		System.out.println("a^b = " + Math.pow(first_number, second_number));

		// Sqrt
		System.out.println("Can bac hai cua a = " + Math.sqrt(first_number));

		scanner.close();

	}
}
