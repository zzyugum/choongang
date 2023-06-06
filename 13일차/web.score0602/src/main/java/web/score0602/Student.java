package web.score0602;

public class Student {

	private String name;
	private int kor, math, eng;

		public Student(String name, int kor, int math, int eng) {				
			super();
			this.name = name;
			this.kor = kor;
			this.math = math;
			this.eng = eng;
			
		
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", kor=" + kor + ", math=" + math + ", eng=" + eng + "]";
		}
		public int getSum(){
			return kor+math+eng;
		}
		
		public double getavg() {
			return getSum()/3.0;
		}
		
		public Student() {}
		
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
