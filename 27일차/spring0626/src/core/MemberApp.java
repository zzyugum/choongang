package core;

import core.dorder.Order;
import core.member.Grade;
import core.member.Member;

public class MemberApp {

	public static void main(String[] args) {

		AppConfig app = new AppConfig();
		Member member = new Member(1L, "홍", Grade.VIP);

		app.memberService().join(member); // 회원 등록

		Member findMember  //회원 검색
			= app.memberService().findMember(1L);
		System.out.println(findMember);

	
	
		Order order = app.orderService().createOrder(1L,"청소기",110000);
	
		System.out.println("할인금액:"+order.getDiscountPrice());
		System.out.println("지불액:"+order.calculaterPrice());;
	}
}
