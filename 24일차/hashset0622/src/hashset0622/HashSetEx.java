package hashset0622;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("123");
		set.add("가나다");
		set.add("홍길동");
//		Iterator<String> iterator = set.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		for(String str : set) {
			System.out.println(str);
		}
	}
}
