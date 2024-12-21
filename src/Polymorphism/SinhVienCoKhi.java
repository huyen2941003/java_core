package Polymorphism;

public class SinhVienCoKhi extends SinhVien {

	protected double scoreCNC;
	protected double scorePLC;

	public SinhVienCoKhi(double scoreCNC, double scorePLC) {
		super();
		this.scoreCNC = scoreCNC;
		this.scorePLC = scorePLC;
	}

	@Override
	public String toString() {
		return "SinhVienCoKhi [scoreCNC=" + scoreCNC + ", scorePLC=" + scorePLC + "]";
	}

	public double getScoreCNC() {
		return scoreCNC;
	}

	public void setScoreCNC(double scoreCNC) {
		this.scoreCNC = scoreCNC;
	}

	public double getScorePLC() {
		return scorePLC;
	}

	public void setScorePLC(double scorePLC) {
		this.scorePLC = scorePLC;
	}

	@Override
	double getDiem() {
		// TODO Auto-generated method stub
		return (this.getScoreCNC() + this.getScorePLC()) / 2;
	}

}
