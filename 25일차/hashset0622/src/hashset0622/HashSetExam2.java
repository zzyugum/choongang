package hashset0622;

import java.util.HashSet;
import java.util.Set;

public class HashSetExam2 {

	public static void main(String[] args) {

		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		System.out.println("총 객체수: " + set.size());
		
		//중복검사를 위해 사용
	}

}
