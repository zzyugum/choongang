package core.member;

public class MemberSerivceImpl implements MemberService {

	private MemberRepository memberRepositry;

	
	public MemberSerivceImpl(MemberRepository memberRepositry) {
		super();
		this.memberRepositry = memberRepositry;
	}

	@Override
	public void join(Member member) {

		memberRepositry.save(member);

	}

	@Override
	public Member findMember(Long memberId) {

		return memberRepositry.findById(memberId);
	}

}
