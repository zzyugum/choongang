package table0620;

import java.sql.SQLException;
import java.util.Scanner;

public class TableMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 전체 검색
//		SelectList sel = new SelectList();
//		sel.selectList();
		Scanner scan = new Scanner(System.in);
//		// 한명 검색
//		System.out.println("검색할 id를 입력하세요.");
//		int a= Integer.parseInt(scan.next());
//		SelectOne sel2 = new SelectOne();
//		sel2.selectOne(a);
//		if(sel2.selectOne(a).getId() == -1) {
//			System.out.println("없는 id 입니다");
//		}else {
//			System.out.println(sel2.selectOne(a));
//		}
		// 인서트
//		System.out.print("이름 : ");		
//		String name = scan.next();
//		System.out.print("주소 : ");
//		String addr = scan.next();
//		System.out.print("전화번호 : ");
//		String phon = scan.next();
//		Dto dto = new Dto(0,name,addr,phon);
//		InsertDao insert = new InsertDao();
//		insert.insert(dto);
//		삭제
//		System.out.println("삭제할 id를 입력하세요");
//		int a = Integer.parseInt(scan.next());
//		Dto dto = new Dto(a, null, null, null);
//		DeleteDao delete = new DeleteDao();
//		delete.delete(dto);
//		수정
		System.out.println("수정할 id를 입력하세요.");
		int a = Integer.parseInt(scan.next());
		SelectOne sel2 = new SelectOne();
		if (sel2.selectOne(a).getId() == -1) {
			System.out.println("없는 id입니다");
		} else {
			sel2.selectOne(a);
			System.out.print(sel2.selectOne(a).getName() + " : ");
			String name = scan.next();
			System.out.print(sel2.selectOne(a).getAddr() + " : ");
			String addr = scan.next();
			System.out.print(sel2.selectOne(a).getPhon() + " : ");
			String phon = scan.next();
			Dto dto = new Dto(a, name, addr, phon);
			UpdateDao update = new UpdateDao();
			update.updatedao(dto);
		}
	}
}