package web.static0601;

public class Student {

	private String name;
	private int kor;
	private int math;
	private int eng;
	
	public int sum() {
		
		return kor+math+eng;
	}
	public double avg() {
		
		return sum()/3.0;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getKor() {
		return kor;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getMath() {
		return math;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getEng() {
		return eng;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}

	
}
