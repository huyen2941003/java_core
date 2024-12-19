package OOP;

public class Vidu02 {
	public static void main(String[] args) {
		// Su dung ham tao
		Student std = new Student();
		System.out.println("check object: " + std.getName());
		Student std1 = new Student("Huyen", 21);
		System.out.println("Name = " + std1.getName() + " and Age = " + std1.getAge());
		std1.setName("Thu Huyen");
		System.out.println("Name = " + std1.getName() + " and Age = " + std1.getAge());
	}
}
