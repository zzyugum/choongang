package core;

import core.discount.DiscountPolicy;
import core.discount.FixDiscountPolicy;
import core.discount.RateDiscountPolicy;
import core.dorder.OrderServiceImpl;
import core.member.MemberRepository;
import core.member.MemberSerivceImpl;
import core.member.MemoryMemberRepository;

public class AppConfig {

	public DiscountPolicy discountPolicy() {
		
		return new RateDiscountPolicy();
	}
	
	public MemberRepository memberRepository() {
	
		return new MemoryMemberRepository();
	
	}
	
	public MemberSerivceImpl memberService() {
		
		return new MemberSerivceImpl(memberRepository());
	}
	
	public OrderServiceImpl orderService() {
		
		return new OrderServiceImpl(memberRepository(), discountPolicy());
	}
}
