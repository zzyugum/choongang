package class0528.pro;

public class MemberServiceExample {

	public static void main(String[] args) {
		// 
		
		MEmberService memberService = new MEmberService();
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되셧습니다");
			memberService.logout("hong");
		}else {
			
			System.out.println("id또는 password가 올바르지 않습니다");
		}
	}

}
