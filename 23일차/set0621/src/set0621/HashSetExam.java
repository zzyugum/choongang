package set0621;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");

		int size = set.size();
		System.out.println("총 객체수: " + size);

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String elements = iterator.next();
			System.out.println("\t" + elements);
		}
		set.remove("JDBC");
		set.remove("iBATIS");

		System.out.println("총 객체수: " + set.size());

		iterator = set.iterator();
		for (String element : set) {
			System.out.println("\t" + element);
		}

		set.clear();

		if (set.isEmpty()) {
			System.out.println("비어 있음");
		}

	}

}
