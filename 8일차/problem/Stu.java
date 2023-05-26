package problem;

public class Stu {
// 입력값으로 이름, 국어, 영어, 수학 출력, 총점, 평균 출력
	String name;
	int kor;
	int eng;
	int math;

	
		Stu(String name, int kor, int eng, int math){
			
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
			
		}
		int getTotal() {
			
			return kor+eng+math;
		}
		double getavg() {
			
			return (kor+eng+math)/3.0;
			
		}
		void printStudent() {	
			System.out.print("이름: " +name +"  ");
			System.out.print("국어: " +kor+"  ");
			System.out.print("영어: " +eng+"  ");
			System.out.print("수학: " +math+"  ");
			System.out.print("평균: "+getavg()+"  ");
			System.out.print("총점: "+getTotal());
		}
		
}

		
		


