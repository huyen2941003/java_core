package String;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	private String name;
	private int id;

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	public Student() {

	}

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<Student>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Nhap ten: ");
			String name = scanner.nextLine();
			System.out.println("Nhap id: ");
			int id = scanner.nextInt();
			scanner.nextLine();

			Student std = new Student();
			std.setName(name);
			std.setId(id);

			array.add(std);
			if (array.size() == 3) {
				break;
			}
		}
		System.out.println(array.toString());

		for (int i = 0; i < array.size(); i++) {
			if (array.get(i).getName().startsWith("Nguyễn")) {
				System.out.println("Student: " + array.get(i).toString());
			}
		}
	}
}
