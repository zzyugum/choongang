package exception03;

public class TryEx {

	public static void main(String[] args) {

		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());
		//	e.printStackTrace();
		}
		System.out.println("여기");

	}

}
