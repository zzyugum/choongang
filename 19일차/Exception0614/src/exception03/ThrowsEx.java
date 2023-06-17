package exception03;


public class ThrowsEx {

	public static void findClass() throws ClassNotFoundException {
		Class.forName("asdfgq");
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		
			findClass();
		System.out.println("여기");

	}

}
