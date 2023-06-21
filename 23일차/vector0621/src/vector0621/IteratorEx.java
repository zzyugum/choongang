package vector0621;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();

		cars.add("벤츠");
		cars.add("람보르기니");
		cars.add("아우디");
		cars.add("페라리");
		// iterator 패턴 (반복자 패턴)
		Iterator<String> it = cars.iterator();
		while (it.hasNext()) {
//		for(int i = 0 ; i<10; i++) {
			String str = it.next();
			System.out.println(str);
//		}
		}
	}
}