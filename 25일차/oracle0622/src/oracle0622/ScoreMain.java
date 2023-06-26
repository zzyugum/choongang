package oracle0622;

import java.sql.SQLException;
import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) throws SQLException {
		ScoreServiceImpl service = new ScoreServiceImpl();
		Scanner scan = new Scanner(System.in);
		int sn;
		while (true) {
			System.out.println("--------------------------------------------");
			System.out.println("1.전체 검색|2.학생 검색|3.등록|4.삭제|5.점수 수정|6.종료");
			System.out.println("--------------------------------------------");
			int num = Integer.parseInt(scan.nextLine());
			switch (num) {

			case 1:
				for(ScoreDto dto : service.select()) {
					System.out.println(dto);
				}
				System.out.println("\t총점");
				System.out.println("국어 영어 수학 평균");
				for(int i = 0; i<3; i++) {
					System.out.print(service.max()[i]+" ");
				}
				System.out.println(service.avg());

				break;
			case 2:
				System.out.println("검색할 학생의 학번을 입력해주세요.");
				sn = Integer.parseInt(scan.nextLine());
				if(service.selectone(sn).getNum() == -1) {
					System.out.println("없는학생입니다");
				} else {
					System.out.println(service.selectone(sn));
				}
				break;

			case 3:
				System.out.println("등록할 이름을 입력해주세요");
				String name = scan.nextLine();
				System.out.println("국어점수을 입력해주세요");
				int kor = Integer.parseInt(scan.nextLine());
				System.out.println("영어점수을 입력해주세요");
				int eng = Integer.parseInt(scan.nextLine());
				System.out.println("수학점수을 입력해주세요");
				int math = Integer.parseInt(scan.nextLine());
				service.insert(name, kor, eng, math);
				break;
			case 4:
				System.out.println("삭제할 학번을 입력하세요");
				sn = Integer.parseInt(scan.nextLine());
				service.delete(sn);
				break;
			case 5:
				System.out.println("수정할 학번을 입력하세요.");
				sn = Integer.parseInt(scan.nextLine());
				System.out.println("수정할 국어점수을 입력하세요.");
				kor = Integer.parseInt(scan.nextLine());
				System.out.println("수정할 영어점수을 입력하세요.");
				eng = Integer.parseInt(scan.nextLine());
				System.out.println("수정할 수학점수을 입력하세요.");
				math = Integer.parseInt(scan.nextLine());
				service.update(sn, kor, eng, math);
				break;
			case 6: 
				System.out.println("시스템 종료");
				System.exit(0);
				break;
			}

		}
	}
}
