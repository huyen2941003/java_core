package Interface_Exercise;

public class Student extends Person {
	private int mark;
	private String grade;

	@Override
	public String toString() {
		return "Student [mark=" + mark + ", grade=" + getGrade() + ", id=" + id + ", name=" + name + ", age=" + age
				+ "]";
	}

	public Student(int mark, String id, String name, int age) {
		super(id, name, age);
		// TODO Auto-generated constructor stub
		this.mark = mark;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade() {
		if (this.getMark() >= 8 && this.getMark() <= 10) {
			this.grade = "A";
		} else if (this.getMark() >= 7 && this.getMark() < 8) {
			this.grade = "B";
		} else if (this.getMark() >= 6 && this.getMark() < 7) {
			this.grade = "C";
		} else if (this.getMark() >= 5 && this.getMark() < 6) {
			this.grade = "D";
		} else {
			this.grade = "Thi lai";
		}
	}

}
