package account0621;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
//
//		AccountInsertDao it = new AccountInsertDao();
//		AccountDto dto = new AccountDto(1, "홍", 0);
//		it.insert(dto);
//		
//		SelectListDao sl = new SelectListDao();
//		sl.slectlist();
		Scanner scan = new Scanner(System.in);
		Impl im = new Impl();
		AccountDto dtoo;
		int num;
		do {

			while (true) {
				System.out.println("계좌 번호를 입력하세요");
				num = Integer.parseInt(scan.nextLine());
				dtoo = im.dao.selone(num);
				if (dtoo.getAccnum() == -1) {
					System.out.println("계좌를 생성 하시겠습니까?");
					String res = scan.nextLine();
					if (res.equals("y") || res.equals("yes") || res.equals("Y") || res.equals("Yes")) {
						System.out.println("이름을 입력하세요");
						String name = scan.nextLine();
						im.insert(im.max() + 1, name);
						num = im.max();
						break;
					} else {

					}
				}
			}

		} while (num == 0);
		System.out.println(num);
		while (true) {
			System.out.println("----------------------------");
			System.out.println("1.입금|2.출금|3.잔고확인|4.계좌 삭제");
			System.out.println("----------------------------");
			int x = Integer.parseInt(scan.nextLine());
			int num1;
			switch (x) {

			case 1: // 입금 메서드
				System.out.println(num);
				System.out.println("입금할 금액을 입력하세요");
				num1 = Integer.parseInt(scan.nextLine());
				im.update(num, num1);
				System.out.println("현재 잔액");
				System.out.println(im.check(num));
				break;
			case 2: // 출금 메서드
				System.out.println("출금할 금액을 입력하세요");
				num1 = Integer.parseInt(scan.nextLine());
				im.withdraw(num1, num1);
				System.out.println("현재 잔액");
				System.out.println(im.check(num));
				break;
			case 3: // 잔고 확인 메서드
				System.out.println(im.check(num));
				break;
			case 4: //계좌 삭제 메서드

			}
		}
	}
}
