package String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	private String cccd;
	private String password;

	@Override
	public String toString() {
		return "Regex [cccd=" + cccd + ", password=" + password + ", email=" + email + "]";
	}

	public Regex() {

	}

	public Regex(String cccd, String password, String email) {
		super();
		this.cccd = cccd;
		this.password = password;
		this.email = email;
	}

	private String email;

	public String getCccd() {
		return cccd;
	}

	public void setCccd(String cccd) {
		this.cccd = cccd;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void cccd(Regex regex) {
		Pattern pattern = Pattern.compile("0\\d{11}");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap can cuoc cong dan la: ");
		regex.setCccd(scanner.nextLine());
		Matcher matcher = pattern.matcher(regex.getCccd());
		System.out.println("Input: " + matcher.matches());
	}

	public void passWord(Regex regex) {
		Pattern pattern = Pattern.compile(".{5,}");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap mat khau la: ");
		regex.setPassword(scanner.nextLine());
		Matcher matcher = pattern.matcher(regex.getPassword());
		System.out.println("Input: " + matcher.matches());
	}

	public void email(Regex regex) {
		Pattern pattern = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$",
				Pattern.CASE_INSENSITIVE);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap email la: ");
		regex.setEmail(scanner.nextLine());
		Matcher matcher = pattern.matcher(regex.getEmail());
		System.out.println("Input: " + matcher.matches());
	}

	public static void main(String[] args) {
		Regex regex = new Regex();
		regex.cccd(regex);
		regex.passWord(regex);
		regex.email(regex);
	}
}
