package sec01.exam01;

public class Member {

	
	String name;
	int kor;
	int eng;
	
	Member(String name,int kor,int eng){		
		this.eng = eng;
		this.name = name;
		this.kor = kor;
	}
	
	void printscore(int kor, int eng) {
		System.out.print("이름: " +name +"  ");
		System.out.print("국어: " +kor+"  ");
		System.out.print("영어: " +eng+"  ");

	}
	
	int ScoreSum(int kor, int eng) {
		
		int sum = kor + eng;
		
		return sum;
	}
}
