package core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {

	// 해시맵에 고객정보 저장, 검색
	private static Map<Long, Member> store = new HashMap<>();

	@Override
	public void save(Member member) {
		store.put(member.getId(), member);

	}

	@Override
	public Member findById(Long memberId) {

		return store.get(memberId);
	}

}
