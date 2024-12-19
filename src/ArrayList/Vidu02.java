package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Vidu02 {
	public static void main(String[] args) {
		ArrayList<Double> array = new ArrayList<Double>();
		Scanner scanner = new Scanner(System.in);
		double sum = 0;
		while (true) {
			System.out.println("Nhap phan tu mang: ");
			double x = scanner.nextDouble();
			array.add(x);
			sum += x;
			scanner.nextLine();
			System.out.println("Co muon nhap nua khong? Y or N: ");
			String option = scanner.nextLine();
			if (option.equals("N") || option.equals("n")) {
				break;
			}
		}
		System.out.println("Mang co gia tri: " + array.toString() + " Sum = " + sum);

		double Sum1 = 0;
		for (int i = 0; i < array.size(); i++) {
			Sum1 += array.get(i);
		}
		System.out.println("Sum = " + Sum1);
	}
}
