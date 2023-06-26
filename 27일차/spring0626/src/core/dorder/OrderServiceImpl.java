package core.dorder;

import core.discount.DiscountPolicy;
import core.member.Member;
import core.member.MemberRepository;

public class OrderServiceImpl implements OrderSerivce{

	private MemberRepository memberRepositry;
	private DiscountPolicy discountPolicy;
	
	
	public OrderServiceImpl(MemberRepository memberRepositry, DiscountPolicy discountPolicy) {
		super();
		this.memberRepositry = memberRepositry;
		this.discountPolicy = discountPolicy;
	}


	@Override
	public Order createOrder
			(Long memberId, String itemName, int itemPrice) {
		Member member = memberRepositry.findById(memberId);
		int discountPrice = discountPolicy.discount(member, itemPrice);
	
		return new Order(memberId,itemName,itemPrice,discountPrice);
	}

}
