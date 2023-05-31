package sec05.exam04;

public class SingletonEx {

	public static void main(String[] args) {

		
		
//		Singleton obj1 = new Singleton();
//		Singleton obj2 = new Singleton();
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		
		System.out.println(obj1);
		
		System.out.println(obj2);
		if(obj1 == obj2) {
			System.out.println("같은 싱글톤 객체 입니다.");
		} else {
			System.out.println("틀린 싱글톤 객체 입니다.");
		}
	}
	

}
