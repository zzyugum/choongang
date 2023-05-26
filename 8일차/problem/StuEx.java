package problem;

import java.util.Scanner;

public class StuEx {

	public static void main(String[] args) {
		int num = 0;
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("학생 수를 입력해 주세요");
		num = Integer.parseInt(scan.nextLine());
		Stu[] students = new Stu[num];
		while(run) {
		System.out.println("-----------------------------");
		System.out.println("1.점수 입력 |2. 점수 분석 |3. 종료|");
		System.out.println("-----------------------------");
		System.out.print("선택> ");
		int selectNo = Integer.parseInt(scan.nextLine());
		switch(selectNo) {
			case 1:
				if(students.length == 0) {
					main(args);
				
			}else {
				for(int i = 0;i<students.length; i++) {
					System.out.print("이름: ");
					String name = scan.nextLine();
					System.out.print("국어 점수: ");
					int kor = Integer.parseInt(scan.nextLine());
					System.out.print("영어 점수: ");
					int eng = Integer.parseInt(scan.nextLine());
					System.out.print("수학 점수: ");
					int math = Integer.parseInt(scan.nextLine());
					students[i] = new Stu(name, kor, eng, math);
				}
				continue;}
			case 2: 
				if(students.length == 0) {
					main(args);
				
			}else{
				for(int i = 0; i<students.length;i++) {
					students[i].printStudent();
			}	int sumKor = 0, sumEng = 0 ,sumMath = 0;
				int avgKor = 0, avgEng = 0, avgMath = 0;
			
				for(int i = 0; i<students.length;i++){
				sumKor += students[i].kor;
				sumEng += students[i].eng;
				sumMath += students[i].math;
			}
				avgKor = sumKor/students.length;
				avgEng = sumEng/students.length;
				avgMath = sumMath/students.length;
				System.out.print("국어 총점:" + sumKor+"\t" );
				System.out.print("영어 총점:" + sumEng+"\t");
				System.out.println("수학 총점:" + sumMath+"\t");
				System.out.print("국어 평균:" + avgKor+"\t");
				System.out.print("영어 평균:" + avgEng +"\t");
				System.out.println("수학 평균:" + avgMath+"\t");
			
			
		}
			case 3: 
				System.out.println("프로그램 종료");
				run = false;
}

		}
	}

	}

	
