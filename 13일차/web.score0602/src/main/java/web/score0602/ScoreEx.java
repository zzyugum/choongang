package web.score0602;

import java.util.Scanner;

public class ScoreEx {

	public static void main(String[] args) {
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		int sum;
		int avg;
		int best=0;
		Singleton st = Singleton.GetInstance();
		for(int i = 0; i<st.stu.length; i++) {
			st.stu[i].setName("김"+i);
			st.stu[i].setKor((int) (Math.random()*100+1));
			st.stu[i].setEng((int) (Math.random()*100+1));
			st.stu[i].setMath((int) (Math.random()*100+1));
		}
//		for(int i = 0; i<st.stu.length; i++) {
//			System.out.print(i+1 + "번 학생 이름: ");
//			st.stu[i].setName(scan.nextLine());
//			System.out.print(i+1 + "번 학생 국어점수: ");
//			st.stu[i].setKor(Integer.parseInt(scan.nextLine()));
//			System.out.print(i+1 + "번 학생 수학점수: ");
//			st.stu[i].setMath(Integer.parseInt(scan.nextLine()));
//			System.out.print(i+1 + "번 학생 영어점수: ");
//			st.stu[i].setEng(Integer.parseInt(scan.nextLine()));
//			System.out.println(st.stu[i].getSum());
//			System.out.println(st.stu[i].getavg());
//		}
		for(Student student : st.stu) {
			System.out.println(student);
			
			
		}
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.학생별 총점/평균 2.과목별 3.검색 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택 >");
			int num = Integer.parseInt(scan.nextLine());
			switch(num){
				
				case 1: 
					for(int i = 0; i<st.stu.length; i++) {
						System.out.println("이름\t국어\t수학\t영어\t총점\t평균");
						System.out.printf("%s\t%d\t%d\t%d\t%d\t%f\n",
										st.stu[i].getName(),st.stu[i].getKor(),
										st.stu[i].getMath(),st.stu[i].getEng(),
										st.stu[i].getSum(),st.stu[i].getavg());
						}
					break;
				case 2:
		
					st.makeKing();
					System.out.println("이름\t국어|이름\t수학|이름\t영어");
					System.out.printf("%s\t%d%s%s\t%d%s%s\t%d\t",
										st.korKingName,st.korKingScore," |",
										st.mathKingName,st.mathKingScore," |",
										st.engKingName,st.engKingScore);
					System.out.println();
					
					
					
					break;
				case 3:
					System.out.print("이름을 입력하세요:");
					String name = scan.nextLine();
					if(st.search(name) != null) {
					System.out.println(st.search(name));	
					}else {System.out.println("정보가 없습니다.");}
					
					
					break;
				case 4:
					run = false;
				
			}
		}
		System.out.println("프로그램 종료");	
		
		
		
		
		
	}
}
