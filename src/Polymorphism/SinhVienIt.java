package Polymorphism;

public class SinhVienIt extends SinhVien {
	protected double scoreJava;
	protected double scoreHtml;

	public SinhVienIt(double scoreJava, double scoreHtml) {
		super();
		this.scoreJava = scoreJava;
		this.scoreHtml = scoreHtml;
	}

	@Override
	public String toString() {
		return "SinhVienIt [scoreJava=" + scoreJava + ", scoreHtml=" + scoreHtml + "]";
	}

	public double getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(double scoreJava) {
		this.scoreJava = scoreJava;
	}

	public double getScoreHtml() {
		return scoreHtml;
	}

	public void setScoreHtml(double scoreHtml) {
		this.scoreHtml = scoreHtml;
	}

	@Override
	double getDiem() {
		// TODO Auto-generated method stub
		return (this.getScoreJava() * 2 + this.getScoreHtml()) / 3;
	}

}
