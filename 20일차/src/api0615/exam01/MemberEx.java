package api0615.exam01;

public class MemberEx {

	public static void main(String[] args) {

		String str1 = new String("test");
		String str2 = new String("test");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		if(str1.equals(str2)) {
			System.out.println("같습니다.");
		} else {
			System.out.println("같지 않습니다");
		}
		
		
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
//		
//		if (obj1.equals(obj2)) {
//			System.out.println("같습니다.");
//		} else {
//			System.out.println("같지 않습니다");
//		}
//		if (obj1.equals(obj3)) {
//			System.out.println("같습니다.");
//		} else {
//			System.out.println("같지 않습니다");
//		}
//		
		
	}

}
