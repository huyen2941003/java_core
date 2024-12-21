package Interface_Exercise;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap id: ");
		String id = scanner.nextLine();
		System.out.println("Nhap name: ");
		String name = scanner.nextLine();
		System.out.println("Nhap age: ");
		int age = scanner.nextInt();
		System.out.println("Nhap mark: ");
		int mark = scanner.nextInt();

		Student std = new Student(mark, id, name, age);
		std.setGrade();
		System.out.println("Student [mark=" + mark + ", grade=" + std.getGrade() + ", id=" + id + ", name=" + name
				+ ", age=" + age + "]");
	}
}
