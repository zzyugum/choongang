package oraTest0623;

public class NumberDto {
	private int kor;
	private int eng;
	private int math;
	public NumberDto(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	@Override
	public String toString() {
		return "NumberDto [kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	
}
