package class0528.pro;

public class MEmberService {

	
	String id;
	String password;
	
	boolean login (String id, String password) {
		
		if (id.equals("hong")&& password.equals("12345") ) {
			System.out.println("로그인 성공");
		} return true;
		
	}
	
	void logout(String id) {
		if (id.equals("hong")) {
		System.out.println("hong님이 로그아웃 하셧습니다.");	
		} return;
		
	}
	
}
