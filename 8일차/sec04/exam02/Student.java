package sec04.exam02;

public class Student {

	
// 스튜던트 클래스를 만들어보세요.
//	메소드 : int getTotal(),
//			double getAvg(),
//			void printResult();
//	생성자: student("홍길동", 90, 80, 90)이 가능한 생성자 1개
//  실행이 가능한 프로그램도 만들어 보세요.
	private String name;
	private int kor;
	private int eng;
	private int math;

	
		Student(String name, int kor, int eng, int math){
			
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
			System.out.println("이름: " +name);
			System.out.println("평균: "+getavg());
			System.out.println("총점: "+getTotal());
		}
		
}

